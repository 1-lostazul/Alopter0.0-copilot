// Root Gradle build (Kotlin DSL)
// This is a lightweight scaffold. Adjust plugin versions as needed when you add the Gradle wrapper.

plugins {
    // Do not apply plugins here; app module will configure them.
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
