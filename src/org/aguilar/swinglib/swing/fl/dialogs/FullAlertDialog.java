/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl.dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import org.aguilar.swinglib.behavior.effects.FaderAWT;

/**
 *
 * @author Leo Aguilar
 */
public class FullAlertDialog extends TranslucentFullDialog {

    private JLabel messageLabel;
    private FaderAWT fadeIn;
    public FaderAWT fadeOut;
    private boolean fade;
    private String message;
    private ImageIcon icon;
    private int duration;
    private int fontSize = 26;
    private static ImageIcon dialogIcon = new ImageIcon(FullAlertDialog.class.getResource("/img/px48/dialog.png"));

    public FullAlertDialog() {
        this(Color.ORANGE, FullAlertDialog.CENTER, 3000, true);
    }
    public FullAlertDialog(Color backgroundColor) {
        this(backgroundColor, FullAlertDialog.CENTER, 3000, true);
    }
    public FullAlertDialog(Color backgroundColor, int position) {
        this(backgroundColor, position, 3000, true);
    }
    public FullAlertDialog(Color backgroundColor, int position, int duration) {
        this(backgroundColor, position, duration, true);
    }
    public FullAlertDialog(Color backgroundColor, int position, int duration, boolean fade) {
        super(backgroundColor, position, duration);
        setPaintGradient(true);
        this.fade = fade;
        this.duration = duration;
        if (fade) {
            fadeIn = new FaderAWT(this, 30, FaderAWT.FADE_IN);
            fadeOut = new FaderAWT(this, 30, FaderAWT.FADE_OUT);
        }
        initComponents();
    }
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    public void setForegroundColor(Color foregroundColor) {
        messageLabel.setForeground(foregroundColor);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        messageLabel = new JLabel(message, icon, SwingConstants.CENTER);
        messageLabel.setIconTextGap(15);
        messageLabel.setFont(new Font("Verdana", Font.BOLD, fontSize));
        messageLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(messageLabel, BorderLayout.CENTER);
        pack();
    }
    public void showDialog(String message) {
        showDialog(message, dialogIcon);
    }
    public void showDialog(String message, ImageIcon icon) {
        messageLabel.setIcon(icon);
        messageLabel.setText(plainTextToHtml(message));
        pack();
        new Timer(duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fade) {
                    fadeOut.start();
                } else {
                    setVisible(false);
                }
                ((Timer)e.getSource()).stop();
            }
        }).start();
        if (fade) {
            fadeIn.start();
        } else {
            setVisible(true);
        }
    }
    public static String plainTextToHtml(String plainText) {
        String html;
        plainText = plainText.replace("\n", "<br/>");
        html = "<html>" + plainText + "</html>";
        return html;
    }

    public static void main(String[] args) {
        FullAlertDialog alert = new FullAlertDialog(Color.ORANGE, FullAlertDialog.TOP, 3000, true);
        alert.setForegroundColor(Color.WHITE);
        alert.setPaintGradient(true);
        alert.showDialog("MENSAJE DE PRUEBA");
    }

}