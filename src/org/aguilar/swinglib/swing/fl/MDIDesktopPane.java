/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

/**
 *
 * @author I.S.C. Leonardo Favio Aguilar Ramírez [Leo Aguilar]
 */

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 * An extension of JDesktopPane that supports often used MDI functionality. This class also handles
 * setting scroll bars for when windows move too far to the left or bottom, providing the
 * MDIDesktopPane is in a ScrollPane.
 *
 * From JavaWorld article (http://www.javaworld.com/javaworld/jw-05-2001/jw-0525-mdi.html)
 */
public class MDIDesktopPane extends FlDesktopPane {

    private static final long serialVersionUID = -5746013654602797327L;
        private static int FRAME_OFFSET = 20;
        private MDIDesktopManager manager;
        private final List<MaximizeListener> maxListeners = new ArrayList<MaximizeListener>();

        public interface MaximizeListener {
                public void internalFrameMaximized(JInternalFrame f);

                public void internalFrameUnmaximized(JInternalFrame f);
        }
        public MDIDesktopPane() {
                manager = new MDIDesktopManager();
                setDesktopManager(manager);
        }
        public void addMaximizeListener(MaximizeListener maxListener) {
                maxListeners.add(maxListener);
        }

        private void fireOne(JInternalFrame f) {
                for (MaximizeListener guy : maxListeners) {
                        guy.internalFrameMaximized(f);
                }
        }

        private void fireTwo(JInternalFrame f) {
                for (MaximizeListener guy : maxListeners) {
                        guy.internalFrameUnmaximized(f);
                }
        }

        @Override
        public void setBounds(int x, int y, int w, int h) {
                super.setBounds(x, y, w, h);
                checkDesktopSize();
        }

        @Override
        public Component add(Component component) {
                super.add(component);
                if (!(component instanceof JInternalFrame)) {
                        return component;
                }
                JInternalFrame frame = (JInternalFrame) component;
                JInternalFrame[] allFrames = getAllFrames();
                checkDesktopSize();
                Point p = new Point((allFrames.length - 1) * FRAME_OFFSET, (allFrames.length - 1) * FRAME_OFFSET);
                frame.setLocation(p.x, p.y);
                return component;
        }

        @Override
        public void remove(Component c) {
                super.remove(c);
                checkDesktopSize();
        }

        private void checkDesktopSize() {
                if (getParent() != null && isVisible()) {
                        manager.resizeDesktop();
                }
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
                        if (MDIDesktopPane.this.getParent() instanceof JViewport) {
                                JViewport viewPort = (JViewport) MDIDesktopPane.this.getParent();
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
                                for (JInternalFrame frame : MDIDesktopPane.this.getAllFrames()) {
                                        if (rect == null) {
                                                rect = frame.getBounds();
                                        } else {
                                                rect = rect.union(frame.getBounds());
                                        }
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