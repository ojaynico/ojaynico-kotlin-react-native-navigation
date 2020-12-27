package ojaynico.kotlin.react.native.navigation

import react.RBuilder
import react.RElementBuilder

fun RBuilder.sideMenuView(handler: RElementBuilder<SideMenuViewProps>.() -> Unit) = child(SideMenuView::class) {
    handler()
}
