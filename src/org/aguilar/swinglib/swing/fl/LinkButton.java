/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.aguilar.swinglib.swing.fl;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.Action;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.metal.MetalButtonUI;

/**
 *
 * @author Leo Aguilar
 */
public class LinkButton extends JButton {

    private static final String uiString = "LinkButtonUI";
    public static final int ALWAYS_UNDERLINE = 0;
    public static final int HOVER_UNDERLINE = 1;
    public static final int NEVER_UNDERLINE = 2;
    public static final int SYSTEM_DEFAULT = 3;
    private int linkBehavior;
    private Color linkColor;
    private Color colorPressed;
    private Color visitedLinkColor;
    private Color disabledLinkColor;
    private URL buttonURL;
    private Action defaultAction;
    private boolean isLinkVisited;

    public LinkButton() {
        this(null, null, null);
    }
    public LinkButton(Action action) {
        this();
        setAction(action);
    }
    public LinkButton(Icon icon) {
        this(null, icon, null);
    }
    public LinkButton(String s) {
        this(s, null, null);
    }
    public LinkButton(URL url) {
        this(null, null, url);
    }
    public LinkButton(String s, URL url) {
        this(s, null, url);
    }
    public LinkButton(Icon icon, URL url) {
        this(null, icon, url);
    }
    public LinkButton(String text, Icon icon, URL url) {
        super(text, icon);
        linkBehavior = LinkButton.HOVER_UNDERLINE;
        linkColor = Color.blue;
        colorPressed = Color.red;
        visitedLinkColor = new Color(128, 0, 128);
        if (text == null && url != null) {
          setText(url.toExternalForm());
        }
        setLinkURL(url);
        setCursor(Cursor.getPredefinedCursor(12));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setRolloverEnabled(true);
        addActionListener(defaultAction);
    }
    @Override
    public void updateUI() {
        setUI(BasicLinkButtonUI.createUI(this));
    }
    private void setDefault() {
        UIManager.getDefaults().put("LinkButtonUI", "BasicLinkButtonUI");
    }
    @Override
    public String getUIClassID() {
        return "LinkButtonUI";
    }
    protected void setupToolTipText() {
        String tip = null;
        if (buttonURL != null) {
          tip = buttonURL.toExternalForm();
        }
        setToolTipText(tip);
    }
    public void setLinkBehavior(int bnew) {
        checkLinkBehavior(bnew);
        int old = linkBehavior;
        linkBehavior = bnew;
        firePropertyChange("linkBehavior", old, bnew);
        repaint();
    }
    private void checkLinkBehavior(int behavior) {
        if (behavior != ALWAYS_UNDERLINE && behavior != HOVER_UNDERLINE && behavior != NEVER_UNDERLINE && behavior != SYSTEM_DEFAULT) {
            throw new IllegalArgumentException("Not a legal LinkBehavior");
        } else {
            return;
        }
    }
    public int getLinkBehavior() {
        return linkBehavior;
    }
    public void setLinkColor(Color color) {
        Color colorOld = linkColor;
        linkColor = color;
        firePropertyChange("linkColor", colorOld, color);
        repaint();
    }
    public Color getLinkColor() {
        return linkColor;
    }
    public void setActiveLinkColor(Color colorNew) {
        Color colorOld = colorPressed;
        colorPressed = colorNew;
        firePropertyChange("activeLinkColor", colorOld, colorNew);
        repaint();
    }
    public Color getActiveLinkColor() {
        return colorPressed;
    }
    public void setDisabledLinkColor(Color color) {
        Color colorOld = disabledLinkColor;
        disabledLinkColor = color;
        firePropertyChange("disabledLinkColor", colorOld, color);
        if (!isEnabled())
            repaint();
    }
    public Color getDisabledLinkColor() {
        return disabledLinkColor;
    }
    public void setVisitedLinkColor(Color colorNew) {
        Color colorOld = visitedLinkColor;
        visitedLinkColor = colorNew;
        firePropertyChange("visitedLinkColor", colorOld, colorNew);
        repaint();
    }
    public Color getVisitedLinkColor() {
        return visitedLinkColor;
    }
    public URL getLinkURL() {
        return buttonURL;
    }
    public void setLinkURL(URL url) {
        URL urlOld = buttonURL;
        buttonURL = url;
        setupToolTipText();
        firePropertyChange("linkURL", urlOld, url);
        revalidate();
        repaint();
    }
    public void setLinkVisited(boolean flagNew) {
        boolean flagOld = isLinkVisited;
        isLinkVisited = flagNew;
        firePropertyChange("linkVisited", flagOld, flagNew);
        repaint();
    }
    public boolean isLinkVisited() {
        return isLinkVisited;
    }
    public void setDefaultAction(Action actionNew) {
        Action actionOld = defaultAction;
        defaultAction = actionNew;
        firePropertyChange("defaultAction", actionOld, actionNew);
    }
    public Action getDefaultAction() {
        return defaultAction;
    }
    @Override
    protected String paramString() {
        String str;
        if (linkBehavior == ALWAYS_UNDERLINE) {
            str = "ALWAYS_UNDERLINE";
        } else if (linkBehavior == HOVER_UNDERLINE) {
            str = "HOVER_UNDERLINE";
        } else if (linkBehavior == NEVER_UNDERLINE) {
            str = "NEVER_UNDERLINE";
        } else {
            str = "SYSTEM_DEFAULT";
        }
        String colorStr = linkColor == null ? "" : linkColor.toString();
        String colorPressStr = colorPressed == null ? "" : colorPressed.toString();
        String disabledLinkColorStr = disabledLinkColor == null ? "" : disabledLinkColor.toString();
        String visitedLinkColorStr = visitedLinkColor == null ? "" : visitedLinkColor.toString();
        String buttonURLStr = buttonURL == null ? "" : buttonURL.toString();
        String isLinkVisitedStr = isLinkVisited ? "true" : "false";
        return super.paramString() + ",linkBehavior=" + str + ",linkURL="
            + buttonURLStr + ",linkColor=" + colorStr + ",activeLinkColor="
            + colorPressStr + ",disabledLinkColor=" + disabledLinkColorStr
            + ",visitedLinkColor=" + visitedLinkColorStr
            + ",linkvisitedString=" + isLinkVisitedStr;
    }
    
}

