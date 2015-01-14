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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import org.aguilar.swinglib.behavior.effects.Fader;
import org.aguilar.swinglib.swing.fl.FlRoundButton;
import org.aguilar.swinglib.swing.fl.FlStringField;

/**
 *
 * @author Leo Aguilar
 */
public class InputDialog extends TranslucentDialog {

    private JLabel iconLabel;
    private JLabel messageLabel;
    private FlStringField inputField;
//    private Object inputValue;
    private int dialogResult;
    private Fader fadeIn;
    private Fader fadeOut;
    private boolean fade;
    private final ImageIcon dialogTitleIcon = new ImageIcon(this.getClass().getResource("/img/px16/dialog.png"));
    private final ImageIcon dialogIcon = new ImageIcon(this.getClass().getResource("/img/px32/dialog.png"));
    public static short OK_OPTION = 1;
    public static short CANCEL_OPTION = 0;
    
    public InputDialog(Frame parent, String title) {
        this(parent, title, Color.BLACK, false);
    }
    public InputDialog(Frame parent, String title, boolean fade) {
        this(parent, title, Color.BLACK, fade);
    }
    public InputDialog(Frame parent, String title, Color color, boolean fade) {
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
    public Object showDialog(String message) {
        return showDialog(dialogTitleIcon, message, dialogIcon);
    }
    public Object showDialog(ImageIcon titleIcon, String message, ImageIcon messageIcon) {
        setIcon(titleIcon);
        iconLabel.setIcon(messageIcon);
        messageLabel.setText(plainTextToHtml(message));
        pack();
        OK_OPTION = 0;
        CANCEL_OPTION = 1;
        FlRoundButton[] buttons = new FlRoundButton[2];
        buttons[0] = createButton("Aceptar", OK_OPTION);
        buttons[1] = createButton("Cancelar", CANCEL_OPTION);
        addButtonToBottomPane(buttons);
        pack();
        if (fade) {
            fadeIn.init();
        } else {
            setVisible(true);
        }
        return dialogResult == CANCEL_OPTION ? null : inputField.getText();
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
        inputField = new FlStringField();
        messageLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setHorizontalAlignment(SwingConstants.LEADING);
        messageLabel.setVerticalAlignment(SwingConstants.CENTER);
        messageLabel.setIconTextGap(10);
        messageLabel.setBorder(new EmptyBorder(10, 0, 10, 15));
        iconLabel.setBorder(new EmptyBorder(10, 10, 10, 0));
        JPanel wrapping = new JPanel(new BorderLayout());
        wrapping.setBorder(BorderFactory.createEmptyBorder(10, 10, 10 ,10));
        wrapping.setOpaque(false);
        inputField.setBorder(null);
        inputField.setFont(new Font("tahoma", Font.PLAIN, 12));
        inputField.setMargin(new Insets(5, 5, 5, 5));
        wrapping.add(inputField);
        wrapping.revalidate();
//        inputField.setBorder(compound);
//        inputField.setMargin(new Insets(10, 10, 10, 10));
//        inputField.setBorder(new EmptyBorder(10, 10, 10, 10));
        setMinimumSize(new Dimension(200, 120));
        setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
        getContentPane().setLayout(new BorderLayout(20, 0));
        getContentPane().add(iconLabel, BorderLayout.WEST);
        getContentPane().add(messageLabel, BorderLayout.CENTER);
        getContentPane().add(wrapping, BorderLayout.SOUTH);
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
        InputDialog alert = new InputDialog(new JFrame(), "Información", Color.BLACK, true);
        System.out.println(alert.showDialog("ESTE ES UN MENSAJE DE PRUEBA.\n\nPRESIONE ACEPTAR PARA CERRAR ESTA VENTANA."));
    }

}