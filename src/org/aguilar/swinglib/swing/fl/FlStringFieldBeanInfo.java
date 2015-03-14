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
public class FlStringFieldBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( org.aguilar.swinglib.swing.fl.FlStringField.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_action = 1;
    private static final int PROPERTY_actionCommand = 2;
    private static final int PROPERTY_actionListeners = 3;
    private static final int PROPERTY_actionMap = 4;
    private static final int PROPERTY_actions = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_autoCompleteFeature = 9;
    private static final int PROPERTY_autoscrolls = 10;
    private static final int PROPERTY_background = 11;
    private static final int PROPERTY_backgroundSet = 12;
    private static final int PROPERTY_baselineResizeBehavior = 13;
    private static final int PROPERTY_border = 14;
    private static final int PROPERTY_bounds = 15;
    private static final int PROPERTY_caret = 16;
    private static final int PROPERTY_caretColor = 17;
    private static final int PROPERTY_caretListeners = 18;
    private static final int PROPERTY_caretPosition = 19;
    private static final int PROPERTY_colorModel = 20;
    private static final int PROPERTY_columns = 21;
    private static final int PROPERTY_component = 22;
    private static final int PROPERTY_componentCount = 23;
    private static final int PROPERTY_componentListeners = 24;
    private static final int PROPERTY_componentOrientation = 25;
    private static final int PROPERTY_componentPopupMenu = 26;
    private static final int PROPERTY_components = 27;
    private static final int PROPERTY_containerListeners = 28;
    private static final int PROPERTY_control = 29;
    private static final int PROPERTY_cursor = 30;
    private static final int PROPERTY_cursorSet = 31;
    private static final int PROPERTY_debugGraphicsOptions = 32;
    private static final int PROPERTY_defaultText = 33;
    private static final int PROPERTY_defaultTextOnLostFocusIfNull = 34;
    private static final int PROPERTY_disabledTextColor = 35;
    private static final int PROPERTY_displayable = 36;
    private static final int PROPERTY_document = 37;
    private static final int PROPERTY_doubleBuffered = 38;
    private static final int PROPERTY_dragEnabled = 39;
    private static final int PROPERTY_dropLocation = 40;
    private static final int PROPERTY_dropMode = 41;
    private static final int PROPERTY_dropTarget = 42;
    private static final int PROPERTY_editable = 43;
    private static final int PROPERTY_enabled = 44;
    private static final int PROPERTY_fieldName = 45;
    private static final int PROPERTY_focusable = 46;
    private static final int PROPERTY_focusAccelerator = 47;
    private static final int PROPERTY_focusCycleRoot = 48;
    private static final int PROPERTY_focusCycleRootAncestor = 49;
    private static final int PROPERTY_focusListeners = 50;
    private static final int PROPERTY_focusOwner = 51;
    private static final int PROPERTY_focusTraversable = 52;
    private static final int PROPERTY_focusTraversalKeys = 53;
    private static final int PROPERTY_focusTraversalKeysEnabled = 54;
    private static final int PROPERTY_focusTraversalPolicy = 55;
    private static final int PROPERTY_focusTraversalPolicyProvider = 56;
    private static final int PROPERTY_focusTraversalPolicySet = 57;
    private static final int PROPERTY_font = 58;
    private static final int PROPERTY_fontSet = 59;
    private static final int PROPERTY_foreground = 60;
    private static final int PROPERTY_foregroundSet = 61;
    private static final int PROPERTY_formatNumber = 62;
    private static final int PROPERTY_graphics = 63;
    private static final int PROPERTY_graphicsConfiguration = 64;
    private static final int PROPERTY_height = 65;
    private static final int PROPERTY_hierarchyBoundsListeners = 66;
    private static final int PROPERTY_hierarchyListeners = 67;
    private static final int PROPERTY_highlighter = 68;
    private static final int PROPERTY_horizontalAlignment = 69;
    private static final int PROPERTY_horizontalVisibility = 70;
    private static final int PROPERTY_ignoreRepaint = 71;
    private static final int PROPERTY_inheritsPopupMenu = 72;
    private static final int PROPERTY_inputContext = 73;
    private static final int PROPERTY_inputMap = 74;
    private static final int PROPERTY_inputMethodListeners = 75;
    private static final int PROPERTY_inputMethodRequests = 76;
    private static final int PROPERTY_inputVerifier = 77;
    private static final int PROPERTY_insets = 78;
    private static final int PROPERTY_invalidNumberErrorMessage = 79;
    private static final int PROPERTY_keyListeners = 80;
    private static final int PROPERTY_keymap = 81;
    private static final int PROPERTY_layout = 82;
    private static final int PROPERTY_lightweight = 83;
    private static final int PROPERTY_locale = 84;
    private static final int PROPERTY_location = 85;
    private static final int PROPERTY_locationOnScreen = 86;
    private static final int PROPERTY_managingFocus = 87;
    private static final int PROPERTY_margin = 88;
    private static final int PROPERTY_maximumSize = 89;
    private static final int PROPERTY_maximumSizeSet = 90;
    private static final int PROPERTY_maxLength = 91;
    private static final int PROPERTY_minimumSize = 92;
    private static final int PROPERTY_minimumSizeSet = 93;
    private static final int PROPERTY_minLength = 94;
    private static final int PROPERTY_mouseListeners = 95;
    private static final int PROPERTY_mouseMotionListeners = 96;
    private static final int PROPERTY_mousePosition = 97;
    private static final int PROPERTY_mouseWheelListeners = 98;
    private static final int PROPERTY_name = 99;
    private static final int PROPERTY_navigationFilter = 100;
    private static final int PROPERTY_nextFocusableComponent = 101;
    private static final int PROPERTY_onlyDigits = 102;
    private static final int PROPERTY_opaque = 103;
    private static final int PROPERTY_optimizedDrawingEnabled = 104;
    private static final int PROPERTY_paintingForPrint = 105;
    private static final int PROPERTY_paintingTile = 106;
    private static final int PROPERTY_parent = 107;
    private static final int PROPERTY_peer = 108;
    private static final int PROPERTY_placeHolderGap = 109;
    private static final int PROPERTY_placeHolderIcon = 110;
    private static final int PROPERTY_placeHolderText = 111;
    private static final int PROPERTY_preferredScrollableViewportSize = 112;
    private static final int PROPERTY_preferredSize = 113;
    private static final int PROPERTY_preferredSizeSet = 114;
    private static final int PROPERTY_propertyChangeListeners = 115;
    private static final int PROPERTY_registeredKeyStrokes = 116;
    private static final int PROPERTY_requestFocusEnabled = 117;
    private static final int PROPERTY_required = 118;
    private static final int PROPERTY_requiredErrorMessage = 119;
    private static final int PROPERTY_rootPane = 120;
    private static final int PROPERTY_scrollableTracksViewportHeight = 121;
    private static final int PROPERTY_scrollableTracksViewportWidth = 122;
    private static final int PROPERTY_scrollOffset = 123;
    private static final int PROPERTY_selectAllOnFocus = 124;
    private static final int PROPERTY_selectedText = 125;
    private static final int PROPERTY_selectedTextColor = 126;
    private static final int PROPERTY_selectionColor = 127;
    private static final int PROPERTY_selectionEnd = 128;
    private static final int PROPERTY_selectionStart = 129;
    private static final int PROPERTY_showing = 130;
    private static final int PROPERTY_size = 131;
    private static final int PROPERTY_testingNumberFormat = 132;
    private static final int PROPERTY_text = 133;
    private static final int PROPERTY_toolkit = 134;
    private static final int PROPERTY_toolTipText = 135;
    private static final int PROPERTY_tooShortErrorMessage = 136;
    private static final int PROPERTY_topLevelAncestor = 137;
    private static final int PROPERTY_transferHandler = 138;
    private static final int PROPERTY_treeLock = 139;
    private static final int PROPERTY_UI = 140;
    private static final int PROPERTY_UIClassID = 141;
    private static final int PROPERTY_upperCase = 142;
    private static final int PROPERTY_valid = 143;
    private static final int PROPERTY_validateRoot = 144;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 145;
    private static final int PROPERTY_vetoableChangeListeners = 146;
    private static final int PROPERTY_visible = 147;
    private static final int PROPERTY_visibleRect = 148;
    private static final int PROPERTY_width = 149;
    private static final int PROPERTY_x = 150;
    private static final int PROPERTY_y = 151;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[152];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", org.aguilar.swinglib.swing.fl.FlStringField.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", org.aguilar.swinglib.swing.fl.FlStringField.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", org.aguilar.swinglib.swing.fl.FlStringField.class, null, "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", org.aguilar.swinglib.swing.fl.FlStringField.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actions] = new PropertyDescriptor ( "actions", org.aguilar.swinglib.swing.fl.FlStringField.class, "getActions", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", org.aguilar.swinglib.swing.fl.FlStringField.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", org.aguilar.swinglib.swing.fl.FlStringField.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoCompleteFeature] = new PropertyDescriptor ( "autoCompleteFeature", org.aguilar.swinglib.swing.fl.FlStringField.class, null, "setAutoCompleteFeature" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", org.aguilar.swinglib.swing.fl.FlStringField.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", org.aguilar.swinglib.swing.fl.FlStringField.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", org.aguilar.swinglib.swing.fl.FlStringField.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", org.aguilar.swinglib.swing.fl.FlStringField.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", org.aguilar.swinglib.swing.fl.FlStringField.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_caret] = new PropertyDescriptor ( "caret", org.aguilar.swinglib.swing.fl.FlStringField.class, "getCaret", "setCaret" ); // NOI18N
            properties[PROPERTY_caretColor] = new PropertyDescriptor ( "caretColor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getCaretColor", "setCaretColor" ); // NOI18N
            properties[PROPERTY_caretListeners] = new PropertyDescriptor ( "caretListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getCaretListeners", null ); // NOI18N
            properties[PROPERTY_caretPosition] = new PropertyDescriptor ( "caretPosition", org.aguilar.swinglib.swing.fl.FlStringField.class, "getCaretPosition", "setCaretPosition" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", org.aguilar.swinglib.swing.fl.FlStringField.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columns] = new PropertyDescriptor ( "columns", org.aguilar.swinglib.swing.fl.FlStringField.class, "getColumns", "setColumns" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", org.aguilar.swinglib.swing.fl.FlStringField.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", org.aguilar.swinglib.swing.fl.FlStringField.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", org.aguilar.swinglib.swing.fl.FlStringField.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", org.aguilar.swinglib.swing.fl.FlStringField.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", org.aguilar.swinglib.swing.fl.FlStringField.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_control] = new PropertyDescriptor ( "control", org.aguilar.swinglib.swing.fl.FlStringField.class, "getControl", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_defaultText] = new PropertyDescriptor ( "defaultText", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDefaultText", "setDefaultText" ); // NOI18N
            properties[PROPERTY_defaultText].setPreferred ( true );
            properties[PROPERTY_defaultTextOnLostFocusIfNull] = new PropertyDescriptor ( "defaultTextOnLostFocusIfNull", org.aguilar.swinglib.swing.fl.FlStringField.class, "isDefaultTextOnLostFocusIfNull", "setDefaultTextOnLostFocusIfNull" ); // NOI18N
            properties[PROPERTY_disabledTextColor] = new PropertyDescriptor ( "disabledTextColor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDisabledTextColor", "setDisabledTextColor" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", org.aguilar.swinglib.swing.fl.FlStringField.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_document] = new PropertyDescriptor ( "document", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDocument", "setDocument" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", org.aguilar.swinglib.swing.fl.FlStringField.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", org.aguilar.swinglib.swing.fl.FlStringField.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", org.aguilar.swinglib.swing.fl.FlStringField.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_editable].setPreferred ( true );
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", org.aguilar.swinglib.swing.fl.FlStringField.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_fieldName] = new PropertyDescriptor ( "fieldName", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFieldName", "setFieldName" ); // NOI18N
            properties[PROPERTY_fieldName].setPreferred ( true );
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusAccelerator] = new PropertyDescriptor ( "focusAccelerator", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFocusAccelerator", "setFocusAccelerator" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", org.aguilar.swinglib.swing.fl.FlStringField.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", org.aguilar.swinglib.swing.fl.FlStringField.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_font].setPreferred ( true );
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", org.aguilar.swinglib.swing.fl.FlStringField.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_formatNumber] = new PropertyDescriptor ( "formatNumber", org.aguilar.swinglib.swing.fl.FlStringField.class, "isFormatNumber", "setFormatNumber" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", org.aguilar.swinglib.swing.fl.FlStringField.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", org.aguilar.swinglib.swing.fl.FlStringField.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", org.aguilar.swinglib.swing.fl.FlStringField.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_highlighter] = new PropertyDescriptor ( "highlighter", org.aguilar.swinglib.swing.fl.FlStringField.class, "getHighlighter", "setHighlighter" ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", org.aguilar.swinglib.swing.fl.FlStringField.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalVisibility] = new PropertyDescriptor ( "horizontalVisibility", org.aguilar.swinglib.swing.fl.FlStringField.class, "getHorizontalVisibility", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", org.aguilar.swinglib.swing.fl.FlStringField.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", org.aguilar.swinglib.swing.fl.FlStringField.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_invalidNumberErrorMessage] = new PropertyDescriptor ( "invalidNumberErrorMessage", org.aguilar.swinglib.swing.fl.FlStringField.class, null, "setInvalidNumberErrorMessage" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keymap] = new PropertyDescriptor ( "keymap", org.aguilar.swinglib.swing.fl.FlStringField.class, "getKeymap", "setKeymap" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", org.aguilar.swinglib.swing.fl.FlStringField.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", org.aguilar.swinglib.swing.fl.FlStringField.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", org.aguilar.swinglib.swing.fl.FlStringField.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", org.aguilar.swinglib.swing.fl.FlStringField.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", org.aguilar.swinglib.swing.fl.FlStringField.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", org.aguilar.swinglib.swing.fl.FlStringField.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_maxLength] = new PropertyDescriptor ( "maxLength", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMaxLength", "setMaxLength" ); // NOI18N
            properties[PROPERTY_maxLength].setPreferred ( true );
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_minLength] = new PropertyDescriptor ( "minLength", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMinLength", "setMinLength" ); // NOI18N
            properties[PROPERTY_minLength].setPreferred ( true );
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", org.aguilar.swinglib.swing.fl.FlStringField.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_navigationFilter] = new PropertyDescriptor ( "navigationFilter", org.aguilar.swinglib.swing.fl.FlStringField.class, "getNavigationFilter", "setNavigationFilter" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", org.aguilar.swinglib.swing.fl.FlStringField.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_onlyDigits] = new PropertyDescriptor ( "onlyDigits", org.aguilar.swinglib.swing.fl.FlStringField.class, "isOnlyDigits", "setOnlyDigits" ); // NOI18N
            properties[PROPERTY_onlyDigits].setPreferred ( true );
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", org.aguilar.swinglib.swing.fl.FlStringField.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", org.aguilar.swinglib.swing.fl.FlStringField.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", org.aguilar.swinglib.swing.fl.FlStringField.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", org.aguilar.swinglib.swing.fl.FlStringField.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", org.aguilar.swinglib.swing.fl.FlStringField.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_placeHolderGap] = new PropertyDescriptor ( "placeHolderGap", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPlaceHolderGap", "setPlaceHolderGap" ); // NOI18N
            properties[PROPERTY_placeHolderIcon] = new PropertyDescriptor ( "placeHolderIcon", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPlaceHolderIcon", "setPlaceHolderIcon" ); // NOI18N
            properties[PROPERTY_placeHolderText] = new PropertyDescriptor ( "placeHolderText", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPlaceHolderText", "setPlaceHolderText" ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", org.aguilar.swinglib.swing.fl.FlStringField.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", org.aguilar.swinglib.swing.fl.FlStringField.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", org.aguilar.swinglib.swing.fl.FlStringField.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_required] = new PropertyDescriptor ( "required", org.aguilar.swinglib.swing.fl.FlStringField.class, "isRequired", "setRequired" ); // NOI18N
            properties[PROPERTY_required].setPreferred ( true );
            properties[PROPERTY_requiredErrorMessage] = new PropertyDescriptor ( "requiredErrorMessage", org.aguilar.swinglib.swing.fl.FlStringField.class, null, "setRequiredErrorMessage" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", org.aguilar.swinglib.swing.fl.FlStringField.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", org.aguilar.swinglib.swing.fl.FlStringField.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", org.aguilar.swinglib.swing.fl.FlStringField.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_scrollOffset] = new PropertyDescriptor ( "scrollOffset", org.aguilar.swinglib.swing.fl.FlStringField.class, "getScrollOffset", "setScrollOffset" ); // NOI18N
            properties[PROPERTY_selectAllOnFocus] = new PropertyDescriptor ( "selectAllOnFocus", org.aguilar.swinglib.swing.fl.FlStringField.class, "isSelectAllOnFocus", "setSelectAllOnFocus" ); // NOI18N
            properties[PROPERTY_selectedText] = new PropertyDescriptor ( "selectedText", org.aguilar.swinglib.swing.fl.FlStringField.class, "getSelectedText", null ); // NOI18N
            properties[PROPERTY_selectedTextColor] = new PropertyDescriptor ( "selectedTextColor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getSelectedTextColor", "setSelectedTextColor" ); // NOI18N
            properties[PROPERTY_selectionColor] = new PropertyDescriptor ( "selectionColor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getSelectionColor", "setSelectionColor" ); // NOI18N
            properties[PROPERTY_selectionEnd] = new PropertyDescriptor ( "selectionEnd", org.aguilar.swinglib.swing.fl.FlStringField.class, "getSelectionEnd", "setSelectionEnd" ); // NOI18N
            properties[PROPERTY_selectionStart] = new PropertyDescriptor ( "selectionStart", org.aguilar.swinglib.swing.fl.FlStringField.class, "getSelectionStart", "setSelectionStart" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", org.aguilar.swinglib.swing.fl.FlStringField.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", org.aguilar.swinglib.swing.fl.FlStringField.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_testingNumberFormat] = new PropertyDescriptor ( "testingNumberFormat", org.aguilar.swinglib.swing.fl.FlStringField.class, "isTestingNumberFormat", "setTestingNumberFormat" ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", org.aguilar.swinglib.swing.fl.FlStringField.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_text].setPreferred ( true );
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", org.aguilar.swinglib.swing.fl.FlStringField.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", org.aguilar.swinglib.swing.fl.FlStringField.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_tooShortErrorMessage] = new PropertyDescriptor ( "tooShortErrorMessage", org.aguilar.swinglib.swing.fl.FlStringField.class, null, "setTooShortErrorMessage" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", org.aguilar.swinglib.swing.fl.FlStringField.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", org.aguilar.swinglib.swing.fl.FlStringField.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", org.aguilar.swinglib.swing.fl.FlStringField.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", org.aguilar.swinglib.swing.fl.FlStringField.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", org.aguilar.swinglib.swing.fl.FlStringField.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_upperCase] = new PropertyDescriptor ( "upperCase", org.aguilar.swinglib.swing.fl.FlStringField.class, "isUpperCase", "setUpperCase" ); // NOI18N
            properties[PROPERTY_upperCase].setPreferred ( true );
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", org.aguilar.swinglib.swing.fl.FlStringField.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", org.aguilar.swinglib.swing.fl.FlStringField.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", org.aguilar.swinglib.swing.fl.FlStringField.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", org.aguilar.swinglib.swing.fl.FlStringField.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", org.aguilar.swinglib.swing.fl.FlStringField.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", org.aguilar.swinglib.swing.fl.FlStringField.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", org.aguilar.swinglib.swing.fl.FlStringField.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", org.aguilar.swinglib.swing.fl.FlStringField.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", org.aguilar.swinglib.swing.fl.FlStringField.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties
    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_caretListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_keyListener = 9;
    private static final int EVENT_mouseListener = 10;
    private static final int EVENT_mouseMotionListener = 11;
    private static final int EVENT_mouseWheelListener = 12;
    private static final int EVENT_propertyChangeListener = 13;
    private static final int EVENT_vetoableChangeListener = 14;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[15];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_caretListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "caretListener", javax.swing.event.CaretListener.class, new String[] {"caretUpdate"}, "addCaretListener", "removeCaretListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlStringField.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addKeymap7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_copy18 = 18;
    private static final int METHOD_countComponents19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createToolTip22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_cut25 = 25;
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
    private static final int METHOD_getInsets54 = 54;
    private static final int METHOD_getKeymap55 = 55;
    private static final int METHOD_getListeners56 = 56;
    private static final int METHOD_getLocation57 = 57;
    private static final int METHOD_getMousePosition58 = 58;
    private static final int METHOD_getPopupLocation59 = 59;
    private static final int METHOD_getPrintable60 = 60;
    private static final int METHOD_getPropertyChangeListeners61 = 61;
    private static final int METHOD_getScrollableBlockIncrement62 = 62;
    private static final int METHOD_getScrollableUnitIncrement63 = 63;
    private static final int METHOD_getSize64 = 64;
    private static final int METHOD_getText65 = 65;
    private static final int METHOD_getToolTipLocation66 = 66;
    private static final int METHOD_getToolTipText67 = 67;
    private static final int METHOD_gotFocus68 = 68;
    private static final int METHOD_grabFocus69 = 69;
    private static final int METHOD_handleEvent70 = 70;
    private static final int METHOD_hasFocus71 = 71;
    private static final int METHOD_hide72 = 72;
    private static final int METHOD_imageUpdate73 = 73;
    private static final int METHOD_insets74 = 74;
    private static final int METHOD_inside75 = 75;
    private static final int METHOD_invalidate76 = 76;
    private static final int METHOD_isAncestorOf77 = 77;
    private static final int METHOD_isFocusCycleRoot78 = 78;
    private static final int METHOD_isLightweightComponent79 = 79;
    private static final int METHOD_keyDown80 = 80;
    private static final int METHOD_keyUp81 = 81;
    private static final int METHOD_layout82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_loadKeymap88 = 88;
    private static final int METHOD_locate89 = 89;
    private static final int METHOD_location90 = 90;
    private static final int METHOD_lostFocus91 = 91;
    private static final int METHOD_main92 = 92;
    private static final int METHOD_minimumSize93 = 93;
    private static final int METHOD_modelToView94 = 94;
    private static final int METHOD_mouseDown95 = 95;
    private static final int METHOD_mouseDrag96 = 96;
    private static final int METHOD_mouseEnter97 = 97;
    private static final int METHOD_mouseExit98 = 98;
    private static final int METHOD_mouseMove99 = 99;
    private static final int METHOD_mouseUp100 = 100;
    private static final int METHOD_move101 = 101;
    private static final int METHOD_moveCaretPosition102 = 102;
    private static final int METHOD_nextFocus103 = 103;
    private static final int METHOD_paint104 = 104;
    private static final int METHOD_paintAll105 = 105;
    private static final int METHOD_paintComponents106 = 106;
    private static final int METHOD_paintImmediately107 = 107;
    private static final int METHOD_paintImmediately108 = 108;
    private static final int METHOD_paste109 = 109;
    private static final int METHOD_postActionEvent110 = 110;
    private static final int METHOD_postEvent111 = 111;
    private static final int METHOD_preferredSize112 = 112;
    private static final int METHOD_prepareImage113 = 113;
    private static final int METHOD_prepareImage114 = 114;
    private static final int METHOD_print115 = 115;
    private static final int METHOD_print116 = 116;
    private static final int METHOD_print117 = 117;
    private static final int METHOD_print118 = 118;
    private static final int METHOD_printAll119 = 119;
    private static final int METHOD_printComponents120 = 120;
    private static final int METHOD_putClientProperty121 = 121;
    private static final int METHOD_read122 = 122;
    private static final int METHOD_registerKeyboardAction123 = 123;
    private static final int METHOD_registerKeyboardAction124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_remove126 = 126;
    private static final int METHOD_remove127 = 127;
    private static final int METHOD_removeAll128 = 128;
    private static final int METHOD_removeAutoCompleteFeature129 = 129;
    private static final int METHOD_removeKeymap130 = 130;
    private static final int METHOD_removeNotify131 = 131;
    private static final int METHOD_removePropertyChangeListener132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_repaint135 = 135;
    private static final int METHOD_repaint136 = 136;
    private static final int METHOD_repaint137 = 137;
    private static final int METHOD_replaceSelection138 = 138;
    private static final int METHOD_requestDefaultFocus139 = 139;
    private static final int METHOD_requestFocus140 = 140;
    private static final int METHOD_requestFocus141 = 141;
    private static final int METHOD_requestFocusInWindow142 = 142;
    private static final int METHOD_resetKeyboardActions143 = 143;
    private static final int METHOD_reshape144 = 144;
    private static final int METHOD_resize145 = 145;
    private static final int METHOD_resize146 = 146;
    private static final int METHOD_revalidate147 = 147;
    private static final int METHOD_scrollRectToVisible148 = 148;
    private static final int METHOD_select149 = 149;
    private static final int METHOD_selectAll150 = 150;
    private static final int METHOD_setBounds151 = 151;
    private static final int METHOD_setComponentZOrder152 = 152;
    private static final int METHOD_setDefaultLocale153 = 153;
    private static final int METHOD_setValidation154 = 154;
    private static final int METHOD_setValidation155 = 155;
    private static final int METHOD_show156 = 156;
    private static final int METHOD_show157 = 157;
    private static final int METHOD_size158 = 158;
    private static final int METHOD_toString159 = 159;
    private static final int METHOD_transferFocus160 = 160;
    private static final int METHOD_transferFocusBackward161 = 161;
    private static final int METHOD_transferFocusDownCycle162 = 162;
    private static final int METHOD_transferFocusUpCycle163 = 163;
    private static final int METHOD_unregisterKeyboardAction164 = 164;
    private static final int METHOD_update165 = 165;
    private static final int METHOD_updateUI166 = 166;
    private static final int METHOD_validar167 = 167;
    private static final int METHOD_validate168 = 168;
    private static final int METHOD_viewToModel169 = 169;
    private static final int METHOD_write170 = 170;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[171];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addKeymap7] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("addKeymap", new Class[] {java.lang.String.class, javax.swing.text.Keymap.class})); // NOI18N
            methods[METHOD_addKeymap7].setDisplayName ( "" );
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
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_copy18] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("copy", new Class[] {})); // NOI18N
            methods[METHOD_copy18].setDisplayName ( "" );
            methods[METHOD_countComponents19] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createToolTip22] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_cut25] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("cut", new Class[] {})); // NOI18N
            methods[METHOD_cut25].setDisplayName ( "" );
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
            methods[METHOD_getInsets54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets54].setDisplayName ( "" );
            methods[METHOD_getKeymap55] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getKeymap55].setDisplayName ( "" );
            methods[METHOD_getListeners56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners56].setDisplayName ( "" );
            methods[METHOD_getLocation57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation57].setDisplayName ( "" );
            methods[METHOD_getMousePosition58] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition58].setDisplayName ( "" );
            methods[METHOD_getPopupLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation59].setDisplayName ( "" );
            methods[METHOD_getPrintable60] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getPrintable", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable60].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners61] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners61].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement62] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement62].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement63] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement63].setDisplayName ( "" );
            methods[METHOD_getSize64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize64].setDisplayName ( "" );
            methods[METHOD_getText65] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getText", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getText65].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation66].setDisplayName ( "" );
            methods[METHOD_getToolTipText67] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
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
            methods[METHOD_imageUpdate73] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate73].setDisplayName ( "" );
            methods[METHOD_insets74] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets74].setDisplayName ( "" );
            methods[METHOD_inside75] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside75].setDisplayName ( "" );
            methods[METHOD_invalidate76] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate76].setDisplayName ( "" );
            methods[METHOD_isAncestorOf77] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf77].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot78] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot78].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent79] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent79].setDisplayName ( "" );
            methods[METHOD_keyDown80] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown80].setDisplayName ( "" );
            methods[METHOD_keyUp81] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp81].setDisplayName ( "" );
            methods[METHOD_layout82] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_loadKeymap88] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("loadKeymap", new Class[] {javax.swing.text.Keymap.class, javax.swing.text.JTextComponent.KeyBinding[].class, javax.swing.Action[].class})); // NOI18N
            methods[METHOD_loadKeymap88].setDisplayName ( "" );
            methods[METHOD_locate89] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate89].setDisplayName ( "" );
            methods[METHOD_location90] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location90].setDisplayName ( "" );
            methods[METHOD_lostFocus91] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus91].setDisplayName ( "" );
            methods[METHOD_main92] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlStringField.class.getMethod("main", new Class[] {java.lang.String[].class})); // NOI18N
            methods[METHOD_main92].setDisplayName ( "" );
            methods[METHOD_minimumSize93] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize93].setDisplayName ( "" );
            methods[METHOD_modelToView94] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("modelToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_modelToView94].setDisplayName ( "" );
            methods[METHOD_mouseDown95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown95].setDisplayName ( "" );
            methods[METHOD_mouseDrag96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag96].setDisplayName ( "" );
            methods[METHOD_mouseEnter97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter97].setDisplayName ( "" );
            methods[METHOD_mouseExit98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit98].setDisplayName ( "" );
            methods[METHOD_mouseMove99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove99].setDisplayName ( "" );
            methods[METHOD_mouseUp100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp100].setDisplayName ( "" );
            methods[METHOD_move101] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move101].setDisplayName ( "" );
            methods[METHOD_moveCaretPosition102] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("moveCaretPosition", new Class[] {int.class})); // NOI18N
            methods[METHOD_moveCaretPosition102].setDisplayName ( "" );
            methods[METHOD_nextFocus103] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus103].setDisplayName ( "" );
            methods[METHOD_paint104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint104].setDisplayName ( "" );
            methods[METHOD_paintAll105] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll105].setDisplayName ( "" );
            methods[METHOD_paintComponents106] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents106].setDisplayName ( "" );
            methods[METHOD_paintImmediately107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately107].setDisplayName ( "" );
            methods[METHOD_paintImmediately108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately108].setDisplayName ( "" );
            methods[METHOD_paste109] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("paste", new Class[] {})); // NOI18N
            methods[METHOD_paste109].setDisplayName ( "" );
            methods[METHOD_postActionEvent110] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("postActionEvent", new Class[] {})); // NOI18N
            methods[METHOD_postActionEvent110].setDisplayName ( "" );
            methods[METHOD_postEvent111] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent111].setDisplayName ( "" );
            methods[METHOD_preferredSize112] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize112].setDisplayName ( "" );
            methods[METHOD_prepareImage113] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage113].setDisplayName ( "" );
            methods[METHOD_prepareImage114] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage114].setDisplayName ( "" );
            methods[METHOD_print115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print115].setDisplayName ( "" );
            methods[METHOD_print116] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print116].setDisplayName ( "" );
            methods[METHOD_print117] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print117].setDisplayName ( "" );
            methods[METHOD_print118] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.PrintService.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print118].setDisplayName ( "" );
            methods[METHOD_printAll119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll119].setDisplayName ( "" );
            methods[METHOD_printComponents120] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents120].setDisplayName ( "" );
            methods[METHOD_putClientProperty121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty121].setDisplayName ( "" );
            methods[METHOD_read122] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("read", new Class[] {java.io.Reader.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_read122].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction123].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_remove126] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove126].setDisplayName ( "" );
            methods[METHOD_remove127] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove127].setDisplayName ( "" );
            methods[METHOD_removeAll128] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll128].setDisplayName ( "" );
            methods[METHOD_removeAutoCompleteFeature129] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlStringField.class.getMethod("removeAutoCompleteFeature", new Class[] {})); // NOI18N
            methods[METHOD_removeAutoCompleteFeature129].setDisplayName ( "" );
            methods[METHOD_removeKeymap130] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_removeKeymap130].setDisplayName ( "" );
            methods[METHOD_removeNotify131] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify131].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener132] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_repaint135] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint135].setDisplayName ( "" );
            methods[METHOD_repaint136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint136].setDisplayName ( "" );
            methods[METHOD_repaint137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint137].setDisplayName ( "" );
            methods[METHOD_replaceSelection138] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("replaceSelection", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_replaceSelection138].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus139].setDisplayName ( "" );
            methods[METHOD_requestFocus140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus140].setDisplayName ( "" );
            methods[METHOD_requestFocus141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus141].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow142].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions143] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions143].setDisplayName ( "" );
            methods[METHOD_reshape144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape144].setDisplayName ( "" );
            methods[METHOD_resize145] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize145].setDisplayName ( "" );
            methods[METHOD_resize146] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize146].setDisplayName ( "" );
            methods[METHOD_revalidate147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate147].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible148] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible148].setDisplayName ( "" );
            methods[METHOD_select149] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("select", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_select149].setDisplayName ( "" );
            methods[METHOD_selectAll150] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll150].setDisplayName ( "" );
            methods[METHOD_setBounds151] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds151].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder152] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder152].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale153] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale153].setDisplayName ( "" );
            methods[METHOD_setValidation154] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlStringField.class.getMethod("setValidation", new Class[] {})); // NOI18N
            methods[METHOD_setValidation154].setDisplayName ( "" );
            methods[METHOD_setValidation155] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlStringField.class.getMethod("setValidation", new Class[] {boolean.class, boolean.class, int.class, int.class, java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_setValidation155].setDisplayName ( "" );
            methods[METHOD_show156] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show156].setDisplayName ( "" );
            methods[METHOD_show157] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show157].setDisplayName ( "" );
            methods[METHOD_size158] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size158].setDisplayName ( "" );
            methods[METHOD_toString159] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString159].setDisplayName ( "" );
            methods[METHOD_transferFocus160] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus160].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward161] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward161].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle162] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle162].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle163] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle163].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction164] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction164].setDisplayName ( "" );
            methods[METHOD_update165] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update165].setDisplayName ( "" );
            methods[METHOD_updateUI166] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI166].setDisplayName ( "" );
            methods[METHOD_validar167] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlStringField.class.getMethod("validar", new Class[] {})); // NOI18N
            methods[METHOD_validar167].setDisplayName ( "" );
            methods[METHOD_validate168] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate168].setDisplayName ( "" );
            methods[METHOD_viewToModel169] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("viewToModel", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_viewToModel169].setDisplayName ( "" );
            methods[METHOD_write170] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("write", new Class[] {java.io.Writer.class})); // NOI18N
            methods[METHOD_write170].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/img/beanInfo/stringfield/color_16x16.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/img/beanInfo/stringfield/color_32x32.png";
    private static String iconNameM16 = "/img/beanInfo/stringfield/byn_16x16.png";
    private static String iconNameM32 = "/img/beanInfo/stringfield/byn_32x32.png";//GEN-END:Icons
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
