/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.aguilar.swinglib.utils.ColorUtils;

/**
 *
 * @author Leo Aguilar
 */
public class FlRoundButton extends JButton {

    private Shape shape;
    private int roundness;
    private LinearGradientPaint gradientNormal;
    private LinearGradientPaint gradientHover;
    private LinearGradientPaint gradientPressed;

    public FlRoundButton() {
        this("flRoundButton", null, 16);
    }
    public FlRoundButton(String text) {
        this(text, null, 16);
    }
    public FlRoundButton(ImageIcon icon) {
        this("", icon, 16);
    }
    public FlRoundButton(String text, ImageIcon icon) {
        this(text, icon, 16);
    }
    public FlRoundButton(String text, int roundness) {
        this(text, null, roundness);
    }
    public FlRoundButton(ImageIcon icon, int roundness) {
        this("", icon, roundness);
    }
    public FlRoundButton(String text, ImageIcon icon, int roundness) {
        super(text, icon);
        setUI(new javax.swing.plaf.metal.MetalButtonUI());
        setMargin(new Insets(2, 5, 2, 5));
        setFont(new Font("Tahoma", Font.PLAIN, 12));
        setContentAreaFilled(false);
        setFocusPainted(false);
        this.roundness = roundness;
        this.setFocusable(true);
    }
    private void initColors() {
        Color background = UIManager.getColor("Button.background");
        Color dark = ColorUtils.adjustColorBrightness(background, -0.1f);
//        Color shadow = UIManager.getColor("Button.shadow");
        if (gradientNormal == null) {
            gradientNormal = new LinearGradientPaint(0, 0, 0, getHeight(), new float[] {0.0f, 0.499f, 0.5f, 1.0f},
//                    new Color[] {ColorUtils.adjustColorBrightness(background, 0.1f), background, dark, ColorUtils.adjustColorBrightness(dark, -0.1f)});
                    new Color[] {new Color(0xf8f8f8), new Color(0xd9d9d9), new Color(0xcacaca), new Color(0xbbbbbb)});
        }
        if (gradientPressed == null) {
            gradientPressed = new LinearGradientPaint(0, 0, 0, getHeight(), new float[] {0.0f, 0.499f, 0.5f, 1.0f},
//                    new Color[] {ColorUtils.adjustColorBrightness(dark, -0.1f), dark, background, ColorUtils.adjustColorBrightness(background, 0.1f)});
                    new Color[] {new Color(0xbbbbbb), new Color(0xcacaca), new Color(0xd9d9d9), new Color(0xf8f8f8)});
        }
        if (gradientHover == null) {
            gradientHover = new LinearGradientPaint(0, 0, 0, getHeight(), new float[] {0.0f, 0.499f, 0.5f, 1.0f},
//                    new Color[] {
//                        ColorUtils.adjustColorBrightness(background, 0.15f),
//                        ColorUtils.adjustColorBrightness(background, 0.1f),
//                        ColorUtils.adjustColorBrightness(dark, 0.1f),
//                        ColorUtils.adjustColorBrightness(dark, -0.05f)});
                    new Color[] {new Color(0xffffff), new Color(0xf0f0f0), new Color(0xe4e4e4), new Color(0xdddddd)});
        }
    }
    @Override
    public void paint(Graphics g) {
        initColors();
        super.paint(g);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (!getModel().isArmed()) {
            g2.setPaint(gradientNormal);
        }
        if (getModel().isRollover()) {
            g2.setPaint(gradientHover);
        }
        if (getModel().isArmed()) {
            g2.setPaint(gradientPressed);
        }
        g2.fillRoundRect(0, 0, getSize().width, getSize().height, roundness, roundness);
        super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g) {
//        super.paintBorder(g);
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(UIManager.getColor("Button.darkShadow"));
        g2.setStroke(new BasicStroke(0.3f));
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, roundness, roundness));
    }
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(2, 2, getWidth() - 4, getHeight() - 4, roundness, roundness);
        }
        return shape.contains(x, y);
    }
    public static void main(String[] args) {
        FlRoundButton button = new FlRoundButton("EJEMPLO", 5);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(button, BorderLayout.NORTH);
//        frame.getContentPane().setLayout(new FlowLayout());
        button.requestFocusInWindow();
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
    
}