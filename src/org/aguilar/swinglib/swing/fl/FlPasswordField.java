/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.text.Document;

/**
 *
 * @author Leo Aguilar
 */
public class FlPasswordField extends JPasswordField {

    private int minLength = 0;
    private int maxLength = -1;
    private int placeHolderGap = 2;
    private ImageIcon placeHolderIcon;
    private String placeHolderText = "";
    private Insets dummyInsets;
    
    public FlPasswordField() {
        super();
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                ((FlPasswordField)e.getSource()).selectAll();
            }
        });
        Border border = UIManager.getBorder("TextField.border");
        JTextField dummy = new JTextField();
        this.dummyInsets = border.getBorderInsets(dummy);
    }
    public FlPasswordField(String text) {
        super(text);
    }
    public FlPasswordField(int columns) {
        super(columns);
    }
    public FlPasswordField(String text, int columns) {
        super(text, columns);
    }
    public FlPasswordField(Document doc, String text, int columns) {
        super(doc, text, columns);
    }
    public void setPlaceHolderGap(int placeHolderGap) {
        this.placeHolderGap = placeHolderGap;
    }
    public void setPlaceHolderIcon(ImageIcon placeHolderIcon) {
        this.placeHolderIcon = placeHolderIcon;
    }
    public void setPlaceHolderText(String placeHolderText) {
        this.placeHolderText = placeHolderText;
    }
    public void setMaxLength(final int maxLength) {
        this.maxLength = maxLength;
        if (maxLength != -1) {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    JTextField jtf = (JTextField)e.getComponent();
                    if (jtf.getText().length() >= maxLength) {
                        e.consume();
                    }
                }
            });
        }
    }
    public int getPlaceHolderGap() {
        return placeHolderGap;
    }
    public ImageIcon getPlaceHolderIcon() {
        return placeHolderIcon;
    }
    public String getPlaceHolderText() {
        return placeHolderText;
    }
    public int getMaxLength() {
        return maxLength;
    }
    @Override
    public String getText() {
        return String.valueOf(this.getPassword());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int textX = 2;
        if (this.placeHolderIcon != null) {
            int iconWidth = placeHolderIcon.getIconWidth();
            int iconHeight = placeHolderIcon.getIconHeight();
            this.setSize(this.getWidth(), iconHeight + placeHolderGap);
            int x = dummyInsets.left + 5;
            textX = x + iconWidth + 2;
            int y = (this.getHeight() - iconHeight) / 2;
            placeHolderIcon.paintIcon(this, g, x, y);
        }
        setMargin(new Insets(2, textX, 2, 2));
        if (this.getText().equals("")) {
            int width = this.getWidth();
            int height = this.getHeight();
            Font prev = g.getFont();
            Font italic = prev.deriveFont(Font.ITALIC);
            Color prevColor = g.getColor();
            g.setFont(italic);
            g.setColor(UIManager.getColor("textInactiveText"));
            int h = g.getFontMetrics().getHeight();
            int textBottom = (height - h) / 2 + h - 4;
            int x = this.getInsets().left;
            Graphics2D g2d = (Graphics2D) g;
            RenderingHints hints = g2d.getRenderingHints();
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2d.drawString(placeHolderText, x, textBottom);
            g2d.setRenderingHints(hints);
            g.setFont(prev);
            g.setColor(prevColor);
        }
    }

}