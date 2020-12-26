@file:JsModule("react-native-navigation-drawer-extension")
@file:Suppress("unused")

package ojaynico.kotlin.react.native.navigation

external class RNNDrawer {
    companion object {
        fun create(component: dynamic): JsClass<dynamic>
        fun showDrawer(layout:dynamic)
        fun dismissDrawer()
    }
}
