/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl.dialogs;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.aguilar.swinglib.utils.ColorUtils;

/**
 * 
 * @author Leo Aguilar
 */
public class TranslucentDialog extends JDialog {
    
    private JComponent main, contentPane, titlePane, bottomPane;
    private JLabel closeLabel;
    private JLabel titleLabel;
    private ImageIcon closeNormal;
    private ImageIcon closeHover;
    private ImageIcon closePress;
    private ImageIcon icon;
    private boolean showBottomPane;
    private boolean showCloseButton;
    private float alpha;
    private Color backgroundColor;
    private MouseListener mouseListener;

    public TranslucentDialog() {
        this(null, "", false);
    }
    public TranslucentDialog(String title) {
        this(null, title, false);
    }
    public TranslucentDialog(Frame frame) {
        this(frame, "", false);
    }
    public TranslucentDialog(Frame frame, String title) {
        this(frame, title, false);
    }
    public TranslucentDialog(Frame frame, String title, boolean showBottomPane) {
        this(frame, title, showBottomPane, Color.BLACK);
    }
    public TranslucentDialog(Frame frame, String title, boolean showBottomPane, Color backgroundColor) {
        this(frame, title, showBottomPane, backgroundColor, true);
    }
    public TranslucentDialog(Frame frame, String title, boolean showBottomPane, Color backgroundColor, boolean showCloseButton) {
        this(frame, title, showBottomPane, backgroundColor, showCloseButton, 0.7f);
    }
    public TranslucentDialog(Frame frame, String title, boolean showBottomPane, Color backgroundColor, boolean showCloseButton, float alpha) {
        super(frame, title);
        this.alpha = alpha;
        this.showBottomPane = showBottomPane;
        this.backgroundColor = backgroundColor;
        this.showCloseButton = showCloseButton;
        JDialog.setDefaultLookAndFeelDecorated(true);
        initializeComponents();
        installListeners();
    }
    public float getAlpha() {
        return alpha;
    }
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }
    public Color getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    @SuppressWarnings("unchecked")
    private void initializeComponents() {
        setUndecorated(true);
        contentPane = createMainPane();
        setContentPane(contentPane);
        if (main == null) {
            main = new JComponent() {};
        }
        closeNormal = new ImageIcon(getClass().getResource("/img/px16/close.png"));
        closeHover = new ImageIcon(getClass().getResource("/img/px16/close_hover.png"));
        closePress = new ImageIcon(getClass().getResource("/img/px16/close_pressed_red.png"));
        titleLabel = new JLabel(getTitle());
        titleLabel.setIconTextGap(10);
        titleLabel.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
        titleLabel.setForeground(ColorUtils.isDark(backgroundColor) ? Color.WHITE : Color.BLACK);
        try {
            BufferedImage img = ImageIO.read(getClass().getResource("/img/px16/window.png"));
            icon = getScaledImage(img, 16, 16);
            titleLabel.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(TranslucentDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeLabel = new JLabel(closeNormal);
        if (main.getLayout() == null) {
            setLayout(new FlowLayout());
        }
        contentPane.setLayout(new BorderLayout());
        contentPane.add(titlePane = createTitlePane(), BorderLayout.NORTH);
        if (showBottomPane) {
            contentPane.add(bottomPane = createBottomPane(), BorderLayout.SOUTH);
        }
        contentPane.add(main = createContentPane(false), BorderLayout.CENTER);
        MouseInputHandler handler = new MouseInputHandler(this);
        titlePane.addMouseListener(handler);
        titlePane.addMouseMotionListener(handler);
//        setBackground(null);
        setBackground(new Color(0, 0, 0, 0));
        setAlwaysOnTop(false);
        setModal(true);
        repaint();
    }
    @Override
    public void setTitle(String title) {
        super.setTitle(title);
        titleLabel.setText(title);
    }
    public void setIcon(ImageIcon icon) {
        Image image = icon.getImage();
        BufferedImage img = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();
        titleLabel.setIcon(this.icon = getScaledImage(img, 16, 16));
    }
    public JComponent getTitlePane() {
        return titlePane;
    }
    @Override
    public Container getContentPane() {
        return main;
    }
    public JComponent getBottomPane() {
        return bottomPane;
    }
    private JComponent createMainPane() {
        return createContentPane(true);
    }
    private JComponent createContentPane(final boolean isMainPane) {
        return new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                float calcAlpha = isMainPane ? alpha : 0.0f;
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Composite old = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, calcAlpha));
                g2.setColor(backgroundColor);
                Area area = null;
                if (isMainPane) {
                    area = new Area(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 16, 16));
                } else {
                    if (showBottomPane) {
                        area = new Area(new Rectangle2D.Float(0, 0, getWidth(), getHeight()));
                    } else {
                        Shape roundRectangle = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 16, 16);
                        Shape rectangle = new Rectangle2D.Float(0, 0, getWidth(), getHeight() - 16);
                        area = new Area(roundRectangle);
                        Area rectangleArea = new Area(rectangle);
                        area.add(rectangleArea);
                    }
                }
                g2.fill(area);
                g2.setComposite(old);
                g2.dispose();
            }
        };
    }
    private JComponent createTitlePane() {
        JComponent title = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                setOpaque(false);
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Composite old = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
                int red = backgroundColor.getRed();
                int green = backgroundColor.getGreen();
                int blue = backgroundColor.getBlue();
                LinearGradientPaint paint = new LinearGradientPaint(0, 0, 0, getHeight(),
                    new float[] {.0f, .499f, .5f, 1.0f},
                    new Color[] {new Color (red, green, blue, 70), //new Color(0x858585),
                                 new Color (red, green, blue, 27), //new Color(0x3c3c3c),
                                 new Color (red, green, blue, 84), //new Color(0x2c2c2c),
                                 new Color (red, green, blue, 175)}); /*new Color(0x333334)});*/
                g2.setPaint(paint);
                Shape roundRectangle = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 16, 16);
                Shape rectangle = new Rectangle2D.Float(0, getHeight() / 2, getWidth(), getHeight() / 2);
                Area roundRectangleArea = new Area(roundRectangle);
                Area rectangleArea = new Area(rectangle);
                roundRectangleArea.add(rectangleArea);
                g2.fill(roundRectangleArea);
                g2.setComposite(old);
                g2.dispose();
            }
        };
        GroupLayout layout = new GroupLayout(title);
        title.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeLabel)
                .addContainerGap()
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(closeLabel))
                .addGap(5)
            )
        );
        return title;
    }
    private JComponent createBottomPane() {
        JComponent result = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Composite old = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));
                g2.setColor(backgroundColor);
                Shape roundRectangle = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 16, 16);
                Shape rectangle = new Rectangle2D.Float(0, 0, getWidth(), getHeight() / 2);
                Area roundRectangleArea = new Area(roundRectangle);
                Area rectangleArea = new Area(rectangle);
                roundRectangleArea.add(rectangleArea);
                g2.fill(roundRectangleArea);
                g2.setComposite(old);
                g2.dispose();
            }
        };
        result.setLayout(new FlowLayout(FlowLayout.RIGHT));
        return result;
    }
    public static ImageIcon getScaledImage(BufferedImage image, int width, int height) {
        int anchoImg  = image.getWidth();
        int altoImg = image.getHeight();
        double escalaX = (double)width / anchoImg;
        double escalaY = (double)height / altoImg;
        AffineTransform scaleTransform = AffineTransform.getScaleInstance(escalaX, escalaY);
        AffineTransformOp bilinearScaleOp = new AffineTransformOp(scaleTransform, AffineTransformOp.TYPE_BILINEAR);
        return new ImageIcon(bilinearScaleOp.filter(image, new BufferedImage(width, height, image.getType())));
    }
    @Override
    public void setLayout(LayoutManager manager) {
        if (main == null) {
            main = new JPanel();
            main.setLayout(new FlowLayout());
        } else {
            main.setLayout(manager);
        }
        if (!(getLayout() instanceof BorderLayout)) {
            super.setRootPaneCheckingEnabled(false);
            super.setLayout(new BorderLayout());
            super.setRootPane(super.getRootPane());
            super.setRootPaneCheckingEnabled(true);
        }
    }
    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        if (contentPane != null) {
            contentPane.setBackground(color);
            titlePane.setBackground(color);
            main.setBackground(color);
        }
    }
    @Override
    public Component add(Component comp) {
        return main.add(comp);
    }
    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(screenSize.width / 2 - (getWidth() / 2), screenSize.height / 2 - (getHeight() / 2));
        }
        super.setVisible(visible);
    }
    public void installCloseButtonClickListener(MouseListener listener) {
        if (mouseListener != null) {
            closeLabel.removeMouseListener(mouseListener);
        }
        mouseListener = listener;
        closeLabel.addMouseListener(mouseListener);
    }

//<editor-fold defaultstate="collapsed" desc="installListeners method">
    /*
     * Add all listeners
     */
    private void installListeners() {
        closeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                closeLabel.setIcon(closePress);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                closeLabel.setIcon(closeNormal);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                closeLabel.setIcon(closeHover);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                closeLabel.setIcon(closeNormal);
            }
        });
    }
//</editor-fold>

    public void close() {
        setVisible(false);
        dispose();
    }
    public static void main(String args[]) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                TranslucentDialog dialog = new TranslucentDialog(new JFrame(), "Ejemplo", true, Color.BLACK, true, 0.7f);
//                dialog.setAlpha(0.5f);
//                dialog.setBackgroundColor(Color.red);
                dialog.setSize(new Dimension(300, 200));
                dialog.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }

}