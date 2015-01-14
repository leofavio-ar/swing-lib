/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.models;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import org.aguilar.swinglib.swing.misc.TreeEntry;

/**
 *
 * @author Leo Aguilar
 */
public class IconTreeModel extends DefaultTreeModel {
    
    public IconTreeModel(TreeEntry root) {
        super(root);
        this.root = root;
    }
    @Override
    public TreeEntry getRoot() {
        return (TreeEntry)root;
    }
    @Override
    public Object getChild(Object parent, int index) {
        return ((TreeEntry) parent).get(index);
    }
    @Override
    public int getChildCount(Object parent) {
         return ((TreeEntry) parent).size();
    }
    @Override
    public boolean isLeaf(Object node) {
        return ((TreeEntry) node).size() == 0;
    }
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        throw new UnsupportedOperationException("Not supported");
    }
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return ((TreeEntry) parent).indexOf(child);
    }
    @Override
    public void addTreeModelListener(TreeModelListener l) {
        listenerList.add(TreeModelListener.class, l);
    }
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
         listenerList.remove(TreeModelListener.class, l);
    }
    public void removeNodeFromParent(TreeEntry node) {
        TreeEntry parent = (TreeEntry)node.getParent();
        if (parent == null) {
            throw new IllegalArgumentException("El nodo no tiene padre.");
        }
        int[] childIndex = new int[1];
        Object[] removedArray = new Object[1];
        childIndex[0] = parent.getIndex(node);
        parent.remove(childIndex[0]);
        removedArray[0] = node;
        nodesWereRemoved(parent, childIndex, removedArray);
    }
    
}