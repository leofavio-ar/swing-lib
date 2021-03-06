package org.aguilar.swinglib.validator;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import org.aguilar.swinglib.swing.fl.FlStringField;
import org.aguilar.swinglib.swing.fl.FlTextComponent;

/**
 *
 * @author Leo Aguilar
 */
public class StringValidator extends FocusAdapter {

    private boolean required;
    private boolean onlyDigits;
    private int minLenght = 0;
    private String[] errorMessages;
    private Color bgColor;
//    private static final String NUM = "\\d+(\\.\\d+)?";
    private static final String NUM = "(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?";
    public static final int REQUERIDO = 0;
    public static final int LONG_MINIMA = 1;
    public static final int NUMEROS = 2;

    public StringValidator(boolean required, int minLenght, boolean onlyDigits, String[] errorMessages, Color bgColor) {
        super();
        this.required = required;
        this.onlyDigits = onlyDigits;
        this.minLenght = minLenght;
        this.errorMessages = errorMessages;
        this.bgColor = bgColor;
    }
    @Override
    public void focusGained(FocusEvent evt) {
        ((FlStringField)evt.getComponent()).setBackground(bgColor);
        ((FlStringField)evt.getComponent()).setForeground(null);
    }
    @Override
    public void focusLost(FocusEvent evt) {
        FlStringField fsf = (FlStringField)evt.getComponent();
        validar(fsf);
    }
    public void validar(FlTextComponent ftc) {
        if (!(boolean)ftc.getControl().get("cancelado")) {
            if (required) {
                if (ftc.getText().trim().equals("")) {
                    establecerEstado(REQUERIDO, ftc);
                    return;
                }
            }
            if (onlyDigits) {
                if (ftc.isTestingNumberFormat()) {
//                    if (!esNumeroValido(fsf.getText().trim())) {
//                        establecerEstado(NUMEROS, fsf);
//                        return;
//                    }
                    if (!Pattern.matches(NUM, ftc.getText().trim())) {
                        establecerEstado(NUMEROS, ftc);
                        return;
                    }
                }
            }
            if (minLenght > 0) {
                if (ftc.getText().trim().length() < minLenght) {
                    establecerEstado(LONG_MINIMA, ftc);
                    return;
                }
            }
        }
        ftc.getControl().put("cancelado", Boolean.FALSE);
        ftc.getControl().put("error", Boolean.FALSE);
        ftc.getControl().put("mensajeError", "");
//        fsf.setBackground(UIManager.getColor("TextField.background"));
        ftc.setBackground(bgColor);
        ftc.setForeground(UIManager.getColor("TextField.foreground"));
        ftc.setToolTipText(null);
        ToolTipManager.sharedInstance().unregisterComponent(ftc);
    }
    public void validar(FlStringField fsf) {
        if (!(boolean)fsf.getControl().get("cancelado")) {
            if (required) {
                if (fsf.getText().trim().equals("")) {
                    establecerEstado(REQUERIDO, fsf);
                    return;
                }
            }
            if (onlyDigits) {
                if (fsf.isTestingNumberFormat()) {
//                    if (!esNumeroValido(fsf.getText().trim())) {
//                        establecerEstado(NUMEROS, fsf);
//                        return;
//                    }
                    if (!Pattern.matches(NUM, fsf.getText().trim())) {
                        establecerEstado(NUMEROS, fsf);
                        return;
                    }
                }
            }
            if (minLenght > 0) {
                if (fsf.getText().trim().length() < minLenght) {
                    establecerEstado(LONG_MINIMA, fsf);
                    return;
                }
            }
        }
        fsf.getControl().put("cancelado", Boolean.FALSE);
        fsf.getControl().put("error", Boolean.FALSE);
        fsf.getControl().put("mensajeError", "");
//        fsf.setBackground(UIManager.getColor("TextField.background"));
        fsf.setBackground(bgColor);
        fsf.setForeground(UIManager.getColor("TextField.foreground"));
        fsf.setToolTipText(null);
        ToolTipManager.sharedInstance().unregisterComponent(fsf);
    }
    private boolean esNumeroValido(String numero) {
        Number num = null;
        try {
            num = NumberFormat.getNumberInstance(new Locale("es", "MX")).parse(numero);
        } catch (ParseException ex) {
            
        }
        return num != null;
    }
    private void establecerEstado(int msg, FlTextComponent ftc) {
        switch (msg) {
            case REQUERIDO  : ftc.setBackground(new Color(220, 144, 144, 255)); break;
            case LONG_MINIMA: ftc.setBackground(new Color(144, 185, 220, 255)); break;
            case NUMEROS    : ftc.setBackground(new Color(155, 144, 220, 255)); break;
        }
        ftc.getControl().put("error", Boolean.TRUE);
        ftc.getControl().put("mensajeError", errorMessages[msg]);
        ftc.setForeground(Color.white);
        ToolTipManager.sharedInstance().registerComponent(ftc);
        ftc.setToolTipText(errorMessages[msg]);
    }
    private void establecerEstado(int msg, FlStringField fsf) {
        switch (msg) {
            case REQUERIDO  : fsf.setBackground(new Color(220, 144, 144, 255)); break;
            case LONG_MINIMA: fsf.setBackground(new Color(144, 185, 220, 255)); break;
            case NUMEROS    : fsf.setBackground(new Color(155, 144, 220, 255)); break;
        }
        fsf.getControl().put("error", Boolean.TRUE);
        fsf.getControl().put("mensajeError", errorMessages[msg]);
        fsf.setForeground(Color.white);
        ToolTipManager.sharedInstance().registerComponent(fsf);
        fsf.setToolTipText(errorMessages[msg]);
    }

}