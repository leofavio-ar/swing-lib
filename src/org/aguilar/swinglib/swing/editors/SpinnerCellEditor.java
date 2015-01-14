/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.editors;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Leo Aguilar
 */
public class SpinnerCellEditor extends AbstractCellEditor implements TableCellEditor {

    private JSpinner spinner = new JSpinner();
    
    public SpinnerCellEditor(int min, int max, Number incremento) {
        SpinnerNumberModel model = new SpinnerNumberModel(min, min, max, incremento);
        spinner.setModel(model);
        spinner.setForeground(Color.GREEN);
    }
    public SpinnerCellEditor() {
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 0.5);
        spinner.setModel(model);
        spinner.setForeground(Color.GREEN);
    }
    @Override
    public boolean isCellEditable(EventObject evt) {
//        if (evt instanceof MouseEvent)
//            return ((MouseEvent)evt).getClickCount() >= 2;
        return true;
    }
    @Override
    public Object getCellEditorValue() {
        return spinner.getValue();
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        spinner.setFont(table.getFont().deriveFont(Font.BOLD));
        spinner.setValue(value);
        return spinner;
    }
    
}