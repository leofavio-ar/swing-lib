/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author Leo Aguilar
 */
public class FrameTemplate extends JFrame {

    private MenuBar menuBar;
    private JToolBar sidePane;
    private FlDesktopPane desktopPane;
    private JPanel helpPane;
    private JToolBar toolBar;

    public FrameTemplate() {
        super();
        initializeComponents();
    }
    private void initializeComponents() {
        menuBar = new MenuBar();
        sidePane = new JToolBar(JToolBar.VERTICAL);
        desktopPane = new FlDesktopPane();
        helpPane = new JPanel();
        toolBar = new JToolBar();
        setMinimumSize(new Dimension(500, 200));
        setLayout(new BorderLayout());

        menuBar.add(new Menu("MENU"));

        setMenuBar(menuBar);

        JButton button = new JButton("BOTON");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                helpPane.add(new JLabel("<html>aksjd lkajd lkasjdlk ajsdlkajdklasj askdj askd jaslkjd lkajsd klasjd lkajsdlajslkd</html>"), BorderLayout.CENTER);
                helpPane.setVisible(true);
            }

        });
        sidePane.setFloatable(false);
        sidePane.add(button);

        desktopPane.setBackground(Color.BLACK);

        helpPane.setMaximumSize(new Dimension(300, Short.MAX_VALUE));
        helpPane.setMinimumSize(new Dimension(300, Short.MAX_VALUE));
        helpPane.setLayout(new BorderLayout());
        helpPane.setVisible(false);

        toolBar.setFloatable(false);
        toolBar.add(new JLabel("TOOLBAR"));

        add(sidePane, BorderLayout.LINE_START);
        add(desktopPane, BorderLayout.CENTER);
        add(helpPane, BorderLayout.LINE_END);
        add(toolBar, BorderLayout.SOUTH);
        pack();
    }
    @Override
    public MenuBar getMenuBar() {
        return menuBar;
    }
    public JToolBar getSidePane() {
        return sidePane;
    }
    public FlDesktopPane getDesktopPane() {
        return desktopPane;
    }
    public JPanel getHelpPane() {
        return helpPane;
    }
    public JToolBar getToolBar() {
        return toolBar;
    }
    public static void main(String[] args) {
        new FrameTemplate().setVisible(true);
    }

}