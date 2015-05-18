/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import org.aguilar.swinglib.swing.fl.dialogs.TranslucentDialog;
import org.aguilar.swinglib.utils.interfaces.FormAdministrable;
import org.aguilar.swinglib.utils.interfaces.HotKeysAplicable;

/**
 * Representa los <code>KeyStroke</code> que disparan las funciones de un componente.
 * @author Leonardo Favio Aguilar Ramírez
 */
public class HotKeys {

    public static final KeyStroke KS_F1     = KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0, true);
    public static final KeyStroke KS_F2     = KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0, true);
    public static final KeyStroke KS_F3     = KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0, true);
    public static final KeyStroke KS_F4     = KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0, true);
    public static final KeyStroke KS_F5     = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0, true);
    public static final KeyStroke KS_F6     = KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0, true);
    public static final KeyStroke KS_F7     = KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0, true);
    public static final KeyStroke KS_F8     = KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0, true);
    public static final KeyStroke KS_F9     = KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0, true);
    public static final KeyStroke KS_F10    = KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0, true);
    public static final KeyStroke KS_F11    = KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0, true);
    public static final KeyStroke KS_F12    = KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0, true);
    public static final KeyStroke KS_ESC    = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, true);
    private ActionMap actionMap;
    private InputMap inputMap;
    private Object componente;
    private String objetoControl;
   
//    /**
//     * Crea un objeto <code>HotKeys</code> para controlar los eventos de teclas en un componente que 
//     * implemente la interface <code>HotKeysAplicable</code> y sea capaz de manejar un <code>ActionMap</code>.
//     * Por defecto se asigna el objeto de nombre "control" del componente para efectos de controlar los 
//     * estados en los que puede o no ejecutarse la función asignada a las acciones de los <code>KeyStroke</code>.
//     * @param componente Un objeto <code>HotKeysAplicable</code>.
//     */
//    public HotKeys(HotKeysAplicable componente) {
//        this(componente.obtenerComponentePrincipal(), "control");
//    }
//    /**
//     * Crea un objeto <code>HotKeys</code> para controlar los eventos de teclas en un componente que 
//     * implemente la interface <code>HotKeysAplicable</code> y sea capaz de manejar un <code>ActionMap</code>.
//     * @param componente Un objeto <code>HotKeysAplicable</code>.
//     * @param objetoControl El objeto del componente que controla los estados en los que puede o no ejecutarse
//     * la función asignada a las acciones de los <code>KeyStroke</code>.
//     */
//    public HotKeys(HotKeysAplicable componente, String objetoControl) {
//        this(componente.obtenerComponentePrincipal(), objetoControl);
//    }
//    public HotKeys(FormAdministrable componente) {
//        this((Object)componente, "control");
//    }
//    public HotKeys(FormAdministrable componente, String objetoControl) {
//        this((Object)componente, objetoControl);
//    }
    /**
     * Crea un objeto <code>HotKeys</code> para controlar los eventos de teclas en un componente que sea
     * capaz de manejar un <code>ActionMap</code>. Por defecto se asigna el objeto de nombre "control"
     * del componente para efectos de controlar los estados en los que puede o no ejecutarse la función
     * asignada a las acciones de los <code>KeyStroke</code>.
     * @param componente El componente al que se asignarán los <code>KeyStroke</code>. 
     * Los componentes soportados pueden ser alguno de los siguientes:
     * <ul>
     * <li><code>JComponent</code></li>
     * <li><code>JFrame</code></li>
     * <li><code>JDialog</code></li>
     * <li><code>TranslucentDialog</code></li>
     * </ul>
     * O un objeto que implemente la interface <code>FormAdministrable</code>.
     */
    public HotKeys(Object componente) {
        this(componente, "control");
    }
    /**
     * Crea un objeto <code>HotKeys</code> para controlar los eventos de teclas en un componente que sea
     * capaz de manejar un <code>ActionMap</code>.
     * @param componente El componente al que se asignarán los <code>KeyStroke</code>. 
     * Los componentes soportados pueden ser alguno de los siguientes:
     * <ul>
     * <li><code>JComponent</code></li>
     * <li><code>JFrame</code></li>
     * <li><code>JDialog</code></li>
     * <li><code>TranslucentDialog</code></li>
     * </ul>
     * O un objeto que implemente la interface <code>FormAdministrable</code>.
     * @param objetoControl El objeto del componente que controla los estados en los que puede o no ejecutarse
     * la función asignada a las acciones de los <code>KeyStroke</code>.
     */
    public HotKeys(Object componente, String objetoControl) {
        this.objetoControl = objetoControl;
        if (componente instanceof JComponent) {
            this.inputMap = ((JComponent)componente).getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            this.actionMap = ((JComponent)componente).getActionMap();
        } else {
            JComponent aux = null;
            if (componente instanceof JFrame) {
                aux = (JPanel)((JFrame)componente).getContentPane();
            } else if (componente instanceof TranslucentDialog) {
                aux = (JComponent)((TranslucentDialog)componente).getContentPane();
            } else if (componente instanceof JDialog) {
                aux = (JPanel)((JDialog)componente).getContentPane();
            }
            this.inputMap = aux.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            this.actionMap = aux.getActionMap();
        }
        this.componente = componente;
    }
    public String getObjetoControl() {
        return objetoControl;
    }
    public void setObjetoControl(String objetoControl) {
        this.objetoControl = objetoControl;
    }
    /**
     * Agrega una acción al ActionMap del componente asignado.
     * @param keyStroke Un objeto <code>KeyStroke</code> que indica cual tecla dispara la acción.
     * @param nombre    El nombre de la acción que se agregará al <code>ActionMap</code> del componente.
     * @param nombreFuncion El nombre de la función del componente que se ejecutará al disparar el <code>KeyStroke</code>.
     * @param estados   Un array de objetos <code>int</code> para controlar la condicion en la que se 
     *                  ejecuta el <code>KeyStroke</code>, estos valores pueden ser arbitrarios y
     *                  se controlan mediante el objeto con el nombre asignado a <code>objetoControl</code> del
     *                  componente.
     */
    public void agregarAccion(KeyStroke keyStroke, String nombre, final String nombreFuncion, final int ... estados) {
        actionMap.put(nombre, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean ejecutar = false;
                    if (estados.length != 0) {
                        Field control = componente.getClass().getDeclaredField(objetoControl);
                        control.setAccessible(true);
                        for (int i : estados) {
                            if (i == control.getInt(componente)) {
                                ejecutar = true;
                                break;
                            }
                        }
                    } else {
                        ejecutar = true;
                    }
                    if (ejecutar) {
                        Method method;
                        method = componente.getClass().getDeclaredMethod(nombreFuncion, null);
                        method.setAccessible(true);
                        method.invoke(componente, null);
                    }
                } catch (NoSuchFieldException ex) {
                    Logger.getLogger(HotKeys.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SecurityException ex) {
                    Logger.getLogger(HotKeys.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(HotKeys.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(HotKeys.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(HotKeys.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(HotKeys.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        inputMap.put(keyStroke, nombre);
    }
    
}