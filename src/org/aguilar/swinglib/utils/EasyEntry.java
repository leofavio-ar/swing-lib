/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.io.Serializable;

/**
 *
 * @author Leo Aguilar
 */
public class EasyEntry implements Serializable {

    private String key;
    private Object value;

    public EasyEntry(String key, Object value) {
        this.key = key;
        this.value = value;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public Object getValue() {
        return value;
    }
    @Override
    public String toString() {
        return key + "=" + value.toString();
    }
    public static EasyEntry crear(String key, Object value) {
        return new EasyEntry(key, value);
    }
    public static void main(String[] args) {
        EasyEntry entry = EasyEntry.crear("identificador", "valor");
        System.out.println(entry.toString());
    }

}