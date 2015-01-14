/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl.dialogs;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolTip;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import org.aguilar.swinglib.swing.fl.FlRoundButton;

/**
 *
 * @author Leo Aguilar
 */
public class ToolTipButtons extends JDialog {

    private FlRoundButton[] buttons;

    public ToolTipButtons() {
        this(new FlRoundButton[] {});
    }
    public ToolTipButtons(FlRoundButton[] buttons) {
        super();
        this.buttons = buttons;
        initializeComponents();
    }
    //<editor-fold defaultstate="collapsed" desc="Construcción del ToolTip">
    @SuppressWarnings("unchecked")
    private void initializeComponents() {
        setUndecorated(true);
        setMinimumSize(new Dimension(100, 50));
        JComponent contentPane = createPane();
        contentPane.add(new FlRoundButton("BOTÓN"), BorderLayout.CENTER);
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);
        setBackground(new Color(0, 0, 0, 0));
        setModal(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowLostFocus(WindowEvent evt) {
                ((JDialog)evt.getWindow()).setVisible(false);
            }
        });
        addMouseListener(new MouseAdapter() {

        });
//        for (FlRoundButton button : buttons)
//            contentPane.add(button, BorderLayout.WEST);
    }
    //</editor-fold>

    private JComponent createPane() {
        return new JComponent() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Composite old = g2.getComposite();
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.75f));
                Area area = new Area();
                Shape triangle = new Polygon(new int[] {0, 15, 15}, new int[] {getHeight() / 2, 0, getHeight()}, 3);
                Shape roundRect = new RoundRectangle2D.Float(15, 0, getWidth() - 15, getHeight(), 16, 16);
                Shape rect = new Rectangle2D.Float(15, 0, 10, getHeight());
                area.add(new Area(roundRect));
                area.add(new Area(triangle));
                area.add(new Area(rect));
                g2.setColor(Color.BLACK);
                g2.fill(area);
                g2.setComposite(old);
                g2.dispose();
            }
            @Override
            protected void paintBorder(Graphics g) {

            }
        };
    }

    public static void main(String[] args) {
        final ToolTipButtons toolTip = new ToolTipButtons();
        JFrame frame = new JFrame("Ejemplo de esta nueva madre");
        frame.setLayout(new BorderLayout());
        frame.setMinimumSize(new java.awt.Dimension(500, 100));
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel("EJEMPLO DEL TOOLTIP");
        label.setFont(label.getFont().deriveFont(30));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                if (!toolTip.isVisible()) {
                    JLabel label = (JLabel)evt.getSource();
//                    toolTip.setLocationRelativeTo(label);
                    toolTip.setLocation(label.getLocationOnScreen().x + label.getWidth(), label.getLocationOnScreen().y);
                    toolTip.setVisible(true);
                }
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                toolTip.setVisible(false);
            }
        });
        frame.add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

}