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
}
