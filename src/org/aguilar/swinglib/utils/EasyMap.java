/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leo Aguilar
 */
public class EasyMap implements Map, Serializable {

    private Map<String, EasyEntry> datos;

    public EasyMap() {
        this(new EasyEntry[] {});
    }
    public EasyMap(EasyEntry ... entries) {
        datos = new LinkedHashMap<>();
        for (EasyEntry entry : entries) {
            datos.put(entry.getKey(), entry);
        }
    }
    @Override
    public int size() {
        return datos.size();
    }
    @Override
    public boolean isEmpty() {
        return datos.isEmpty();
    }
    public boolean containsKey(String key) {
        return datos.containsKey(key);
    }
    public String[] getKeys() {
        return (String[])datos.keySet().toArray();
    }
    @Override
    public Set keySet() {
        return datos.keySet();
    }
    @Override
    public boolean containsValue(Object value) {
        for (EasyEntry entry : datos.values()) {
            if (entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
    public Object get(String key) {
        return datos.get(key).getValue();
    }
    public Object put(String key, Object value) {
        return datos.put(key, EasyEntry.crear(key, value));
    }
    public Object put(EasyEntry entry) {
        return datos.put(entry.getKey(), entry);
    }
    public Object remove(String key) {
        return datos.remove(key);
    }
    @Override
    public void clear() {
        datos.clear();
    }
    @Override
    public String toString() {
        String string = "{";
        for (EasyEntry entry : datos.values()) {
            string += entry.toString() + ", ";
        }
        string = string.subSequence(0, string.length() - 2).toString();
        string += "}";
        return string;
    }
    @Override
    public boolean containsKey(Object key) {
        return this.datos.containsKey(key);
    }
    @Override
    public Object get(Object key) {
        return this.datos.get(key).getValue();
    }
    @Override
    public Object put(Object key, Object value) {
        return put(key.toString(), value);
    }
    @Override
    public Object remove(Object key) {
        return remove(key.toString());
    }
    @Override
    public void putAll(Map m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public Collection values() {
        return this.datos.values();
    }
    @Override
    public Set entrySet() {
        return this.datos.entrySet();
    }
    public static EasyMap crear(EasyEntry ... entries) {
        return new EasyMap(entries);
    }
    public static Map crearMap(EasyEntry ... entries) {
        return convertirEasyMap(new EasyMap(entries));
    }
    public static EasyMap crearDesdeMap(Map map) {
        EasyMap easy = new EasyMap();
        for (Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry en = (Map.Entry)it.next();
            easy.put(EasyEntry.crear(en.getKey().toString(), en.getValue()));
        }
        return easy;
    }
    public static Map convertirEasyMap(EasyMap map) {
        Map aux = new LinkedHashMap();
        for (EasyEntry easy : map.datos.values()) {
            aux.put(easy.getKey(), easy.getValue());
        }
        return aux;
    }
    public static void main(String[] args) {
        EasyMap map = new EasyMap(EasyEntry.crear("COL", 123), EasyEntry.crear("COL1", "VAL1"));
        Map aux = new LinkedHashMap();
        aux.put("col1", 1);
        aux.put("col2", 2);
        aux.put("col3", 3);
        System.out.println(EasyMap.convertirEasyMap(map));
        System.out.println(EasyMap.crearDesdeMap(aux));
        System.out.println(map.toString());
    }

}