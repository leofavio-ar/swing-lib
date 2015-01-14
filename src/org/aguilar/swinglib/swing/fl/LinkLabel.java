package org.aguilar.swinglib.swing.fl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import org.aguilar.swinglib.utils.ColorUtils;

/**
 *
 * @author I.S.C. Leonardo Favio Aguilar Ramírez [Leo Aguilar]
 */

public class LinkLabel extends JLabel implements MouseListener {

    private Color oldForeground;
    private Font orgFont;
    private Font underlineFont;

    public LinkLabel() {
        super();
        setLinkBehavior();
    }
    public LinkLabel(String text) {
        super(text);
        setLinkBehavior();
        calculateFonts();
    }
    private void calculateFonts() {
        orgFont = new Font("Tahoma", Font.BOLD, 12);
        Map fontAttributes = new HashMap<TextAttribute, Integer>();
        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        underlineFont = orgFont.deriveFont(fontAttributes);
        setFont(underlineFont);
    }
    @Override
    public void setForeground(Color foreground) {
        oldForeground = getForeground();
        super.setForeground(foreground);
    }
    @Override
    protected void processMouseEvent(MouseEvent evt){
        super.processMouseEvent(evt);
        if (evt.getID() == MouseEvent.MOUSE_CLICKED)
            fireActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, getText()));
    }
    public Color getOldForeground() {
        return oldForeground;
    }
    public void setOrgFont(Font font) {
        this.orgFont = font;
        calculateFonts();
    }
    /**
     *  Adds an ActionListener to the list of listeners receiving notifications
     *  when the label is clicked.
     *
     *  @param  listener    The ActionListener to add.
     */
    public void addActionListener(ActionListener listener){
        listenerList.add(ActionListener.class, listener);
    }
    /**
     *  Removes the given ActionListener from the list of listeners receiving
     *  notifications when the label is clicked.
     *
     *  @param  listener    The ActionListener to remove.
     */
    public void removeActionListener(ActionListener listener){
        listenerList.remove(ActionListener.class, listener);
    }
    private void setLinkBehavior() {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        enableEvents(MouseEvent.MOUSE_EVENT_MASK);
        addMouseListener(this);
    }
    protected void fireActionPerformed(ActionEvent evt){
        Object [] listeners = listenerList.getListenerList();
        for (int i = 0; i < listeners.length; i += 2)
            if (listeners[i] == ActionListener.class) {
                ActionListener listener = (ActionListener)listeners[i + 1];
                listener.actionPerformed(evt);
            }
    }
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void mouseEntered(MouseEvent e) {
        LinkLabel label = (LinkLabel)e.getSource();
        label.setForeground(
            ColorUtils.adjustColorBrightness(
                label.getForeground(),
                ColorUtils.isDark(label.getForeground(), 130) ? 0.2f : -0.2f));
        label.setFont(orgFont);
    }
    public void mouseExited(MouseEvent e) {
        LinkLabel label = (LinkLabel)e.getSource();
        label.setForeground(label.getOldForeground());
        label.setFont(underlineFont);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 200);
        LinkLabel label = new LinkLabel("TEXTO DE EJEMPLO");
        label.setForeground(Color.ORANGE);
        frame.add(label, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}