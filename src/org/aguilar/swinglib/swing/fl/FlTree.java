/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import javax.swing.tree.DefaultTreeModel;
import org.aguilar.swinglib.swing.misc.CustomTreeUI;
import org.aguilar.swinglib.swing.renderers.IconTreeRenderer;
import org.aguilar.swinglib.swing.misc.TreeEntry;

/**
 *
 * @author Leo Aguilar
 */
public class FlTree extends javax.swing.JTree {

    public FlTree() {
        super();
        setUI(new CustomTreeUI());
        setCellRenderer(new IconTreeRenderer());
        setRootVisible(false);
        setExpandsSelectedPaths(true);
    }
    public void insertChild(TreeEntry parent, TreeEntry child) {
        parent.add(child);
        ((DefaultTreeModel)getModel()).nodeStructureChanged(parent);
    }

}