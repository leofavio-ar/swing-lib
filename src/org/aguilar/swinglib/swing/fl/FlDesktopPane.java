package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultDesktopManager;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author Leo Aguilar
 */
public class FlDesktopPane extends JDesktopPane {

    public static enum SizeMode {
        NORMAL, STRETCH, TILE
    }
    private static int FRAME_OFFSET = 20;
    private FlDesktopManager manager;
    private final List<MaximizeListener> maxListeners = new ArrayList<MaximizeListener>();
    private Image image;
    private SizeMode imageSizeMode = SizeMode.NORMAL;
    private Map sizes = new LinkedHashMap();
    private JMenu menu = null;

    public FlDesktopPane() {
        manager = new FlDesktopManager();
        setDesktopManager(manager);
    }
    public FlDesktopPane(String imagePath) {
        if (imagePath != null) {
            image = new ImageIcon(getClass().getResource(imagePath)).getImage();
        }
        manager = new FlDesktopManager();
        setDesktopManager(manager);
    }
    public FlDesktopPane(Image image) {
        if (image != null) {
            this.image = image;
        }
        manager = new FlDesktopManager();
        setDesktopManager(manager);
    }
    public JMenu getMenu() {
        return menu;
    }
    public void setMenu(JMenu menu) {
        this.menu = menu;
    }
    public void setImage(String imagePath) {
        setImage(imagePath != null ? new ImageIcon(getClass().getResource(imagePath)).getImage() : null);
    }
    public void setImage(File imageFile) {
        Image aux;
        try {
            aux = new ImageIcon(imageFile.getCanonicalPath()).getImage();
        } catch (IOException ex) {
            aux = null;
        }
        setImage(aux);
    }
    public void setImage(Image image) {
        this.image = image;
        repaint();
    }
    public void setImageSizeMode(SizeMode imageSizeMode) {
        this.imageSizeMode = imageSizeMode == null ? SizeMode.NORMAL : imageSizeMode;
        repaint();
    }
    public SizeMode getImageSizeMode() {
        return imageSizeMode;
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setBackground(Color.white);
        g2.setColor(Color.white);
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (image != null) {
            switch (imageSizeMode) {
                case NORMAL:
                    g2.drawImage(image, 0, 0, this);
                    break;
                case STRETCH:
                    g2.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
                    break;
                case TILE:
                    int width = this.getWidth();
                    int height = this.getHeight();
                    while(height > 0) {
                        while(width > 0) {
                            g2.drawImage(image, this.getWidth() - width, this.getHeight() - height, image.getWidth(this), image.getHeight(this), this);
                            width -= image.getWidth(this);
                        }
                        height -= image.getHeight(this);
                        width = this.getWidth();
                    }
            }
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g2);
    }
    public void cascadeFrames() throws PropertyVetoException {
        JInternalFrame[] frames = getAllFrames();
        if (frames.length == 0) {
            return;
        }
        for (int i = 0; i < frames.length; i++) {
            frames[i].setMaximum(false);
            frames[i].setSize((Dimension)sizes.get(frames[i].getClass().getCanonicalName()));
            frames[i].setLocation(i == 0 ? 0 : FRAME_OFFSET + (i - 1) * FRAME_OFFSET, i == 0 ? 0 : FRAME_OFFSET + (i - 1) * FRAME_OFFSET);
            getDesktopManager().activateFrame(frames[i]);
        }
        checkDesktopSize();
    }
    public void tileFrames() throws PropertyVetoException {
        JInternalFrame frames[] = getAllFrames();
        if (frames.length == 0) {
            return;
        }
        int frameHeight = getBounds().height / frames.length;
        int y = 0;
        for (int i = 0; i < frames.length; i++) {
            frames[i].setMaximum(false);
            frames[i].setSize(getBounds().width, frameHeight);
            frames[i].setLocation(0, y);
            y = y + frameHeight;
        }
        checkDesktopSize();
    }
    public void closeFrames() {
        JInternalFrame frames[] = getAllFrames();
        for (JInternalFrame jif : frames) {
            jif.dispose();
        }
    }
    public void openFrame(FlInternalFrame nuevoFrame, String titulo) {
        openFrame(nuevoFrame, titulo, true, false);
    }
    public void openFrame(FlInternalFrame nuevoFrame, String titulo, boolean abrir) {
        openFrame(nuevoFrame, titulo, abrir, false);
    }
    public void openFrame(FlInternalFrame nuevoFrame, String titulo, boolean abrir, boolean maximizar) {
        FlInternalFrame activeFrame = comprobarFrames(nuevoFrame.getClass().getCanonicalName());
        if (activeFrame != null) {
            this.getDesktopManager().activateFrame(activeFrame);
            nuevoFrame.dispose();
        } else {
            this.add(nuevoFrame);
            nuevoFrame.setVisible(true);
            try {
                nuevoFrame.setMaximum(maximizar);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FlDesktopPane.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (this.menu != null) {
                agregarElementoMenu(nuevoFrame, titulo);
            }
        }
    }
    private FlInternalFrame comprobarFrames(String className) {
        JInternalFrame[] internalFrames = this.getAllFrames();
        for (JInternalFrame jif : internalFrames) {
            if (jif.getClass().getCanonicalName().equals(className)) {
                return (FlInternalFrame)jif;
            }
        }
        return null;
    }
    private void agregarElementoMenu(FlInternalFrame newFrame, String name){
        JMenuItem menuItem = new JMenuItem();
        menuItem.setText(name);
//        menuItem.setIcon(new ImageIcon(this.getClass().getResource("/img/16px/window.png")));
        menuItem.putClientProperty("frame", newFrame);
        newFrame.putClientProperty("menuItem", menuItem);
        final FlDesktopPane desktopPane = this;
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javax.swing.JMenuItem menu = (javax.swing.JMenuItem)evt.getSource();
                desktopPane.getDesktopManager().activateFrame((JInternalFrame)menu.getClientProperty("frame"));
            }
        });
        this.menu.add(menuItem);
        newFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent evt) {
                FlInternalFrame frame = (FlInternalFrame)evt.getSource();
                menu.remove((JMenuItem)frame.getClientProperty("menuItem"));
            }
        });
    }
    public interface MaximizeListener {
        public void internalFrameMaximized(JInternalFrame f);
        public void internalFrameUnmaximized(JInternalFrame f);
    }
    public void addMaximizeListener(MaximizeListener maxListener) {
        maxListeners.add(maxListener);
    }
    private void fireOne(JInternalFrame f) {
        for (MaximizeListener guy : maxListeners) {
            guy.internalFrameMaximized(f);
        }
    }
    private void fireTwo(JInternalFrame f) {
        for (MaximizeListener guy : maxListeners) {
            guy.internalFrameUnmaximized(f);
        }
    }
    @Override
    public void setBounds(int x, int y, int w, int h) {
        super.setBounds(x, y, w, h);
        checkDesktopSize();
    }
    @Override
    public Component add(Component component) {
        super.add(component);
        if (!(component instanceof JInternalFrame)) {
            return component;
        }
        JInternalFrame frame = (JInternalFrame)component;
        JInternalFrame[] allFrames = getAllFrames();
        checkDesktopSize();
        Point p = new Point((allFrames.length - 1) * FRAME_OFFSET, (allFrames.length - 1) * FRAME_OFFSET);
        frame.setLocation(p.x, p.y);
        sizes.put(component.getClass().getCanonicalName(), frame.getSize());
        return component;
    }
    @Override
    public void remove(Component c) {
        super.remove(c);
        checkDesktopSize();
    }
    private void checkDesktopSize() {
        if (getParent() != null && isVisible()) {
            manager.resizeDesktop();
        }
    }

    /**
     * Private class used to replace the standard DesktopManager for JDesktopPane. Used to provide
     * scrollbar functionality.
     */
    private class FlDesktopManager extends DefaultDesktopManager {

        private static final long serialVersionUID = 5570342469190180173L;

        public FlDesktopManager() {
        }
        @Override
        public void maximizeFrame(JInternalFrame f) {
            super.maximizeFrame(f);
            fireOne(f);
        }
        @Override
        public void iconifyFrame(JInternalFrame f) {
            super.iconifyFrame(f);
            fireTwo(f);
        }
        @Override
        public void minimizeFrame(JInternalFrame f) {
            super.minimizeFrame(f);
            fireTwo(f);
        }
        @Override
        public void closeFrame(JInternalFrame f) {
            super.closeFrame(f);
            fireTwo(f);
        }
        @Override
        public void endResizingFrame(JComponent f) {
            super.endResizingFrame(f);
            resizeDesktop();
        }
        @Override
        public void endDraggingFrame(JComponent f) {
            super.endDraggingFrame(f);
            resizeDesktop();
        }
        private JScrollPane getScrollPane() {
            if (FlDesktopPane.this.getParent() instanceof JViewport) {
                JViewport viewPort = (JViewport)FlDesktopPane.this.getParent();
                if (viewPort.getParent() instanceof JScrollPane) {
                    return (JScrollPane) viewPort.getParent();
                }
            }
            return null;
        }
        public void resizeDesktop() {
            // TODO: dragging a window out of view, then scrolling the scrollbar, should reset the
            // scrollbars to a neutral position
            Rectangle rect = new Rectangle();
            JScrollPane scrollPane = getScrollPane();
            if (scrollPane != null) {
                for (JInternalFrame frame : FlDesktopPane.this.getAllFrames()) {
                    if (rect == null) {
                        rect = frame.getBounds();
                    } else {
                        rect = rect.union(frame.getBounds());
                    }
                }
                setAllSize(rect.width, rect.height);
                scrollPane.invalidate();
                scrollPane.validate();
            }
        }
        private void setAllSize(Dimension d) {
            setMinimumSize(d);
            setMaximumSize(d);
            setPreferredSize(d);
        }
        private void setAllSize(int width, int height) {
            setAllSize(new Dimension(width, height));
        }
    }
    
}