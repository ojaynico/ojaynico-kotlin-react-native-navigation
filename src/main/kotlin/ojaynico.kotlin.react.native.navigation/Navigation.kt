@file:JsModule("react-native-navigation")
@file:Suppress("unused")

package ojaynico.kotlin.react.native.navigation

import react.Component

external class Navigation {
fun immediatelyResetRouteStack(nextRouteStack: dynamic)
    companion object {
        var TouchablePreview: Any
        var store: Any
        var optionProcessorsStore: Any
        var layoutProcessorsStore: Any
        var nativeEventsReceiver: Any
        var uniqueIdProvider: Any
        var componentRegistry: Any
        var layoutTreeParser: Any
        var layoutTreeCrawler: Any
        var nativeCommandsSender: Any
        var commands: Any
        var eventsRegistry: Any
        var commandsObserver: Any
        var componentEventsObserver: Any
        var componentWrapper: Any

        fun <T : Component<*, *>> registerComponent(name: String, createComponent: () -> JsClass<T>): dynamic
        fun <T : Component<*, *>> registerComponent(name: Number, createComponent: () -> JsClass<T>): dynamic
        fun <T> addOptionProcessor(optionPath: String, processor: (value: T, commandName: dynamic) -> T): dynamic
        fun addLayoutProcessor(processor: (layout: dynamic, commandName: dynamic) -> dynamic): dynamic
        fun setLazyComponentRegistrator(lazyRegistratorFn: (lazyComponentRequest: dynamic /* String | Number */) -> Unit)
        fun registerComponentWithRedux(componentName: String, getComponentClassFunc: dynamic, ReduxProvider: Any, reduxStore: Any): dynamic
        fun registerComponentWithRedux(componentName: Number, getComponentClassFunc: dynamic, ReduxProvider: Any, reduxStore: Any): dynamic
        fun setRoot(layout: dynamic): dynamic
        fun setDefaultOptions(options: dynamic)
        fun mergeOptions(componentId: String, options: dynamic)
        fun updateProps(componentId: String, props: Any?)
        fun <P> showModal(layout: Layout<P>): dynamic
        fun dismissModal(componentId: String, mergeOptions: dynamic = definedExternally): dynamic
        fun dismissAllModals(mergeOptions: dynamic = definedExternally): dynamic
        fun <P> push(componentId: String, layout: Layout<P>): dynamic
        fun pop(componentId: String, mergeOptions: dynamic = definedExternally): dynamic
        fun popTo(componentId: String, mergeOptions: dynamic = definedExternally): dynamic
        fun popToRoot(componentId: String, mergeOptions: dynamic = definedExternally): dynamic
        fun <P> setStackRoot(componentId: String, layout: Layout<P>): dynamic
        fun <P> setStackRoot(componentId: String, layout: Array<Layout<P>>): dynamic
        fun <P> showOverlay(layout: Layout<P>): dynamic
        fun dismissOverlay(componentId: String): dynamic
        fun dismissAllOverlays(): dynamic
        fun getLaunchArgs(): dynamic
        fun constants(): dynamic
        fun events(): EventsRegistry
        fun push(componentId: String, component: () -> dynamic)
        fun updateProps(id: String, props: () -> dynamic)
    }
}

external class EventsRegistry {
    fun registerAppLaunchedListener(callback: () -> dynamic): dynamic
    fun registerComponentListener(listener: dynamic, componentId: String): dynamic
    fun bindComponent(component: Component<*,*>, componentId: String): dynamic
    fun registerComponentDidAppearListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerComponentDidDisappearListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerCommandCompletedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerBottomTabSelectedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerBottomTabPressedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerBottomTabLongPressedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerNavigationButtonPressedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerModalDismissedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerModalAttemptedToDismissListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerSearchBarUpdatedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerSearchBarCancelPressedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerPreviewCompletedListener(callback: (event: dynamic) -> dynamic): dynamic
    fun registerCommandListener(callback: (name: String, params: dynamic) -> dynamic): dynamic
    fun registerScreenPoppedListener(callback: (event: dynamic) -> dynamic): dynamic
}

