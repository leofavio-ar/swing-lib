/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aguilar.swinglib.swing.fl;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Map;
import org.aguilar.swinglib.utils.EasyEntry;
import org.aguilar.swinglib.utils.EasyMap;
import org.aguilar.swinglib.utils.PosicionLabel;

/**
 *
 * @author SISTEMAS
 */
public class PruebaLayout extends javax.swing.JFrame {

    /**
     * Creates new form PruebaLayout
     */
    public PruebaLayout() {
        initComponents();
        ArrayList<Map> list = new ArrayList<>();
        list.add(EasyMap.crearMap(
                    EasyEntry.crear("nombre", "IZQUIERDA"),
                    EasyEntry.crear("alineacion", PosicionLabel.LEFT))
                );
        list.add(EasyMap.crearMap(
                    EasyEntry.crear("nombre", "ARRIBA"),
                    EasyEntry.crear("alineacion", PosicionLabel.TOP))
                );
        list.add(EasyMap.crearMap(
                    EasyEntry.crear("nombre", "DERECHA"),
                    EasyEntry.crear("alineacion", PosicionLabel.RIGHT))
                );
        list.add(EasyMap.crearMap(
                    EasyEntry.crear("nombre", "ABAJO"),
                    EasyEntry.crear("alineacion", PosicionLabel.BOTTOM))
                );
        flComboBox1.setDataProvider(list, "nombre");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flLabeledField1 = new org.aguilar.swinglib.swing.fl.FlLabeledField();
        chkAnchoFijo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        flStringField2 = new org.aguilar.swinglib.swing.fl.FlStringField();
        flLabeledField2 = new org.aguilar.swinglib.swing.fl.FlLabeledField();
        flComboBox1 = new org.aguilar.swinglib.swing.fl.FlComboBox();
        flLabeledField3 = new org.aguilar.swinglib.swing.fl.FlLabeledField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        flLabeledField1.setAnchoFijo(true);
        flLabeledField1.setAnchoLabel(150);
        flLabeledField1.setEditable(true);

        chkAnchoFijo.setText("Ancho fijo");
        chkAnchoFijo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkAnchoFijoItemStateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Ancho");

        flStringField2.setOnlyDigits(true);
        flStringField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                flStringField2KeyReleased(evt);
            }
        });

        flLabeledField2.setAnchoLabel(100);
        flLabeledField2.setLabelFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        flLabeledField2.setStringFieldFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        flComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                flComboBox1ItemStateChanged(evt);
            }
        });

        flLabeledField3.setEditable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flLabeledField1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(flLabeledField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAnchoFijo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flStringField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(flComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flLabeledField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flLabeledField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAnchoFijo)
                    .addComponent(jLabel2)
                    .addComponent(flStringField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flLabeledField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flLabeledField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAnchoFijoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkAnchoFijoItemStateChanged
        flLabeledField1.setAnchoFijo(chkAnchoFijo.isSelected());
    }//GEN-LAST:event_chkAnchoFijoItemStateChanged

    private void flStringField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flStringField2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            flLabeledField1.setAnchoLabel(Integer.parseInt(flStringField2.getText().trim()));
        }
    }//GEN-LAST:event_flStringField2KeyReleased

    private void flComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_flComboBox1ItemStateChanged
        flLabeledField2.setPosicionLabel((PosicionLabel)flComboBox1.getSelectedMap().get("alineacion"));
    }//GEN-LAST:event_flComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PruebaLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaLayout().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAnchoFijo;
    private org.aguilar.swinglib.swing.fl.FlComboBox flComboBox1;
    private org.aguilar.swinglib.swing.fl.FlLabeledField flLabeledField1;
    private org.aguilar.swinglib.swing.fl.FlLabeledField flLabeledField2;
    private org.aguilar.swinglib.swing.fl.FlLabeledField flLabeledField3;
    private org.aguilar.swinglib.swing.fl.FlStringField flStringField2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}