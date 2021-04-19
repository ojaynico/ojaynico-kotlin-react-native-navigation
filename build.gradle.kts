plugins {
    kotlin("js") version "1.4.32"
    id("maven-publish")
    id("io.codearte.nexus-staging") version "0.30.0"
    signing
}
group = "com.github.ojaynico"
version = "1.0.8"

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
val pomDeveloperEmail = "ojaynico@gmail.com"

kotlin {
    js(BOTH) {
        nodejs {}
        useCommonJs()
    }
}

repositories {
    mavenCentral()
    jcenter()
    maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
}

dependencies {
    implementation("org.jetbrains:kotlin-react:17.0.2-pre.153-kotlin-1.4.32")
    implementation("org.jetbrains:kotlin-extensions:1.0.1-pre.153-kotlin-1.4.32")
    implementation(npm("react", "17.0.2"))
    implementation(npm("react-native", "0.64.0"))
    implementation(npm("react-native-navigation", "7.13.0"))
    implementation(npm("react-native-navigation-drawer-extension", "4.0.0"))
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(kotlin.sourceSets.main.get().kotlin)
}

publishing {
    repositories {
        maven {
            credentials {
                val sonatypeUsername: String by project
                val sonatypePassword: String by project
                username = sonatypeUsername
                password = sonatypePassword
            }
            url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
        }
    }
    publications {
        create<MavenPublication>("ojaynico-kotlin-react-native-navigation") {
            groupId = artifactGroup
            artifactId = artifactName
            version = artifactVersion
            from(components["kotlin"])

            artifact(sourcesJar.get())

            pom.withXml {
                asNode().apply {
                    appendNode("description", pomDesc)
                    appendNode("name", rootProject.name)
                    appendNode("url", pomUrl)
                    appendNode("licenses").appendNode("license").apply {
                        appendNode("name", pomLicenseName)
                        appendNode("url", pomLicenseUrl)
                    }
                    appendNode("developers").appendNode("developer").apply {
                        appendNode("id", pomDeveloperId)
                        appendNode("name", pomDeveloperName)
                        appendNode("email", pomDeveloperEmail)
                    }
                    appendNode("scm").apply {
                        appendNode("connection", "scm:git:$pomScmUrl.git")
                        appendNode("developerConnection", "scm:git:$pomScmUrl.git")
                        appendNode("url", pomScmUrl)
                    }
                }
            }
        }
    }
}

nexusStaging {
    packageGroup = project.group.toString()

    val sonatypeUsername: String by project
    val sonatypePassword: String by project
    username = sonatypeUsername
    password = sonatypePassword
}

signing {
    sign(tasks["sourcesJar"])
    sign(publishing.publications["ojaynico-kotlin-react-native-navigation"])
}
