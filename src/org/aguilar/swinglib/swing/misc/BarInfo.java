/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.misc;

import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/**
 *
 * @author I.S.C. Leonardo Favio Aguilar Ramírez [Leo Aguilar]
 */

/**
   * Internal class that maintains information about individual Accordion bars;
   * specifically it maintains the following information:
   *
   * name      The name of the bar
   * button     The associated JButton for the bar
   * component    The component maintained in the Accordion
   */
public class BarInfo {

    private String name;
    private JButton button;
    private JComponent component;

    /**
     * Creates a new BarInfo
     *
     * @param  name    The name of the bar
     * @param  component  The component that is the body of the Accordion
     */
    public BarInfo(String name, JComponent component) {
      this.name = name;
      this.component = component;
      this.button = new JButton(name);
      setButtonProperties();
    }
    /**
     * Creates a new BarInfo
     *
     * @param  name    The name of the bar
     * @param  icon    JButton icon
     * @param  component  The component that is the body of the Accordion
     */
    public BarInfo(String name, Icon icon, JComponent component) {
        this.name = name;
        this.component = component;
        this.button = new JButton(name, icon);
        setButtonProperties();
    }
    /**
     * Returns the name of the bar
     *
     * @return The name of the bar
     */
    public String getName() {
        return this.name;
    }
    /**
     * Sets the name of the bar
     *
     * @param  The name of the bar
     */
    public void setName(String name) {
        this.name = name;
        this.button.setText(name);
    }
    /**
     * Returns the Accordion JButton implementation
     *
     * @return   The Accordion JButton implementation
     */
    public JButton getButton() {
        return this.button;
    }
    /**
     * Returns the component that implements the body of this Accordion
     *
     * @return The component that implements the body of this Accordion
     */
    public JComponent getComponent() {
        return this.component;
    }
    private void setButtonProperties() {
        button.setFont(new Font("Tahoma", Font.BOLD, 14));
        button.setIconTextGap(15);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setHorizontalTextPosition(SwingConstants.RIGHT);
    }

}