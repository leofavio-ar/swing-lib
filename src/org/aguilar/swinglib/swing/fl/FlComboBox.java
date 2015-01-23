package org.aguilar.swinglib.swing.fl;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Leo Aguilar
 */
public class FlComboBox extends JComboBox {

    private ArrayList<Map> dataProvider = new ArrayList<Map>();
    private String dataField;
    private Object[] lista;
    private int currentCaretPosition = 0;
    private JTextField textfield;
    private static final String ERR_INDRANGO = "Índice fuera de rango";
    private static final String ERR_NOELE = "No hay elementos en el modelo";
    private static final String ERR_NODATOS = "No se ha asignado el origen de datos";
    
    public FlComboBox() {
        this(new DefaultComboBoxModel());
    }
    public FlComboBox (DefaultComboBoxModel model) {
        super(model);
    }
    public FlComboBox(Object[] itemArray) {
        super(itemArray);
    }
    public FlComboBox(Vector<?> itemVector) {
        super(itemVector);
    }
    public FlComboBox(ArrayList<Map> dataProvider, String dataField) throws Exception {
        setDataProvider(dataProvider, dataField);
    }
    @Override
    public Map getItemAt(int index) {
        if (dataProvider.size() > 0) {
            if (index >= 0 && index < dataProvider.size()) {
                return dataProvider.get(index);
            } else {
                throw new IndexOutOfBoundsException(ERR_INDRANGO);
            }
        }
        throw new NullPointerException(ERR_NOELE);
    }
    public void addItem(Map item) {
        super.addItem(item.get(dataField));
        dataProvider.add(item);
    }
    public void addItemAt(Map item, int index) {
        dataProvider.add(index, item);
        try {
            setDataProvider(dataProvider, dataField);
        } catch(Exception ex) { }
    }
    public Map getSelectedMap() {
        if (dataProvider == null) {
            throw new NullPointerException(ERR_NODATOS);
        }
        if (dataProvider.size() > 0) {
            return dataProvider.get(getSelectedIndex());
        } else {
            throw new NullPointerException(ERR_NOELE);
        }
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String dataField) {
        if (dataProvider == null) {
            throw new NullPointerException(ERR_NODATOS);
        }
        if (dataProvider.size() > 0) {
            if (dataProvider.get(0).containsKey(dataField)) {
                this.dataProvider = dataProvider;
                lista = new String[dataProvider.size()];
                setDataField(dataField);
                int i = 0;
                for (Map m : dataProvider) {
                    lista[i ++] = m.get(dataField).toString();
                }
                setModel(new DefaultComboBoxModel(lista));
            } else {
                try {
                    throw new Exception("Llave no encontrada: " + dataField);
                } catch (Exception ex) {
                    Logger.getLogger(FlComboBox.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            setModel(new DefaultComboBoxModel());
            this.dataProvider = new ArrayList<>();
//            throw new NullPointerException(ERR_NOELE);
        }
    }
    public int getItemIndex(String value, String key) {
        Map item;
        for (int i = 0; i < dataProvider.size(); i ++) {
            item = (Map)dataProvider.get(i);
            if (item.containsKey(key)) {
                if (item.get(key).toString().trim().equals(value)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public void setDataField(String dataField) {
        this.dataField = dataField;
        Object[] lista = new String[dataProvider.size()];
        int i = 0;
        for (Map m : dataProvider) {
            lista[i ++] = m.get(dataField).toString();
        }
        setModel(new DefaultComboBoxModel(lista));
    }
    public ArrayList<Map> getDataProvider() {
        return dataProvider;
    }
    public String getDataField() {
        return dataField;
    }
    public void addTextFieldKeyListener(KeyAdapter adapter) throws NullPointerException {
        if (textfield == null) {
            throw new NullPointerException("No existe la funcionalidad de autocompletar");
        }
        textfield.addKeyListener(adapter);
    }
    public void setAutoCompleter() {
        if (dataProvider == null) {
            throw new NullPointerException(ERR_NODATOS);
        }
        if (dataProvider.isEmpty()) {
            return;
        }
        super.setEditable(true);
        textfield = (JTextField)this.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        currentCaretPosition = textfield.getCaretPosition();
                        if (textfield.getSelectedText() == null) {
                            textfield.setCaretPosition(0);
                            comboFilter(textfield.getText());
                            textfield.setCaretPosition(currentCaretPosition);
                        }
                     }
                });
            }

        });
    }
    public void comboFilter(String enteredText) {
        List<String> array = Arrays.asList(Arrays.copyOf(lista, lista.length, String[].class));
        List<String> filterArray = new ArrayList<String>();
        for (int i = 0; i < array.size(); i ++) {
            if (array.get(i).toLowerCase().contains(enteredText.toLowerCase())) {
                filterArray.add(array.get(i));
            }
        }
        if (filterArray.size() > 0) {
            this.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            this.setSelectedItem(enteredText);
            this.showPopup();
        } else {
            this.hidePopup();
        }
    }

}