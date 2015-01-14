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
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Leo Aguilar
 */
public class TranslucentFullDialog extends JDialog {

    private JComponent main, contentPane;
    private Color backgroundColor;
    private int duration, position;
    private boolean paintGradient = false;
    public static final int TOP = 0;
    public static final int CENTER = 1;
    public static final int BOTTOM = 2;

    public TranslucentFullDialog() {
        this(Color.LIGHT_GRAY, BOTTOM, 3000);
    }
    public TranslucentFullDialog(Color backgroundColor) {
        this(backgroundColor, BOTTOM, 3000);
    }
    public TranslucentFullDialog(Color backgroundColor, int position) {
        this(backgroundColor, position, 3000);
    }
    public TranslucentFullDialog(Color backgroundColor, int position, int duration) {
        super(new Frame(), "");
        setFocusableWindowState(false);
        setFocusable(false);
        this.backgroundColor = backgroundColor;
        this.duration = duration;
        this.position = position;
        initializeComponents();
    }
//<editor-fold defaultstate="collapsed" desc="getters/setters">
    protected void setPosition(int position) {
        this.position = position;
    }
    protected void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        setBackground(backgroundColor);
    }
    protected void setDuration(int duration) {
        this.duration = duration;
    }
    private int getPosition() {
        return position;
    }
    private Color getBackgroundColor() {
        return backgroundColor;
    }
    private int getDuration() {
        return duration;
    }
//</editor-fold>
    @SuppressWarnings("unchecked")
    private void initializeComponents() {
        setUndecorated(true);
        contentPane = createMainPane();
        setContentPane(contentPane);
        if (main == null) {
            main = new JComponent() {};
        }
        if (main.getLayout() == null) {
            setLayout(new FlowLayout());
        }
        contentPane.setLayout(new BorderLayout());
        contentPane.add(main = createContentPane(), BorderLayout.CENTER);
        setMinimumSize(new Dimension(800, 30));
        setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
        setBackground(new Color(0, 0, 0, 0));
        setAlwaysOnTop(false);
//        setModal(true);
        repaint();
    }
    @Override
    public Container getContentPane() {
        return main;
    }
    private JComponent createMainPane() {
        return createContentPane(true);
    }
    private JComponent createContentPane() {
        return createContentPane(false);
    }
    private JComponent createContentPane(final boolean isMainPane) {
        return new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Composite old = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                int red = backgroundColor.getRed();
                int green = backgroundColor.getGreen();
                int blue = backgroundColor.getBlue();
                LinearGradientPaint paint = new LinearGradientPaint(0, 0, 0, getHeight(),
                    new float[] {0.0f, 0.1f, 0.4f, 0.6f, 0.9f, 1.0f},
                    new Color[] {new Color(0, 0, 0, 150),
                                 new Color(red, green, blue, 191),
                                 new Color(red, green, blue, 63),
                                 new Color(red, green, blue, 63),
                                 new Color(red, green, blue, 191),
                                 new Color(0, 0, 0, 150)}
                );
                if (isMainPane || !paintGradient) {
                    g2.setColor(backgroundColor);
                } else {
                    g2.setPaint(paint);
                }
                Rectangle desktop = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
                Shape shape = new Rectangle2D.Float(0, 0, desktop.width, getHeight());
                g2.fill(shape);
                g2.setComposite(old);
                g2.dispose();
            }
        };
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
            Rectangle desktop = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
            int y = 0;
            switch (position) {
                case TOP:
                    y = desktop.y;
                    break;
                case CENTER:
                    y = desktop.height / 2 + desktop.y - getHeight() / 2;
                    break;
                case BOTTOM:
                    y = desktop.height + desktop.y - getHeight();
                    break;
            }
            setLocation(desktop.x, y);
            setSize(desktop.width, getHeight());
        }
        super.setVisible(visible);
    }
    public void setPaintGradient(boolean paintGradient) {
        this.paintGradient = paintGradient;
    }
    public boolean isPaintGradient() {
        return paintGradient;
    }

    public static void main(String[] args) {
        TranslucentFullDialog dialog =
                new TranslucentFullDialog(Color.ORANGE, TranslucentFullDialog.CENTER);
        dialog.setPaintGradient(true);
        dialog.setVisible(true);
    }

}