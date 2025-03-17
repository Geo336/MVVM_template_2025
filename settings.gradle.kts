pluginManagement {
    plugins {
        // Using the alias to refer to the plugin defined in libs.versions.toml
        //id("com.google.dagger.hilt.android") version libs.versions.hilt.get()
    }
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MVVM_template_2025"
include(":app")
 