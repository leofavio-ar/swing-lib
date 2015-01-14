/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.laf;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalToolTipUI;

/**
 *
 * @author Leo Aguilar
 */
public class FlToolTipUI extends MetalToolTipUI {

    public void __org__aguilar__mycontrols__laf__FlToolTipUI__installUI(JComponent paramJComponent) {
        super.installUI(paramJComponent);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
//        Graphics2D g2 = (Graphics2D)g.create();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        Composite old = g2.getComposite();
//        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
//        Area area = new Area();
//        Shape triangle = new Polygon(new int[] {0, 15, 15}, new int[] {getHeight() / 2, 0, getHeight()}, 3);
//        Shape roundRect = new RoundRectangle2D.Float(15, 0, getWidth() - 15, getHeight(), 10, 10);
//        Shape rect = new Rectangle2D.Float(15, 0, 10, getHeight());
//        area.add(new Area(roundRect));
//        area.add(new Area(triangle));
//        area.add(new Area(rect));
//        g2.setColor(Color.BLACK);
//        g2.fill(area);
//        g2.setComposite(old);
//        g2.dispose();
    }

}