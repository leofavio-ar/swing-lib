/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.awt.Color;

/**
 *
 * @author Leo Aguilar
 */
public class ColorUtils {

    /**
     * Obtiene un nuevo <code>Color</code> a partir de una base y los valores
     * HSB deseados.
     * @param base El color base que se derivará.
     * @param hue El valor del tinte que se agregará al nuevo
     * <code>Color</code>.
     * @param saturation El valor de saturación que se agregará al nuevo
     * <code>Color</code>.
     * @param brightness El valor de brillo que se agregará al nuevo
     * <code>Color</code>.
     * @return Un color derivado a partir de la base y los valors HSB enviados.
     */
    public static Color deriveColorHSB(Color base, float hue, float saturation, float brightness) {
        float hsb[] = Color.RGBtoHSB(base.getRed(), base.getGreen(), base.getBlue(), null);
        hsb[0] += hue;
        hsb[1] += saturation;
        hsb[2] += brightness;
        return Color.getHSBColor(
            hsb[0] < 0 ? 0 : (hsb[0] > 1 ? 1 : hsb[0]),
            hsb[1] < 0 ? 0 : (hsb[1] > 1 ? 1 : hsb[1]),
            hsb[2] < 0 ? 0 : (hsb[2] > 1 ? 1 : hsb[2]));
    }
    /**
     * Obtiene un nuevo <code>Color</code> a partir de una base y el valor de
     * brillo deseado.
     * @param base El color base que se derivará.
     * @param brightness El valor de brillo que se sumará al brillo del color
     * base.
     * @return Un nuevo <code>Color</code> a partir de la base y el valor del
     * brillo enviado.
     */
    public static Color adjustColorBrightness(Color base, float brightness) {
        float hsb[] = Color.RGBtoHSB(base.getRed(), base.getGreen(), base.getBlue(), null);
        hsb[2] += brightness;
        hsb[2] = hsb[2] < 0.0f ? 0.0f : (hsb[2] > 1.0f ? 1.0f : hsb[2]);
        return Color.getHSBColor(hsb[0], hsb[1], hsb[2]);
    }
    /**
     * Obtiene un valor entre 0 y 255 que indica el brillo de un <code>Color</code>.
     * @param color El <code>Color</code> del cual queremos saber su brillo.
     * @return Un entero entre 0 y 255 que indica el brillo del <code>Color</code>
     */
    private static int getBrightness(Color color) {
        return (int) Math.sqrt(
            color.getRed() * color.getRed() * 0.241f +
            color.getGreen() * color.getGreen() * 0.691f +
            color.getBlue() * color.getBlue() * 0.068f);
    }
    /**
     * Indica si un <code>Color</code> se considera oscuro o no a partir de un
     * valor de umbral de oscuridad.
     * @param color El <code>Color</code> del cual queremos saber si es oscuro
     * o no.
     * @param treshold El umbral de oscuridad para saber si el <code>Color</code>
     * se considera oscuro o no. Valores menores al umbral indicado se
     * considerará un color oscuro, a valores iguales o mayores se considerará
     * un color claro.
     * @return <code>true</code> si el color es oscuro.
     */
    public static boolean isDark(Color color, int treshold) {
        if (treshold < 0 || treshold > 255)
            throw new IllegalArgumentException("El valor del umbral debe estar entre 0 y 255. 0 &let treshold &let 255");
        return getBrightness(color) < treshold;
    }
    /**
     * Indica si un <code>Color</code> se considera oscuro o no a partir de un
     * valor de umbral de 130.
     * @param color El <code>Color</code> del cual queremos saber si es oscuro
     * o no.
     * @return <code>true</code> si el color es oscuro.
     */
    public static boolean isDark(Color color) {
        return isDark(color, 130);
    }
//    /**
//     * Obtiene un nuevo <code>Color</code> a partir de una base y el factor de
//     * brillo que se aplicará.
//     * @param base El color base que se abrillantará.
//     * @param factor El factor de brillo que se aplicará a la base;
//     * 0.0 &le factor &le 1.0. A mayor factor, más brillante será el resultado.
//     * @return Un nuevo <code>Color</code> igual o más brillante que la base.
//     */
//    public static Color brighter(Color base, float factor) {
//        if (factor < 0.0f || factor > 1.0f)
//            throw new IllegalArgumentException("El factor debe estar entre 0 y 1; 0.0f <= factor <= 1.0f.");
//        int r = base.getRed();
//        int g = base.getGreen();
//        int b = base.getBlue();
//        int alpha = base.getAlpha();
//        int i = (int)(1.0 / (1.0 - factor));
//        if (r == 0 && g == 0 && b == 0)
//            return new Color(i, i, i, alpha);
//        if (r > 0 && r < i) r = i;
//        if (g > 0 && g < i) g = i;
//        if (b > 0 && b < i) b = i;
//        return new Color(Math.min((int)(r / factor), 255),
//                         Math.min((int)(g / factor), 255),
//                         Math.min((int)(b / factor), 255),
//                         alpha);
//    }
//    /**
//     * Obtiene un nuevo <code>Color</code> a partir de una base y el factor de
//     * oscuridad que se aplicará.
//     * @param base El color base que se oscurecerá.
//     * @param factor El factor de oscuridad que se aplicará a la base;
//     * 0.0 &le factor &le 1.0f.
//     * @return Un nuevo <code>Color</code> igual o más oscuro que la base.
//     */
//    public static Color darker(Color base, float factor) {
//        if (factor < 0.0f || factor > 1.0f)
//            throw new IllegalArgumentException("El factor debe estar entre 0 y 1; 0.0f <= factor <= 1.0f.");
//        return new Color(Math.max((int)(base.getRed() * factor), 0),
//                         Math.max((int)(base.getGreen() * factor), 0),
//                         Math.max((int)(base.getBlue() * factor), 0),
//                         base.getAlpha());
//    }

}