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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    private String tipSeleccion = "Click para seleccionar un registro";
    private String tipBorrar = "Click para eliminar la selección";

    public FlSelectField() {
        this(false);
    }
    public FlSelectField(boolean aceptaEliminacion) {
        super();
        initComponents();
        registro = new HashMap();
        this.columnas = new String[] {};
        stringField.setFont(this.getFont());
        setAceptaEliminacion(aceptaEliminacion);
    }
    public Map getRegistro() {
        return registro;
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
        String[] columnas = new String[dataProvider.get(0).size()];
        int i = 0;
        Set<Map.Entry> set = dataProvider.get(0).entrySet();
        for (Map.Entry entry : set) {
            columnas[i ++] = entry.getKey().toString();
        }
        setDataProvider(dataProvider, columnas, columnas);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] columnas) {
        setDataProvider(dataProvider, columnas, columnas);
    }
    public void setDataProvider(ArrayList<Map> dataProvider, String[] columnas, String[] encabezados) {
        if (columnas.length != encabezados.length) {
            throw new IllegalArgumentException("El tamaño del arreglo de columnas es distinto al tamaño del arreglo de encabezados");
        }
        this.dataProvider = dataProvider;
        this.columnas = columnas;
        this.encabezados = encabezados;
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
            FlSelectDialog selectDialog = new FlSelectDialog(this.dataProvider, "", this.columnas, this.encabezados, false);
            selectDialog.setVisible(true);
            if (selectDialog.isOk()) {
                this.registro = selectDialog.getSeleccionado().get(0);
                if (this.columnaPrincipal != null) {
                    stringField.setText(registro.containsKey(columnaPrincipal) ? 
                            registro.get(columnaPrincipal).toString() :
                            registro.get(columnas[0]).toString());
                } else {
                    stringField.setText(registro.get(columnas[0]).toString());
                }
            }
        }
    }
    private void lblBorrarMouseClickedHandler(MouseEvent e) {
        if (((Component)e.getSource()).isEnabled()) {
            this.registro = null;
            stringField.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        stringField = new FlStringField();
        stringField.setEditable(false);
        lblSeleccionar = new JLabel(new ImageIcon(this.getClass().getResource("/img/px24/buscar.png")));
        lblSeleccionar.setOpaque(false);
        lblSeleccionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblSeleccionar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblSeleccionarMouseClickedHandler(e);
            }
        });
        lblBorrar = new JLabel(new ImageIcon(this.getClass().getResource("/img/px24/borrar.png")));
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
        this.setPreferredSize(new Dimension(200, 24));
        this.setOpaque(false);
        this.add(stringField, BorderLayout.CENTER);
        this.add(panelBotones, BorderLayout.EAST);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba de SelectField");
        frame.setLayout(new BorderLayout());
        final FlSelectField sel = new FlSelectField(true);
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