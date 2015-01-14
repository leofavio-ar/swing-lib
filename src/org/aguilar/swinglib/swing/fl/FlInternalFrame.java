package org.aguilar.swinglib.swing.fl;

import java.awt.AWTEvent;
import java.awt.ActiveEvent;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Leo Aguilar
 * Trébol Informatica
 * http://trebolinformatica.com.mx
 */
public class FlInternalFrame extends JInternalFrame {

    private boolean modal = false;

    public FlInternalFrame() {
        super();
    }
    public FlInternalFrame(String title) {
        super(title);
    }
    public FlInternalFrame(String title, boolean resizable) {
        super(title, resizable);
    }
    public FlInternalFrame(String title, boolean resizable, boolean closable) {
        super(title, resizable, closable);
    }
    public FlInternalFrame(String title, boolean resizable, boolean closable, boolean maximizable) {
        super(title, resizable, closable, maximizable);
    }
    public FlInternalFrame(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
    }
    @Override
    public void show() {
        super.show();
        if (modal)
            startModal();
    }
    @Override
    public void setVisible(boolean value) {
        super.setVisible(value);
        if (modal) {
            if (value)
                startModal();
            else
                stopModal();
        }
    }
    public void undecorate() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        this.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    } 
    private synchronized void startModal() {
        try {
            if (SwingUtilities.isEventDispatchThread()) {
                EventQueue theQueue = getToolkit().getSystemEventQueue();
                while (isVisible()) {
                    AWTEvent event = theQueue.getNextEvent();
                    Object source = event.getSource();
                    boolean dispatch = true;
                    if (event instanceof MouseEvent) {
                        MouseEvent e = (MouseEvent) event;
                        MouseEvent m = SwingUtilities.convertMouseEvent((Component) e.getSource(), e, this);
                        if (!this.contains(m.getPoint()) && e.getID() != MouseEvent.MOUSE_DRAGGED)
                            dispatch = false;
                    }
                    if (dispatch) {
                        if (event instanceof ActiveEvent)
                            ((ActiveEvent) event).dispatch();
                        else if (source instanceof Component)
                            ((Component) source).dispatchEvent(event);
                        else if (source instanceof MenuComponent)
                            ((MenuComponent) source).dispatchEvent(event);
                        else
                            System.err.println("Unable to dispatch: " + event);
                    }
                }
            } else
                while (isVisible())
                    wait();
        } catch (InterruptedException ignored) {

        }
    }
    private synchronized void stopModal() {
        notifyAll();
    }
    public void setModal(boolean modal) {
        this.modal = modal;
    }
    public boolean isModal() {
        return this.modal;
    }

}