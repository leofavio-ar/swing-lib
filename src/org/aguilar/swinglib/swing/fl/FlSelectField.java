/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.aguilar.swinglib.swing.fl.dialogs.FlDialog;
import org.aguilar.swinglib.swing.fl.dialogs.FlSelectDialog;

/**
 *
 * @author Leonardo Favio Aguilar Ramírez
 */
public class FlSelectField extends JPanel {
    
    private FlStringField stringField;
    private JLabel lblSeleccionar;
    private JLabel lblBorrar;
    private JPanel panelBotones;
    private Map registro;
    private ArrayList<Map> dataProvider;
    private String columnaPrincipal;
    private String fieldName;
    private String[] columnas;
    private String[] encabezados;
    private boolean aceptaEliminacion;
    private boolean requerido;
    private boolean mostrarErrorVacio;
    private Object objetoControl;
    private String procesoControl;
    private String tipSeleccion = "Click para seleccionar un registro";
    private String tipBorrar = "Click para eliminar la selección";
    private String mensajeCatalogoVacio = "No existen registros en el catálogo";

    public FlSelectField() {
        this(false, true);
    }
    public FlSelectField(boolean aceptaEliminacion, boolean mostrarErrorVacio) {
        super();
        initComponents();
        registro = new HashMap();
        this.columnas = new String[] {};
        this.encabezados = new String[] {};
        stringField.setFont(this.getFont());
        setMensajeCatalogoVacio(mensajeCatalogoVacio);
        setAceptaEliminacion(aceptaEliminacion);
        setMostrarErrorVacio(mostrarErrorVacio);
        setTipSeleccion(tipSeleccion);
        setTipBorrar(tipBorrar);
    }
    public Map getRegistro() {
        return registro;
    }
    public void setRegistro(Map registro) {
        this.firePropertyChange("registro", this.registro, registro);
        this.registro = registro;
        if (registro != null) {
            if (this.columnaPrincipal != null) {
                stringField.setText(registro.containsKey(columnaPrincipal) ?
                        registro.get(columnaPrincipal).toString() :
                        primerColumnaTexto());
            }
        } else {
            stringField.setText("");
        }
    }
    private String primerColumnaTexto() {
        for (Iterator it = this.registro.entrySet().iterator(); it.hasNext(); ){
            Map.Entry en = (Map.Entry)it.next();
            if (en.getValue() instanceof String) {
                return en.getValue().toString();
            }
        }
        return this.registro.get(0).toString();
    }
    public boolean isMostrarErrorVacio() {
        return mostrarErrorVacio;
    }
    public void setMostrarErrorVacio(boolean mostrarErrorVacio) {
        this.mostrarErrorVacio = mostrarErrorVacio;
    }
    public String getMensajeCatalogoVacio() {
        return mensajeCatalogoVacio;
    }
    public void setMensajeCatalogoVacio(String mensajeCatalogoVacio) {
        this.mensajeCatalogoVacio = mensajeCatalogoVacio;
    }
    public String getColumnaPrincipal() {
        return columnaPrincipal;
    }
    public void setColumnaPrincipal(String columnaPrincipal) {
        this.columnaPrincipal = columnaPrincipal;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public String[] getColumnas() {
        return columnas;
    }
    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }
    public String[] getEncabezados() {
        return encabezados;
    }
    public void setEncabezados(String[] encabezados) {
        this.encabezados = encabezados;
    }
    public boolean isAceptaEliminacion() {
        return aceptaEliminacion;
    }
    public void setAceptaEliminacion(boolean aceptaEliminacion) {
        this.aceptaEliminacion = aceptaEliminacion;
        lblBorrar.setVisible(aceptaEliminacion);
    }
    public boolean isRequerido() {
        return requerido;
    }
    public void setRequerido(boolean requerido) {
        this.requerido = requerido;
        this.stringField.setRequired(requerido);
    }
    public void setControlDataProvider(Object objetoControl, String procesoControl, String columna, String encabezado) {
        setControlDataProvider(objetoControl, procesoControl, new String[] {columna}, new String[] {encabezado});
    }
    public void setControlDataProvider(Object objetoControl, String procesoControl, String[] columnas, String[] encabezados) {
        this.objetoControl = objetoControl;
        this.procesoControl = procesoControl;
        this.columnas = columnas;
        this.encabezados = encabezados;
    }
    public Object getObjetoControl() {
        return objetoControl;
    }
    public void setObjetoControl(Object objetoControl) {
        this.objetoControl = objetoControl;
    }
    public String getProcesoControl() {
        return procesoControl;
    }
    public void setProcesoControl(String procesoControl) {
        this.procesoControl = procesoControl;
    }
    public String getTipSeleccion() {
        return tipSeleccion;
    }
    public void setTipSeleccion(String tipSeleccion) {
        this.tipSeleccion = tipSeleccion;
        lblSeleccionar.setToolTipText(tipSeleccion);
    }
    public String getTipBorrar() {
        return tipBorrar;
    }
    public void setTipBorrar(String tipBorrar) {
        this.tipBorrar = tipBorrar;
        lblBorrar.setToolTipText(tipBorrar);
    }
    public FlStringField getStringField() {
        return this.stringField;
    }
    public ArrayList<Map> getDataProvider() {
        return dataProvider;
    }
    public void setDataProvider(ArrayList<Map> dataProvider) {
        if (dataProvider == null) {
            dataProvider = new ArrayList<>();
        }
        if (dataProvider.isEmpty()) {
            setDataProvider(dataProvider, new String[] {}, new String[] {});
            return;
        }
        String[] cols = new String[dataProvider.get(0).size()];
        int i = 0;
        Set<Map.Entry> set = dataProvider.get(0).entrySet();
        for (Map.Entry entry : set) {
            cols[i ++] = entry.getKey().toString();
        }
        setDataProvider(dataProvider, cols, cols, null, null);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] columnas) {
        setDataProvider(dataProvider, columnas, columnas, null, null);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] columnas, String[] encabezados) {
        setDataProvider(dataProvider, columnas, encabezados, null, null);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] columnas, String[] encabezados, Object objetoControl, String procesoControl) {
        if (columnas.length != encabezados.length) {
            throw new IllegalArgumentException("El tamaño del arreglo de columnas es distinto al tamaño del arreglo de encabezados");
        }
        this.dataProvider = dataProvider;
        this.columnas = columnas;
        this.encabezados = encabezados;
        this.objetoControl = objetoControl;
        this.procesoControl = procesoControl;
    }
    public void setValidation() {
        this.stringField.setValidation();
    }
    public void validar() {
        this.stringField.validar();
    }
    @Override
    public void setFont(Font font) {
        super.setFont(font);
        if (stringField != null) {
            stringField.setFont(font);
        }
    }
    @Override
    public boolean isOpaque() {
        return false;
    }
    @Override
    public void setEnabled(boolean e) {
        habilitar(this, e);
        lblSeleccionar.setCursor(e ? 
                Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) :
                Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        lblBorrar.setCursor(e ? 
                Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) :
                Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    private void habilitar(Container c, boolean hab) {
        for (Component c1 : c.getComponents()) {
            c1.setEnabled(hab);
            if (c1 instanceof Container) {
                habilitar((Container)c1, hab);
            }
        }
    }
    private void lblSeleccionarMouseClickedHandler(MouseEvent e) {
        if (((Component)e.getSource()).isEnabled()) {
            if (objetoControl != null && procesoControl != null) {
                Method method;
                try {
                    method = objetoControl.getClass().getDeclaredMethod(procesoControl, null);
                    method.setAccessible(true);
                    Object resultado = method.invoke(objetoControl, null);
                    if (resultado instanceof List || resultado instanceof ArrayList) {
                        setDataProvider(
                                (ArrayList<Map>)resultado, 
                                this.columnas == null ? new String[] {} : this.columnas, 
                                this.encabezados == null ? new String[] {} : this.encabezados, 
                                this.objetoControl, 
                                this.procesoControl);
                    }
                } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(FlSelectField.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (this.dataProvider.isEmpty() && this.mostrarErrorVacio) {
                FlDialog.showFullWarningDialog(this.mensajeCatalogoVacio);
            }
            FlSelectDialog selectDialog = new FlSelectDialog(this.dataProvider, "", this.columnas, this.encabezados, false);
            selectDialog.setVisible(true);
            if (selectDialog.isOk()) {
                Map aux = selectDialog.getSeleccionado().get(0);
                setRegistro(selectDialog.getSeleccionado().get(0));
                if (this.columnaPrincipal != null) {
                    stringField.setText(registro.containsKey(this.columnaPrincipal) ? 
                            aux.get(this.columnaPrincipal).toString() :
                            primerColumnaTexto());
                } else {
                    stringField.setText(primerColumnaTexto());
                }
            }
        }
    }
    private void lblBorrarMouseClickedHandler(MouseEvent e) {
        if (((Component)e.getSource()).isEnabled()) {
            setRegistro(null);
        }
    }
    public void agregarRegistroListener(PropertyChangeListener listener) {
        this.addPropertyChangeListener("registro", listener);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        stringField = new FlStringField();
        stringField.setEditable(false);
        lblSeleccionar = new JLabel(new ImageIcon(this.getClass().getResource("/img/px21/buscar.png")));
        lblSeleccionar.setOpaque(false);
        lblSeleccionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblSeleccionar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblSeleccionarMouseClickedHandler(e);
            }
        });
        lblBorrar = new JLabel(new ImageIcon(this.getClass().getResource("/img/px21/borrar.png")));
        lblBorrar.setOpaque(false);
        lblBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblBorrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblBorrarMouseClickedHandler(e);
            }
        });
        panelBotones = new JPanel(new BorderLayout(5, 0));
        panelBotones.add(lblBorrar, BorderLayout.CENTER);
        panelBotones.add(lblSeleccionar, BorderLayout.EAST);
        panelBotones.setOpaque(false);
        this.setOpaque(false);
        this.setLayout(new BorderLayout(5, 0));
        this.setPreferredSize(new Dimension(200, 21));
        this.setOpaque(false);
        this.add(stringField, BorderLayout.CENTER);
        this.add(panelBotones, BorderLayout.EAST);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba de SelectField");
        frame.setLayout(new BorderLayout());
        final FlSelectField sel = new FlSelectField(true, true);
        ArrayList<Map> list = new ArrayList<>();
        Map m = new HashMap();
        m.put("uno", "uno,uno");
        m.put("dos", "uno,dos");
        m.put("tres", "uno,tres");
        list.add(m);
        m = new HashMap();
        m.put("uno", "dos,uno");
        m.put("dos", "dos,dos");
        m.put("tres", "dos,tres");
        list.add(m);
        m = new HashMap();
        m.put("uno", "tres,uno");
        m.put("dos", "tres,dos");
        m.put("tres", "tres,tres");
        list.add(m);
        sel.setDataProvider(list);
        sel.setColumnaPrincipal("tres");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(sel, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
    
}