package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Leo Aguilar
 */
public class FlDesktopPane extends JDesktopPane {

    private static final long serialVersionUID = -5746013654602797327L;
    public static enum SizeMode {
        NORMAL, STRETCH, TILE
    }
//    public static final int NORMAL = 0;
//    public static final int STRETCH = 1;
//    public static final int TILE = 2;
    private static int FRAME_OFFSET = 20;
    private MDIDesktopManager manager;
    private final List<MaximizeListener> maxListeners = new ArrayList<MaximizeListener>();
    private Image image;
    private SizeMode imageSizeMode = SizeMode.NORMAL;
    private Map sizes = new LinkedHashMap();

    public FlDesktopPane() {
        manager = new MDIDesktopManager();
        setDesktopManager(manager);
    }
    public FlDesktopPane(String imagePath) {
        if (imagePath != null)
            image = new ImageIcon(getClass().getResource(imagePath)).getImage();
        manager = new MDIDesktopManager();
        setDesktopManager(manager);
    }
    public FlDesktopPane(Image image) {
        if (image != null)
            this.image = image;
        manager = new MDIDesktopManager();
        setDesktopManager(manager);
    }
    public void setImage(Image image) {
        this.image = image;
        repaint();
    }
    public void setImage(String imagePath) {
        image = imagePath != null ? new ImageIcon(getClass().getResource(imagePath)).getImage() : null;
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
        } else
            setOpaque(true);
        super.paint(g2);
    }
    public void cascadeFrames() throws PropertyVetoException {
        JInternalFrame[] frames = getAllFrames();
        if (frames.length == 0)
            return;
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
        if (frames.length == 0)
            return;
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
        for (JInternalFrame jif : frames)
            jif.dispose();
    }
    public interface MaximizeListener {
        public void internalFrameMaximized(JInternalFrame f);
        public void internalFrameUnmaximized(JInternalFrame f);
    }
    public void addMaximizeListener(MaximizeListener maxListener) {
        maxListeners.add(maxListener);
    }
    private void fireOne(JInternalFrame f) {
        for (MaximizeListener guy : maxListeners)
            guy.internalFrameMaximized(f);
    }
    private void fireTwo(JInternalFrame f) {
        for (MaximizeListener guy : maxListeners)
            guy.internalFrameUnmaximized(f);
    }
    @Override
    public void setBounds(int x, int y, int w, int h) {
        super.setBounds(x, y, w, h);
        checkDesktopSize();
    }
    @Override
    public Component add(Component component) {
        super.add(component);
        if (!(component instanceof JInternalFrame))
            return component;
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
        if (getParent() != null && isVisible())
            manager.resizeDesktop();
    }

    /**
     * Private class used to replace the standard DesktopManager for JDesktopPane. Used to provide
     * scrollbar functionality.
     */
    private class MDIDesktopManager extends DefaultDesktopManager {

        private static final long serialVersionUID = 5570342469190180173L;

        public MDIDesktopManager() {
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
                if (viewPort.getParent() instanceof JScrollPane)
                    return (JScrollPane) viewPort.getParent();
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
                    if (rect == null)
                        rect = frame.getBounds();
                    else
                        rect = rect.union(frame.getBounds());
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