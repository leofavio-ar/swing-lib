package org.aguilar.swinglib.swing.fl;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.Timer;

/**
 *
 * @author Leo Aguilar
 * Trébol Informatica
 * http://trebolinformatica.com.mx
 */
public class FlStatusBar extends JToolBar {

    private JLabel label = new JLabel();
    private Timer timer;
    private int messageDuration = 3000;
    private final ImageIcon informationIcon = new ImageIcon(this.getClass().getResource("/img/information.png"));
    private final ImageIcon warningIcon = new ImageIcon(this.getClass().getResource("/img/warning.png"));
    private final ImageIcon errorIcon = new ImageIcon(this.getClass().getResource("/img/exclamation.png"));

    public FlStatusBar() {
        super();
        init();
    }
    public FlStatusBar(String name) {
        super(name);
        init();
    }
    public FlStatusBar(int orientation) {
        super(orientation);
        init();
    }
    public FlStatusBar(String name, int orientation) {
        super(name, orientation);
        init();
    }
    private void init() {
        setFloatable(false);
        label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        add(label);
        initTimer(messageDuration);
    }
    private void initTimer(int messageDuration) {
        timer = new Timer(messageDuration, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setIcon(null);
                label.setText("");
                ((Timer)e.getSource()).stop();
            }
        });
    }
    public void showCustom(String message, int messageDuration, String urlIcon) {
        timer.stop();
        label.setIcon(null);
        label.setText("");
        label.setText(message);
        label.setIcon(new ImageIcon(this.getClass().getResource(urlIcon)));
        initTimer(messageDuration != this.messageDuration ? messageDuration : this.messageDuration);
        timer.start();
    }
    public void setMessageDuration(int messageDuration) {
        this.messageDuration = messageDuration;
        timer.setDelay(messageDuration);
    }
    public int getMessageDuration() {
        return messageDuration;
    }
    public void showInformation(String message) {
        show(message, messageDuration, 0);
    }
    public void showInformation(String message, int duration) {
        show(message, duration, 0);
    }
    public void showWarning(String message) {
        show(message, messageDuration, 1);
    }
    public void showWarning(String message, int duration) {
        show(message, duration, 0);
    }
    public void showError(String message) {
        show(message, messageDuration, 2);
    }
    public void showError(String message, int duration) {
        show(message, duration, 2);
    }
    private void show(String message, int duration, int type) {
        timer.stop();
        label.setIcon(null);
        label.setText("");
        label.setText(message);
        switch (type) {
            case 0: label.setIcon(informationIcon); break;
            case 1: label.setIcon(warningIcon);     break;
            case 2: label.setIcon(errorIcon);       break;
        }
        initTimer(duration != messageDuration ? duration : messageDuration);
        timer.start();
    }

}