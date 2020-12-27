@file:JsModule("react-native-navigation")
@file:Suppress("unused")

package ojaynico.kotlin.react.native.navigation

import react.Component

external class Navigation {
fun immediatelyResetRouteStack(nextRouteStack: dynamic)
    fun jumpTo(route: JSON)
    fun jumpForward()
    fun jumpBack()
    fun push(route: JSON)
    fun popN(n: Number)
    fun pop()
    fun replaceAtIndex(route: JSON, index: Number, cb: () -> Unit)
    fun replace(route:JSON)
    fun replacePrevious(route: JSON)
    fun popToTop()
    fun popToRoute(route: JSON)
    fun replacePreviousAndPop(route: JSON)
    fun resetTo(route: JSON)
    fun getCurrentRoutes()


    companion object {
        fun <T : Component<*, *>> registerComponent(name: String, createComponent: () -> JsClass<T>)
        fun events(): EventsRegistry
        fun setRoot(layout: dynamic): dynamic
        fun setDefaultOptions(options: dynamic)
        fun mergeOptions(componentId: String, options: dynamic)
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
