/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.misc;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.AbstractLayoutCache;
import javax.swing.tree.TreePath;

/**
 *
 * @author Leo Aguilar
 */
public class CustomTreeUI extends BasicTreeUI {

    private JScrollPane fScrollPane;

    public CustomTreeUI() {
        super();
    }
    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        tree.addPropertyChangeListener("ancestor", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                parentDidChange();
            }
        });
    }
    private void parentDidChange() {
        if (tree.getParent() instanceof JViewport && tree.getParent().getParent() instanceof JScrollPane) {
            fScrollPane = (JScrollPane) tree.getParent().getParent();
        }
    }
    @Override
    protected AbstractLayoutCache.NodeDimensions createNodeDimensions() {
        return new NodeDimensionsHandler() {
            @Override
            public Rectangle getNodeDimensions(Object value, int row, int depth, boolean expanded, Rectangle size) {
                Rectangle dimensions = super.getNodeDimensions(value, row, depth, expanded, size);
                if (fScrollPane != null) {
                    dimensions.width = fScrollPane.getViewport().getWidth() - getRowX(row, depth);
                }
                return dimensions;
            }
        };
    }
    @Override
    protected void paintHorizontalLine(Graphics g, JComponent c, int y, int left, int right) {
        super.paintHorizontalLine(g, c, y, left, right);
    }
    @Override
    protected void paintVerticalPartOfLeg(Graphics g, Rectangle clipBounds, Insets insets, TreePath path) {
        super.paintVerticalPartOfLeg(g, clipBounds, insets, path);
    }
    @Override
    protected void drawDashedHorizontalLine(Graphics g, int y, int x1, int x2) {
        super.drawDashedHorizontalLine(g, y, x1, x2);
    }
    @Override
    protected void drawDashedVerticalLine(Graphics g, int x, int y1, int y2) {
        super.drawDashedVerticalLine(g, x, y1, y2);
    }

}