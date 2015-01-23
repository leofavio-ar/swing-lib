/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.behavior.effects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Leo Aguilar
 */
public class Fader extends Timer {

    public static final int FADE_IN = 0;
    public static final int FADE_OUT = 1;
    private JDialog dialog;
    private int fadeType;
    private float alphaFrom;
    private float alphaTo;
    private float step;
    private float aux;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            start();
        }
    };

    public Fader(JDialog dialog, int fadeType) {
        this(dialog, fadeType, 10);
    }
    public Fader(JDialog dialog, int fadeType, int interval) {
        super(0, null);
        this.dialog = dialog;
        this.fadeType = fadeType;
        setAlphas();
        step = java.lang.Math.abs(alphaFrom - alphaTo) / interval;
        aux = alphaFrom;
        addTimerActionListener();
    }
    private void addTimerActionListener() {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(fadeType) {
                    case FADE_IN:
                        if (aux + step < 1.0f) {
                            dialog.setOpacity(aux += step);
                        } else {
                            stop();
                        }
                        break;
                    case FADE_OUT:
                        if (aux - step > 0.0f) {
                            dialog.setOpacity(aux -= step);
                        } else {
                            stop();
                            dialog.dispose();
                        }
                }
            }
        });
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
    public void init() {
        new Thread(runnable).start();
        if (!dialog.isVisible()) {
            dialog.setOpacity(alphaFrom);
            dialog.setVisible(true);
        }
    }
    @Override
    public void stop() {
        super.stop();
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
        Fader fadeIn = new Fader(dialog, Fader.FADE_IN, 100);
        Fader fadeOut = new Fader(dialog, Fader.FADE_OUT, 100);
        fadeIn.init();
        fadeOut.init();
    }

}