external interface LayoutComponent<P> {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
    var passProps: P?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutComponent__0 : LayoutComponent<Any>

external interface LayoutStackChildren {
    var component: LayoutComponent__0?
        get() = definedExternally
        set(value) = definedExternally
    var externalComponent: ExternalComponent?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutStack {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<LayoutStackChildren>?
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutTabsChildren {
    var stack: LayoutStack?
        get() = definedExternally
        set(value) = definedExternally
    var component: LayoutComponent__0?
        get() = definedExternally
        set(value) = definedExternally
    var externalComponent: ExternalComponent?
        get() = definedExternally
        set(value) = definedExternally
    var sideMenu: LayoutSideMenu?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutBottomTabs {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<LayoutTabsChildren>?
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutSideMenu {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var left: LayoutStackChildren?
        get() = definedExternally
        set(value) = definedExternally
    var center: dynamic
    var right: LayoutStackChildren?
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutSplitView {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var master: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var detail: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutTopTabs {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<LayoutTabsChildren>?
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutRoot {
    var root: dynamic
    var modals: Any?
        get() = definedExternally
        set(value) = definedExternally
    var overlays: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExternalComponent {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
    var passProps: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Layout<P> {
    var component: LayoutComponent<P>?
        get() = definedExternally
        set(value) = definedExternally
    var stack: LayoutStack?
        get() = definedExternally
        set(value) = definedExternally
    var bottomTabs: LayoutBottomTabs?
        get() = definedExternally
        set(value) = definedExternally
    var sideMenu: LayoutSideMenu?
        get() = definedExternally
        set(value) = definedExternally
    var splitView: LayoutSplitView?
        get() = definedExternally
        set(value) = definedExternally
    var topTabs: LayoutTopTabs?
        get() = definedExternally
        set(value) = definedExternally
    var externalComponent: ExternalComponent?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsSplitView {
    var displayMode: String? /* 'auto' | 'visible' | 'hidden' | 'overlay' */
        get() = definedExternally
        set(value) = definedExternally
    var primaryEdge: String? /* 'leading' | 'trailing' */
        get() = definedExternally
        set(value) = definedExternally
    var minWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var primaryBackgroundStyle: String? /* 'none' | 'sidebar' */
        get() = definedExternally
        set(value) = definedExternally
}


external interface OptionsStatusBar {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: String? /* 'light' | 'dark' */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var drawBehind: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var translucent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animated: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideWithTopBar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsLayout {
    var fitSystemWindows: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var componentBackgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var orientation: Array<String /* 'portrait' | 'landscape' */>?
        get() = definedExternally
        set(value) = definedExternally
    var topMargin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var direction: String? /* 'rtl' | 'ltr' | 'locale' */
        get() = definedExternally
        set(value) = definedExternally
    var autoHideHomeIndicator: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class OptionsModalPresentationStyle {
    formSheet /* = 'formSheet' */,
    pageSheet /* = 'pageSheet' */,
    overFullScreen /* = 'overFullScreen' */,
    overCurrentContext /* = 'overCurrentContext' */,
    currentContext /* = 'currentContext' */,
    popover /* = 'popover' */,
    fullScreen /* = 'fullScreen' */,
    none /* = 'none' */
}

external enum class OptionsModalTransitionStyle {
    coverVertical /* = 'coverVertical' */,
    crossDissolve /* = 'crossDissolve' */,
    flipHorizontal /* = 'flipHorizontal' */,
    partialCurl /* = 'partialCurl' */
}

external interface OptionsTopBarLargeTitle {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* 'normal' | 'italic' */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* String | String | String | String | String | String | String | String | String | String | String | String */
        get() = definedExternally
        set(value) = definedExternally
}


external interface OptionsTopBarTitle {
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* 'normal' | 'italic' */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* String | String | String | String | String | String | String | String | String | String | String | String */
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignment: String? /* 'center' | 'fill' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsTopBarSubtitle {
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* 'normal' | 'italic' */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* String | String | String | String | String | String | String | String | String | String | String | String */
        get() = definedExternally
        set(value) = definedExternally
    var alignment: String? /* 'center' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsTopBarBackButton {
    var accessibilityLabel: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var showTitle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* 'normal' | 'italic' */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* String | String | String | String | String | String | String | String | String | String | String | String */
        get() = definedExternally
        set(value) = definedExternally
    var testID: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsTopBarScrollEdgeAppearanceBackground {
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var translucent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsTopBarScrollEdgeAppearance {
    var background: OptionsTopBarScrollEdgeAppearanceBackground?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean
    var noBorder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
}


external interface OptionsTopBarBackground {
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var clipToBounds: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var translucent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}


external interface OptionsTopBarButton {
    var allCaps: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var id: String
    var icon: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var iconInsets: IconInsets?
        get() = definedExternally
        set(value) = definedExternally
    var component: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var systemItem: String? /* 'done' | 'cancel' | 'edit' | 'save' | 'add' | 'flexibleSpace' | 'fixedSpace' | 'compose' | 'reply' | 'action' | 'organize' | 'bookmarks' | 'search' | 'refresh' | 'stop' | 'camera' | 'trash' | 'play' | 'pause' | 'rewind' | 'fastForward' | 'undo' | 'redo' */
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var accessibilityLabel: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* 'normal' | 'italic' */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* String | String | String | String | String | String | String | String | String | String | String | String */
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableIconTint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var disabledColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var iconBackground: IconBackgroundOptions?
        get() = definedExternally
        set(value) = definedExternally
    var testID: String?
        get() = definedExternally
        set(value) = definedExternally
    var showAsAction: String? /* 'ifRoom' | 'withText' | 'always' | 'never' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsSearchBar {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideOnScroll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideTopBarOnFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var obscuresBackgroundDuringPresentation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var tintColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsTopBar {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideOnScroll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leftButtonColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var rightButtonColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var leftButtonDisabledColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var rightButtonDisabledColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var drawBehind: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var testID: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: OptionsTopBarTitle?
        get() = definedExternally
        set(value) = definedExternally
    var subtitle: OptionsTopBarSubtitle?
        get() = definedExternally
        set(value) = definedExternally
    var backButton: OptionsTopBarBackButton?
        get() = definedExternally
        set(value) = definedExternally
    var leftButtons: Array<OptionsTopBarButton>?
        get() = definedExternally
        set(value) = definedExternally
    var rightButtons: Array<OptionsTopBarButton>?
        get() = definedExternally
        set(value) = definedExternally
    var background: OptionsTopBarBackground?
        get() = definedExternally
        set(value) = definedExternally
    var scrollEdgeAppearance: OptionsTopBarScrollEdgeAppearance?
        get() = definedExternally
        set(value) = definedExternally
    var barStyle: String? /* 'default' | 'black' */
        get() = definedExternally
        set(value) = definedExternally
    var noBorder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var searchBar: OptionsSearchBar?
        get() = definedExternally
        set(value) = definedExternally
    var searchBarHiddenWhenScrolling: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var searchBarPlaceholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var searchBarBackgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var searchBarTintColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var hideNavBarOnFocusSearchBar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var largeTitle: OptionsTopBarLargeTitle?
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var borderHeight: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var elevation: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var topMargin: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SharedElementTransition {
    var fromId: String
    var toId: String
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: dynamic /* `T$3` | `T$4` | `T$5` | `T$6` | `T$7` | `T$8` | `T$9` | `T$10` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ElementTransition {
    var id: String
    var alpha: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var translationX: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var translationY: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleX: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleY: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var rotationX: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var rotationY: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* AppearingElementAnimation? | DisappearingElementAnimation? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface AppearingElementAnimation : ElementAnimation {
    var from: Number
}

external interface DisappearingElementAnimation : ElementAnimation {
    var to: Number
}

external interface ElementAnimation {
    var duration: Number
    var startDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: dynamic /* `T$3` | `T$4` | `T$5` | `T$6` | `T$7` | `T$8` | `T$9` | `T$10` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsFab {
    var id: String
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var clickColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var rippleColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var iconColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var alignHorizontally: String? /* 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var hideOnScroll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var size: String? /* 'mini' | 'regular' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsBottomTabs {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animateTabSelection: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preferLargeIcons: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var currentTabIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var currentTabId: String?
        get() = definedExternally
        set(value) = definedExternally
    var testID: String?
        get() = definedExternally
        set(value) = definedExternally
    var drawBehind: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var tabsAttachMode: String? /* 'together' | 'afterInitialTab' | 'onSwitchToTab' */
        get() = definedExternally
        set(value) = definedExternally
    var barStyle: String? /* 'default' | 'black' */
        get() = definedExternally
        set(value) = definedExternally
    var translucent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideShadow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var titleDisplayMode: String? /* 'alwaysShow' | 'showWhenActive' | 'alwaysHide' | 'showWhenActiveForce' */
        get() = definedExternally
        set(value) = definedExternally
    var elevation: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var hideOnScroll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DotIndicatorOptions {
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImageSystemSource {
    var system: String
    var fallback: dynamic /* ImageRequireSource? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsBottomTab {
    var dotIndicator: DotIndicatorOptions?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var badge: String?
        get() = definedExternally
        set(value) = definedExternally
    var badgeColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var animateBadge: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var testID: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var iconColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var iconWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var iconHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var selectedIconColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var selectedTextColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* 'normal' | 'italic' */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* String | String | String | String | String | String | String | String | String | String | String | String */
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var iconInsets: Any?
        get() = definedExternally
        set(value) = definedExternally
    var selectedIcon: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var disableIconTint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableSelectedIconTint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var selectedFontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var selectTabOnPress: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SideMenuSide {
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shouldStretchDrawer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsSideMenu {
    var left: SideMenuSide?
        get() = definedExternally
        set(value) = definedExternally
    var right: SideMenuSide?
        get() = definedExternally
        set(value) = definedExternally
    var openGestureMode: String? /* 'entireScreen' | 'bezel' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OverlayOptions {
    var interceptTouchOutside: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var handleKeyboardEvents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ModalOptions {
    var swipeToDismiss: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsPreviewAction {
    var id: String
    var title: String
    var style: String? /* 'default' | 'selected' | 'destructive' */
        get() = definedExternally
        set(value) = definedExternally
    var actions: Array<OptionsPreviewAction>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsPreview {
    var reactTag: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var commit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var actions: Array<OptionsPreviewAction>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionsAnimationPropertyConfig {
    var from: Number?
        get() = definedExternally
        set(value) = definedExternally
    var to: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: dynamic /* `T$3` | `T$4` | `T$5` | `T$6` | `T$7` | `T$8` | `T$9` | `T$10` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScreenAnimationOptions {
    var x: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var y: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var translationX: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var translationY: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var scaleX: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var scaleY: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var rotationX: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var rotationY: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: OptionsAnimationPropertyConfig?
        get() = definedExternally
        set(value) = definedExternally
    var waitForRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IconInsets {
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bottom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var right: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ViewAnimationOptions : ScreenAnimationOptions {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ModalAnimationOptions : ViewAnimationOptions {
    var sharedElementTransitions: Array<SharedElementTransition>?
        get() = definedExternally
        set(value) = definedExternally
    var elementTransitions: Array<ElementTransition>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StackAnimationOptions {
    var waitForRender: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var topBar: ViewAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var bottomTabs: ViewAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var content: ViewAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var sharedElementTransitions: Array<SharedElementTransition>?
        get() = definedExternally
        set(value) = definedExternally
    var elementTransitions: Array<ElementTransition>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationOptions {
    var setStackRoot: ViewAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var setRoot: ViewAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var push: StackAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var pop: StackAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var showModal: ModalAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var dismissModal: ModalAnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NavigationBarOptions {
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WindowOptions {
    var backgroundColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IconBackgroundOptions {
    var color: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var disabledColor: dynamic /* String | Any */
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Options {
    var statusBar: OptionsStatusBar?
        get() = definedExternally
        set(value) = definedExternally
    var layout: OptionsLayout?
        get() = definedExternally
        set(value) = definedExternally
    var modalPresentationStyle: OptionsModalPresentationStyle?
        get() = definedExternally
        set(value) = definedExternally
    var modalTransitionStyle: OptionsModalTransitionStyle?
        get() = definedExternally
        set(value) = definedExternally
    var topBar: OptionsTopBar?
        get() = definedExternally
        set(value) = definedExternally
    var fab: OptionsFab?
        get() = definedExternally
        set(value) = definedExternally
    var bottomTabs: OptionsBottomTabs?
        get() = definedExternally
        set(value) = definedExternally
    var bottomTab: OptionsBottomTab?
        get() = definedExternally
        set(value) = definedExternally
    var sideMenu: OptionsSideMenu?
        get() = definedExternally
        set(value) = definedExternally
    var splitView: OptionsSplitView?
        get() = definedExternally
        set(value) = definedExternally
    var overlay: OverlayOptions?
        get() = definedExternally
        set(value) = definedExternally
    var modal: ModalOptions?
        get() = definedExternally
        set(value) = definedExternally
    var animations: AnimationOptions?
        get() = definedExternally
        set(value) = definedExternally
    var navigationBar: NavigationBarOptions?
        get() = definedExternally
        set(value) = definedExternally
    var preview: OptionsPreview?
        get() = definedExternally
        set(value) = definedExternally
    var popGesture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundImage: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var rootBackgroundImage: dynamic /* ImageRequireSource | String | ImageSystemSource */
        get() = definedExternally
        set(value) = definedExternally
    var window: WindowOptions?
        get() = definedExternally
        set(value) = definedExternally
    var blurOnUnmount: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
