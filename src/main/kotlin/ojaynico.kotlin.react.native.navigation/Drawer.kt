@file:JsModule("react-native-navigation-drawer-extension")
@file:Suppress("unused")

package ojaynico.kotlin.react.native.navigation

import react.Component
import react.RProps
import react.RState

external class RNNDrawer {
    companion object {
        fun create(component: dynamic): JsClass<dynamic>
        fun showDrawer(layout:dynamic)
        fun dismissDrawer()
    }
}

external interface SideMenuViewProps : RProps {
    var style: dynamic
    var drawerName: String
    var direction: String
    var passProps: dynamic
    var options: dynamic
}

external class SideMenuView : Component<SideMenuViewProps, RState> {
    override fun render(): dynamic = definedExternally
}
