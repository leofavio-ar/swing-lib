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
    private Color bgColor;
    
    public SpinnerCellEditor() {
        this(0, 0, Integer.MAX_VALUE, null);
    }
    public SpinnerCellEditor(int min, int max) {
        this(min, max, 1, null);
    }
    public SpinnerCellEditor(int min, int max, Number incremento) {
        this(min, max, incremento, null);
    }
    public SpinnerCellEditor(int min, int max, Number incremento, Color bgColor) {
        SpinnerNumberModel model = new SpinnerNumberModel(min, min, max, incremento);
        spinner.setModel(model);
        spinner.setForeground(Color.GREEN);
        setBgColor(bgColor);
    }
    public Color getBgColor() {
        return bgColor;
    }
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
        ((JSpinner.DefaultEditor)spinner.getEditor()).getTextField().setBackground(bgColor);
    }
    @Override
    public boolean isCellEditable(EventObject evt) {
        return true;
    }
    @Override
    public Object getCellEditorValue() {
        return (Number)spinner.getValue();
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        spinner.setFont(table.getFont().deriveFont(Font.BOLD));
        spinner.setValue((Number)value);
        return spinner;
    }
    
}