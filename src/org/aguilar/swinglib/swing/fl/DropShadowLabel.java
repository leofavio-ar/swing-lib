/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 
 * @author Leo Aguilar
 */
public class DropShadowLabel extends JLabel {
    
    /** Used to generate drop shadown. */
    private final ConvolveOp blur;
    /** Sized used for Kernel used to generate drop shadow. */
    private static final int KERNEL_SIZE = 3;
    /** Factor used for Kernel used to generate drop shadow. */
    private static final float BLUR_FACTOR = 0.1f;
    /** How far to shift the drop shadow along the horizontal axis. */
    private static final int SHIFT_X = 0;
    /** How far to shift the drop shadow along the vertical axis. */
    private static final int SHIFT_Y = 1;
    private BufferedImage textImage, dropShadowImage;

    /**
     * Creates a new instance of DropShadowLabel
     */
    public DropShadowLabel() {
        this("");
    }
    /**
     * Creates a new instance of DropShadowLabel with the given text.
     * @param text Text to display
     */
    public DropShadowLabel(String text) {
        super(text);
        int kw = KERNEL_SIZE, kh = KERNEL_SIZE;
        float blurFactor = BLUR_FACTOR;
        float[] kernelData = new float[kw * kh];
        for (int i = 0; i < kernelData.length; i++) {
            kernelData[i] = blurFactor;
        }
        blur = new ConvolveOp(new Kernel(kw, kh, kernelData));
    }
    @Override
    protected void paintComponent(Graphics g) {
        Insets insets = getInsets();
        int w = getWidth() - (insets.left + insets.right);
        int h = getHeight() - (insets.top + insets.bottom);
        if (textImage == null) {
            textImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            dropShadowImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        }
        // Step 1: render the text.
        Graphics2D textImageG = textImage.createGraphics();
        textImageG.setComposite(AlphaComposite.Clear);
        textImageG.fillRect(0, 0, w, h);
        textImageG.setComposite(AlphaComposite.SrcOver);
        textImageG.setColor(getForeground());
        textImageG.setFont(getFont());
        paintText(textImageG, getText());
        textImageG.dispose();
        // Step 2: copy the image containing the text to dropShadowImage using
        // the blur effect, which generates a nice drop shadow.
        Graphics2D blurryImageG = dropShadowImage.createGraphics();
        blurryImageG.setComposite(AlphaComposite.Clear);
        blurryImageG.fillRect(0, 0, w, h);
        blurryImageG.setComposite(AlphaComposite.SrcOver);
        blurryImageG.drawImage(textImage, blur, SHIFT_X, SHIFT_Y);
        blurryImageG.setColor(getForeground());
        blurryImageG.setFont(getFont());
        // Step 3: render the text again on top.
        paintText(blurryImageG, getText());
        blurryImageG.dispose();
        // And finally copy it.
        g.drawImage(dropShadowImage, 0, 0, null);
    }
    private void paintText(Graphics g, String text) {
        g.drawString(text, 0, g.getFontMetrics(g.getFont()).getAscent());
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba DropShadowLabel");
        frame.setMinimumSize(new java.awt.Dimension(500, 150));
        frame.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        DropShadowLabel label = new DropShadowLabel("<html>Leonardo Aguilar</html>");
        label.setForeground(Color.ORANGE);
        label.setFont(new java.awt.Font("Tahoma", 0, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

}