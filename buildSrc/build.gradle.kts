plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    val kotlin = "1.8.0"
    val ktlint = "11.0.0"

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:$ktlint")
}
