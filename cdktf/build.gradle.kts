plugins {
    id("cdktf.kotlin-jvm-convention")
    id("cdktf.deployment-convention")
}

group = "org.example"
version = "0.1"

dependencies {
    implementation(libs.bundles.cdktf.docker)

    testImplementation(kotlin("test"))
}

application {
    mainClass.set("org.example.MainKt")
}
