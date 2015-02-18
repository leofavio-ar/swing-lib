package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.text.Document;
import org.aguilar.swinglib.swing.misc.TextFieldAutoCompleter;
import org.aguilar.swinglib.validator.StringValidator;

/**
 *
 * @author Leo Aguilar
 */
public class FlStringField extends JTextField {

    private boolean required = false;
    private boolean onlyDigits = false;
    
    private boolean upperCase = false;
    private boolean testingNumberFormat = false;
    private boolean defaultTextOnLostFocusIfNull = false;
    private boolean formatNumber = false;
    private boolean selectAllOnFocus = true;
    private int minLength = 0;
    private int maxLength = -1;
    private int placeHolderGap = 2;
    private String requiredErrorMessage = "El campo es requerido";
    private String tooShortErrorMessage = "La cadena es más corta que el mínimo permitido";
    private String invalidNumberErrorMessage = "El número es inválido";
    private String defaultText = "";
    private String fieldName = "";
    private ImageIcon placeHolderIcon;
    private String placeHolderText = "";
    private Color bgColor;
    
    private Insets dummyInsets;
    private Map control;
    
    private TextFieldAutoCompleter actf;
    private DecimalFormat dec = new DecimalFormat("#0.00");
    private StringValidator validator;
    private final FocusAdapter selectAllAdapter = new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            ((FlStringField)e.getSource()).selectAll();
        }
    };

    public FlStringField() {
        super();
        tooShortErrorMessage = "La cadena es más corta que el mínimo permitido (" + minLength + ").";
        control = new HashMap();
        control.put("error", Boolean.FALSE);
        control.put("mensajeError", "");
        control.put("cancelado", Boolean.FALSE);
        selectAllOnFocus = true;
        Border border = UIManager.getBorder("TextField.border");
        JTextField dummy = new JTextField();
        this.dummyInsets = border.getBorderInsets(dummy);
        bgColor = this.getBackground();
        addSelectAllOnFocusListener();
    }
    public FlStringField(String text) {
        super(text);
    }
    public FlStringField(int columns) {
        super(columns);
    }
    public FlStringField(String text, int columns) {
        super(text, columns);
    }
    public FlStringField(Document doc, String text, int columns) {
        super(doc, text, columns);
    }
    private void addSelectAllOnFocusListener() {
        if (selectAllOnFocus) {
            addFocusListener(selectAllAdapter);
        } else {
            removeFocusListener(selectAllAdapter);
        }
    }
    public void setPlaceHolderGap(int placeHolderGap) {
        this.placeHolderGap = placeHolderGap;
    }
    public void setPlaceHolderIcon(ImageIcon placeHolderIcon) {
        this.placeHolderIcon = placeHolderIcon;
    }
    public void setPlaceHolderText(String placeHolderText) {
        this.placeHolderText = placeHolderText;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
        control.put("campo", fieldName);
    }
    public void setSelectAllOnFocus(boolean selectAllOnFocus) {
        this.selectAllOnFocus = selectAllOnFocus;
        addSelectAllOnFocusListener();        
    }
    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
    }
    public void setDefaultTextOnLostFocusIfNull(boolean defaultTextOnLostFocusIfNull) {
        this.defaultTextOnLostFocusIfNull = defaultTextOnLostFocusIfNull;
        if (defaultTextOnLostFocusIfNull) {
            addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    JTextField jtf = (JTextField)e.getComponent();
                    if (jtf.getText().trim().equals("")) {
                        jtf.setText(defaultText);
                    }
                }
            });
        }
    }
    public void setTestingNumberFormat(boolean testNumberFormat) {
        this.testingNumberFormat = testNumberFormat;
    }
    public void setRequiredErrorMessage(String requiredErrorMessage) {
        this.requiredErrorMessage = requiredErrorMessage;
    }
    public void setTooShortErrorMessage(String tooShortErrorMessage) {
        this.tooShortErrorMessage = tooShortErrorMessage;
    }
    public void setInvalidNumberErrorMessage(String invalidNumberErrorMessage) {
        this.invalidNumberErrorMessage = invalidNumberErrorMessage;
    }
    public void setRequired(boolean required) {
        this.required = required;
    }
    public void removeAutoCompleteFeature() {
        if (actf != null) {
            if (actf.isInstalado()) {
                actf.desinstalar();
            }
        }
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
    public void setMinLength(int minLength) {
        this.minLength = minLength;
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
    public void setAutoCompleteFeature(Object[] list) {
        if (actf == null) {
            actf = new TextFieldAutoCompleter(this);
        }
        if (!actf.isInstalado()) {
            actf.instalar();
        }
        actf.setLista(list);
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
    public boolean isFormatNumber() {
        return formatNumber;
    }
    public boolean isDefaultTextOnLostFocusIfNull() {
        return defaultTextOnLostFocusIfNull;
    }
    public boolean isTestingNumberFormat() {
        return testingNumberFormat;
    }
    public boolean isRequired() {
        return required;
    }
    public boolean isOnlyDigits() {
        return onlyDigits;
    }
    public boolean isUpperCase() {
        return upperCase;
    }
    public boolean isSelectAllOnFocus() {
        return selectAllOnFocus;
    }
    public int getPlaceHolderGap() {
        return placeHolderGap;
    }
    public ImageIcon getPlaceHolderIcon() {
        return placeHolderIcon;
    }
    public String getPlaceHolderText() {
        return placeHolderText;
    }
    public String getFieldName() {
        return fieldName;
    }
    public Map getControl() {
        return control;
    }
    public String getDefaultText() {
        return defaultText;
    }
    public int getMinLength() {
        return minLength;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public TextFieldAutoCompleter getActf() {
        return actf;
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
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int textX = 2;
        if (this.placeHolderIcon != null) {
            int iconWidth = placeHolderIcon.getIconWidth();
            int iconHeight = placeHolderIcon.getIconHeight();
            this.setSize(this.getWidth(), iconHeight + placeHolderGap);
            int x = dummyInsets.left + 5;
            textX = x + iconWidth + 2;
            int y = (this.getHeight() - iconHeight) / 2;
            placeHolderIcon.paintIcon(this, g, x, y);
        }
        setMargin(new Insets(2, textX, 2, 2));
        if (this.getText().equals("")) {
            int width = this.getWidth();
            int height = this.getHeight();
            Font prev = g.getFont();
            Font italic = prev.deriveFont(Font.ITALIC);
            Color prevColor = g.getColor();
            g.setFont(italic);
            g.setColor(UIManager.getColor("textInactiveText"));
            int h = g.getFontMetrics().getHeight();
            int textBottom = (height - h) / 2 + h - 4;
            int x = this.getInsets().left;
            Graphics2D g2d = (Graphics2D) g;
            RenderingHints hints = g2d.getRenderingHints();
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2d.drawString(placeHolderText, x, textBottom);
            g2d.setRenderingHints(hints);
            g.setFont(prev);
            g.setColor(prevColor);
        }
    }
    
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        FlStringField field = new FlStringField();
        frame.setSize(500, 500);
        field.setPlaceHolderText("escribe algo...");
        field.setPlaceHolderIcon(new ImageIcon(FlStringField.class.getResource("/img/px24/help.png")));
        field.setPlaceHolderGap(10);
        frame.add(field);
        frame.pack();
        frame.setVisible(true);
    }

}