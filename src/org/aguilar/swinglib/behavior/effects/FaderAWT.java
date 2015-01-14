/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.behavior.effects;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Leo Aguilar
 */
public class FaderAWT extends Timer {

    public static final int FADE_IN = 0;
    public static final int FADE_OUT = 1;
    private JDialog dialog;
    private int fadeType;
    private float alphaFrom;
    private float alphaTo;
    private int interval = 10;
    private float step = 0.1f;
    private float aux;

    /**
     * Constructor de la clase, con valor de interval = 10.
     * @param dialog El JDialog sobre el cual se realizará el efecto.
     * @param fadeType El tipo de efecto que se realizará: FADE_IN o FADE_OUT.
     */
    public FaderAWT(JDialog dialog, int fadeType) {
        this.dialog = dialog;
        this.fadeType = fadeType;
        setAlphas();
    }
    /**
     * Constructor de la clase.
     * @param dialog El JDialog sobre el cual se realizará el efecto.
     * @param interval El tiempo en milisegundos que habrá entre cada decremento/aumento en la opacidad.
     * @param fadeType El tipo de efecto que se realizará: FADE_IN o FADE_OUT.
     */
    public FaderAWT(JDialog dialog, int interval, int fadeType) {
        this.dialog = dialog;
        this.interval = interval;
        this.fadeType = fadeType;
        setAlphas();
        step = java.lang.Math.abs(alphaFrom - alphaTo) / interval;
        aux = alphaFrom;
    }
    private void setAlphas() {
        switch (fadeType) {
            case FADE_IN:
                alphaFrom = 0.0f;
                alphaTo = 1.0f;
                break;
            case FADE_OUT:
                alphaFrom = 1.0f;
                alphaTo = 0.0f;
        }
    }
    public void start() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                schedule(new TimerTask() {
                    @Override
                    public void run() {
//                        System.out.println(dialog.getOpacity());
                        switch(fadeType) {
                            case FADE_IN:
                                if (aux + step < 1.0f)
                                    dialog.setOpacity(aux += step);
                                else
                                    end();
                                break;
                            case FADE_OUT:
                                if (aux - step > 0.0f)
                                    dialog.setOpacity(aux -= step);
                                else {
                                    end();
                                    dialog.dispose();
                                }
                        }
                    }
                }, 0, interval);
            }
        });
        t.start();
        if (!dialog.isVisible()) {
            dialog.setOpacity(alphaFrom);
            dialog.setVisible(true);
        }
    }
    public void end() {
        cancel();
        dialog.setOpacity(alphaTo);
    }
    public static void main(String[] args) {
        JDialog dialog = new JDialog(new JFrame(), "Informacion");
        dialog.setUndecorated(true);
        dialog.setModal(true);
        dialog.setAlwaysOnTop(true);
        dialog.setMinimumSize(new java.awt.Dimension(500, 200));
        dialog.setLocationRelativeTo(null);
        dialog.getContentPane().setBackground(java.awt.Color.BLACK);
        FaderAWT fadeIn = new FaderAWT(dialog, 30, FaderAWT.FADE_IN);
        FaderAWT fadeOut = new FaderAWT(dialog, 30, FaderAWT.FADE_OUT);
        fadeIn.start();
        fadeOut.start();
    }

}