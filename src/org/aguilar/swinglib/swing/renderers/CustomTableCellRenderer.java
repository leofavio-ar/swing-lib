package org.aguilar.swinglib.swing.renderers;

import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Leo Aguilar
 */
public class CustomTableCellRenderer extends DefaultTableCellRenderer {

    private JLabel label;
    private DecimalFormat df = new DecimalFormat("#0.#");
    
    public CustomTableCellRenderer() {
        label = new JLabel();
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (value instanceof Double) {
            label.setBackground(c.getBackground());
            label.setHorizontalAlignment(JLabel.RIGHT);
            label.setFont(c.getFont());
            label.setText(df.format((Double)value));
            //label = (JLabel)table.getValueAt(row, column);
            return label;
        }
        return c;
    }
}