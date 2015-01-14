/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leo Aguilar
 */
public class CustomObject implements Serializable {

    private Map<String, Object> valores;
    private List<Object> _listaAtributos;

    public CustomObject () {
        valores = new HashMap<String, Object>();
        _listaAtributos = new ArrayList<Object>();
    }
    public CustomObject(Object[] listaAtributos) {
        this(java.util.Arrays.asList(listaAtributos));
    }
    public CustomObject (List<Object> listaAtributos) {
        _listaAtributos = listaAtributos;
        valores = new HashMap<String, Object>();
        for (Object atrib : listaAtributos)
            valores.put(atrib.toString(), null);
    }
    public void setValor(String atributo, Object nuevoValor) {
        Set<Map.Entry<String, Object>> s = valores.entrySet();
        for (Map.Entry<String, Object> entry : s)
           if (entry.getKey().equals(atributo)) {
               entry.setValue(nuevoValor);
               return;
           }
    }
    public Object getValor(String atributo) {
        return valores.get(atributo);
    }
    public void addAtributo(String atributo) {
        _listaAtributos.add(atributo);
        valores.put(atributo, null);
    }
    public List<Object> getListaAtributos() {
        return _listaAtributos;
    }
}