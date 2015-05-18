/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.renderers;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import org.aguilar.swinglib.swing.misc.TreeEntry;

/**
 *
 * @author Leo Aguilar
 */
public class IconTreeRenderer extends DefaultTreeCellRenderer {

    private final JLabel label;
    private Font orgFont;
    private Font boldFont;
    private TreeEntry te;

    public IconTreeRenderer() {
        label = new JLabel();
        label.setBackground(null);
        orgFont = new Font("Tahoma", Font.PLAIN, 12);
        boldFont = orgFont.deriveFont(Font.BOLD);
    }
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        te = (TreeEntry)value;
        label.setIcon(te.getIcono());
        TreePath path = new TreePath(te);
        boolean seleccionado = sel ? true : 
                tree.getSelectionModel().getSelectionPath() == null ? sel : tree.getSelectionModel().getSelectionPath().equals(path);
//        label.setFont(orgFont);
        if (seleccionado) {
            label.setBorder(UIManager.getBorder("Tree.selectionBorderColor"));
            label.setOpaque(true);
//            label.setFont(boldFont);
            label.setBackground(UIManager.getColor("Tree.selectionBackground"));
            label.setForeground(UIManager.getColor("Tree.selectionForeground"));
        } else {
            label.setBorder(null);
            label.setOpaque(false);
            label.setBackground(UIManager.getColor("Tree.background"));
            label.setForeground(UIManager.getColor("Tree.foreground"));
            label.setBackground(null);
        }
        label.setText(te.getTitulo());
        return label;
    }

}