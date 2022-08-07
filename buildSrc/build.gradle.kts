plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    val kotlin = "1.7.10"
    val ktlint = "10.3.0"

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:$ktlint")
}
