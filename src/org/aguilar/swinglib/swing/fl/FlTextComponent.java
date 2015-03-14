/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import org.aguilar.swinglib.swing.misc.TextFieldAutoCompleter;
import org.aguilar.swinglib.validator.StringValidator;

/**
 *
 * @author leoaguilar
 */
public class FlTextComponent extends JTextComponent {
    
    private boolean required = false;
    private boolean onlyDigits = false;
    private boolean upperCase = false;
    private boolean testingNumberFormat = false;
    private boolean defaultTextOnLostFocusIfNull = false;
    private boolean formatNumber = false;
    private boolean selectAllOnFocus = true;
    private int     minLength = 0;
    private int     maxLength = -1;
    private int     placeHolderGap = 2;
    private String  requiredErrorMessage = "El campo es requerido";
    private String  tooShortErrorMessage = "La cadena es más corta que el mínimo permitido";
    private String  invalidNumberErrorMessage = "El número es inválido";
    private String  defaultText = "";
    private String  fieldName = "";
    private Color   bgColor;
    
    private Map                     control;
    private TextFieldAutoCompleter  actf;
    private StringValidator         validator;
    
    private final DecimalFormat     dec = new DecimalFormat("#0.00");
    private final FocusAdapter      selectAllAdapter = new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            ((FlStringField)e.getSource()).selectAll();
        }
    };

    public FlTextComponent() {
        super();
        tooShortErrorMessage = "La cadena es más corta que el mínimo permitido (" + minLength + ").";
        control = new HashMap();
        control.put("error", Boolean.FALSE);
        control.put("mensajeError", "");
        control.put("cancelado", Boolean.FALSE);
        bgColor = this.getBackground();
        setSelectAllOnFocus(true);
    }
    private void addSelectAllOnFocusListener() {
        if (selectAllOnFocus) {
            addFocusListener(selectAllAdapter);
        } else {
            removeFocusListener(selectAllAdapter);
        }
    }
    public void addAutoCompleteFeature(Object[] list) {
        this.setAutoCompleteFeature(list);
    }
    @Deprecated
    public void setAutoCompleteFeature(Object[] list) {
        if (actf == null) {
            actf = new TextFieldAutoCompleter(this);
        }
        if (!actf.isInstalado()) {
            actf.instalar();
        }
        actf.setLista(list);
    }
    public void removeAutoCompleteFeature() {
        if (actf != null) {
            if (actf.isInstalado()) {
                actf.desinstalar();
            }
        }
    }
    public void setValidation() {
        setValidation(required, onlyDigits, minLength, maxLength, requiredErrorMessage, tooShortErrorMessage, invalidNumberErrorMessage);
    }
    public void setValidation(
            boolean required, boolean onlyDigits, int minLength, int maxLength, 
            String requiredErrorMessage, String tooShortErrorMessage, String invalidNumberErrorMessage) {
        this.required = required;
        this.minLength = minLength;
        setOnlyDigits(onlyDigits);
        setMaxLength(maxLength);
        this.requiredErrorMessage = requiredErrorMessage;
        this.tooShortErrorMessage = tooShortErrorMessage;
        validator = new StringValidator(
                required, minLength, onlyDigits, new String[] {requiredErrorMessage, tooShortErrorMessage, invalidNumberErrorMessage}, bgColor);
        addFocusListener(validator);
    }
    public void validar() {
        if (validator != null) {
            validator.validar(this);
        }
    }
    @Override
    public void setEditable(boolean editable) {
        super.setEditable(editable);
        if (!editable) {
            bgColor = new Color(240, 240, 240);
            this.setBackground(bgColor);
        }
    }
    public boolean isRequired() {
        return required;
    }
    public void setRequired(boolean required) {
        this.required = required;
    }
    public boolean isOnlyDigits() {
        return onlyDigits;
    }
    public void setOnlyDigits(boolean onlyDigits) {
        this.onlyDigits = onlyDigits;
        if (onlyDigits) {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char ch = e.getKeyChar();
                    int co = e.getKeyCode();
                    if (!Character.isDigit(ch) && co != KeyEvent.VK_BACK_SPACE && co != KeyEvent.VK_DELETE && ch != '.' && co != KeyEvent.VK_SPACE) {
                        e.consume();
                    }
                }
            });
        }
    }
    public boolean isUpperCase() {
        return upperCase;
    }
    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
        if (upperCase) {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char ch = e.getKeyChar();
                    if (Character.isLetter(ch)) {
                        e.setKeyChar(Character.toUpperCase(ch));
                    }
                }
            });
        }
    }
    public boolean isTestingNumberFormat() {
        return testingNumberFormat;
    }
    public void setTestingNumberFormat(boolean testingNumberFormat) {
        this.testingNumberFormat = testingNumberFormat;
    }
    public boolean isFormatNumber() {
        return formatNumber;
    }
    public void setFormatNumber(boolean formatNumber) {
        this.formatNumber = formatNumber;
        if (formatNumber) {
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    JTextField jtf = (JTextField)e.getComponent();
                    if (jtf.getText().trim().matches("-?\\d+(\\.\\d+)?")) {
                        jtf.setText(dec.format(Double.valueOf(jtf.getText().trim())));
                    } else {
                        jtf.setText("0.00");
                    }
                }
            });
        }
    }
    public boolean isSelectAllOnFocus() {
        return selectAllOnFocus;
    }
    public void setSelectAllOnFocus(boolean selectAllOnFocus) {
        this.selectAllOnFocus = selectAllOnFocus;
        addSelectAllOnFocusListener();
    }
    public int getMinLength() {
        return minLength;
    }
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public void setMaxLength(final int maxLength) {
        this.maxLength = maxLength;
        if (maxLength != -1) {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    JTextField jtf = (JTextField)e.getComponent();
                    if (jtf.getText().length() >= maxLength) {
                        e.consume();
                    }
                }
            });
        }
    }
    public int getPlaceHolderGap() {
        return placeHolderGap;
    }
    public void setPlaceHolderGap(int placeHolderGap) {
        this.placeHolderGap = placeHolderGap;
    }
    public String getRequiredErrorMessage() {
        return requiredErrorMessage;
    }
    public void setRequiredErrorMessage(String requiredErrorMessage) {
        this.requiredErrorMessage = requiredErrorMessage;
    }
    public String getTooShortErrorMessage() {
        return tooShortErrorMessage;
    }
    public void setTooShortErrorMessage(String tooShortErrorMessage) {
        this.tooShortErrorMessage = tooShortErrorMessage;
    }
    public String getInvalidNumberErrorMessage() {
        return invalidNumberErrorMessage;
    }
    public void setInvalidNumberErrorMessage(String invalidNumberErrorMessage) {
        this.invalidNumberErrorMessage = invalidNumberErrorMessage;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
        control.put("campo", fieldName);
    }
    public Color getBgColor() {
        return bgColor;
    }
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }
    public Map getControl() {
        return control;
    }
    
}