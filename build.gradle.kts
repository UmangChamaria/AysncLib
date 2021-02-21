// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${ProjectConfig.kotlinVersion}")
        // publishing plugin
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.14.2")
        // documentation plugin
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.4.20")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}