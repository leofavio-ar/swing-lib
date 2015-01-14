/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl.dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import org.aguilar.swinglib.behavior.effects.Fader;
import org.aguilar.swinglib.swing.fl.FlRoundButton;

/**
 *
 * @author Leo Aguilar
 */
public class AlertDialog extends TranslucentDialog {

    private JLabel iconLabel;
    private JLabel messageLabel;
    private int dialogResult;
    private Fader fadeIn;
    private Fader fadeOut;
    private boolean fade;
    private final ImageIcon dialogTitleIcon = new ImageIcon(this.getClass().getResource("/img/px16/dialog.png"));
    private final ImageIcon dialogIcon = new ImageIcon(this.getClass().getResource("/img/px32/dialog.png"));
    public static final short OK_ONLY = 0;
    public static final short OK_CANCEL = 1;
    public static final short YES_NO = 2;
    public static final short YES_NO_CANCEL = 4;
    public static short OK_OPTION = 8;
    public static short CANCEL_OPTION = 16;
    public static short YES_OPTION = 32;
    public static short NO_OPTION = 64;

    public AlertDialog(Frame parent, String title) {
        this(parent, title, Color.BLACK, false);
    }
    public AlertDialog(Frame parent, String title, boolean fade) {
        this(parent, title, Color.BLACK, fade);
    }
    public AlertDialog(Frame parent, String title, Color color, boolean fade) {
        super(parent, title, true, color);
        this.fade = fade;
        if (fade) {
            fadeIn = new Fader(this, Fader.FADE_IN, 50);
            fadeOut = new Fader(this, Fader.FADE_OUT, 50);
        }
        installCloseButtonClickListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                dialogResult = CANCEL_OPTION;
                setVisible(false);
                dispose();
            }
        });
        initializeComponents();
    }
    public int showDialog(String message) {
        return showDialog(dialogTitleIcon, message, dialogIcon, AlertDialog.OK_ONLY);
    }
    public int showDialog(String message, int buttons) {
        return showDialog(dialogTitleIcon, message, dialogIcon, buttons);
    }
    public int showDialog(String message, String ... buttons) {
        return showDialog(dialogTitleIcon, message, dialogIcon, buttons);
    }
    public int showDialog(ImageIcon titleIcon, String message, ImageIcon messageIcon, int buttons) {
        setIcon(titleIcon);
        int result = -1;
        pack();
        switch (buttons) {
            case OK_ONLY:
                OK_OPTION = 0;
                result = showDialog(titleIcon, message, messageIcon, "Aceptar");
                break;
            case OK_CANCEL:
                OK_OPTION = 0;
                CANCEL_OPTION = 1;
                result = showDialog(titleIcon, message, messageIcon, "Aceptar", "Cancelar");
                break;
            case YES_NO:
                YES_OPTION = 0;
                NO_OPTION = 1;
                result = showDialog(titleIcon, message, messageIcon, "Sí", "No");
                break;
            case YES_NO_CANCEL:
                YES_OPTION = 0;
                NO_OPTION = 1;
                CANCEL_OPTION = 2;
                result = showDialog(titleIcon, message, messageIcon, "Sí", "No", "Cancelar");
                break;
        }
        return result;
    }
    public int showDialog(ImageIcon titleIcon, String message, ImageIcon messageIcon, String ... buttons) {
        setIcon(titleIcon);
        iconLabel.setIcon(messageIcon);
        messageLabel.setText(plainTextToHtml(message));
        pack();
        FlRoundButton[] toAdd = new FlRoundButton[buttons.length];
        for (short i = 0; i < buttons.length; i ++) {
            toAdd[i] = createButton(buttons[i], i);
        }
        addButtonToBottomPane(toAdd);
        pack();
        if (fade) {
            fadeIn.init();
        } else {
            setVisible(true);
        }
        return dialogResult;
    }
    private FlRoundButton createButton(String text, int optionValue) {
        FlRoundButton button = new FlRoundButton(text);
        button.setFont(new Font("Verdana", Font.PLAIN, 12));
        if (text.trim().toUpperCase().equals("ACEPTAR")) {
            button.setIcon(new ImageIcon(getClass().getResource("/img/px16/ok.png")));
        } else if (text.trim().toUpperCase().equals("CANCELAR")) {
            button.setIcon(new ImageIcon(getClass().getResource("/img/px16/cancel.png")));
        } else if (text.trim().toUpperCase().equals("SÍ")) {
            button.setIcon(new ImageIcon(getClass().getResource("/img/px16/yes.png")));
        } else if (text.trim().toUpperCase().equals("NO")) {
            button.setIcon(new ImageIcon(getClass().getResource("/img/px16/no.png")));
        }
        button.putClientProperty("optionValue", optionValue);
        return button;
    }
    private void addButtonToBottomPane(FlRoundButton[] buttons) {
        for (FlRoundButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) { 
                    buttonActionPerformed((Integer)((JButton)evt.getSource()).getClientProperty("optionValue"));
                }
            });
            getBottomPane().add(button);
        }
    }
    private void buttonActionPerformed(int dialogResult) {
        this.dialogResult = dialogResult;
        if (fade) {
            fadeOut.init();
        } else {
            dispose();
        }
    }
    @SuppressWarnings("unchecked")
    private void initializeComponents() {
        iconLabel = new JLabel();
        messageLabel = new JLabel();
        messageLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setHorizontalAlignment(SwingConstants.LEADING);
        messageLabel.setVerticalAlignment(SwingConstants.CENTER);
        messageLabel.setIconTextGap(10);
        messageLabel.setBorder(new EmptyBorder(10, 0, 10, 15));
        iconLabel.setBorder(new EmptyBorder(10, 10, 10, 0));
        setMinimumSize(new Dimension(200, 120));
        setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
        getContentPane().setLayout(new BorderLayout(20, 0));
        getContentPane().add(iconLabel, BorderLayout.WEST);
        getContentPane().add(messageLabel, BorderLayout.CENTER);
        pack();
    }
    public static String plainTextToHtml(String plainText) {
        if (plainText != null) {
            String html;
            plainText = plainText.replace("\n", "<br/>");
            html = "<html>" + plainText + "</html>";
            return html;
        }
        return new String();
    }
    public boolean isFade() {
        return fade;
    }
    public static void main(String[] args) {
        AlertDialog alert = new AlertDialog(new JFrame(), "Información", Color.BLACK, true);
        System.out.println(alert.showDialog("ESTE ES UN MENSAJE DE PRUEBA.\n\nPRESIONE ACEPTAR PARA CERRAR ESTA VENTANA."));
    }

}