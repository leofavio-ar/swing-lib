/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import org.aguilar.swinglib.swing.fl.dialogs.FlAlertDialog;

/**
 *
 * @author I.S.C. Leonardo Favio Aguilar Ramírez [Leo Aguilar]
 */
public class ExceptionLogger {

    private Exception exception = new Exception();

    public ExceptionLogger(Exception exception) {
        setException(exception);
    }
    public void logToFile(String path) {
        try {
            FileWriter fw = new FileWriter(path);
            PrintWriter out = new PrintWriter(fw);
            out.append(exception.getStackTrace().toString() + "\n\n");
            out.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ExceptionLogger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//    public void show() {
//        FlAlert.error(null, exception.getStackTrace().toString());
//    }
    public Exception getException() {
        return exception;
    }
    public void setException(Exception exception) {
        this.exception = exception;
    }

}