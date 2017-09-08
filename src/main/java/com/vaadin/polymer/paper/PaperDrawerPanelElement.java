/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-drawer-panel project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper;

import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <p>Material design: <a href="https://www.google.com/design/spec/patterns/navigation-drawer.html">Navigation drawer</a></p>
 * <p><code>paper-drawer-panel</code> contains a drawer panel and a main panel.  The drawer<br>and the main panel are side-by-side with drawer on the left.  When the browser<br>window size is smaller than the <code>responsiveWidth</code>, <code>paper-drawer-panel</code><br>changes to narrow layout.  In narrow layout, the drawer will be stacked on top<br>of the main panel.  The drawer will slide in/out to hide/reveal the main<br>panel.</p>
 * <p>Use the attribute <code>drawer</code> to indicate that the element is the drawer panel and<br><code>main</code> to indicate that the element is the main panel.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-drawer-panel&gt;
 *   &lt;div drawer&gt; Drawer panel... &lt;/div&gt;
 *   &lt;div main&gt; Main panel... &lt;/div&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>The drawer and the main panels are not scrollable.  You can set CSS overflow<br>property on the elements to make them scrollable or use <code>paper-header-panel</code>.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-drawer-panel&gt;
 *   &lt;paper-header-panel drawer&gt;
 *     &lt;paper-toolbar&gt;&lt;/paper-toolbar&gt;
 *     &lt;div&gt; Drawer content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 *   &lt;paper-header-panel main&gt;
 *     &lt;paper-toolbar&gt;&lt;/paper-toolbar&gt;
 *     &lt;div&gt; Main content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>An element that should toggle the drawer will automatically do so if it’s<br>given the <code>paper-drawer-toggle</code> attribute.  Also this element will automatically<br>be hidden in wide layout.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-drawer-panel&gt;
 *   &lt;paper-header-panel drawer&gt;
 *     &lt;paper-toolbar&gt;
 *       &lt;div&gt;Application&lt;/div&gt;
 *     &lt;/paper-toolbar&gt;
 *     &lt;div&gt; Drawer content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 *   &lt;paper-header-panel main&gt;
 *     &lt;paper-toolbar&gt;
 *       &lt;paper-icon-button icon=&quot;menu&quot; paper-drawer-toggle&gt;&lt;/paper-icon-button&gt;
 *       &lt;div&gt;Title&lt;/div&gt;
 *     &lt;/paper-toolbar&gt;
 *     &lt;div&gt; Main content... &lt;/div&gt;
 *   &lt;/paper-header-panel&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><p>To position the drawer to the right, add <code>right-drawer</code> attribute.</p>
 * <pre><code>&lt;paper-drawer-panel right-drawer&gt;
 *   &lt;div drawer&gt; Drawer panel... &lt;/div&gt;
 *   &lt;div main&gt; Main panel... &lt;/div&gt;
 * &lt;/paper-drawer-panel&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>To change the main container:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-main-container: {
 *     background-color: gray;
 *   };
 * }
 * 
 * 
 * </code></pre><p>To change the drawer container when it’s in the left side:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-left-drawer-container: {
 *     background-color: white;
 *   };
 * }
 * 
 * 
 * </code></pre><p>To change the drawer container when it’s in the right side:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-right-drawer-container: {
 *     background-color: white;
 *   };
 * }
 * 
 * 
 * </code></pre><p>To customize the scrim:</p>
 * <pre><code>paper-drawer-panel {
 *   --paper-drawer-panel-scrim: {
 *     background-color: red;
 *   };
 * }
 * 
 * 
 * </code></pre><p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-drawer-panel-scrim-opacity</code></td>
 * <td>Scrim opacity</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-drawer-container</code></td>
 * <td>Mixin applied to drawer container</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-left-drawer-container</code></td>
 * <td>Mixin applied to container when it’s in the left side</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-main-container</code></td>
 * <td>Mixin applied to main container</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-right-drawer-container</code></td>
 * <td>Mixin applied to container when it’s in the right side</td>
 * <td>{}</td>
 * </tr>
 * <tr>
 * <td><code>--paper-drawer-panel-scrim</code></td>
 * <td>Mixin applied to scrim</td>
 * <td>{}</td>
 * </tr>
 * </tbody>
 * </table>
 */
@JsType(isNative=true)
public interface PaperDrawerPanelElement extends HTMLElement {

    @JsOverlay public static final String TAG = "paper-drawer-panel";
    @JsOverlay public static final String SRC = "paper-drawer-panel/paper-drawer-panel.html";


