/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.aguilar.swinglib.swing.misc.TextFieldAutoCompleter;
import org.aguilar.swinglib.utils.AlineacionLabel;
import org.aguilar.swinglib.utils.PosicionLabel;

/**
 *
 * @author Leonardo Favio Aguilar Ramírez
 */
public class FlLabeledField extends JPanel {

    private FlStringField stringFieldComponent;
    private JLabel labelComponent;
    private int anchoLabel;
    private boolean anchoFijo;
    private PosicionLabel posicionLabel = PosicionLabel.LEFT;
    private AlineacionLabel alineacionLabel = AlineacionLabel.TRAILING;
    
    public FlLabeledField() {
        super();
        initComponents();
        recalcular();
        setEditable(true);
        setAnchoLabel(labelComponent.getPreferredSize().width);
    }
    public String getLabel() {
        return labelComponent.getText();
    }
    public void setLabel(String label) {
        labelComponent.setText(label);
        labelComponent.setPreferredSize(null);
        if (isAnchoFijo()) {
            recalcular();
        }
    }
    public String getText() {
        return stringFieldComponent.getText();
    }
    public void setText(String text) {
        stringFieldComponent.setText(text);
    }
    public int getAnchoLabel() {
        return anchoLabel;
    }
    public void setAnchoLabel(int anchoLabel) {
        this.anchoLabel = anchoLabel;
        if (isAnchoFijo()) {
            ajustarLabel();
        } else {
            recalcular();
        }
    }
    public boolean isAnchoFijo() {
        return anchoFijo;
    }
    public void setAnchoFijo(boolean anchoFijo) {
        this.anchoFijo = anchoFijo;
        if (anchoFijo) {
            ajustarLabel();
        } else {
            recalcular();
        }
    }
    public PosicionLabel getPosicionLabel() {
        return posicionLabel;
    }
    public void setPosicionLabel(PosicionLabel posicionLabel) {
        this.posicionLabel = posicionLabel;
        switch (this.posicionLabel) {
            case TOP:
                this.add(labelComponent, BorderLayout.NORTH, 0);
                break;
            case LEFT:
                this.add(labelComponent, BorderLayout.WEST, 0);
                ajustarLabel();
                break;
            case RIGHT:
                this.add(labelComponent, BorderLayout.EAST, 0); 
                ajustarLabel();
                break;
            case BOTTOM:
                this.add(labelComponent, BorderLayout.SOUTH, 0);
                break;
        }
        labelComponent.setPreferredSize(null);
        stringFieldComponent.setPreferredSize(null);
        this.setPreferredSize(null);
    }
    public AlineacionLabel getAlineacionLabel() {
        return alineacionLabel;
    }
    public void setAlineacionLabel(AlineacionLabel alineacionLabel) {
        this.alineacionLabel = alineacionLabel;
        switch (this.alineacionLabel) {
            case LEFT:
            case LEADING:
                labelComponent.setHorizontalAlignment(JLabel.LEADING); break;
            case RIGHT:
            case TRAILING:
                labelComponent.setHorizontalAlignment(JLabel.TRAILING); break;
            case CENTER:
                labelComponent.setHorizontalAlignment(JLabel.CENTER); break;
        }
    }
    private void ajustarLabel() {
        labelComponent.setPreferredSize(null);
//        stringFieldComponent.setSize(this.getPreferredSize().width - anchoLabel, stringFieldComponent.getPreferredSize().height);
        if (isAnchoFijo()) {
            labelComponent.setPreferredSize(new Dimension(anchoLabel, labelComponent.getPreferredSize().height));
//            stringFieldComponent.setSize(this.getPreferredSize().width - anchoLabel, stringFieldComponent.getPreferredSize().height);
        }
//        this.revalidate();
    }
    private void recalcular() {
        labelComponent.setPreferredSize(null);
        if (isAnchoFijo()) {
            if (labelComponent.getPreferredSize().getWidth() < anchoLabel) {
                labelComponent.setPreferredSize(new Dimension(anchoLabel, labelComponent.getPreferredSize().width));
            } else {
                setAnchoLabel(labelComponent.getPreferredSize().width);
            }
        }
    }
    public void setLabelFont(Font font) {
        if (labelComponent != null) {
            labelComponent.setFont(font);
            recalcular();
        }
    }
    public Font getLabelFont() {
        return labelComponent.getFont();
    }
    public void setStringFieldFont(Font font) {
        if (stringFieldComponent != null) {
            stringFieldComponent.setFont(font);
        }
    }
    public Font getStringFieldFont() {
        return stringFieldComponent.getFont();
    }
    @Override
    public void setFont(Font font) {
        super.setFont(font);
        if (!(labelComponent == null && stringFieldComponent == null)) {
            stringFieldComponent.setFont(font);
            labelComponent.setFont(font);
            recalcular();
            this.setPreferredSize(new Dimension(this.getPreferredSize().width, stringFieldComponent.getPreferredSize().height));
        }
        this.revalidate();
    }
    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }    
    public void setPlaceHolderGap(int placeHolderGap) {
        stringFieldComponent.setPlaceHolderGap(placeHolderGap);
    }
    public void setPlaceHolderIcon(ImageIcon placeHolderIcon) {
        stringFieldComponent.setPlaceHolderIcon(placeHolderIcon);
    }
    public void setPlaceHolderText(String placeHolderText) {
        stringFieldComponent.setPlaceHolderText(placeHolderText);
    }
    public void setFieldName(String fieldName) {
        stringFieldComponent.setFieldName(fieldName);
    }
    public void setSelectAllOnFocus(boolean selectAllOnFocus) {
        stringFieldComponent.setSelectAllOnFocus(selectAllOnFocus);
    }
    public void setDefaultText(String defaultText) {
        stringFieldComponent.setDefaultText(defaultText);
    }
    public void setDefaultTextOnLostFocusIfNull(boolean defaultTextOnLostFocusIfNull) {
        stringFieldComponent.setDefaultTextOnLostFocusIfNull(defaultTextOnLostFocusIfNull);
    }
    public void setTestingNumberFormat(boolean testNumberFormat) {
        stringFieldComponent.setTestingNumberFormat(testNumberFormat);
    }
    public void setRequiredErrorMessage(String requiredErrorMessage) {
        stringFieldComponent.setRequiredErrorMessage(requiredErrorMessage);
    }
    public void setTooShortErrorMessage(String tooShortErrorMessage) {
        stringFieldComponent.setTooShortErrorMessage(tooShortErrorMessage);
    }
    public void setInvalidNumberErrorMessage(String invalidNumberErrorMessage) {
        stringFieldComponent.setInvalidNumberErrorMessage(invalidNumberErrorMessage);
    }
    public void setRequired(boolean required) {
        stringFieldComponent.setRequired(required);
    }
    public void removeAutoCompleteFeature() {
        stringFieldComponent.removeAutoCompleteFeature();
    }
    public void setOnlyDigits(boolean onlyDigits) {
        stringFieldComponent.setOnlyDigits(onlyDigits);
    }
    public void setUpperCase(boolean upperCase) {
        stringFieldComponent.setUpperCase(upperCase);
    }
    public void setMinLength(int minLength) {
        stringFieldComponent.setMinLength(minLength);
    }
    public void setMaxLength(final int maxLength) {
        stringFieldComponent.setMaxLength(maxLength);
    }
    public void setAutoCompleteFeature(Object[] list) {
        stringFieldComponent.setAutoCompleteFeature(list);
    }
    public void setFormatNumber(boolean formatNumber) {
        stringFieldComponent.setFormatNumber(formatNumber);
    }
    public boolean isFormatNumber() {
        return stringFieldComponent.isFormatNumber();
    }
    public boolean isDefaultTextOnLostFocusIfNull() {
        return stringFieldComponent.isDefaultTextOnLostFocusIfNull();
    }
    public boolean isTestingNumberFormat() {
        return stringFieldComponent.isTestingNumberFormat();
    }
    public boolean isRequired() {
        return stringFieldComponent.isRequired();
    }
    public boolean isOnlyDigits() {
        return stringFieldComponent.isOnlyDigits();
    }
    public boolean isUpperCase() {
        return stringFieldComponent.isUpperCase();
    }
    public boolean isSelectAllOnFocus() {
        return stringFieldComponent.isSelectAllOnFocus();
    }
    public int getPlaceHolderGap() {
        return stringFieldComponent.getPlaceHolderGap();
    }
    public ImageIcon getPlaceHolderIcon() {
        return stringFieldComponent.getPlaceHolderIcon();
    }
    public String getPlaceHolderText() {
        return stringFieldComponent.getPlaceHolderText();
    }
    public String getFieldName() {
        return stringFieldComponent.getFieldName();
    }
    public Map getControl() {
        return stringFieldComponent.getControl();
    }
    public String getDefaultText() {
        return stringFieldComponent.getDefaultText();
    }
    public int getMinLength() {
        return stringFieldComponent.getMinLength();
    }
    public int getMaxLength() {
        return stringFieldComponent.getMaxLength();
    }
    public TextFieldAutoCompleter getActf() {
        return stringFieldComponent.getActf();
    }
    public void setValidation() {
        stringFieldComponent.setValidation();
    }
    public void validar() {
        stringFieldComponent.validar();
    }
    public void setEditable(boolean editable) {
        stringFieldComponent.setEditable(editable);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        stringFieldComponent = new FlStringField();
        labelComponent = new JLabel("Etiqueta:");
        stringFieldComponent.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        labelComponent.setHorizontalAlignment(JLabel.TRAILING);
        labelComponent.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        this.setOpaque(false);
        this.setLayout(new BorderLayout(5, 5));
        this.setOpaque(false);
        this.add(labelComponent, BorderLayout.LINE_START, 0);
        this.add(stringFieldComponent, BorderLayout.CENTER, 1);
//        this.setPreferredSize(new Dimension(200, stringFieldComponent.getPreferredSize().height));
        this.setPreferredSize(null);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba de LabeledField");
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(500, 100));
        final FlLabeledField laf1 = new FlLabeledField();
        final FlLabeledField laf3 = new FlLabeledField();
        JButton btn1 = new JButton("+");
        JButton btn2 = new JButton("-");
        JButton btn3 = new JButton("Cambiar label");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                laf1.setFont(new Font("Tahoma", Font.BOLD, laf1.getFont().getSize() + 1));
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                laf1.setFont(new Font("Tahoma", Font.BOLD, laf1.getFont().getSize() - 1));
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                laf1.setLabel("etiqueta larguísima al extremo...");
            }
        });
        laf1.setAnchoFijo(true);
        laf1.setAnchoLabel(100);
//        laf1.setFont(new Font("Tahoma", Font.BOLD, 12));
//        laf3.setAnchoLabel(100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(laf1, BorderLayout.NORTH);
        laf1.setText("texto de prueba..");
        laf1.setPosicionLabel(PosicionLabel.TOP);
        frame.add(btn1, BorderLayout.WEST);
        frame.add(btn2, BorderLayout.EAST);
        frame.add(btn3, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    
}