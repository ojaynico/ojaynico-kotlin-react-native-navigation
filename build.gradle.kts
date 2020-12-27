plugins {
    kotlin("js") version "1.4.10"
    id("maven-publish")
    id("com.jfrog.bintray") version "1.8.4"
}
group = "ojaynico.kotlin.react.native.navigation"
version = "1.0.1"

val artifactName = project.name
val artifactGroup = project.group.toString()
val artifactVersion = project.version.toString()

val pomUrl = "https://github.com/ojaynico/ojaynico-kotlin-react-native-navigation"
val pomScmUrl = "https://github.com/ojaynico/ojaynico-kotlin-react-native-navigation"
val pomIssueUrl = "https://github.com/ojaynico/ojaynico-kotlin-react-native-navigation/issues"
val pomDesc = "https://github.com/ojaynico/ojaynico-kotlin-react-native-navigation"

val githubRepo = "https://github.com/ojaynico"
val githubReadme = "README.md"

val pomLicenseName = "MIT"
val pomLicenseUrl = "https://opensource.org/licenses/mit-license.php"
val pomLicenseDist = "repo"

val pomDeveloperId = "ojaynico"
val pomDeveloperName = "Nicodemus Ojwee"

kotlin {
    js {
        nodejs {

        }
        useCommonJs()
    }
}

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://dl.bintray.com/ojaynico/ojaynico-kotlin-react-native-navigation") }
    maven { url = uri("http://dl.bintray.com/kotlin/kotlin-js-wrappers") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
}

dependencies {
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.120-kotlin-1.4.10")
    implementation("org.jetbrains:kotlin-extensions:1.0.1-pre.120-kotlin-1.4.10")
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-native", "0.63.3"))
    implementation(npm("react-native-navigation", "7.6.0"))
    implementation(npm("react-native-navigation-drawer-extension", "3.2.0"))
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(kotlin.sourceSets.main.get().kotlin)
}

publishing {
    publications {
        create<MavenPublication>("ojaynico-kotlin-react-native-navigation") {
            groupId = artifactGroup
            artifactId = artifactName
            version = artifactVersion
            from(components["kotlin"])

            //artifact(sourcesJar)

            pom.withXml {
                asNode().apply {
                    appendNode("description", pomDesc)
                    appendNode("name", rootProject.name)
                    appendNode("url", pomUrl)
                    appendNode("licenses").appendNode("license").apply {
                        appendNode("name", pomLicenseName)
                        appendNode("url", pomLicenseUrl)
                        appendNode("distribution", pomLicenseDist)
                    }
                    appendNode("developers").appendNode("developer").apply {
                        appendNode("id", pomDeveloperId)
                        appendNode("name", pomDeveloperName)
                    }
                    appendNode("scm").apply {
                        appendNode("url", pomScmUrl)
                    }
                }
            }
        }
    }
}

bintray {
    user = project.findProperty("bintrayUser").toString()
    key = project.findProperty("bintrayKey").toString()
    publish = true

    setPublications("ojaynico-kotlin-react-native-navigation")

    pkg.apply {
        repo = "ojaynico-kotlin-react-native-navigation"
        name = artifactName
        githubRepo = githubRepo
        vcsUrl = pomScmUrl
        description = "Kotlin wrapper for react-native-navigation by wix and react-native-navigation-drawer-extension"
        setLabels("kotlin", "react", "react-native", "react-native-navigation", "react-native-navigation-drawer-extension")
        setLicenses("MIT")
        desc = description
        websiteUrl = pomUrl
        issueTrackerUrl = pomIssueUrl
        githubReleaseNotesFile = githubReadme

        version.apply {
            name = artifactVersion
            desc = pomDesc
            released = "2020-12-26"
            vcsTag = artifactVersion
        }
    }
}
