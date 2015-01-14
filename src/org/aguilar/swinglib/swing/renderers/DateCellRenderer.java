/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.renderers;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Leo Aguilar
 */
public class DateCellRenderer extends DefaultTableCellRenderer {

    private JLabel label;
    private SimpleDateFormat sdf;
    private Color color = null;
    private String dateFormat;
    private int orientation = DateCellRenderer.RIGHT;

    public DateCellRenderer() {
        this(null, DateCellRenderer.CENTER, "dd/MM/yyyy");
    }
    public DateCellRenderer(String dateFormat) {
        this(null, DateCellRenderer.CENTER, dateFormat);
    }
    public DateCellRenderer(Color color, String dateFormat) {
        this(color, DateCellRenderer.CENTER, dateFormat);
    }
    public DateCellRenderer(Color color, int orientation, String dateFormat) {
        label = new JLabel();
        label.setOpaque(true);
        this.color = color;
        this.orientation = orientation;
        this.dateFormat = dateFormat;
        sdf = new SimpleDateFormat(dateFormat);
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
        if (value == null) {
            label.setText("");
        } else {
            String val = value.toString();
            label.setText(dateFormat != null ? sdf.format((Date)value) : val);
        }
        return label;
    }

}