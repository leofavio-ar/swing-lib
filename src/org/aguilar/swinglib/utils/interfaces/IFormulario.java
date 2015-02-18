/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aguilar.swinglib.utils.interfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author I.S.C. Leonardo Aguilar
 */
public interface IFormulario {
 
    public final static int EN_ESPERA = 0;
    public final static int REGISTRANDO = 1;
    public final static int EDITANDO = 2;
    
    /**
     * Asigna las hotkeys relacionas a un objeto HotKeys para controlar las 
     * acciones del teclado en el formulario.
     */
    public void asignarHotKeys();
    /**
     * Llena la tabla de los registros actuales del formulario.
     * @param datos Un <code>List</code> que contiene los registros que se
     *              mostrarán en la tabla.
     */
    public void llenarTabla(List<Map> datos);
    /**
     * Realiza las operaciones necesarias para crear un nuevo registro en el
     * formulario.
     */
    public void nuevo();
    /**
     * Realiza las operaciones necesarias para editar registro existente de la
     * tabla de registros.
     */
    public void editar();
    /**
     * Realiza las operaciones necesarias para guardar los cambios de un
     * registro nuevo o uno existente.
     */
    public void guardar();
    /**
     * Realiza las operaciones necesarias para cancelar las operaciones de 
     * registro o edición.
     */
    public void cancelar();
    /**
     * Cierra el componente del formulario.
     */
    public void cerrar();
    /**
     * Realiza las operaciones necesarias para habilitar los controles
     * necesarios del formulario para realizar un nuevo registro o una edición.
     * @param hab   Indica si se habilitarán o deshabilitarán los controles de
     *              registro
     */
    public void habilitar(boolean hab);
    /**
     * Realiza las operaciones necesarias para limpiar los datos del formulario.
     */
    public void limpiar();
    /**
     * Realiza las operaciones necesarias para filtrar la tabla de los registros
     * actuales del formulario.
     */
    public void filtrar();
    
}