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
import java.util.Arrays;
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

/**
 *
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
    
    public HotKeys(Object componente) {
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
    public void agregarAccion(KeyStroke keyStroke, String nombre, final String nombreFuncion, final int ... estados) {
        actionMap.put(nombre, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean ejecutar = false;
                    if (estados.length != 0) {
                        Field control = componente.getClass().getDeclaredField("control");
                        control.setAccessible(true);
                        if (Arrays.binarySearch(estados, control.getInt(componente)) != -1) {
                            ejecutar = true;
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