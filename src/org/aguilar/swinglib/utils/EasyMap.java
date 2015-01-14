/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leo Aguilar
 */
public class EasyMap implements Map, Serializable {

    private Map<String, EasyEntry> information;

    public EasyMap() {
        this(new EasyEntry[] {});
    }
    public EasyMap(EasyEntry ... entries) {
        information = new LinkedHashMap<String, EasyEntry>();
        for (EasyEntry entry : entries)
            information.put(entry.getKey(), entry);
    }
    public int size() {
        return information.size();
    }
    public boolean isEmpty() {
        return information.isEmpty();
    }
    public boolean containsKey(String key) {
        return information.containsKey(key);
    }
    public String[] getKeys() {
        return (String[])information.keySet().toArray();
    }
    public Set keySet() {
        return information.keySet();
    }
    public boolean containsValue(Object value) {
        for (EasyEntry entry : information.values())
            if (entry.getValue().equals(value))
                return true;
        return false;
    }
    public Object get(String key) {
        return information.get(key).getValue();
    }
    public Object put(String key, Object value) {
        return information.put(key, EasyEntry.create(key, value));
    }
    public Object put(EasyEntry entry) {
        return information.put(entry.getKey(), entry);
    }
    public Object remove(String key) {
        return information.remove(key);
    }
    public void clear() {
        information.clear();
    }
    @Override
    public String toString() {
        String string = "{";
        for (EasyEntry entry : information.values())
            string += entry.toString() + ", ";
        string = string.subSequence(0, string.length() - 2).toString();
        string += "}";
        return string;
    }
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Object get(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Object put(Object key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Object remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void putAll(Map m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Collection values() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Set entrySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public static EasyMap create(EasyEntry ... entries) {
        return new EasyMap(entries);
    }
    public static void main(String[] args) {
        EasyMap map = new EasyMap(EasyEntry.create("COL", "VAL"), EasyEntry.create("COL1", "VAL1"));
        System.out.println(map.toString());
    }

}