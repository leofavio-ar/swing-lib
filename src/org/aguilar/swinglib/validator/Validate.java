package org.aguilar.swinglib.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.FocusManager;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import org.aguilar.swinglib.swing.fl.FlStringField;

/**
 *
 * @author Leo Aguilar
 * Trébol Informatica
 * http://www.trebolinformatica.com.mx
 */
public class Validate {

    public static List validateAll(FlStringField[] stringFields) {
        List<Map<String, String>> list = new ArrayList<>();
        for (FlStringField fsf : stringFields) {
            fsf.validar();
            if ((boolean)fsf.getControl().get("error")) {
                list.add(fsf.getControl());
            }
        }
        if (stringFields.length > 0) {
            FocusManager.getCurrentManager().focusNextComponent(stringFields[0]);
        }
        return list;
    }
    public static void cancel(FlStringField[] stringFieldsArray) {
        for (FlStringField fsf : stringFieldsArray) {
            fsf.getControl().put("error", Boolean.FALSE);
            fsf.getControl().put("mensajeError", "");
            fsf.getControl().put("cancelado", Boolean.TRUE);
            fsf.setBackground(UIManager.getColor("TextField.background"));
            fsf.setForeground(UIManager.getColor("TextField.foreground"));
            fsf.setToolTipText(null);
            ToolTipManager.sharedInstance().unregisterComponent(fsf);
        }
    }

}