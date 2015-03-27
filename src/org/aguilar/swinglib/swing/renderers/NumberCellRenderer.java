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
    private Color original = null;
    private boolean isInteger = false;
    private int orientation = NumberCellRenderer.RIGHT;
    private String mask = null;
    private boolean marcarRenglon = false;

    public NumberCellRenderer(Color color, int orientation) {
        this(color, orientation, false, null);
    }
    public NumberCellRenderer(Color color, boolean isInteger) {
        this(color, NumberCellRenderer.RIGHT, isInteger, null);
    }
    public NumberCellRenderer(int orientation, boolean isInteger) {
        this(null, orientation, isInteger, null);
    }
    public NumberCellRenderer(int orientation, boolean isInteger, String mask) {
        this(null, orientation, isInteger, mask);
    }
    public NumberCellRenderer(Color color, int orientation, boolean isInteger) {
        this(color, orientation, isInteger, null);
    }
    public NumberCellRenderer(Color color, int orientation, boolean isInteger, String mask) {
        label = new JLabel();
        label.setOpaque(true);
        this.color = color;
        this.original = color;
        this.orientation = orientation;
        this.isInteger = isInteger;
        this.mask = mask;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (isSelected) {
            label.setForeground(table.getSelectionForeground());
            label.setBackground(color = table.getSelectionBackground());
        } else {
            color = original;
            label.setForeground(table.getForeground());
            label.setBackground(color != null ? color : null);
        }
        setFont(table.getFont());
        if (hasFocus) {
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
            if (table.isCellEditable(row, column)) {
                setForeground(UIManager.getColor("Table.focusCellForeground"));
                setBackground(color = UIManager.getColor("Table.focusCellBackground"));
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
            label.setText("0.00");
        }
        return label;
    }

}