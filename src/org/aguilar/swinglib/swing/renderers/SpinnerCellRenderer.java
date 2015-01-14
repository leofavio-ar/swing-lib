/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.renderers;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Leo Aguilar
 */
public class SpinnerCellRenderer implements TableCellRenderer {

    private JSpinner spinner = new JSpinner();

    public SpinnerCellRenderer() {
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        spinner.setModel(model);
        spinner.setFont(new Font("Tahoma", Font.BOLD, 16));
    }
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        spinner.setValue(value);
        return spinner;
    }

}