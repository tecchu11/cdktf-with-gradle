plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    val kotlin = "1.7.10"

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin")
}