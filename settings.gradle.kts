include(":app")
include(":core:ui")
include(":core:data")
include(":core:model")
include(":core:domain")
include(":core:network")
include(":feature:login")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}