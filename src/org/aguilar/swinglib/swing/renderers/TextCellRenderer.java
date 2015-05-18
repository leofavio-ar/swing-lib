/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.renderers;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Leonardo Favio Aguilar Ramírez
 */
public class TextCellRenderer extends DefaultTableCellRenderer {

    private JLabel label;
    private Color bgcolor = null;
    private Color fgcolor = null;
    private Color original = null;
    private int alineacion = TextCellRenderer.LEFT;
    
    public TextCellRenderer() {
        this(null, null, TextCellRenderer.LEFT);
    }
    public TextCellRenderer(Color bgcolor) {
        this(bgcolor, null, TextCellRenderer.LEFT);
    }
    public TextCellRenderer(Color bgcolor, Color fgcolor) {
        this(bgcolor, fgcolor, TextCellRenderer.LEFT);
    }
    public TextCellRenderer(Color bgcolor, Color fgcolor, int alineacion) {
        label = new JLabel();
        label.setOpaque(true);
        this.bgcolor = bgcolor;
        this.fgcolor = fgcolor;
        this.original = bgcolor;
        this.alineacion = alineacion;
    }
    public Color getColor() {
        return bgcolor;
    }
    public void setColor(Color color) {
        this.bgcolor = color;
    }
    public Color getFgcolor() {
        return fgcolor;
    }
    public void setFgcolor(Color fgcolor) {
        this.fgcolor = fgcolor;
    }
    public int getOrientacion() {
        return alineacion;
    }
    public void setOrientacion(int orientacion) {
        this.alineacion = orientacion;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (isSelected) {
            label.setForeground(table.getSelectionForeground());
            label.setBackground(bgcolor = table.getSelectionBackground());
        } else {
            bgcolor = original;
            label.setForeground(table.getForeground());
            label.setBackground(bgcolor != null ? bgcolor : null);
        }
        setFont(table.getFont());
        if (hasFocus) {
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
            if (table.isCellEditable(row, column)) {
                setForeground(UIManager.getColor("Table.focusCellForeground"));
                setBackground(bgcolor = UIManager.getColor("Table.focusCellBackground"));
            }
        } else {
            setBorder(new EmptyBorder(1, 2, 1, 2));
        }
        label.setHorizontalAlignment(alineacion);
        label.setFont(c.getFont());
        label.setText(value.toString());
        return label;
    }
    
}