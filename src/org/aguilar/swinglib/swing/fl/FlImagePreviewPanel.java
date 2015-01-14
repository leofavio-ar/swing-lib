/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Leo Aguilar
 */
public class FlImagePreviewPanel extends javax.swing.JPanel {

    private BufferedImage image;
    private BufferedImage scaledImage;

    /** Creates new form FlImagePreviewPanel */
    public FlImagePreviewPanel() {
        super();
    }
    public void setImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
            repaint();
        } catch (IOException ex) {
            Logger.getLogger(FlImagePreviewPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Image getImage() {
        return image;
    }
    private double getScale(int imageWidth, int imageHeight) {
        double ratio = Math.min((double)getHeight() / (double)imageHeight, (double)getWidth() / (double)imageWidth);
        if (ratio > 1D)
            ratio = 1D;
        return ratio;
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        if (image != null) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            scaledImage = image;
            int panelWidth = this.getWidth();
            int panelHeight = this.getHeight();
            int imageWidth = scaledImage.getWidth();
            int imageHeight = scaledImage.getHeight();
            double scale = getScale(imageWidth, imageHeight);
            double xPos = (panelWidth - (scale * imageWidth)) / 2;
            double yPos = (panelHeight - (scale * imageHeight)) / 2;
            AffineTransform at = AffineTransform.getTranslateInstance(xPos, yPos);
            at.scale(scale, scale);
            g2.drawRenderedImage(scaledImage, at);
        }
    }

}