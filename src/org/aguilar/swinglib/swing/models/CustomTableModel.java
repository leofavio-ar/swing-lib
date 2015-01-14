package org.aguilar.swinglib.swing.models;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo Aguilar
 * Trébol Informatica
 * http://www.trebolinformatica.com.mx
 */
public class CustomTableModel  extends DefaultTableModel{

    private boolean editable = false;
    private boolean[] editableColumns = null;

    public CustomTableModel () {
        super();
    }
    public CustomTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }
    public CustomTableModel(Object[][] data, Object[] columnNames, boolean[] editableColumns) {
        super(data, columnNames);
        this.editableColumns = editableColumns;
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
        if (editableColumns == null)
            return editable;
        return editableColumns[column];
    }
    @Override
    public Class getColumnClass(int column) {
        return getRowCount() > 0 ? getValueAt(0, column).getClass() : super.getClass();
    }
    @Override
    public void setValueAt(Object value, int row, int column) {
        super.setValueAt(value, row, column);
        fireTableCellUpdated(row, column);
    }
    
}