package org.aguilar.swinglib.swing.models;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo Aguilar
 */
public class CustomTableModel  extends DefaultTableModel{

    private boolean editable = false;
    private boolean[] editableColumns = null;
    private Class<?>[] columnsClass = null;

    public CustomTableModel () {
        super();
    }
    public CustomTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }
    public CustomTableModel(Object[][] data, Object[] columnNames, boolean[] editableColumns) {
        this(data, columnNames, editableColumns, null);
    }
    public CustomTableModel(Object[][] data, Object[] columnNames, boolean[] editableColumns, Class<?>[] columnsClass) {
        super(data, columnNames);
        this.editableColumns = editableColumns;
        this.columnsClass = columnsClass;
        Class<?>[] c = new Class<?>[columnNames.length];
        for (int i = 0; i < c.length; i ++) {
            c[i] = null;
        }
        this.columnsClass = c;
    }
    public CustomTableModel(Object[][] data, Object[] columnNames, boolean editable) {
        super(data, columnNames);
        this.editable = editable;
    }
    public CustomTableModel(Vector data, Vector columnNames, boolean editable) {
        super(data, columnNames);
        this.editable = editable;
    }
    public CustomTableModel(Vector columnNames, int rowCount, boolean editable) {
        super(columnNames, rowCount);
        this.editable = editable;
    }
    public CustomTableModel(int rowCount, int columnCount, boolean editable) {
        super(rowCount, columnCount);
        this.editable = editable;
    }
    @Override
    public boolean isCellEditable(int row, int column) {
        if (editableColumns == null) {
            return editable;
        }
        return editableColumns[column];
    }
    @Override
    public Class getColumnClass(int column) {
        if (columnsClass == null || columnsClass[column] == null) {
            return getRowCount() > 0 ? getValueAt(0, column).getClass() : super.getClass();
        }
        return columnsClass[column];
    }
    public void setColumnClass(Class<?> c, int column) {
        this.columnsClass[column] = c;
    }
    public void setColumnsClass(Class<?>[] columnsClass) {
        this.columnsClass = columnsClass;
    }
    @Override
    public void setValueAt(Object value, int row, int column) {
        super.setValueAt(value, row, column);
        fireTableCellUpdated(row, column);
    }
    
}