    /**
     * <p>Whether the user is dragging the drawer interactively.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    @JsProperty boolean getDragging();
    /**
     * <p>Whether the user is dragging the drawer interactively.</p>
     *
     * JavaScript Info:
     * @property dragging
     * @type Boolean
     * 
     */
    @JsProperty void setDragging(boolean value);

    /**
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    @JsProperty double getEdgeSwipeSensitivity();
    /**
     * <p>How many pixels on the side of the screen are sensitive to edge<br>swipes and peek.</p>
     *
     * JavaScript Info:
     * @property edgeSwipeSensitivity
     * @type Number
     * 
     */
    @JsProperty void setEdgeSwipeSensitivity(double value);

    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    @JsProperty boolean getForceNarrow();
    /**
     * <p>If true, ignore <code>responsiveWidth</code> setting and force the narrow layout.</p>
     *
     * JavaScript Info:
     * @property forceNarrow
     * @type Boolean
     * 
     */
    @JsProperty void setForceNarrow(boolean value);

    /**
     * <p>If true, swipe to open/close the drawer is disabled.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisableSwipe();
    /**
     * <p>If true, swipe to open/close the drawer is disabled.</p>
     *
     * JavaScript Info:
     * @property disableSwipe
     * @type Boolean
     * 
     */
    @JsProperty void setDisableSwipe(boolean value);

    /**
     * <p>Whether the browser has support for the will-change CSS property.</p>
     *
     * JavaScript Info:
     * @property hasWillChange
     * @type Boolean
     * 
     */
    @JsProperty boolean getHasWillChange();
    /**
     * <p>Whether the browser has support for the will-change CSS property.</p>
     *
     * JavaScript Info:
     * @property hasWillChange
     * @type Boolean
     * 
     */
    @JsProperty void setHasWillChange(boolean value);

    /**
     * <p>Returns true if the panel is in narrow layout.  This is useful if you<br>need to show/hide elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    @JsProperty boolean getNarrow();
    /**
     * <p>Returns true if the panel is in narrow layout.  This is useful if you<br>need to show/hide elements based on the layout.</p>
     *
     * JavaScript Info:
     * @property narrow
     * @type Boolean
     * 
     */
    @JsProperty void setNarrow(boolean value);

    /**
     * <p>Whether the drawer is peeking out from the edge.</p>
     *
     * JavaScript Info:
     * @property peeking
     * @type Boolean
     * 
     */
    @JsProperty boolean getPeeking();
    /**
     * <p>Whether the drawer is peeking out from the edge.</p>
     *
     * JavaScript Info:
     * @property peeking
     * @type Boolean
     * 
     */
    @JsProperty void setPeeking(boolean value);

    /**
     * <p>If true, position the drawer to the right.</p>
     *
     * JavaScript Info:
     * @property rightDrawer
     * @type Boolean
     * 
     */
    @JsProperty boolean getRightDrawer();
    /**
     * <p>If true, position the drawer to the right.</p>
     *
     * JavaScript Info:
     * @property rightDrawer
     * @type Boolean
     * 
     */
    @JsProperty void setRightDrawer(boolean value);

    /**
     * <p>The panel that is being selected. <code>drawer</code> for the drawer panel and<br><code>main</code> for the main panel.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|null)
     * 
     */
    @JsProperty Object getSelected();
    /**
     * <p>The panel that is being selected. <code>drawer</code> for the drawer panel and<br><code>main</code> for the main panel.</p>
     *
     * JavaScript Info:
     * @property selected
     * @type (string|null)
     * 
     */
    @JsProperty void setSelected(Object value);

    /**
     * <p>If true, swipe from the edge is disabled.</p>
     *
     * JavaScript Info:
     * @property disableEdgeSwipe
     * @type Boolean
     * 
     */
    @JsProperty boolean getDisableEdgeSwipe();
    /**
     * <p>If true, swipe from the edge is disabled.</p>
     *
     * JavaScript Info:
     * @property disableEdgeSwipe
     * @type Boolean
     * 
     */
    @JsProperty void setDisableEdgeSwipe(boolean value);

    /**
     * <p>Whether the browser has support for the transform CSS property.</p>
     *
     * JavaScript Info:
     * @property hasTransform
     * @type Boolean
     * 
     */
    @JsProperty boolean getHasTransform();
    /**
     * <p>Whether the browser has support for the transform CSS property.</p>
     *
     * JavaScript Info:
     * @property hasTransform
     * @type Boolean
     * 
     */
    @JsProperty void setHasTransform(boolean value);

