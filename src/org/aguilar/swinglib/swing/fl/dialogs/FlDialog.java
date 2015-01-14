package org.aguilar.swinglib.swing.fl.dialogs;

/**
 *
 * @author Leo Aguilar
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FlDialog extends JOptionPane {

    private static final ImageIcon INFORMATION_TITLE_ICON = new ImageIcon(FlDialog.class.getResource("/img/px16/information.png"));
    private static final ImageIcon WARNING_TITLE_ICON = new ImageIcon(FlDialog.class.getResource("/img/px16/warning.png"));
    private static final ImageIcon EXCLAMATION_TITLE_ICON = new ImageIcon(FlDialog.class.getResource("/img/px16/exclamation.png"));
    private static final ImageIcon QUESTION_TITLE_ICON = new ImageIcon(FlDialog.class.getResource("/img/px16/question.png"));
    private static final ImageIcon INFORMATION_ICON = new ImageIcon(FlDialog.class.getResource("/img/px32/information.png"));
    private static final ImageIcon WARNING_ICON = new ImageIcon(FlDialog.class.getResource("/img/px32/warning.png"));
    private static final ImageIcon EXCLAMATION_ICON = new ImageIcon(FlDialog.class.getResource("/img/px32/exclamation.png"));
    private static final ImageIcon QUESTION_ICON = new ImageIcon(FlDialog.class.getResource("/img/px32/question.png"));
    private static final ImageIcon FULL_INFORMATION_ICON = new ImageIcon(FlDialog.class.getResource("/img/px48/information.png"));
    private static final ImageIcon FULL_WARNING_ICON = new ImageIcon(FlDialog.class.getResource("/img/px48/warning.png"));
    private static final ImageIcon FULL_EXCLAMATION_ICON = new ImageIcon(FlDialog.class.getResource("/img/px48/exclamation.png"));
    /** El valor numérico al presionar el botón Aceptar en un diálogo de Información o Advertencia o Error. 
     * Inicialmente su valor es nulo. Adquiere su valor al mostrar un diálogo. */
    public static short OK_OPTION;
    /** El valor numérico al presionar el botón Cancelar en un diálogo de pregunta o al presionar el botón de cerrar de la barra de título del diálogo. 
     * Inicialmente su valor es nulo. Adquiere su valor al mostrar un diálogo. */
    public static short CANCEL_OPTION;
    /** El valor numérico al presionar el botón Sí en una diálogo de pregunta. 
     * Inicialmente su valor es nulo. Adquiere su valor al mostrar un diálogo. */
    public static short YES_OPTION;
    /** El valor numérico al presionar el botón No en una diálogo de pregunta. 
     * Inicialmente su valor es nulo. Adquiere su valor al mostrar un diálogo. */
    public static short NO_OPTION;
    /** El valor numérico que indica la posición superior para un <code>FullAlertDialog</code>. */
    public static short TOP = TranslucentFullDialog.TOP;
    /** El valor numérico que indica la posición central de la pantalla para un <code>FullAlertDialog</code>. */
    public static short CENTER = TranslucentFullDialog.CENTER;
    /** El valor numérico que indica la posición inferior para un <code>FullAlertDialog</code>. */
    public static short BOTTOM = TranslucentFullDialog.BOTTOM;

    /**
     * Muestra un <code>OptionDialog</code>.
     * @param parent El padre del <code>OptionDialog</code> que se mostrará.
     * @param message El mensaje que se mostrará en el diálogo.
     * @return Un objeto con el valor ingresado en el diálogo, <code>NULL</code> si se presiona el botón Cancelar.
     */
    public static Object showInputDialog(Frame parent, String message) {
        InputDialog option = new InputDialog(parent, "Ingreso de datos", false);
        return option.showDialog(INFORMATION_TITLE_ICON, message, INFORMATION_ICON);
    }
    /**
     * Muestra un <code>AlertDialog</code> con íconos de información y un botón para Aceptar.
     * @param parent El padre del <code>AlertDialog</code> que se mostrará.
     * @param message El mensaje que se mostrará en el diálogo.
     * @return Un entero con el valor númerico del botón presionado; uno de dos valores: <i>OK_OPTION</i> o <i>CANCEL_OPTION</i>
     */
    public static int showInformationDialog(Frame parent, String message) {
        AlertDialog alert = new AlertDialog(parent, "Información", false);
        int dialogResult = alert.showDialog(INFORMATION_TITLE_ICON, message, INFORMATION_ICON, AlertDialog.OK_ONLY);
        FlDialog.OK_OPTION = AlertDialog.OK_OPTION;
        FlDialog.CANCEL_OPTION = AlertDialog.CANCEL_OPTION;
        return dialogResult;
    }
    /**
     * Muestra un <code>AlertDialog</code> con íconos de información y un botón para Aceptar.
     * @param parent El padre del <code>AlertDialog</code> que se mostrará.
     * @param message El mensaje que se mostrará en el diálogo.
     * @return Un entero con el valor númerico del botón presionado; uno de dos valores: <i>OK_OPTION</i> o <i>CANCEL_OPTION</i>
     */
    public static int showWarningDialog(Frame parent, String message) {
        AlertDialog alert = new AlertDialog(parent, "Advertencia", false);
        int dialogResult = alert.showDialog(WARNING_TITLE_ICON, message, WARNING_ICON, AlertDialog.OK_ONLY);
        FlDialog.OK_OPTION = AlertDialog.OK_OPTION;
        FlDialog.CANCEL_OPTION = AlertDialog.CANCEL_OPTION;
        return dialogResult;
    }
    /**
     * Muestra un <code>AlertDialog</code> con íconos de error y un botón para Aceptar.
     * @param parent El padre del <code>AlertDialog</code> que se mostrará.
     * @param message El mensaje que se mostrará en el diálogo.
     * @return Un entero con el valor númerico del botón presionado; uno de dos valores: <i>OK_OPTION</i> o <i>CANCEL_OPTION</i>
     */
    public static int showErrorDialog(Frame parent, String message) {
        AlertDialog alert = new AlertDialog(parent, "Error", false);
        int dialogResult = alert.showDialog(EXCLAMATION_TITLE_ICON, message, EXCLAMATION_ICON, AlertDialog.OK_ONLY);
        FlDialog.OK_OPTION = AlertDialog.OK_OPTION;
        FlDialog.CANCEL_OPTION = AlertDialog.CANCEL_OPTION;
        return dialogResult;
    }
    /**
     * Muestra un <code>AlertDialog</code> con íconos de pregunta y un botón para Aceptar.
     * @param parent El padre del <code>AlertDialog</code> que se mostrará.
     * @param message El mensaje que se mostrará en el diálogo.
     * @return Un entero con el valor númerico del botón presionado; uno de tres valores: <i>YES_OPTION</i> o <i>NO_OPTION</i>.
     */
    public static int showQuestionDialog(Frame parent, String message) {
        AlertDialog alert = new AlertDialog(parent, "Confirmación", false);
        int dialogResult = alert.showDialog(QUESTION_TITLE_ICON, message, QUESTION_ICON, AlertDialog.YES_NO);
        FlDialog.OK_OPTION = AlertDialog.OK_OPTION;
        FlDialog.CANCEL_OPTION = AlertDialog.CANCEL_OPTION;
        return dialogResult;
    }
    /**
     * Muestra un <code>AlertDialog</code> con íconos por defecto y botones personalizados.
     * @param parent El padre del <code>AlertDialog</code> que se mostrará.
     * @param title El texto que se mostrará en la barra de título del diálogo.
     * @param message El mensaje que se mostrará en el diálogo.
     * @param buttons Los nombres que se mostrarán en los botones que aparecerán en el diálogo.
     * @return Un entero con el valor númerico de la posicion del botón presionado; de izquierda a derecha, el primer botón equivale a 0, el segundo a 1, y así sucesivamente.
     * <br/>Al presionar el botón de cerrar de la barra de título se regresa el valor de <i>CANCEL_OPTION</i>
     */
    public static int showCustomDialog(Frame parent, String title, String message, String ... buttons) {
        AlertDialog alert = new AlertDialog(parent, title, false);
        FlDialog.CANCEL_OPTION = -1;
        return alert.showDialog(message, buttons);
    }
    /**
     * Muestra un <code>AlertDialog</code> con íconos y botones personalizados.
     * @param parent El padre del <code>AlertDialog</code> que se mostrará.
     * @param titleIcon El ícono que se mostrará en la barra de título del diálogo, de preferencia de 16x16 pixeles.
     * @param title El texto que se mostrará en la barra de título del diálogo.
     * @param messageIcon El ícono mostrado al lado del mensaje del díalogo, de preferencia de 32x32 pixeles.
     * @param message El mensaje que se mostrará en el diálogo.
     * @param buttons Los nombres que se mostrarán en los botones que aparecerán en el diálogo.
     * @return Un entero con el valor númerico de la posicion del botón presionado; de izquierda a derecha, el primer botón equivale a 0, el segundo a 1, y así sucesivamente.
     * <br/>Al presionar el botón de cerrar de la barra de título se regresa el valor de <i>CANCEL_OPTION</i>
     */
    public static int showCustomDialog(Frame parent, ImageIcon titleIcon, String title, ImageIcon messageIcon, String message, String ... buttons) {
        AlertDialog alert = new AlertDialog(parent, title, false);
        return alert.showDialog(titleIcon, message, messageIcon, buttons);
    }
    /**
     * Muestra un <code>FullWidthAlertDialog</code> con ícono de información, fondo azul y letras blancas.
     * @param message El mensaje que se mostrará en el diálogo.
     * @param position La posición en pantalla del diálogo. Uno de los siguientes valores:
     * FlAlertDialog.TOP, FlAlertDialog.CENTER o FlAlertDialog.BOTTOM.
     * @param duration El tiempo que tardará en desaparecer el diálogo.
     */
    public static void showFullInformationDialog(String message, int position, int duration) {
        FullAlertDialog alert = new FullAlertDialog(new Color(0x1836a8), position, duration, false);
        alert.setForegroundColor(Color.WHITE);
        alert.showDialog(message, FULL_INFORMATION_ICON);
    }
    public static void showFullInformationDialog(String message, int position) {
        FlDialog.showFullInformationDialog(message, position, 3000);
    }
    public static void showFullInformationDialog(String message) {
        FlDialog.showFullInformationDialog(message, FlDialog.BOTTOM, 3000);
    }
    /**
     * Muestra un <code>FullWidthAlertDialog</code> con ícono de advertencia, fondo amarillo y letras negras.
     * @param message El mensaje que se mostrará en el diálogo.
     * @param position La posición en pantalla del diálogo. Uno de los siguientes valores:
     * FlAlertDialog.TOP, FlAlertDialog.CENTER o FlAlertDialog.BOTTOM.
     * @param duration El tiempo que tardará en desaparecer el diálogo.
     */
    public static void showFullWarningDialog(String message, int position, int duration) {
        FullAlertDialog alert = new FullAlertDialog(new Color(0xd4d719), position, duration, false);
        alert.setForegroundColor(Color.BLACK);
        alert.showDialog(message, FULL_WARNING_ICON);
    }
    public static void showFullWarningDialog(String message, int position) {
        FlDialog.showFullWarningDialog(message, position, 3000);
    }
    public static void showFullWarningDialog(String message) {
        FlDialog.showFullWarningDialog(message, FlDialog.BOTTOM, 3000);
    }
    /**
     * Muestra un <code>FullWidthAlertDialog</code> con ícono de error, fondo rojo y letras blancas.
     * @param message El mensaje que se mostrará en el diálogo.
     * @param position La posición en pantalla del diálogo. Uno de los siguientes valores:
     * FlAlertDialog.TOP, FlAlertDialog.CENTER o FlAlertDialog.BOTTOM.
     * @param duration El tiempo que durará visible el diálogo.
     */
    public static void showFullErrorDialog(String message, int position, int duration) {
        FullAlertDialog alert = new FullAlertDialog(new Color(0xc51111), position, duration, false);
        alert.setForegroundColor(Color.WHITE);
        alert.showDialog(message, FULL_EXCLAMATION_ICON);
    }
    public static void showFullErrorDialog(String message, int position) {
        FlDialog.showFullErrorDialog(message, position, 3000);
    }
    public static void showFullErrorDialog(String message) {
        FlDialog.showFullErrorDialog(message, FlDialog.BOTTOM, 3000);
    }
    /**
     * Muestra un <code>FullWidthAlertDialog</code> con ícono, color de fondo y tamaño y color de fuente personalizados.
     * @param message El mensaje que se mostrará en el diálogo.
     * @param icon El ícono que se mostrará al lado del mensaje.
     * @param position La posición en pantalla del diálogo. Uno de los siguientes valores:
     * FlAlertDialog.TOP, FlAlertDialog.CENTER o FlAlertDialog.BOTTOM.
     * @param duration El tiempo que durará visible el diálogo.
     * @param backgroundColor El color del fondo del diálogo
     * @param fontSize El tamaño de fuente del mensaje.
     * @param foregroundColor El color de la fuente del mensaje.
     */
    public static void showFullCustomDialog(String message, ImageIcon icon, int position, int duration, Color backgroundColor, int fontSize, Color foregroundColor) {
        FullAlertDialog alert = new FullAlertDialog(backgroundColor, position, duration, false);
        alert.setFontSize(fontSize);
        alert.setForegroundColor(foregroundColor);
        alert.showDialog(message, icon);
    }

    public static void main(String[] args) {
        System.out.println(FlDialog.showInputDialog(null, "Ingrese el valor de algo:").toString());
//        FlDialog.showFullInformationDialog("mensaje", FlDialog.TOP);
    }

//<editor-fold defaultstate="collapsed" desc="Deprecated">
    public static final int YES = 0;
    public static final int NO = 1;
    public static final int OK = 0;
    public static final int CANCEL = 1;

    @Deprecated
    public static void info(Component parent, String message) {
        showMessageDialog(parent, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    @Deprecated
    public static void error(Component parent, String message) {
        showMessageDialog(parent, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    @Deprecated
    public static void warning(Component parent, String message) {
        showMessageDialog(parent, message, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    @Deprecated
    public static int confirm(Component parent, String message) {
        return showConfirmDialog(parent, message, "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
    @Deprecated
    public static int custom(Component parent, Component[] components, String title) {
        return custom(parent, components, title, new String[] {"Aceptar", "Cancelar"});
    }
    @Deprecated
    public static int custom(Component parent, Component[] components, String title, String[] options) {
        return showOptionDialog(parent, components, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
    }
//</editor-fold>

}