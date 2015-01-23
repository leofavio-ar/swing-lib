/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Leo Aguilar
 */
public class ArrayCollection extends ArrayList implements Serializable {

    List<EasyMap> list = new ArrayList<EasyMap>();

    public ArrayCollection() {
        this(new EasyMap[] {});
    }
    public ArrayCollection(EasyMap ... maps) {
        list.addAll(Arrays.asList(maps));
    }
    public boolean add(EasyMap map) {
        return list.add(map);
    }
    public boolean remove(EasyMap map) {
        return list.remove(map);
    }
    public EasyMap removeAt(int index) {
        return list.remove(index);
    }
    @Override
    public String toString() {
        String string = "{";
        for (int i = 0; i < size(); i ++) {
            string += get(i).toString() + (i == size() - 1 ? "" : ", ");
        }
        string += "}";
        return string;
    }
    public boolean contains(EasyMap map) {
        return list.contains(map);
    }
    @Override
    public EasyMap get(int index) {
        return list.get(index);
    }
    
    public static void main(String[] args) {
        ArrayCollection collection = new ArrayCollection();
        EasyMap map1 = EasyMap.create(
                EasyEntry.create("KEY1", 1),
                EasyEntry.create("KEY2", "VALUE2"));
        EasyMap map2 = EasyMap.create(
                EasyEntry.create("KEY3", 3),
                EasyEntry.create("KEY4", "VALUE4"));
        EasyMap map3 = EasyMap.create(
                EasyEntry.create("KEY5", 5),
                EasyEntry.create("KEY6", "VALUE4"),
                EasyEntry.create("KEY7", 7));
        collection.add(map1);
        collection.add(map2);
        collection.add(map3);
        System.out.println(collection.toString());
    }

}