    /**
     * <p>Max-width when the panel changes to narrow layout.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    @JsProperty String getResponsiveWidth();
    /**
     * <p>Max-width when the panel changes to narrow layout.</p>
     *
     * JavaScript Info:
     * @property responsiveWidth
     * @type String
     * 
     */
    @JsProperty void setResponsiveWidth(String value);

    /**
     * <p>The panel to be selected when <code>paper-drawer-panel</code> changes to narrow<br>layout.</p>
     *
     * JavaScript Info:
     * @property defaultSelected
     * @type String
     * 
     */
    @JsProperty String getDefaultSelected();
    /**
     * <p>The panel to be selected when <code>paper-drawer-panel</code> changes to narrow<br>layout.</p>
     *
     * JavaScript Info:
     * @property defaultSelected
     * @type String
     * 
     */
    @JsProperty void setDefaultSelected(String value);

    /**
     * <p>Width of the drawer panel.</p>
     *
     * JavaScript Info:
     * @property drawerWidth
     * @type String
     * 
     */
    @JsProperty String getDrawerWidth();
    /**
     * <p>Width of the drawer panel.</p>
     *
     * JavaScript Info:
     * @property drawerWidth
     * @type String
     * 
     */
    @JsProperty void setDrawerWidth(String value);

    /**
     * <p>The attribute on elements that should toggle the drawer on tap, also elements will<br>automatically be hidden in wide layout.</p>
     *
     * JavaScript Info:
     * @property drawerToggleAttribute
     * @type String
     * 
     */
    @JsProperty String getDrawerToggleAttribute();
    /**
     * <p>The attribute on elements that should toggle the drawer on tap, also elements will<br>automatically be hidden in wide layout.</p>
     *
     * JavaScript Info:
     * @property drawerToggleAttribute
     * @type String
     * 
     */
    @JsProperty void setDrawerToggleAttribute(String value);

    /**
     * <p>The CSS selector for the element that should receive focus when the drawer is open.<br>By default, when the drawer opens, it focuses the first tabbable element. That is,<br>the first element that can receive focus.</p>
     * <p>To disable this behavior, you can set <code>drawerFocusSelector</code> to <code>null</code> or an empty string.</p>
     *
     * JavaScript Info:
     * @property drawerFocusSelector
     * @type String
     * 
     */
    @JsProperty String getDrawerFocusSelector();
    /**
     * <p>The CSS selector for the element that should receive focus when the drawer is open.<br>By default, when the drawer opens, it focuses the first tabbable element. That is,<br>the first element that can receive focus.</p>
     * <p>To disable this behavior, you can set <code>drawerFocusSelector</code> to <code>null</code> or an empty string.</p>
     *
     * JavaScript Info:
     * @property drawerFocusSelector
     * @type String
     * 
     */
    @JsProperty void setDrawerFocusSelector(String value);


    /**
     * <p>Used to remove a resizable descendant from the list of descendants<br>that should be notified of a resize change.</p>
     *
     * JavaScript Info:
     * @method stopResizeNotificationsFor
     * @param {} target  
     * @behavior VaadinSplitLayout
     * 
     */
    void stopResizeNotificationsFor(Object target);

    /**
     * <p>Used to assign the closest resizable ancestor to this resizable<br>if the ancestor detects a request for notifications.</p>
     *
     * JavaScript Info:
     * @method assignParentResizable
     * @param {} parentResizable  
     * @behavior VaadinSplitLayout
     * 
     */
    void assignParentResizable(Object parentResizable);

    /**
     * <p>This method can be overridden to filter nested elements that should or<br>should not be notified by the current element. Return true if an element<br>should be notified, or false if it should not be notified.</p>
     *
     * JavaScript Info:
     * @method resizerShouldNotify
     * @param {HTMLElement} element  
     * @behavior VaadinSplitLayout
     * @return {boolean}
     */
    boolean resizerShouldNotify(JavaScriptObject element);

    /**
     * <p>Can be called to manually notify a resizable and its descendant<br>resizables of a resize change.</p>
     *
     * JavaScript Info:
     * @method notifyResize
     * @behavior VaadinSplitLayout
     * 
     */
    void notifyResize();

    /**
     * <p>Opens the drawer.</p>
     *
     * JavaScript Info:
     * @method openDrawer
     * 
     * 
     */
    void openDrawer();

    /**
     * <p>Toggles the panel open and closed.</p>
     *
     * JavaScript Info:
     * @method togglePanel
     * 
     * 
     */
    void togglePanel();

    /**
     * <p>Closes the drawer.</p>
     *
     * JavaScript Info:
     * @method closeDrawer
     * 
     * 
     */
    void closeDrawer();

}
