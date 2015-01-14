/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.misc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Trébol Informática
 * http://www.trebolinformatica.com.mx
 *
 */
public class TextFieldAutoCompleter {

    private JList jList;
    private Object[] lista;
    private boolean instalado = false;
    private JPopupMenu popup;
    private JTextComponent textComponent;
    private static final String AUTOCOMPLETER = "AUTOCOMPLETER";
    private final PopupMenuListener popUpListener = new PopupMenuListener() {
        @Override
        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        }
        @Override
        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            textComponent.unregisterKeyboardAction(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        }
        @Override
        public void popupMenuCanceled(PopupMenuEvent e){
        }
    };
    
    public TextFieldAutoCompleter(JTextComponent comp) {
        this(comp, new Object[0]);
    }
    public TextFieldAutoCompleter(JTextComponent comp, Object[] elementos) {
        lista = elementos;
        textComponent = comp;
        popup = new JPopupMenu();
        jList = new JList();
    }
    public void desinstalar() {
        instalado = false;
        textComponent.putClientProperty(AUTOCOMPLETER, null);
        textComponent.getInputMap().remove(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, KeyEvent.CTRL_MASK));
        textComponent.getInputMap().remove(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0));
        textComponent.getInputMap().remove(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0));
        textComponent.getInputMap().remove(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        textComponent.getActionMap().remove("showActionMap");
        textComponent.getActionMap().remove("upActionMap");
        textComponent.getActionMap().remove("hidePopupActionMap");
        textComponent.getActionMap().remove("hideAndGoMap");
        popup = new JPopupMenu();
        jList = new JList();
    }
    public void instalar() {
        instalado = true;
        textComponent.putClientProperty(AUTOCOMPLETER, null);
        textComponent.putClientProperty(AUTOCOMPLETER, this);
        JScrollPane scroll = new JScrollPane(jList);
        scroll.setBorder(null);
        jList.setFocusable(false);
        scroll.getVerticalScrollBar().setFocusable(false);
        scroll.getHorizontalScrollBar().setFocusable(false);
        jList.setFont(textComponent.getFont());
        popup.setBorder(BorderFactory.createLineBorder(Color.black));
        popup.add(scroll);
        textComponent.setFocusTraversalKeysEnabled(false);
        if (textComponent instanceof JTextField) {
            textComponent.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "showActionMap");
            textComponent.getDocument().addDocumentListener(documentListener);
        } else {
            textComponent.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, KeyEvent.CTRL_MASK), "showActionMap");
        }
        textComponent.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "upActionMap");
        textComponent.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "hideAndGoMap");
        textComponent.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "hidePopupActionMap");
        textComponent.getActionMap().put("showActionMap", showAction);
        textComponent.getActionMap().put("upActionMap", upAction);
        textComponent.getActionMap().put("hidePopupActionMap", hidePopupAction);
        textComponent.getActionMap().put("hideAndGoMap", hideAndGo);
        popup.addPopupMenuListener(popUpListener);
        jList.setRequestFocusEnabled(false);
    }
    public void setLista(Object[] lista) {
        this.lista = lista;
    }
    public boolean isInstalado() {
        return instalado;
    }
    private boolean actualizarLista(){
        String value = textComponent.getText();
        List matches = new ArrayList();
        for (int i = 0; i < lista.length; i ++) {
            if (value.length() <= lista[i].toString().length()) {
                if (value.equalsIgnoreCase(lista[i].toString().substring(0,value.length()))) {
                    matches.add(lista[i]);
                }
            }
        }
        jList.setListData(matches.toArray());
        if (jList.getModel().getSize() == 1 && jList.getModel().getElementAt(0).toString().equals(value)) {
            return false;
        }
        return (jList.getModel().getSize()!=0);
    }
    private void seleccionarSiguiente(){
        int si = jList.getSelectedIndex();

        if(si < jList.getModel().getSize() - 1){
            jList.setSelectedIndex(si + 1);
            jList.ensureIndexIsVisible(si + 1);
        }
    }
    private void seleccionarPrevio(){
        int si = jList.getSelectedIndex();
        if(si > 0){
            jList.setSelectedIndex(si - 1);
            jList.ensureIndexIsVisible(si - 1);
        }
    }
    private void aceptarElemento(String selected){
        if (selected == null) {
            return;
        }
        textComponent.setText(selected);
        popup.setVisible(false);
    }
    DocumentListener documentListener = new DocumentListener(){
        @Override
        public void insertUpdate(DocumentEvent e) {
            mostrarPopup();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            mostrarPopup();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    };
    public void mostrarPopup() {
        popup.setVisible(false);
        if (textComponent.isEnabled() && actualizarLista() && jList.getModel().getSize() != 0) {
            if (!(textComponent instanceof JTextField)) {
                textComponent.getDocument().addDocumentListener(documentListener);
            }
            textComponent.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "acceptActionMap");
            textComponent.getActionMap().put("acceptActionMap", acceptAction);
            int size = jList.getModel().getSize();
            int alturaPopup;
            if (size >= 10) {
                alturaPopup = jList.getPreferredSize().height * 10 / size + 2;
                jList.setVisibleRowCount(10);
            }
            else{
                alturaPopup = jList.getPreferredSize().height + 2;
                jList.setVisibleRowCount(size);
            }
            popup.setPreferredSize(new Dimension(textComponent.getWidth(), alturaPopup));
            popup.setMinimumSize(new Dimension(textComponent.getWidth(), alturaPopup));
            popup.setMaximumSize(new Dimension(textComponent.getWidth(), alturaPopup));
            int x = 0;
            popup.show(textComponent, x, textComponent.getHeight());
        } else {
            popup.setVisible(false);
        }
        textComponent.requestFocus();
    }
    AbstractAction acceptAction = new AbstractAction(){
        @Override
        public void actionPerformed(ActionEvent e){
            JComponent tf = (JComponent)e.getSource();
            TextFieldAutoCompleter completer = (TextFieldAutoCompleter)tf.getClientProperty(AUTOCOMPLETER);
            completer.popup.setVisible(false);
            completer.aceptarElemento((String)completer.jList.getSelectedValue());
        }
    };
    AbstractAction showAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e){
            JComponent tf = (JComponent)e.getSource();
            TextFieldAutoCompleter completer = (TextFieldAutoCompleter)tf.getClientProperty(AUTOCOMPLETER);
            if (tf.isEnabled()){
                if (completer.popup.isVisible()) {
                    completer.seleccionarSiguiente();
                } else {
                    completer.mostrarPopup();
                }
            }
        }
    };
    AbstractAction upAction = new AbstractAction(){
        @Override
        public void actionPerformed(ActionEvent e){
            JComponent tf = (JComponent)e.getSource();
            TextFieldAutoCompleter completer = (TextFieldAutoCompleter)tf.getClientProperty(AUTOCOMPLETER);
            if (tf.isEnabled()) {
                if (completer.popup.isVisible()) {
                    completer.seleccionarPrevio();
                }
            }
        }
    };
    AbstractAction hidePopupAction = new AbstractAction(){
        @Override
        public void actionPerformed(ActionEvent e){
            JComponent tf = (JComponent)e.getSource();
            TextFieldAutoCompleter completer = (TextFieldAutoCompleter)tf.getClientProperty(AUTOCOMPLETER);
            if(tf.isEnabled()) {
                completer.popup.setVisible(false);
            }
        }
    };
    AbstractAction hideAndGo = new AbstractAction(){
        @Override
        public void actionPerformed(ActionEvent e){
            JComponent tf = (JComponent)e.getSource();
            TextFieldAutoCompleter completer = (TextFieldAutoCompleter)tf.getClientProperty(AUTOCOMPLETER);
            if (tf.isEnabled()) {
                completer.popup.setVisible(false);
            }
            tf.transferFocus();
        }
    };

}