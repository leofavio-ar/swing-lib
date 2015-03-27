/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aguilar.swinglib.swing.fl;

import java.beans.*;

/**
 *
 * @author Sistemas
 */
public class FlDesktopPaneBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_allFrames = 4;
    private static final int PROPERTY_allFramesInLayer = 5;
    private static final int PROPERTY_ancestorListeners = 6;
    private static final int PROPERTY_autoscrolls = 7;
    private static final int PROPERTY_background = 8;
    private static final int PROPERTY_backgroundSet = 9;
    private static final int PROPERTY_baselineResizeBehavior = 10;
    private static final int PROPERTY_border = 11;
    private static final int PROPERTY_bounds = 12;
    private static final int PROPERTY_colorModel = 13;
    private static final int PROPERTY_component = 14;
    private static final int PROPERTY_componentCount = 15;
    private static final int PROPERTY_componentCountInLayer = 16;
    private static final int PROPERTY_componentListeners = 17;
    private static final int PROPERTY_componentOrientation = 18;
    private static final int PROPERTY_componentPopupMenu = 19;
    private static final int PROPERTY_components = 20;
    private static final int PROPERTY_componentsInLayer = 21;
    private static final int PROPERTY_containerListeners = 22;
    private static final int PROPERTY_cursor = 23;
    private static final int PROPERTY_cursorSet = 24;
    private static final int PROPERTY_debugGraphicsOptions = 25;
    private static final int PROPERTY_desktopManager = 26;
    private static final int PROPERTY_displayable = 27;
    private static final int PROPERTY_doubleBuffered = 28;
    private static final int PROPERTY_dragMode = 29;
    private static final int PROPERTY_dropTarget = 30;
    private static final int PROPERTY_enabled = 31;
    private static final int PROPERTY_focusable = 32;
    private static final int PROPERTY_focusCycleRoot = 33;
    private static final int PROPERTY_focusCycleRootAncestor = 34;
    private static final int PROPERTY_focusListeners = 35;
    private static final int PROPERTY_focusOwner = 36;
    private static final int PROPERTY_focusTraversable = 37;
    private static final int PROPERTY_focusTraversalKeys = 38;
    private static final int PROPERTY_focusTraversalKeysEnabled = 39;
    private static final int PROPERTY_focusTraversalPolicy = 40;
    private static final int PROPERTY_focusTraversalPolicyProvider = 41;
    private static final int PROPERTY_focusTraversalPolicySet = 42;
    private static final int PROPERTY_font = 43;
    private static final int PROPERTY_fontSet = 44;
    private static final int PROPERTY_foreground = 45;
    private static final int PROPERTY_foregroundSet = 46;
    private static final int PROPERTY_graphics = 47;
    private static final int PROPERTY_graphicsConfiguration = 48;
    private static final int PROPERTY_height = 49;
    private static final int PROPERTY_hierarchyBoundsListeners = 50;
    private static final int PROPERTY_hierarchyListeners = 51;
    private static final int PROPERTY_ignoreRepaint = 52;
    private static final int PROPERTY_image = 53;
    private static final int PROPERTY_imageSizeMode = 54;
    private static final int PROPERTY_inheritsPopupMenu = 55;
    private static final int PROPERTY_inputContext = 56;
    private static final int PROPERTY_inputMap = 57;
    private static final int PROPERTY_inputMethodListeners = 58;
    private static final int PROPERTY_inputMethodRequests = 59;
    private static final int PROPERTY_inputVerifier = 60;
    private static final int PROPERTY_insets = 61;
    private static final int PROPERTY_keyListeners = 62;
    private static final int PROPERTY_layout = 63;
    private static final int PROPERTY_lightweight = 64;
    private static final int PROPERTY_locale = 65;
    private static final int PROPERTY_location = 66;
    private static final int PROPERTY_locationOnScreen = 67;
    private static final int PROPERTY_managingFocus = 68;
    private static final int PROPERTY_maximumSize = 69;
    private static final int PROPERTY_maximumSizeSet = 70;
    private static final int PROPERTY_menu = 71;
    private static final int PROPERTY_minimumSize = 72;
    private static final int PROPERTY_minimumSizeSet = 73;
    private static final int PROPERTY_mouseListeners = 74;
    private static final int PROPERTY_mouseMotionListeners = 75;
    private static final int PROPERTY_mousePosition = 76;
    private static final int PROPERTY_mouseWheelListeners = 77;
    private static final int PROPERTY_name = 78;
    private static final int PROPERTY_nextFocusableComponent = 79;
    private static final int PROPERTY_opaque = 80;
    private static final int PROPERTY_optimizedDrawingEnabled = 81;
    private static final int PROPERTY_paintingForPrint = 82;
    private static final int PROPERTY_paintingTile = 83;
    private static final int PROPERTY_parent = 84;
    private static final int PROPERTY_peer = 85;
    private static final int PROPERTY_preferredSize = 86;
    private static final int PROPERTY_preferredSizeSet = 87;
    private static final int PROPERTY_propertyChangeListeners = 88;
    private static final int PROPERTY_registeredKeyStrokes = 89;
    private static final int PROPERTY_requestFocusEnabled = 90;
    private static final int PROPERTY_rootPane = 91;
    private static final int PROPERTY_selectedFrame = 92;
    private static final int PROPERTY_showing = 93;
    private static final int PROPERTY_size = 94;
    private static final int PROPERTY_toolkit = 95;
    private static final int PROPERTY_toolTipText = 96;
    private static final int PROPERTY_topLevelAncestor = 97;
    private static final int PROPERTY_transferHandler = 98;
    private static final int PROPERTY_treeLock = 99;
    private static final int PROPERTY_UI = 100;
    private static final int PROPERTY_UIClassID = 101;
    private static final int PROPERTY_valid = 102;
    private static final int PROPERTY_validateRoot = 103;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 104;
    private static final int PROPERTY_vetoableChangeListeners = 105;
    private static final int PROPERTY_visible = 106;
    private static final int PROPERTY_visibleRect = 107;
    private static final int PROPERTY_width = 108;
    private static final int PROPERTY_x = 109;
    private static final int PROPERTY_y = 110;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[111];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_allFrames] = new PropertyDescriptor ( "allFrames", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getAllFrames", null ); // NOI18N
            properties[PROPERTY_allFramesInLayer] = new IndexedPropertyDescriptor ( "allFramesInLayer", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, null, null, "getAllFramesInLayer", null ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentCountInLayer] = new IndexedPropertyDescriptor ( "componentCountInLayer", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, null, null, "getComponentCountInLayer", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_componentsInLayer] = new IndexedPropertyDescriptor ( "componentsInLayer", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, null, null, "getComponentsInLayer", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_desktopManager] = new PropertyDescriptor ( "desktopManager", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getDesktopManager", "setDesktopManager" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragMode] = new PropertyDescriptor ( "dragMode", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getDragMode", "setDragMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_image] = new PropertyDescriptor ( "image", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, null, "setImage" ); // NOI18N
            properties[PROPERTY_image].setPreferred ( true );
            properties[PROPERTY_imageSizeMode] = new PropertyDescriptor ( "imageSizeMode", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getImageSizeMode", "setImageSizeMode" ); // NOI18N
            properties[PROPERTY_imageSizeMode].setPreferred ( true );
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menu] = new PropertyDescriptor ( "menu", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMenu", "setMenu" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selectedFrame] = new PropertyDescriptor ( "selectedFrame", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getSelectedFrame", "setSelectedFrame" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties
    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlDesktopPane.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events
    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addMaximizeListener7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_cascadeFrames13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_closeFrames16 = 16;
    private static final int METHOD_computeVisibleRect17 = 17;
    private static final int METHOD_contains18 = 18;
    private static final int METHOD_contains19 = 19;
    private static final int METHOD_countComponents20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createToolTip23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_createVolatileImage25 = 25;
    private static final int METHOD_deliverEvent26 = 26;
    private static final int METHOD_disable27 = 27;
    private static final int METHOD_dispatchEvent28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enableInputMethods32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_getActionForKeyStroke43 = 43;
    private static final int METHOD_getBaseline44 = 44;
    private static final int METHOD_getBounds45 = 45;
    private static final int METHOD_getClientProperty46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentZOrder49 = 49;
    private static final int METHOD_getConditionForKeyStroke50 = 50;
    private static final int METHOD_getDefaultLocale51 = 51;
    private static final int METHOD_getFocusTraversalKeys52 = 52;
    private static final int METHOD_getFontMetrics53 = 53;
    private static final int METHOD_getIndexOf54 = 54;
    private static final int METHOD_getInsets55 = 55;
    private static final int METHOD_getLayer56 = 56;
    private static final int METHOD_getLayer57 = 57;
    private static final int METHOD_getLayeredPaneAbove58 = 58;
    private static final int METHOD_getListeners59 = 59;
    private static final int METHOD_getLocation60 = 60;
    private static final int METHOD_getMousePosition61 = 61;
    private static final int METHOD_getPopupLocation62 = 62;
    private static final int METHOD_getPosition63 = 63;
    private static final int METHOD_getPropertyChangeListeners64 = 64;
    private static final int METHOD_getSize65 = 65;
    private static final int METHOD_getToolTipLocation66 = 66;
    private static final int METHOD_getToolTipText67 = 67;
    private static final int METHOD_gotFocus68 = 68;
    private static final int METHOD_grabFocus69 = 69;
    private static final int METHOD_handleEvent70 = 70;
    private static final int METHOD_hasFocus71 = 71;
    private static final int METHOD_hide72 = 72;
    private static final int METHOD_highestLayer73 = 73;
    private static final int METHOD_imageUpdate74 = 74;
    private static final int METHOD_insets75 = 75;
    private static final int METHOD_inside76 = 76;
    private static final int METHOD_invalidate77 = 77;
    private static final int METHOD_isAncestorOf78 = 78;
    private static final int METHOD_isFocusCycleRoot79 = 79;
    private static final int METHOD_isLightweightComponent80 = 80;
    private static final int METHOD_keyDown81 = 81;
    private static final int METHOD_keyUp82 = 82;
    private static final int METHOD_layout83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_locate89 = 89;
    private static final int METHOD_location90 = 90;
    private static final int METHOD_lostFocus91 = 91;
    private static final int METHOD_lowestLayer92 = 92;
    private static final int METHOD_minimumSize93 = 93;
    private static final int METHOD_mouseDown94 = 94;
    private static final int METHOD_mouseDrag95 = 95;
    private static final int METHOD_mouseEnter96 = 96;
    private static final int METHOD_mouseExit97 = 97;
    private static final int METHOD_mouseMove98 = 98;
    private static final int METHOD_mouseUp99 = 99;
    private static final int METHOD_move100 = 100;
    private static final int METHOD_moveToBack101 = 101;
    private static final int METHOD_moveToFront102 = 102;
    private static final int METHOD_nextFocus103 = 103;
    private static final int METHOD_openFrame104 = 104;
    private static final int METHOD_openFrame105 = 105;
    private static final int METHOD_openFrame106 = 106;
    private static final int METHOD_paint107 = 107;
    private static final int METHOD_paintAll108 = 108;
    private static final int METHOD_paintComponents109 = 109;
    private static final int METHOD_paintImmediately110 = 110;
    private static final int METHOD_paintImmediately111 = 111;
    private static final int METHOD_postEvent112 = 112;
    private static final int METHOD_preferredSize113 = 113;
    private static final int METHOD_prepareImage114 = 114;
    private static final int METHOD_prepareImage115 = 115;
    private static final int METHOD_print116 = 116;
    private static final int METHOD_printAll117 = 117;
    private static final int METHOD_printComponents118 = 118;
    private static final int METHOD_putClientProperty119 = 119;
    private static final int METHOD_putLayer120 = 120;
    private static final int METHOD_registerKeyboardAction121 = 121;
    private static final int METHOD_registerKeyboardAction122 = 122;
    private static final int METHOD_remove123 = 123;
    private static final int METHOD_remove124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_removeAll126 = 126;
    private static final int METHOD_removeNotify127 = 127;
    private static final int METHOD_removePropertyChangeListener128 = 128;
    private static final int METHOD_repaint129 = 129;
    private static final int METHOD_repaint130 = 130;
    private static final int METHOD_repaint131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_requestDefaultFocus134 = 134;
    private static final int METHOD_requestFocus135 = 135;
    private static final int METHOD_requestFocus136 = 136;
    private static final int METHOD_requestFocusInWindow137 = 137;
    private static final int METHOD_resetKeyboardActions138 = 138;
    private static final int METHOD_reshape139 = 139;
    private static final int METHOD_resize140 = 140;
    private static final int METHOD_resize141 = 141;
    private static final int METHOD_revalidate142 = 142;
    private static final int METHOD_scrollRectToVisible143 = 143;
    private static final int METHOD_selectFrame144 = 144;
    private static final int METHOD_setBounds145 = 145;
    private static final int METHOD_setComponentZOrder146 = 146;
    private static final int METHOD_setDefaultLocale147 = 147;
    private static final int METHOD_setLayer148 = 148;
    private static final int METHOD_setLayer149 = 149;
    private static final int METHOD_setPosition150 = 150;
    private static final int METHOD_show151 = 151;
    private static final int METHOD_show152 = 152;
    private static final int METHOD_size153 = 153;
    private static final int METHOD_tileFrames154 = 154;
    private static final int METHOD_toString155 = 155;
    private static final int METHOD_transferFocus156 = 156;
    private static final int METHOD_transferFocusBackward157 = 157;
    private static final int METHOD_transferFocusDownCycle158 = 158;
    private static final int METHOD_transferFocusUpCycle159 = 159;
    private static final int METHOD_unregisterKeyboardAction160 = 160;
    private static final int METHOD_update161 = 161;
    private static final int METHOD_updateUI162 = 162;
    private static final int METHOD_validate163 = 163;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[164];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addMaximizeListener7] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("addMaximizeListener", new Class[] {org.aguilar.swinglib.swing.fl.FlDesktopPane.MaximizeListener.class})); // NOI18N
            methods[METHOD_addMaximizeListener7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_cascadeFrames13] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("cascadeFrames", new Class[] {})); // NOI18N
            methods[METHOD_cascadeFrames13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_closeFrames16] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("closeFrames", new Class[] {})); // NOI18N
            methods[METHOD_closeFrames16].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect17].setDisplayName ( "" );
            methods[METHOD_contains18] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains18].setDisplayName ( "" );
            methods[METHOD_contains19] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains19].setDisplayName ( "" );
            methods[METHOD_countComponents20] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createToolTip23] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_createVolatileImage25] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage25].setDisplayName ( "" );
            methods[METHOD_deliverEvent26] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent26].setDisplayName ( "" );
            methods[METHOD_disable27] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable27].setDisplayName ( "" );
            methods[METHOD_dispatchEvent28] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke43].setDisplayName ( "" );
            methods[METHOD_getBaseline44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline44].setDisplayName ( "" );
            methods[METHOD_getBounds45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds45].setDisplayName ( "" );
            methods[METHOD_getClientProperty46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder49].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke50].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale51].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys52] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys52].setDisplayName ( "" );
            methods[METHOD_getFontMetrics53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics53].setDisplayName ( "" );
            methods[METHOD_getIndexOf54] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getIndexOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getIndexOf54].setDisplayName ( "" );
            methods[METHOD_getInsets55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets55].setDisplayName ( "" );
            methods[METHOD_getLayer56] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getLayer", new Class[] {javax.swing.JComponent.class})); // NOI18N
            methods[METHOD_getLayer56].setDisplayName ( "" );
            methods[METHOD_getLayer57] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getLayer", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getLayer57].setDisplayName ( "" );
            methods[METHOD_getLayeredPaneAbove58] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getLayeredPaneAbove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getLayeredPaneAbove58].setDisplayName ( "" );
            methods[METHOD_getListeners59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners59].setDisplayName ( "" );
            methods[METHOD_getLocation60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation60].setDisplayName ( "" );
            methods[METHOD_getMousePosition61] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition61].setDisplayName ( "" );
            methods[METHOD_getPopupLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation62].setDisplayName ( "" );
            methods[METHOD_getPosition63] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("getPosition", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getPosition63].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners64] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners64].setDisplayName ( "" );
            methods[METHOD_getSize65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize65].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation66].setDisplayName ( "" );
            methods[METHOD_getToolTipText67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText67].setDisplayName ( "" );
            methods[METHOD_gotFocus68] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus68].setDisplayName ( "" );
            methods[METHOD_grabFocus69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus69].setDisplayName ( "" );
            methods[METHOD_handleEvent70] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent70].setDisplayName ( "" );
            methods[METHOD_hasFocus71] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus71].setDisplayName ( "" );
            methods[METHOD_hide72] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide72].setDisplayName ( "" );
            methods[METHOD_highestLayer73] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("highestLayer", new Class[] {})); // NOI18N
            methods[METHOD_highestLayer73].setDisplayName ( "" );
            methods[METHOD_imageUpdate74] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate74].setDisplayName ( "" );
            methods[METHOD_insets75] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets75].setDisplayName ( "" );
            methods[METHOD_inside76] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside76].setDisplayName ( "" );
            methods[METHOD_invalidate77] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate77].setDisplayName ( "" );
            methods[METHOD_isAncestorOf78] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf78].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot79] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot79].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent80] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent80].setDisplayName ( "" );
            methods[METHOD_keyDown81] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown81].setDisplayName ( "" );
            methods[METHOD_keyUp82] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp82].setDisplayName ( "" );
            methods[METHOD_layout83] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_locate89] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate89].setDisplayName ( "" );
            methods[METHOD_location90] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location90].setDisplayName ( "" );
            methods[METHOD_lostFocus91] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus91].setDisplayName ( "" );
            methods[METHOD_lowestLayer92] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("lowestLayer", new Class[] {})); // NOI18N
            methods[METHOD_lowestLayer92].setDisplayName ( "" );
            methods[METHOD_minimumSize93] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize93].setDisplayName ( "" );
            methods[METHOD_mouseDown94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown94].setDisplayName ( "" );
            methods[METHOD_mouseDrag95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag95].setDisplayName ( "" );
            methods[METHOD_mouseEnter96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter96].setDisplayName ( "" );
            methods[METHOD_mouseExit97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit97].setDisplayName ( "" );
            methods[METHOD_mouseMove98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove98].setDisplayName ( "" );
            methods[METHOD_mouseUp99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp99].setDisplayName ( "" );
            methods[METHOD_move100] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move100].setDisplayName ( "" );
            methods[METHOD_moveToBack101] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("moveToBack", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_moveToBack101].setDisplayName ( "" );
            methods[METHOD_moveToFront102] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("moveToFront", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_moveToFront102].setDisplayName ( "" );
            methods[METHOD_nextFocus103] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus103].setDisplayName ( "" );
            methods[METHOD_openFrame104] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("openFrame", new Class[] {org.aguilar.swinglib.swing.fl.FlInternalFrame.class, java.lang.String.class})); // NOI18N
            methods[METHOD_openFrame104].setDisplayName ( "" );
            methods[METHOD_openFrame105] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("openFrame", new Class[] {org.aguilar.swinglib.swing.fl.FlInternalFrame.class, java.lang.String.class, boolean.class})); // NOI18N
            methods[METHOD_openFrame105].setDisplayName ( "" );
            methods[METHOD_openFrame106] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("openFrame", new Class[] {org.aguilar.swinglib.swing.fl.FlInternalFrame.class, java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_openFrame106].setDisplayName ( "" );
            methods[METHOD_paint107] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint107].setDisplayName ( "" );
            methods[METHOD_paintAll108] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll108].setDisplayName ( "" );
            methods[METHOD_paintComponents109] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents109].setDisplayName ( "" );
            methods[METHOD_paintImmediately110] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately110].setDisplayName ( "" );
            methods[METHOD_paintImmediately111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately111].setDisplayName ( "" );
            methods[METHOD_postEvent112] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent112].setDisplayName ( "" );
            methods[METHOD_preferredSize113] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize113].setDisplayName ( "" );
            methods[METHOD_prepareImage114] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage114].setDisplayName ( "" );
            methods[METHOD_prepareImage115] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage115].setDisplayName ( "" );
            methods[METHOD_print116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print116].setDisplayName ( "" );
            methods[METHOD_printAll117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll117].setDisplayName ( "" );
            methods[METHOD_printComponents118] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents118].setDisplayName ( "" );
            methods[METHOD_putClientProperty119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty119].setDisplayName ( "" );
            methods[METHOD_putLayer120] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("putLayer", new Class[] {javax.swing.JComponent.class, int.class})); // NOI18N
            methods[METHOD_putLayer120].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction121].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction122].setDisplayName ( "" );
            methods[METHOD_remove123] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove123].setDisplayName ( "" );
            methods[METHOD_remove124] = new MethodDescriptor(javax.swing.JDesktopPane.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_removeAll126] = new MethodDescriptor(javax.swing.JDesktopPane.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll126].setDisplayName ( "" );
            methods[METHOD_removeNotify127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify127].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener128] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener128].setDisplayName ( "" );
            methods[METHOD_repaint129] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint129].setDisplayName ( "" );
            methods[METHOD_repaint130] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint130].setDisplayName ( "" );
            methods[METHOD_repaint131] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus134].setDisplayName ( "" );
            methods[METHOD_requestFocus135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus135].setDisplayName ( "" );
            methods[METHOD_requestFocus136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus136].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow137].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions138].setDisplayName ( "" );
            methods[METHOD_reshape139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape139].setDisplayName ( "" );
            methods[METHOD_resize140] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize140].setDisplayName ( "" );
            methods[METHOD_resize141] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize141].setDisplayName ( "" );
            methods[METHOD_revalidate142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate142].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible143] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible143].setDisplayName ( "" );
            methods[METHOD_selectFrame144] = new MethodDescriptor(javax.swing.JDesktopPane.class.getMethod("selectFrame", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_selectFrame144].setDisplayName ( "" );
            methods[METHOD_setBounds145] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds145].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder146] = new MethodDescriptor(javax.swing.JDesktopPane.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder146].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale147].setDisplayName ( "" );
            methods[METHOD_setLayer148] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("setLayer", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setLayer148].setDisplayName ( "" );
            methods[METHOD_setLayer149] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("setLayer", new Class[] {java.awt.Component.class, int.class, int.class})); // NOI18N
            methods[METHOD_setLayer149].setDisplayName ( "" );
            methods[METHOD_setPosition150] = new MethodDescriptor(javax.swing.JLayeredPane.class.getMethod("setPosition", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setPosition150].setDisplayName ( "" );
            methods[METHOD_show151] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show151].setDisplayName ( "" );
            methods[METHOD_show152] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show152].setDisplayName ( "" );
            methods[METHOD_size153] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size153].setDisplayName ( "" );
            methods[METHOD_tileFrames154] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlDesktopPane.class.getMethod("tileFrames", new Class[] {})); // NOI18N
            methods[METHOD_tileFrames154].setDisplayName ( "" );
            methods[METHOD_toString155] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString155].setDisplayName ( "" );
            methods[METHOD_transferFocus156] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus156].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward157].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle158] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle158].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle159] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle159].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction160] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction160].setDisplayName ( "" );
            methods[METHOD_update161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update161].setDisplayName ( "" );
            methods[METHOD_updateUI162] = new MethodDescriptor(javax.swing.JDesktopPane.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI162].setDisplayName ( "" );
            methods[METHOD_validate163] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate163].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.
//GEN-LAST:Superclass
    /**
     * Gets the bean's
     * <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's
     * <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis. <p> If a property is indexed,
     * then its entry in the result array will belong to the
     * IndexedPropertyDescriptor subclass of PropertyDescriptor. A client of
     * getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's
     * <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's
     * <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors. <P>	Returns -1 if there is no default
     * property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors. <P>	Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats. <p> Beans aren't required to provide
     * icons and may return null from this method. <p> There are four possible
     * flavors of icons (16x16 color, 32x32 color, 16x16 mono, 32x32 mono). If a
     * bean choses to only support a single icon we recommend supporting 16x16
     * color. <p> We recommend that icons have a "transparent" background so
     * they can be rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
}
