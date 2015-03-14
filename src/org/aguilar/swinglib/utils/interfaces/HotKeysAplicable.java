/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aguilar.swinglib.utils.interfaces;

import javax.swing.JComponent;

/**
 *
 * @author I.S.C. Leonardo Aguilar
 */
public interface HotKeysAplicable {
 
    /**
     * Asigna las hotkeys relacionas a un objeto <code>HotKeys</code> para controlar las 
     * acciones del teclado en el formulario.
     */
    public void asignarHotKeys();
    /**
     * Devuelve el componente principal sobre el cual se registrará el <code>ActionMap</code>
     * que controlarán los <code>KeyStroke</code> de la clase <code>HotKeys</code> asignada.
     * @return Un objeto <code>JComponente</code> al que se le asigne la clase <code>HotKeys</code>.
     */
    public JComponent obtenerComponentePrincipal();
    
}