/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import org.aguilar.swinglib.swing.misc.BarInfo;

/**
 *
 * @author I.S.C. Leonardo Favio Aguilar Ramírez [Leo Aguilar]
 */

public class FlAccordion extends JPanel implements ActionListener {

    private JPanel topPanel = new JPanel(new GridLayout(1, 1));
    private JPanel bottomPanel = new JPanel(new GridLayout(1, 1));
    private Map bars = new LinkedHashMap();
    private int visibleBar = 0;
    private JComponent visibleComponent = null;

    public FlAccordion() {
        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.SOUTH);
    }
    /**
     * Adds the specified component to the FlAccordion and sets the bar's name
     *
     * @param  name      The name of the accordion bar
     * @param  componenet   The component to add to the bar
     */
    public void addBar(String name, JComponent component) {
        BarInfo barInfo = new BarInfo(name, component);
        barInfo.getButton().addActionListener(this);
        this.bars.put(name, barInfo);
        render();
    }
    /**
     * Adds the specified component to the FlAccordion and sets the bar's name
     *
     * @param  name      The name of the accordion bar
     * @param  icon      An icon to display in the accordion bar
     * @param  componenet   The component to add to the bar
     */
    public void addBar(String name, Icon icon, JComponent component) {
        BarInfo barInfo = new BarInfo(name, icon, component);
        barInfo.getButton().addActionListener(this);
        this.bars.put(name, barInfo);
        render();
    }
    /**
     * Removes the specified bar from the FlAccordion
     *
     * @param  name  The name of the bar to remove
     */
    public void removeBar(String name) {
        this.bars.remove(name);
        render();
    }
    /**
     * Returns the index of the currently visible bar (zero-based)
     *
     * @return The index of the currently visible bar
     */
    public int getVisibleBar() {
        return this.visibleBar;
    }
    /**
     * Returns the component of the currently visible bar
     *
     * @return The JComponent of the currently visible bar
     */
    public JComponent getVisibleComponent() {
        return this.visibleComponent;
    }
    /**
     * Set the enable state of the bar selected
     *
     * @param   index   The zero-based index of the component
     * @param   enabled The enable state
     */
    public void setBarEnabled(int index, boolean enabled) {
        int current = visibleBar;
        setVisibleBar(index);
        visibleComponent.setEnabled(enabled);
        setVisibleBar(current);
    }
    /**
     * Programmatically sets the currently visible bar; the visible bar
     * index must be in the range of 0 to size() - 1
     *
     * @param  visibleBar   The zero-based index of the component to make visible
     */
    public void setVisibleBar(int visibleBar) {
        if (visibleBar > 0 && visibleBar < this.bars.size() - 1) {
            this.visibleBar = visibleBar;
            render();
        }
    }
    /**
     * Causes the accordion bar component to rebuild itself; this means that
     * it rebuilds the top and bottom panels of bars as well as making the
     * currently selected bar's panel visible
     */
    public void render() {
        int totalBars = this.bars.size();
        int topBars = this.visibleBar + 1;
        int bottomBars = totalBars - topBars;
        Iterator itr = this.bars.keySet().iterator();
        this.topPanel.removeAll();
        GridLayout topLayout = (GridLayout)this.topPanel.getLayout();
        topLayout.setRows( topBars );
        BarInfo barInfo = null;
        for(int i = 0; i < topBars; i ++) {
            String barName = (String)itr.next();
            barInfo = (BarInfo)this.bars.get(barName);
            this.topPanel.add(barInfo.getButton());
        }
        this.topPanel.validate();
        if (this.visibleComponent != null)
            this.remove(this.visibleComponent);
        this.visibleComponent = barInfo.getComponent();
        this.add(visibleComponent, BorderLayout.CENTER);
        this.bottomPanel.removeAll();
        GridLayout bottomLayout = (GridLayout)this.bottomPanel.getLayout();
        bottomLayout.setRows(bottomBars);
        for (int i = 0; i < bottomBars; i ++) {
            String barName = (String)itr.next();
            barInfo = (BarInfo)this.bars.get(barName);
            this.bottomPanel.add(barInfo.getButton());
        }
        this.bottomPanel.validate();
        this.validate();
    }
    /**
     * Invoked when one of our bars is selected
     */
    public void actionPerformed(ActionEvent e) {
        int currentBar = 0;
        for (Iterator i = this.bars.keySet().iterator(); i.hasNext();) {
            String barName = (String)i.next();
            BarInfo barInfo = (BarInfo)this.bars.get(barName);
            if (barInfo.getButton() == e.getSource()) {
                this.visibleBar = currentBar;
                render();
                return;
            }
            currentBar ++;
        }
    }
    
}