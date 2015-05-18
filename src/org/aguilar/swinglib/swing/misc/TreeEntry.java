/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Leo Aguilar
 */
public class TreeEntry extends DefaultMutableTreeNode {

    private String titulo, propiedad;
    private ImageIcon icono;
    private ArrayList<TreeEntry> lHijos;
    private ArrayList<Map> mHijos;
    private TreeEntry padre;
    private Map contenido;
    private boolean seleccionado;

    public TreeEntry() {
        super();
        this.lHijos = new ArrayList<>();
        this.mHijos = new ArrayList<>();
        this.seleccionado = false;
    }
    public TreeEntry(Map content, String dataField, String iconURL, TreeEntry parent) {
        this();
        this.contenido = content;
        this.propiedad = dataField;
        this.padre = parent;
        setTitulo(content.get(dataField).toString());
        setIcono(iconURL);
        this.lHijos = new ArrayList<>();
        this.mHijos = new ArrayList<>();
    }
    public void setContenido(Map content) {
        this.contenido = content;
    }
    public void setPropiedad(String dataField) {
        this.propiedad = dataField;
    }
    private void setTitulo(String title) {
        this.titulo = title;
    }
    private void setIcono(String iconURL) {
        try {
            if (iconURL != null) {
                 this.icono =  new javax.swing.ImageIcon(getClass().getResource(iconURL));
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    private void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
    public Map getContenido() {
        return contenido;
    }
    public String getPropiedad() {
        return propiedad;
    }
    public String getTitulo() {
        return titulo;
    }
    public ImageIcon getIcono() {
        return icono;
    }
    public ArrayList<TreeEntry> getLHijos() {
        return lHijos;
    }
    public ArrayList<Map> getMHijos() {
        return mHijos;
    }
    public boolean isSeleccionado() {
        return seleccionado;
    }
    @Override
    public int getLevel() {
        int count = -1;
        TreeEntry current = this;
        do {
            current = current.getParent();
            count++;
        } while (current != null);
        return count;
    }
    public int indexOf(Object child) {
        return lHijos.indexOf(child);
    }
    public int size() {
        return lHijos.size();
    }
    public TreeEntry get(int index) {
        return lHijos.get(index);
    }
    public void add(TreeEntry treeEntry) {
        Map entry = new HashMap();
        entry.put("title", treeEntry.getTitulo());
        entry.put("node", treeEntry);
        mHijos.add(entry);
        lHijos.add(treeEntry);
    }
    public int getIndex(TreeEntry treeEntry) {
        for (int i = 0; i < lHijos.size(); i ++) {
            if (treeEntry.equals(lHijos.get(i))) {
                return i;
            }
        }
        return -1;
    }
    public TreeEntry getIndex(String titulo) {
        for (int i = 0; i < lHijos.size(); i ++) {
            if (lHijos.get(i).getTitulo().equals(titulo)) {
                return lHijos.get(i);
            }
        }
        return null;
    }
    @Override
    public TreeEntry getParent() {
        return padre;
    }
    @Override
    public void remove(int index) {
        TreeEntry child = (TreeEntry)lHijos.remove(index);
        child.setParent(null);
    }
    @Override
    public String toString() {
        return titulo;
    }

}