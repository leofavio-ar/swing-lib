package org.aguilar.swinglib.swing.fl;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.aguilar.swinglib.swing.models.CustomTableModel;
import org.aguilar.swinglib.utils.methods.AbstractCommand;

/**
 *
 * @author Leo Aguilar
 */
public class FlTable extends JTable {

    private List<Map> dataProvider;
    private TableRowSorter<CustomTableModel> sorter;
    private String[] visibleMapKeys;
    private String[] visibleColumnNames;
    private boolean[] editableColumns;
//    private List<boolean[]> editable;
    private Class<?>[] columnsClass;

    public FlTable() {
        super(null, null, null);
        setSize(200, 200);
        setSurrendersFocusOnKeystroke(true);
        sorter = new TableRowSorter<CustomTableModel>();
        setRowSorter(sorter);
        addCellLostFocusListener();
        removeEnterKeyEvent();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(int numRows, int numCols) {
        super(new CustomTableModel(numRows, numCols, true));
        sorter = new TableRowSorter<CustomTableModel>((CustomTableModel)getModel());
        setRowSorter(sorter);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(Object[][] data, Object[] colNames) {
        super(new CustomTableModel(data, colNames, true));
        sorter = new TableRowSorter<CustomTableModel>((CustomTableModel)getModel());
        setRowSorter(sorter);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(Vector data, Vector colNames) {
        super(new CustomTableModel(data, colNames, true));
        sorter = new TableRowSorter<CustomTableModel>((CustomTableModel)getModel());
        setRowSorter(sorter);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(CustomTableModel model) {
        super(model, null, null);
        sorter = new TableRowSorter<CustomTableModel>(model);
        setRowSorter(sorter);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(TableModel model) {
        super(model, null, null);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(TableModel model, TableColumnModel colModel) {
        super(model, colModel, null);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(TableModel model, TableColumnModel colModel, ListSelectionModel selectionModel) {
        super(model, colModel, selectionModel);
        addCellLostFocusListener();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(ArrayList<Map> dataProvider) {
        setDataProvider(dataProvider, false);
        setSurrendersFocusOnKeystroke(true);
        addCellLostFocusListener();
        removeEnterKeyEvent();
        getTableHeader().setResizingAllowed(true);
    }
    public FlTable(ArrayList<Map> dataProvider, String[] visibleMapKeys, String[] visibleColumnNames) {
        setDataProvider(dataProvider, visibleMapKeys, visibleColumnNames, false);
        setSurrendersFocusOnKeystroke(true);
        this.visibleMapKeys = visibleMapKeys;
        this.visibleColumnNames = visibleColumnNames;
        addCellLostFocusListener();
        removeEnterKeyEvent();
        getTableHeader().setResizingAllowed(true);
    }
    public void resetRowFilter() {
        sorter = new TableRowSorter<CustomTableModel>((CustomTableModel)getModel());
        setRowSorter(sorter);
    }
    private void removeEnterKeyEvent() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER)
                    evt.consume();
            }
        });
    }
//    @Override
//    public boolean isCellEditable(int i, int i1) {
//        return editable.get(i)[i1];
//    }
//    public void setCellEditable(int r, int c, boolean ed) {
//        editable.get(r)[c] = ed;
//    }
    private void addCellLostFocusListener() {
        final FlTable thisTable = this;
        thisTable.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                FlTable table = (FlTable)e.getSource();
                Component comp = table.getEditorComponent();
                if (comp != null) {
                    boolean alreadySet = false;
                    FocusListener listeners[] = comp.getFocusListeners();
                    for (int i = 0, m = listeners.length; i < m; i ++) {
                        FocusListener l = listeners[i];
                        if (l instanceof FocusAdapter) {
                            alreadySet = true;
                            break;
                        }
                    }
                    if (!alreadySet) {
                        comp.addFocusListener(new FocusAdapter() {
                            @Override
                            public void focusLost(FocusEvent e) {
                                TableCellEditor ed = thisTable.getCellEditor();
                                if (ed != null) {
                                    ed.stopCellEditing();
                                }
                            }
                        });
                    }
                }
            }
        });
    }
    private void setNullDataProvider(String[] columns) {
        TableModel tm = new CustomTableModel(new Object[][] {}, columns, editableColumns);
        if (columns.length != 0) {
            this.visibleColumnNames = columns;
        }
        setModel(tm);
        sorter = new TableRowSorter<CustomTableModel>((CustomTableModel)tm);
        setRowSorter(sorter);
        getTableHeader().setResizingAllowed(true);
    }
    public void setDataProvider(ArrayList<Map> dataProvider) {
        setDataProvider(dataProvider, false);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, boolean editable) {
        if (dataProvider == null) {
            this.dataProvider = new ArrayList<Map>();
            setNullDataProvider(new String[] {});
            return;
        } else if (dataProvider.size() == 0) {
            this.dataProvider = dataProvider;
            setNullDataProvider(new String[] {});
            return;
        }
        String[] mapKeys = new String[dataProvider.get(0).size()];
        int i = 0;
        Set<Entry> set = dataProvider.get(0).entrySet();
        for (Entry entry : set) {
            mapKeys[i ++] = entry.getKey().toString();
        }
        setDataProvider(dataProvider, mapKeys, mapKeys, editable);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] visibleMapKeys) {
        setDataProvider(dataProvider, visibleMapKeys, false);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] visibleMapKeys, boolean editable) {
        this.visibleMapKeys = visibleMapKeys;
        if (dataProvider == null) {
            this.dataProvider = new ArrayList<Map>();
            setNullDataProvider(visibleMapKeys);
            return;
        } else if (dataProvider.size() == 0) {
            this.dataProvider = dataProvider;
            setNullDataProvider(visibleMapKeys);
            return;
        }
        setDataProvider(dataProvider, visibleMapKeys, visibleMapKeys, editable);
    }
    public void setDataProvider(List<Map> dataProvider, String[] visibleMapKeys, String[] visibleColumnNames) {
        setDataProvider(dataProvider, visibleMapKeys, visibleColumnNames, false);
    }
    public void setDataProvider(List<Map> dataProvider, String[] visibleMapKeys, String[] visibleColumnNames, boolean editable) {
        boolean[] e = new boolean[visibleMapKeys.length];
        for (int i = 0; i < e.length; i ++) {
            e[i] = editable;
        }
        setDataProvider(dataProvider, visibleMapKeys, visibleColumnNames, e);
    }
    public void setDataProvider(List<Map> dataProvider, String[] visibleMapKeys, String[] visibleColumnNames, boolean[] editableColumns) {
        Class<?>[] c = new Class<?>[visibleMapKeys.length];
        for (int i = 0; i < c.length; i ++) {
            c[i] = null;
        }
        setDataProvider(dataProvider, visibleMapKeys, visibleColumnNames, editableColumns, c);
    }
    public void setDataProvider(List<Map> dataProvider, String[] visibleMapKeys, String[] visibleColumnNames, boolean[] editableColumns, Class<?>[] columnsClass) {
        this.visibleMapKeys = visibleMapKeys;
        this.visibleColumnNames = visibleColumnNames;
        this.editableColumns = editableColumns;
        this.columnsClass = columnsClass;
        if (dataProvider == null) {
            this.dataProvider = new ArrayList<Map>();
            setNullDataProvider(visibleColumnNames);
            return;
        } else if (dataProvider.isEmpty()) {
            this.dataProvider = dataProvider;
            setNullDataProvider(visibleColumnNames);
            return;
        }
        if (visibleMapKeys.length != visibleColumnNames.length) {
            throw new IllegalArgumentException("Los parámetros visibleMapKeys y visibleColumnNames tienen diferente longitud, debe ser igual");
        }
        if (columnsClass.length != visibleMapKeys.length) {
            throw new IllegalArgumentException("La longitud de columnClass debe ser igual a la longitud del arreglo visibleMapKeys");
        }
        TableModel tm;
        Object[][] data = new Object[dataProvider.size()][visibleColumnNames.length];
//        editable = new ArrayList<>();
//        for (int r = 0; r < dataProvider.size(); r ++) {
//            editable.add(new boolean[visibleColumnNames.length]);
//            System.arraycopy(editableColumns, 0, editable.get(r), 0, visibleColumnNames.length);
//        }
        for (int row = 0; row < dataProvider.size(); row ++) {
            Iterator it = dataProvider.get(row).entrySet().iterator();
            List<String> keys = java.util.Arrays.asList(visibleMapKeys);
            while (it.hasNext()) {
                Entry entry = ((Entry)it.next());
                if (keys.contains(entry.getKey().toString())) {
                    data[row][keys.indexOf(entry.getKey().toString())] = entry.getValue();
                }
            }
        }
        tm = new CustomTableModel(data, this.visibleColumnNames, this.editableColumns, this.columnsClass);
        this.dataProvider = dataProvider;
        setModel(tm);
        sorter = new TableRowSorter<CustomTableModel>((CustomTableModel)tm);
        setRowSorter(sorter);
        getTableHeader().setResizingAllowed(true);
    }
    public void setColumnClass(Class<?> c, int column) {
        if (column < 0 || column >= this.columnsClass.length) {
            throw new IndexOutOfBoundsException("El índice está fuera del intervalo válido: 0 <= x < " + this.visibleMapKeys.length);
        }
        if (columnsClass == null) {
            throw new NullPointerException("El arreglo columnsClass es nulo");
        }
        ((CustomTableModel)this.getModel()).setColumnClass(c, column);
        this.columnsClass[column] = c;
    }
    public void setColumnsClass(Class<?>[] columnsClass) {
        if (columnsClass.length != this.visibleMapKeys.length) {
            throw new IllegalArgumentException("La longitud de columnsClass debe ser igual a la longitud del arreglo visibleMapKeys");
        }
        this.columnsClass = columnsClass;
    }
    @Override
    public void setValueAt(Object value, int row, int column) {
        super.setValueAt(value, row, column);
        Set<Entry> set = dataProvider.get(row).entrySet();
        TableColumn dtc = getColumnModel().getColumn(column);
        String colName = dtc.getHeaderValue().toString();
        int i = 0;
        for (int j = 0; j < visibleColumnNames.length; j ++) {
            if (visibleColumnNames[j].equals(colName)) {
                i = j;
                break;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            if (visibleMapKeys[i].equals(entry.getKey())) {
                entry.setValue(value);
                return;
            }
        }
    }
    public void addRow() {
        if (visibleMapKeys == null) {
            throw new NullPointerException("visibleMapKeys no ha sido inicializado");
        }
        ((CustomTableModel)getModel()).addRow(new Object[visibleMapKeys.length]);
        Map row = new LinkedHashMap();
        for (Object key : dataProvider.get(0).keySet()) {
            row.put(key, null);
        }
        dataProvider.add(row);
    }
    public void addRow(Map row) {
        if (dataProvider == null) {
            throw new NullPointerException("El proveedor de datos no ha sido inicializado");
        }
        if (visibleMapKeys == null) {
            visibleMapKeys = java.util.Arrays.copyOf(row.keySet().toArray(), row.size(), String[].class);
            if (visibleColumnNames == null) {
                visibleColumnNames = visibleMapKeys;
                setNullDataProvider(visibleColumnNames);
            }
        }
        Object[] r = new Object[visibleMapKeys.length];
        for (int i = 0; i < visibleMapKeys.length; i ++) {
            r[i] = row.get(visibleMapKeys[i]);
//            editable.add(new boolean[visibleColumnNames.length]);
//            System.arraycopy(editableColumns, 0, editable.get(editable.size() - 1), 0, visibleColumnNames.length);
        }
        ((CustomTableModel)getModel()).addRow(r);
        dataProvider.add(row);
    }
    public void removeRow(int row) {
        dataProvider.remove(convertRowIndexToModel(row));
        ((CustomTableModel)getModel()).removeRow(convertRowIndexToModel(row));
//        editable.remove(convertRowIndexToModel(row));
    }
    public void removeSelectedRow() {
        removeRow(this.getSelectedRow());
    }
    public Map getRow(int row) {
        if (dataProvider == null) {
            throw new NullPointerException("El proveedor de datos no ha sido inicializado");
        }
        if (row < 0 && row >= dataProvider.size()) {
            throw new IndexOutOfBoundsException("El índice debe estar entre 0 y " + (dataProvider.size() - 1));
        }
        return dataProvider.get(convertRowIndexToModel(row));
    }
    public Map getSelectedMap() {
        if (dataProvider == null) {
            throw new NullPointerException("El proveedor de datos no ha sido inicializado");
        }
        return dataProvider.get(convertRowIndexToModel(getSelectedRow()));
    }
    public List<Map> getSelectedMaps() {
        List<Map> selectedRows = new ArrayList<>();
        for (int i : this.getSelectedRows()) {
            selectedRows.add(dataProvider.get(convertRowIndexToModel(i)));
        }
        return selectedRows;
    }
    public List<Map> getDataProvider() {
        return this.dataProvider;
    }
    public int getItemIndex(String value, String key) {
        Map item;
        for (int i = 0; i < dataProvider.size(); i ++) {
            item = (Map)dataProvider.get(i);
            if (item.containsKey(key)) {
                if (item.get(key).toString().equals(value)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public void setColumnSize(int[] size) {
        for (int i = 0; i < size.length; i ++) {
            setColumnSize(size[i], i);
        }
    }
    public void setColumnSize(int size, int col) {
        getColumnModel().getColumn(col).setPreferredWidth(size);
    }
    public void setColumnCellRenderer(TableCellRenderer cellRenderer, int col) {
        getColumnModel().getColumn(col).setCellRenderer(cellRenderer);
    }
    public void setColumnCellEditor(TableCellEditor cellEditor, int col) {
        getColumnModel().getColumn(col).setCellEditor(cellEditor);
    }
    public void filter(String expression) {
        sorter.setRowFilter(RowFilter.regexFilter("(?i).*" + expression + ".*"));
        sorter.setSortKeys(null);
    }
    public void filter(final String expression, final String columnName) {
        this.filter(expression, columnName, false);
    }
    public void filter(final String expression, final String columnName, final boolean exactlyMatch) {
        RowFilter<CustomTableModel, Integer> rowFilter = new RowFilter<CustomTableModel, Integer>() {
            @Override
            public boolean include(RowFilter.Entry<? extends CustomTableModel, ? extends Integer> entry) {
                Map ren = dataProvider.get((int)entry.getIdentifier());
                if (exactlyMatch) {
                    return ren.get(columnName).toString().matches(expression);
                } else {
                    return ren.get(columnName).toString().matches("(?i).*" + expression + ".*");
                }
            }
        };
        sorter.setRowFilter(rowFilter);
        sorter.setSortKeys(null);
    }
    public void installKeyReleasedListener(AbstractCommand command, int triggerKeyCode) {
        final AbstractCommand c = command;
        final int k = triggerKeyCode;
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                if (evt.getKeyCode() == k) {
                    c.execute();
                }
            }
        });
    }
    public void installListSelectionListener(ListSelectionListener listener) {
        this.getSelectionModel().addListSelectionListener(listener);
    }

}