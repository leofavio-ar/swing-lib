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
public class FlSelectFieldBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( org.aguilar.swinglib.swing.fl.FlSelectField.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_abrirVacio = 0;
    private static final int PROPERTY_accessibleContext = 1;
    private static final int PROPERTY_aceptaEliminacion = 2;
    private static final int PROPERTY_actionMap = 3;
    private static final int PROPERTY_alignmentX = 4;
    private static final int PROPERTY_alignmentY = 5;
    private static final int PROPERTY_ancestorListeners = 6;
    private static final int PROPERTY_autoscrolls = 7;
    private static final int PROPERTY_background = 8;
    private static final int PROPERTY_backgroundSet = 9;
    private static final int PROPERTY_baselineResizeBehavior = 10;
    private static final int PROPERTY_border = 11;
    private static final int PROPERTY_bounds = 12;
    private static final int PROPERTY_colorModel = 13;
    private static final int PROPERTY_columnaPrincipal = 14;
    private static final int PROPERTY_columnas = 15;
    private static final int PROPERTY_component = 16;
    private static final int PROPERTY_componentCount = 17;
    private static final int PROPERTY_componentListeners = 18;
    private static final int PROPERTY_componentOrientation = 19;
    private static final int PROPERTY_componentPopupMenu = 20;
    private static final int PROPERTY_components = 21;
    private static final int PROPERTY_containerListeners = 22;
    private static final int PROPERTY_cursor = 23;
    private static final int PROPERTY_cursorSet = 24;
    private static final int PROPERTY_dataProvider = 25;
    private static final int PROPERTY_debugGraphicsOptions = 26;
    private static final int PROPERTY_displayable = 27;
    private static final int PROPERTY_doubleBuffered = 28;
    private static final int PROPERTY_dropTarget = 29;
    private static final int PROPERTY_enabled = 30;
    private static final int PROPERTY_encabezados = 31;
    private static final int PROPERTY_fieldName = 32;
    private static final int PROPERTY_focusable = 33;
    private static final int PROPERTY_focusCycleRoot = 34;
    private static final int PROPERTY_focusCycleRootAncestor = 35;
    private static final int PROPERTY_focusListeners = 36;
    private static final int PROPERTY_focusOwner = 37;
    private static final int PROPERTY_focusTraversable = 38;
    private static final int PROPERTY_focusTraversalKeys = 39;
    private static final int PROPERTY_focusTraversalKeysEnabled = 40;
    private static final int PROPERTY_focusTraversalPolicy = 41;
    private static final int PROPERTY_focusTraversalPolicyProvider = 42;
    private static final int PROPERTY_focusTraversalPolicySet = 43;
    private static final int PROPERTY_font = 44;
    private static final int PROPERTY_fontSet = 45;
    private static final int PROPERTY_foreground = 46;
    private static final int PROPERTY_foregroundSet = 47;
    private static final int PROPERTY_graphics = 48;
    private static final int PROPERTY_graphicsConfiguration = 49;
    private static final int PROPERTY_height = 50;
    private static final int PROPERTY_hierarchyBoundsListeners = 51;
    private static final int PROPERTY_hierarchyListeners = 52;
    private static final int PROPERTY_ignoreRepaint = 53;
    private static final int PROPERTY_inheritsPopupMenu = 54;
    private static final int PROPERTY_inputContext = 55;
    private static final int PROPERTY_inputMap = 56;
    private static final int PROPERTY_inputMethodListeners = 57;
    private static final int PROPERTY_inputMethodRequests = 58;
    private static final int PROPERTY_inputVerifier = 59;
    private static final int PROPERTY_insets = 60;
    private static final int PROPERTY_keyListeners = 61;
    private static final int PROPERTY_layout = 62;
    private static final int PROPERTY_lightweight = 63;
    private static final int PROPERTY_locale = 64;
    private static final int PROPERTY_location = 65;
    private static final int PROPERTY_locationOnScreen = 66;
    private static final int PROPERTY_managingFocus = 67;
    private static final int PROPERTY_maximumSize = 68;
    private static final int PROPERTY_maximumSizeSet = 69;
    private static final int PROPERTY_mensajeCatalogoVacio = 70;
    private static final int PROPERTY_minimumSize = 71;
    private static final int PROPERTY_minimumSizeSet = 72;
    private static final int PROPERTY_mostrarErrorVacio = 73;
    private static final int PROPERTY_mouseListeners = 74;
    private static final int PROPERTY_mouseMotionListeners = 75;
    private static final int PROPERTY_mousePosition = 76;
    private static final int PROPERTY_mouseWheelListeners = 77;
    private static final int PROPERTY_name = 78;
    private static final int PROPERTY_nextFocusableComponent = 79;
    private static final int PROPERTY_objetoControl = 80;
    private static final int PROPERTY_opaque = 81;
    private static final int PROPERTY_optimizedDrawingEnabled = 82;
    private static final int PROPERTY_paintingForPrint = 83;
    private static final int PROPERTY_paintingTile = 84;
    private static final int PROPERTY_parent = 85;
    private static final int PROPERTY_peer = 86;
    private static final int PROPERTY_preferredSize = 87;
    private static final int PROPERTY_preferredSizeSet = 88;
    private static final int PROPERTY_procesoControl = 89;
    private static final int PROPERTY_propertyChangeListeners = 90;
    private static final int PROPERTY_registeredKeyStrokes = 91;
    private static final int PROPERTY_registro = 92;
    private static final int PROPERTY_requerido = 93;
    private static final int PROPERTY_requestFocusEnabled = 94;
    private static final int PROPERTY_rootPane = 95;
    private static final int PROPERTY_showing = 96;
    private static final int PROPERTY_size = 97;
    private static final int PROPERTY_stringField = 98;
    private static final int PROPERTY_tipBorrar = 99;
    private static final int PROPERTY_tipSeleccion = 100;
    private static final int PROPERTY_toolkit = 101;
    private static final int PROPERTY_toolTipText = 102;
    private static final int PROPERTY_topLevelAncestor = 103;
    private static final int PROPERTY_transferHandler = 104;
    private static final int PROPERTY_treeLock = 105;
    private static final int PROPERTY_UI = 106;
    private static final int PROPERTY_UIClassID = 107;
    private static final int PROPERTY_valid = 108;
    private static final int PROPERTY_validateRoot = 109;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 110;
    private static final int PROPERTY_vetoableChangeListeners = 111;
    private static final int PROPERTY_visible = 112;
    private static final int PROPERTY_visibleRect = 113;
    private static final int PROPERTY_width = 114;
    private static final int PROPERTY_x = 115;
    private static final int PROPERTY_y = 116;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[117];
    
        try {
            properties[PROPERTY_abrirVacio] = new PropertyDescriptor ( "abrirVacio", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isAbrirVacio", "setAbrirVacio" ); // NOI18N
            properties[PROPERTY_abrirVacio].setPreferred ( true );
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_aceptaEliminacion] = new PropertyDescriptor ( "aceptaEliminacion", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isAceptaEliminacion", "setAceptaEliminacion" ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columnaPrincipal] = new PropertyDescriptor ( "columnaPrincipal", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getColumnaPrincipal", "setColumnaPrincipal" ); // NOI18N
            properties[PROPERTY_columnaPrincipal].setPreferred ( true );
            properties[PROPERTY_columnas] = new PropertyDescriptor ( "columnas", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getColumnas", "setColumnas" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", org.aguilar.swinglib.swing.fl.FlSelectField.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_dataProvider] = new PropertyDescriptor ( "dataProvider", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getDataProvider", "setDataProvider" ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_encabezados] = new PropertyDescriptor ( "encabezados", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getEncabezados", "setEncabezados" ); // NOI18N
            properties[PROPERTY_fieldName] = new PropertyDescriptor ( "fieldName", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getFieldName", "setFieldName" ); // NOI18N
            properties[PROPERTY_fieldName].setPreferred ( true );
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", org.aguilar.swinglib.swing.fl.FlSelectField.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_font].setPreferred ( true );
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_mensajeCatalogoVacio] = new PropertyDescriptor ( "mensajeCatalogoVacio", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMensajeCatalogoVacio", "setMensajeCatalogoVacio" ); // NOI18N
            properties[PROPERTY_mensajeCatalogoVacio].setPreferred ( true );
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mostrarErrorVacio] = new PropertyDescriptor ( "mostrarErrorVacio", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isMostrarErrorVacio", "setMostrarErrorVacio" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_objetoControl] = new PropertyDescriptor ( "objetoControl", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getObjetoControl", "setObjetoControl" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_procesoControl] = new PropertyDescriptor ( "procesoControl", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getProcesoControl", "setProcesoControl" ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_registro] = new PropertyDescriptor ( "registro", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getRegistro", "setRegistro" ); // NOI18N
            properties[PROPERTY_requerido] = new PropertyDescriptor ( "requerido", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isRequerido", "setRequerido" ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_stringField] = new PropertyDescriptor ( "stringField", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getStringField", null ); // NOI18N
            properties[PROPERTY_tipBorrar] = new PropertyDescriptor ( "tipBorrar", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getTipBorrar", "setTipBorrar" ); // NOI18N
            properties[PROPERTY_tipSeleccion] = new PropertyDescriptor ( "tipSeleccion", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getTipSeleccion", "setTipSeleccion" ); // NOI18N
            properties[PROPERTY_tipSeleccion].setPreferred ( true );
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", org.aguilar.swinglib.swing.fl.FlSelectField.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", org.aguilar.swinglib.swing.fl.FlSelectField.class, "getY", null ); // NOI18N
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
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( org.aguilar.swinglib.swing.fl.FlSelectField.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_agregarRegistroListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createToolTip21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_deliverEvent24 = 24;
    private static final int METHOD_disable25 = 25;
    private static final int METHOD_dispatchEvent26 = 26;
    private static final int METHOD_doLayout27 = 27;
    private static final int METHOD_eliminarRegistroListener28 = 28;
    private static final int METHOD_enable29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enableInputMethods31 = 31;
    private static final int METHOD_findComponentAt32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_getActionForKeyStroke42 = 42;
    private static final int METHOD_getBaseline43 = 43;
    private static final int METHOD_getBounds44 = 44;
    private static final int METHOD_getClientProperty45 = 45;
    private static final int METHOD_getComponentAt46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentZOrder48 = 48;
    private static final int METHOD_getConditionForKeyStroke49 = 49;
    private static final int METHOD_getDefaultLocale50 = 50;
    private static final int METHOD_getFocusTraversalKeys51 = 51;
    private static final int METHOD_getFontMetrics52 = 52;
    private static final int METHOD_getInsets53 = 53;
    private static final int METHOD_getListeners54 = 54;
    private static final int METHOD_getLocation55 = 55;
    private static final int METHOD_getMousePosition56 = 56;
    private static final int METHOD_getPopupLocation57 = 57;
    private static final int METHOD_getPropertyChangeListeners58 = 58;
    private static final int METHOD_getSize59 = 59;
    private static final int METHOD_getToolTipLocation60 = 60;
    private static final int METHOD_getToolTipText61 = 61;
    private static final int METHOD_gotFocus62 = 62;
    private static final int METHOD_grabFocus63 = 63;
    private static final int METHOD_handleEvent64 = 64;
    private static final int METHOD_hasFocus65 = 65;
    private static final int METHOD_hide66 = 66;
    private static final int METHOD_imageUpdate67 = 67;
    private static final int METHOD_insets68 = 68;
    private static final int METHOD_inside69 = 69;
    private static final int METHOD_invalidate70 = 70;
    private static final int METHOD_isAncestorOf71 = 71;
    private static final int METHOD_isFocusCycleRoot72 = 72;
    private static final int METHOD_isLightweightComponent73 = 73;
    private static final int METHOD_keyDown74 = 74;
    private static final int METHOD_keyUp75 = 75;
    private static final int METHOD_layout76 = 76;
    private static final int METHOD_list77 = 77;
    private static final int METHOD_list78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_locate82 = 82;
    private static final int METHOD_location83 = 83;
    private static final int METHOD_lostFocus84 = 84;
    private static final int METHOD_main85 = 85;
    private static final int METHOD_minimumSize86 = 86;
    private static final int METHOD_mouseDown87 = 87;
    private static final int METHOD_mouseDrag88 = 88;
    private static final int METHOD_mouseEnter89 = 89;
    private static final int METHOD_mouseExit90 = 90;
    private static final int METHOD_mouseMove91 = 91;
    private static final int METHOD_mouseUp92 = 92;
    private static final int METHOD_move93 = 93;
    private static final int METHOD_nextFocus94 = 94;
    private static final int METHOD_paint95 = 95;
    private static final int METHOD_paintAll96 = 96;
    private static final int METHOD_paintComponents97 = 97;
    private static final int METHOD_paintImmediately98 = 98;
    private static final int METHOD_paintImmediately99 = 99;
    private static final int METHOD_postEvent100 = 100;
    private static final int METHOD_preferredSize101 = 101;
    private static final int METHOD_prepareImage102 = 102;
    private static final int METHOD_prepareImage103 = 103;
    private static final int METHOD_print104 = 104;
    private static final int METHOD_printAll105 = 105;
    private static final int METHOD_printComponents106 = 106;
    private static final int METHOD_putClientProperty107 = 107;
    private static final int METHOD_registerKeyboardAction108 = 108;
    private static final int METHOD_registerKeyboardAction109 = 109;
    private static final int METHOD_remove110 = 110;
    private static final int METHOD_remove111 = 111;
    private static final int METHOD_remove112 = 112;
    private static final int METHOD_removeAll113 = 113;
    private static final int METHOD_removeNotify114 = 114;
    private static final int METHOD_removePropertyChangeListener115 = 115;
    private static final int METHOD_repaint116 = 116;
    private static final int METHOD_repaint117 = 117;
    private static final int METHOD_repaint118 = 118;
    private static final int METHOD_repaint119 = 119;
    private static final int METHOD_repaint120 = 120;
    private static final int METHOD_requestDefaultFocus121 = 121;
    private static final int METHOD_requestFocus122 = 122;
    private static final int METHOD_requestFocus123 = 123;
    private static final int METHOD_requestFocusInWindow124 = 124;
    private static final int METHOD_resetKeyboardActions125 = 125;
    private static final int METHOD_reshape126 = 126;
    private static final int METHOD_resize127 = 127;
    private static final int METHOD_resize128 = 128;
    private static final int METHOD_revalidate129 = 129;
    private static final int METHOD_scrollRectToVisible130 = 130;
    private static final int METHOD_setBounds131 = 131;
    private static final int METHOD_setComponentZOrder132 = 132;
    private static final int METHOD_setControlDataProvider133 = 133;
    private static final int METHOD_setControlDataProvider134 = 134;
    private static final int METHOD_setDataProvider135 = 135;
    private static final int METHOD_setDataProvider136 = 136;
    private static final int METHOD_setDataProvider137 = 137;
    private static final int METHOD_setDefaultLocale138 = 138;
    private static final int METHOD_setValidation139 = 139;
    private static final int METHOD_show140 = 140;
    private static final int METHOD_show141 = 141;
    private static final int METHOD_size142 = 142;
    private static final int METHOD_toString143 = 143;
    private static final int METHOD_transferFocus144 = 144;
    private static final int METHOD_transferFocusBackward145 = 145;
    private static final int METHOD_transferFocusDownCycle146 = 146;
    private static final int METHOD_transferFocusUpCycle147 = 147;
    private static final int METHOD_unregisterKeyboardAction148 = 148;
    private static final int METHOD_update149 = 149;
    private static final int METHOD_updateUI150 = 150;
    private static final int METHOD_validar151 = 151;
    private static final int METHOD_validate152 = 152;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[153];
    
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
            methods[METHOD_addNotify7] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_agregarRegistroListener9] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("agregarRegistroListener", new Class[] {java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_agregarRegistroListener9].setDisplayName ( "" );
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
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createToolTip21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_deliverEvent24] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent24].setDisplayName ( "" );
            methods[METHOD_disable25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable25].setDisplayName ( "" );
            methods[METHOD_dispatchEvent26] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent26].setDisplayName ( "" );
            methods[METHOD_doLayout27] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout27].setDisplayName ( "" );
            methods[METHOD_eliminarRegistroListener28] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("eliminarRegistroListener", new Class[] {})); // NOI18N
            methods[METHOD_eliminarRegistroListener28].setDisplayName ( "" );
            methods[METHOD_enable29] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enableInputMethods31] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods31].setDisplayName ( "" );
            methods[METHOD_findComponentAt32] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke42].setDisplayName ( "" );
            methods[METHOD_getBaseline43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline43].setDisplayName ( "" );
            methods[METHOD_getBounds44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds44].setDisplayName ( "" );
            methods[METHOD_getClientProperty45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty45].setDisplayName ( "" );
            methods[METHOD_getComponentAt46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder48].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke49].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale50].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys51] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys51].setDisplayName ( "" );
            methods[METHOD_getFontMetrics52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics52].setDisplayName ( "" );
            methods[METHOD_getInsets53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets53].setDisplayName ( "" );
            methods[METHOD_getListeners54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners54].setDisplayName ( "" );
            methods[METHOD_getLocation55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation55].setDisplayName ( "" );
            methods[METHOD_getMousePosition56] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition56].setDisplayName ( "" );
            methods[METHOD_getPopupLocation57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation57].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners58] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners58].setDisplayName ( "" );
            methods[METHOD_getSize59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize59].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation60].setDisplayName ( "" );
            methods[METHOD_getToolTipText61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText61].setDisplayName ( "" );
            methods[METHOD_gotFocus62] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus62].setDisplayName ( "" );
            methods[METHOD_grabFocus63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus63].setDisplayName ( "" );
            methods[METHOD_handleEvent64] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent64].setDisplayName ( "" );
            methods[METHOD_hasFocus65] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus65].setDisplayName ( "" );
            methods[METHOD_hide66] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide66].setDisplayName ( "" );
            methods[METHOD_imageUpdate67] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate67].setDisplayName ( "" );
            methods[METHOD_insets68] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets68].setDisplayName ( "" );
            methods[METHOD_inside69] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside69].setDisplayName ( "" );
            methods[METHOD_invalidate70] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate70].setDisplayName ( "" );
            methods[METHOD_isAncestorOf71] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf71].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot72] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot72].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent73] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent73].setDisplayName ( "" );
            methods[METHOD_keyDown74] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown74].setDisplayName ( "" );
            methods[METHOD_keyUp75] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp75].setDisplayName ( "" );
            methods[METHOD_layout76] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout76].setDisplayName ( "" );
            methods[METHOD_list77] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list77].setDisplayName ( "" );
            methods[METHOD_list78] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list78].setDisplayName ( "" );
            methods[METHOD_list79] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_locate82] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate82].setDisplayName ( "" );
            methods[METHOD_location83] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location83].setDisplayName ( "" );
            methods[METHOD_lostFocus84] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus84].setDisplayName ( "" );
            methods[METHOD_main85] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("main", new Class[] {java.lang.String[].class})); // NOI18N
            methods[METHOD_main85].setDisplayName ( "" );
            methods[METHOD_minimumSize86] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize86].setDisplayName ( "" );
            methods[METHOD_mouseDown87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown87].setDisplayName ( "" );
            methods[METHOD_mouseDrag88] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag88].setDisplayName ( "" );
            methods[METHOD_mouseEnter89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter89].setDisplayName ( "" );
            methods[METHOD_mouseExit90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit90].setDisplayName ( "" );
            methods[METHOD_mouseMove91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove91].setDisplayName ( "" );
            methods[METHOD_mouseUp92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp92].setDisplayName ( "" );
            methods[METHOD_move93] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move93].setDisplayName ( "" );
            methods[METHOD_nextFocus94] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus94].setDisplayName ( "" );
            methods[METHOD_paint95] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint95].setDisplayName ( "" );
            methods[METHOD_paintAll96] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll96].setDisplayName ( "" );
            methods[METHOD_paintComponents97] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents97].setDisplayName ( "" );
            methods[METHOD_paintImmediately98] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately98].setDisplayName ( "" );
            methods[METHOD_paintImmediately99] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately99].setDisplayName ( "" );
            methods[METHOD_postEvent100] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent100].setDisplayName ( "" );
            methods[METHOD_preferredSize101] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize101].setDisplayName ( "" );
            methods[METHOD_prepareImage102] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage102].setDisplayName ( "" );
            methods[METHOD_prepareImage103] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage103].setDisplayName ( "" );
            methods[METHOD_print104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print104].setDisplayName ( "" );
            methods[METHOD_printAll105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll105].setDisplayName ( "" );
            methods[METHOD_printComponents106] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents106].setDisplayName ( "" );
            methods[METHOD_putClientProperty107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty107].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction108].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction109].setDisplayName ( "" );
            methods[METHOD_remove110] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove110].setDisplayName ( "" );
            methods[METHOD_remove111] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove111].setDisplayName ( "" );
            methods[METHOD_remove112] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove112].setDisplayName ( "" );
            methods[METHOD_removeAll113] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll113].setDisplayName ( "" );
            methods[METHOD_removeNotify114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify114].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener115] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener115].setDisplayName ( "" );
            methods[METHOD_repaint116] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint116].setDisplayName ( "" );
            methods[METHOD_repaint117] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint117].setDisplayName ( "" );
            methods[METHOD_repaint118] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint118].setDisplayName ( "" );
            methods[METHOD_repaint119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint119].setDisplayName ( "" );
            methods[METHOD_repaint120] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint120].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus121].setDisplayName ( "" );
            methods[METHOD_requestFocus122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus122].setDisplayName ( "" );
            methods[METHOD_requestFocus123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus123].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow124].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions125].setDisplayName ( "" );
            methods[METHOD_reshape126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape126].setDisplayName ( "" );
            methods[METHOD_resize127] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize127].setDisplayName ( "" );
            methods[METHOD_resize128] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize128].setDisplayName ( "" );
            methods[METHOD_revalidate129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate129].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible130].setDisplayName ( "" );
            methods[METHOD_setBounds131] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds131].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder132] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder132].setDisplayName ( "" );
            methods[METHOD_setControlDataProvider133] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("setControlDataProvider", new Class[] {java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_setControlDataProvider133].setDisplayName ( "" );
            methods[METHOD_setControlDataProvider134] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("setControlDataProvider", new Class[] {java.lang.Object.class, java.lang.String.class, java.lang.String[].class, java.lang.String[].class})); // NOI18N
            methods[METHOD_setControlDataProvider134].setDisplayName ( "" );
            methods[METHOD_setDataProvider135] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("setDataProvider", new Class[] {java.util.ArrayList.class, java.lang.String[].class})); // NOI18N
            methods[METHOD_setDataProvider135].setDisplayName ( "" );
            methods[METHOD_setDataProvider136] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("setDataProvider", new Class[] {java.util.ArrayList.class, java.lang.String[].class, java.lang.String[].class})); // NOI18N
            methods[METHOD_setDataProvider136].setDisplayName ( "" );
            methods[METHOD_setDataProvider137] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("setDataProvider", new Class[] {java.util.ArrayList.class, java.lang.String[].class, java.lang.String[].class, java.lang.Object.class, java.lang.String.class})); // NOI18N
            methods[METHOD_setDataProvider137].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale138].setDisplayName ( "" );
            methods[METHOD_setValidation139] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("setValidation", new Class[] {})); // NOI18N
            methods[METHOD_setValidation139].setDisplayName ( "" );
            methods[METHOD_show140] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show140].setDisplayName ( "" );
            methods[METHOD_show141] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show141].setDisplayName ( "" );
            methods[METHOD_size142] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size142].setDisplayName ( "" );
            methods[METHOD_toString143] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString143].setDisplayName ( "" );
            methods[METHOD_transferFocus144] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus144].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward145] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward145].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle146] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle146].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle147] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle147].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction148] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction148].setDisplayName ( "" );
            methods[METHOD_update149] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update149].setDisplayName ( "" );
            methods[METHOD_updateUI150] = new MethodDescriptor(javax.swing.JPanel.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI150].setDisplayName ( "" );
            methods[METHOD_validar151] = new MethodDescriptor(org.aguilar.swinglib.swing.fl.FlSelectField.class.getMethod("validar", new Class[] {})); // NOI18N
            methods[METHOD_validar151].setDisplayName ( "" );
            methods[METHOD_validate152] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate152].setDisplayName ( "" );
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
