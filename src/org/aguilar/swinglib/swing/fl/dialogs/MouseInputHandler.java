/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl.dialogs;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

/**
 * Class handling mouse input to enable titlePane become drag-able and window become move-able.
 * @author Leo Aguilar
 */
public class MouseInputHandler implements MouseInputListener {

    private boolean isMovingWindow;
    private int dragOffsetX;
    private int dragOffsetY;
    private static final int BORDER_DRAG_THICKNESS = 5;
    private TranslucentDialog dialog;

    public MouseInputHandler(TranslucentDialog dialog) {
        this.dialog = dialog;
    }
    public void mousePressed(MouseEvent ev) {
        Point dragWindowOffset = ev.getPoint();
        JComponent titlePane = dialog.getTitlePane();
        if (dialog != null)
            dialog.toFront();
        Point convertedDragWindowOffset = SwingUtilities.convertPoint(dialog, dragWindowOffset, titlePane);
        if (titlePane.contains(convertedDragWindowOffset)) {
            if (   dragWindowOffset.y >= BORDER_DRAG_THICKNESS
                && dragWindowOffset.x >= BORDER_DRAG_THICKNESS
                && dragWindowOffset.x < dialog.getWidth() - BORDER_DRAG_THICKNESS) {
                isMovingWindow = true;
                dragOffsetX = dragWindowOffset.x;
                dragOffsetY = dragWindowOffset.y;
            }
        } else if (dialog.isResizable()) {
            dragOffsetX = dragWindowOffset.x;
            dragOffsetY = dragWindowOffset.y;
        }
    }
    public void mouseReleased(MouseEvent ev) {
        isMovingWindow = false;
    }
    public void mouseDragged(MouseEvent ev) {
        if (isMovingWindow) {
            Point windowPt = MouseInfo.getPointerInfo().getLocation();
            windowPt.x = windowPt.x - dragOffsetX;
            windowPt.y = windowPt.y - dragOffsetY;
            dialog.setLocation(windowPt);
        }
    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}

}