class BasicLinkButtonUI extends MetalButtonUI {

    private static final BasicLinkButtonUI ui = new BasicLinkButtonUI();

    public BasicLinkButtonUI() {

    }
    public static ComponentUI createUI(JComponent jcomponent) {
        return ui;
    }
    @Override
    protected void paintText(Graphics g, JComponent c, Rectangle rect, String s) {
        LinkButton linkButton = (LinkButton) c;
        ButtonModel bnModel = linkButton.getModel();
        Color color = linkButton.getForeground();
        Object obj = null;
        if (bnModel.isEnabled()) {
            if (bnModel.isPressed()) {
                linkButton.setForeground(linkButton.getActiveLinkColor());
            } else if (linkButton.isLinkVisited()) {
                linkButton.setForeground(linkButton.getVisitedLinkColor());
            } else {
                linkButton.setForeground(linkButton.getLinkColor());
            }
        } else {
            if (linkButton.getDisabledLinkColor() != null) {
                linkButton.setForeground(linkButton.getDisabledLinkColor());
            }
        }
        super.paintText(g, c, rect, s);
        int behavior = linkButton.getLinkBehavior();
        boolean drawLine = false;
        if (behavior == LinkButton.HOVER_UNDERLINE) {
            if (bnModel.isRollover()) {
                drawLine = true;
            }
        } else if (behavior == LinkButton.ALWAYS_UNDERLINE || behavior == LinkButton.SYSTEM_DEFAULT) {
            drawLine = true;
        }
        if (!drawLine) {
            return;
        }
        FontMetrics fm = g.getFontMetrics();
        int x = rect.x + getTextShiftOffset();
        int y = (rect.y + fm.getAscent() + fm.getDescent() + getTextShiftOffset()) - 1;
        if (bnModel.isEnabled()) {
            g.setColor(linkButton.getForeground());
            g.drawLine(x, y, (x + rect.width) - 1, y);
        } else {
            g.setColor(linkButton.getBackground().brighter());
            g.drawLine(x, y, (x + rect.width) - 1, y);
        }
    }

    public static void main(String[] a) {
        JFrame f = new JFrame();
        LinkButton button1 = new LinkButton("TEXTO DE PRUEBA");
        button1.setLinkColor(UIManager.getColor("Label.foreground"));
        f.getContentPane().setLayout(new GridLayout(0,2));
        f.getContentPane().add(button1);
        f.getContentPane().add(new LinkButton("www.java2s.com/ExampleCode/CatalogExampleCode.htm"));
        f.setSize(600, 200);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
    
}