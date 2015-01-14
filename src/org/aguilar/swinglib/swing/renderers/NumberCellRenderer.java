/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.renderers;

import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Leo Aguilar
 */
public class NumberCellRenderer extends DefaultTableCellRenderer {

    private JLabel label;
    private DecimalFormat df = new DecimalFormat("#,###,##0.00");
    private final String NUM = "\\-?\\d+(\\.\\d+)?(E?\\d+)?";
    private Color color = null;
    private boolean isInteger = false;
    private int orientation = NumberCellRenderer.RIGHT;
    private String mask = null;
    private boolean marcarRenglon = false;

    public NumberCellRenderer(Color color, int orientation) {
        label = new JLabel();
        label.setOpaque(true);
        this.color = color;
        this.orientation = orientation;
    }
    public NumberCellRenderer(Color color, boolean isInteger) {
        label = new JLabel();
        label.setOpaque(true);
        this.color = color;
        this.isInteger = isInteger;
    }
    public NumberCellRenderer(int orientation, boolean isInteger) {
        this(orientation, isInteger, null);
    }
    public NumberCellRenderer(int orientation, boolean isInteger, String mask) {
        label = new JLabel();
        label.setOpaque(true);
        this.orientation = orientation;
        this.isInteger = isInteger;
        this.mask = mask;
    }
    public NumberCellRenderer(Color color, int orientation, boolean isInteger) {
        label = new JLabel();
        label.setOpaque(true);
        this.color = color;
        this.orientation = orientation;
        this.isInteger = isInteger;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (isSelected) {
            label.setForeground(table.getSelectionForeground());
            label.setBackground(table.getSelectionBackground());
        } else {
            label.setForeground(table.getForeground());
            label.setBackground(color != null ? color : null);
        }
        setFont(table.getFont());
        if (hasFocus) {
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
            if (table.isCellEditable(row, column)) {
                setForeground(UIManager.getColor("Table.focusCellForeground"));
                setBackground(UIManager.getColor("Table.focusCellBackground"));
            }
        } else {
            setBorder(new EmptyBorder(1, 2, 1, 2));
        }
        label.setHorizontalAlignment(orientation);
        label.setFont(c.getFont());
        String val = value.toString();
        if (Pattern.matches(NUM, val)) {
            if (isInteger) {
                if (mask != null) {
                    DecimalFormat format = new DecimalFormat(mask);
                    label.setText(format.format(value instanceof Double ? ((Double)value).intValue() : (int)value));
                } else {
                    label.setText(val);
                }
            } else {
                if (mask != null) {
                    DecimalFormat format = new DecimalFormat(mask);
                    label.setText(format.format(Double.valueOf(val)));
                } else {
                    label.setText(df.format(Double.valueOf(val)));
                }
            }
        } else {
            label.setText("");
        }
        return label;
    }

}