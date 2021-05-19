# ojaynico-kotlin-react-native-navigation

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ojaynico/ojaynico-kotlin-react-native-navigation/badge.svg)](https://search.maven.org/artifact/com.github.ojaynico/ojaynico-kotlin-react-native-navigation/1.0.9/pom)
[![Kotlin](https://img.shields.io/badge/kotlin-1.5.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![npm version](https://img.shields.io/npm/v/react.svg?style=flat)](https://www.npmjs.com/package/react)
[![npm version](https://img.shields.io/npm/v/react-native?color=brightgreen&label=npm%20package)](https://www.npmjs.com/package/react-native)
[![npm version](https://img.shields.io/npm/v/react-native-navigation/latest.svg?style=flat-square)](https://www.npmjs.com/package/react-native-navigation)
[![npm version](https://img.shields.io/npm/v/react-native-navigation-drawer-extension.svg?style=flat-square)](https://www.npmjs.com/package/react-native-navigation-drawer-extension)
[![Kotlin JS IR supported](https://img.shields.io/badge/Kotlin%2FJS-IR%20supported-yellow)](https://kotl.in/jsirsupported)

Kotlin wrappers for react-native-navigation by wix and react-native-navigation-drawer-extension

**Follow instructions in this repository on how to setup a fully working react native app**

https://github.com/ojaynico/ojaynico-kotlin-react-native

**After check out the following links on how to install and use navigation and navigation drawer**

https://wix.github.io/react-native-navigation/docs/before-you-start

https://github.com/aspect-apps/react-native-navigation-drawer-extension#readme

## `How to use the wrapper?`

Use the cli tool below to generate a new Kotlin React Native application.

https://github.com/ojaynico/create-ojaynico-krn

Proceed to the next step after generating the project.

Run the following command in your projects root directory.

`npm install --save react-native-navigation`

In your react native application shared module (a kotlin gradle project), update your gradle file to include the following in the respective blocks.

```kotlin
repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("com.github.ojaynico:ojaynico-kotlin-react-native-navigation:1.0.9")
}
```

### `Example of code snippet for a react native app using the above wrapper`

```kotlin
import ojaynico.kotlin.react.*
import ojaynico.kotlin.react.native.AppRegistry
import react.*
import ojaynico.kotlin.react.native.navigation.Navigation

val styles = StyleSheet.create(object {
    val body = object {
            val backgroundColor = "#FFF"
    }
    val text = object {
            val fontSize = 24
            val fontWeight = "600"
            val color = "#000"
    }
}

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        scrollView {
            attrs.contentInsetAdjustmentBehavior = "automatic"
            
            view {
                attrs.style = styles.body

                text("Welcome to Kotlin React Native With Navigation Support") {
                    style = styles.text
                }
            }
        }
    }
}

fun main() {
    Navigation.registerComponent("MainScreen") { App::class.js }
    Navigation.setDefaultOptions(object {
        val statusBar = object {
            val backgroundColor = "#4d089a"
        }
        val topBar = object {
            val title = object {
                val color = "white"
            }
            val backButton = object {
                val color = "white"
            }
            val background = object {
                val color = "#4d089a"
            }
        }
    })
    Navigation.events().registerAppLaunchedListener {
        Navigation.setRoot(object {
            val root = object {
                val stack = object {
                    val children = arrayOf(
                        object {
                            val component = object {
                                val name = "MainScreen"
                                val options = object {
                                    val topBar = object {
                                        val title = object {
                                            val text = "Home"
                                            val color = "white"
                                        }
                                        val background = object {
                                            val color = "#4d089a"
                                        }
                                    }
                                }
                            }
                        }
                    )
                }
            }
        })
    }
}
```

**NOTE**: We no-longer use AppRegistry to register our components but we use Navigation component to register it as above

**A fully set up and working example can be found in the repository below.**

https://github.com/ojaynico/KotlinReactNativeNavigation
