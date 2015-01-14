package org.aguilar.swinglib.utils;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;
import org.aguilar.swinglib.swing.fl.FlStringField;

public class PlaceHolder extends JLabel implements FocusListener, DocumentListener {
	
    public enum Show {
            ALWAYS,
            FOCUS_GAINED,
            FOCUS_LOST;
    }
    private JTextComponent component;
    private Document document;
    private int mostrar;
    private boolean mostrarUnaVez;
    private int contFocoPerdido;
    private ImageIcon defaultIcon = new ImageIcon(this.getClass().getResource("/img/px16/yes.png"));
    private static final int SIEMPRE = 0;
    private static final int AL_OBTENER_FOCO = 1;
    private static final int AL_PERDER_FOCO = 2;

    public PlaceHolder(JTextComponent component) {
        this("", component, SIEMPRE);
    }
    public PlaceHolder(String text, JTextComponent component) {
        this(text, component, SIEMPRE);
    }
    public PlaceHolder(String text, JTextComponent component, int mostrar) {
        this.component = component;
        setMostrar(mostrar);
        document = component.getDocument();
        setText(text);
        setFont(component.getFont());
        setForeground(component.getForeground());
        setBorder(new EmptyBorder(component.getInsets()));
        setHorizontalAlignment(JLabel.LEADING);
        component.addFocusListener(this);
        document.addDocumentListener(this);
        component.setLayout(new BorderLayout());
        component.add(this);
        comprobarPlaceHolder();
    }
    public void cambiarAlfa(float alfa) {
        cambiarAlfa((int)(alfa * 255));
    }
    public void cambiarAlfa(int alfa) {
        alfa = alfa > 255 ? 255 : alfa < 0 ? 0 : alfa;
        Color foreground = getForeground();
        int r = foreground.getRed();
        int g = foreground.getGreen();
        int b = foreground.getBlue();
        Color nuevo = new Color(r, g, b, alfa);
        super.setForeground(nuevo);
    }
    public void cambiarEstilo(int style) {
        setFont(getFont().deriveFont(style));
    }
    public int getMostrar() {
        return mostrar;
    }
    public void setMostrar(int mostrar) {
        this.mostrar = mostrar;
    }
    public boolean isMostrarUnaVez() {
        return mostrarUnaVez;
    }
    public void setMostrarUnaVez(boolean mostrarUnaVez) {
        this.mostrarUnaVez = mostrarUnaVez;
    }
    private void comprobarPlaceHolder() {
        if (document.getLength() > 0) {
            setVisible(false);
            return;
        }
        if (mostrarUnaVez && contFocoPerdido > 0) {
            setVisible(false);
            return;
        }
        if (component.hasFocus()) {
            if (mostrar == SIEMPRE || mostrar == AL_OBTENER_FOCO) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        } else {
            if (mostrar == SIEMPRE || mostrar == AL_PERDER_FOCO) {
                setVisible(true);
            } else {
                setVisible(false);
            }
        }
    }
    @Override
    public void setIcon(Icon icon) {
        super.setIcon(icon == null ? defaultIcon : icon);
    }
    @Override
    public void focusGained(FocusEvent e) {
        comprobarPlaceHolder();
    }
    @Override
    public void focusLost(FocusEvent e) {
            contFocoPerdido ++;
        comprobarPlaceHolder();
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        comprobarPlaceHolder();
    }
    @Override
    public void removeUpdate(DocumentEvent e) {
        comprobarPlaceHolder();
    }
    @Override
    public void changedUpdate(DocumentEvent e) {
    
    }
    
    public static void main(String args[]) {
        JFrame frame = new JFrame("Ejemplo text prompt");
        FlStringField sf = new FlStringField();
        BorderLayout bl = new BorderLayout();
        frame.setLayout(bl);
        sf.setSize(300, 30);
        sf.setText("");
        frame.add(sf, BorderLayout.NORTH);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
//        PlaceHolder holder = new PlaceHolder("Nombre de usuario", sf, PlaceHolder.SIEMPRE);
//        holder.cambiarAlfa(0.7f);
//        holder.cambiarEstilo(Font.ITALIC);
//        holder.setIcon(new ImageIcon(PlaceHolder.class.getResource("/img/px16/cancel.png")));
        sf.setBorder(new MatteBorder(0, 16, 0, 0, new ImageIcon(PlaceHolder.class.getResource("/img/px16/yes.png"))));
        
        frame.setVisible(true);
    }
    
}