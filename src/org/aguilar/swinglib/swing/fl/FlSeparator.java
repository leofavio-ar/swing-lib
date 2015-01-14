/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import org.aguilar.swinglib.utils.GradientOrientation;

/**
 *
 * @author Leo Aguilar
 */
public class FlSeparator extends JSeparator {

    private Color color;
    private int stroke;
    private GradientOrientation gradientOrientation = GradientOrientation.LEFT_TO_RIGHT;
    private boolean drawGradient = true;
    private int base = 0;
    
    public FlSeparator() {
        this(Color.BLACK, 5, FlSeparator.HORIZONTAL);
    }
    public FlSeparator(Color color) {
        this(color, 5, FlSeparator.HORIZONTAL);
    }
    public FlSeparator(Color color, int strokeWidth) {
        this(color, strokeWidth, FlSeparator.HORIZONTAL);
    }
    public FlSeparator(Color color, int strokeWidth, int orientation) {
        super(orientation);
        this.color = color;
        setStroke(strokeWidth);
        paintGradient(drawGradient, gradientOrientation);
    }
    /**
     * Indica si el color del separador se mostrará como un gradiente o como un color sólido.
     * @param drawGradient Si el valor es <code>true</code> el separador mostrará un gradiente de dos
     * colores, el indicado en la variable <code>color</code> y el blanco con alpha 0; de lo
     * contrario se muestra uniformemente el color indicado.
     */
    public void setDrawGradient(boolean drawGradient) {
        paintGradient(drawGradient, gradientOrientation);
    }
    /**
     * Asigna la orientación del gradiente. El valor por defecto es LEFT_TO_RIGHT.
     * @param gradientOrientation La orientación del gradiente, una de las siguientes constantes:
     * <code>GradientOrientation.LEFT_TO_RIGHT</code>, <code>GradientOrientation.RIGHT_TO_LEFT</code>,
     * <code>GradientOrientation.TOP_TO_BOTTOM</code> o <code>GradientOrientation.BOTTOM_TO_TOP</code>.
     */
    public void setGradientOrientation(GradientOrientation gradientOrientation) {
        gradientOrientation = gradientOrientation == null ? GradientOrientation.LEFT_TO_RIGHT : gradientOrientation;
        paintGradient(drawGradient, gradientOrientation);
    }
    /**
     * Asigna el color que se tomará como base para colorear el separador.
     * @param color El color con el que se coloreará el separador.
     */
    public void setColor(Color color) {
        this.color = color;
    }
    /**
     * Asigna el grosor que mostrará el separador.
     * @param stroke El grosor del separador.
     */
    public void setStroke(int stroke) {
        this.stroke = stroke;
        int width;
        int height;
        if (getOrientation() == SwingConstants.HORIZONTAL)
            setMinimumSize(new java.awt.Dimension(width = 31, height = stroke));
        else
            setMinimumSize(new java.awt.Dimension(width = stroke, height = 31));
        setMaximumSize(new java.awt.Dimension(width, height));
        setSize(width, height);
    }
    /**
     * Asigna la medida de la base de los triángulos que se agregan
     * a los extremos del separador.
     * @param base La base en pixeles de los triángulos que se agregarán a los
     * extremos del separador.
     */
    public void setBase(int base) {
        this.base = base;
        repaint();
    }
    /**
     * Devuelve el valor que indica si el separador muestra o no un gradiente.
     * @return <code>true</code> si se está mostrando un gradiente para el separador
     * o <code>false</code> para indicar que es un color sólido.
     */
    public boolean isDrawGradient() {
        return drawGradient;
    }
    /**
     * Devuelve el valor que indica la orientación del gradiente.
     * @return Un entero indicando la orientación del gradiente.
     */
    public GradientOrientation getGradientOrientation() {
        return gradientOrientation;
    }
    /**
     * Devuelve el valor que indica el color base utilizado para mostrar el separador.
     * @return El color utilizado para pintar el separador.
     */
    public Color getColor() {
        return color;
    }
    /**
     * Devuelve el valor que indica el grosor del separador.
     * @return El grosor del separador.
     */
    public int getStroke() {
        return stroke;
    }
    private void paintGradient(boolean drawGradient, GradientOrientation gradientOrientation) {
        this.drawGradient = drawGradient;
        this.gradientOrientation = gradientOrientation;
        repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Composite old = g2.getComposite();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
        boolean isH = getOrientation() == FlSeparator.HORIZONTAL;
        if (drawGradient) {
            float[] x = new float[] {};
            float[] y = new float[] {};
            switch (gradientOrientation) {
                case LEFT_TO_RIGHT:
                    x = new float[] {0, isH ? getWidth() : stroke};
                    y = new float[] {0, 0};
                    break;
                case RIGHT_TO_LEFT:
                    x = new float[] {isH ? getWidth() : stroke, 0};
                    y = new float[] {0, 0};
                    break;
                case TOP_TO_BOTTOM:
                    x = new float[] {0, 0};
                    y = new float[] {0, isH ? stroke : getHeight()};
                    break;
                case BOTTOM_TO_TOP:
                    x = new float[] {0, 0};
                    y = new float[] {isH ? stroke : getHeight(), 0};
                    break;
            }
            LinearGradientPaint gradient = new LinearGradientPaint(x[0], y[0], x[1], y[1],
                    new float[] {0.0f, 1.0f}, new Color[] {color, new Color(255, 255, 255, 0)});
            g2.setPaint(gradient);
        } else
            g2.setColor(color);
        if (base > 0) {
            Point p = new Point (isH ? base : 0, isH ? 0 : base);
            Dimension dim = new Dimension(isH ? getWidth() - base * 2 : stroke, isH ? stroke : getHeight() - base * 2);
            Polygon leftTriangle = new Polygon(
                    isH ? new int[] {0, base, base} : new int[] {0, 0, stroke},
                    isH ? new int[] {stroke, 0, stroke} : new int[] {0, base, base}, 3);
            Polygon rightTriangle = new Polygon(
                    isH ? new int[] {getWidth(), getWidth() - base, getWidth() - base} : new int[] {stroke, stroke, 0},
                    isH ? new int[] {0, 0, stroke} : new int[] {getHeight(), getHeight() - base, getHeight() - base}, 3);
            Shape shape = new Rectangle(p, dim);
            Area left = new Area(leftTriangle);
            Area right = new Area(rightTriangle);
            Area area = new Area(shape);
            area.add(left);
            area.add(right);
            g2.fill(area);
        } else {
            Shape shape = new Rectangle(0, 0, isH ? getWidth() : stroke, isH ? stroke : getHeight());
            g2.fill(shape);
        }
        g2.setComposite(old);
        g2.dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de esta nueva madre");
        FlSeparator separator = new FlSeparator(Color.DARK_GRAY, 20, FlSeparator.HORIZONTAL);
        separator.setDrawGradient(true);
        separator.setGradientOrientation(null);
        frame.setLayout(new BorderLayout());
        frame.setMinimumSize(new java.awt.Dimension(500, 100));
        frame.add(separator, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}