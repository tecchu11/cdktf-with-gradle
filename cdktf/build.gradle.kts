plugins {
    id("cdktf.kotlin-jvm-convention")
    id("cdktf.deployment-convention")
}

group = "org.example"
version = "0.1"

dependencies {
    implementation("com.hashicorp:cdktf:0.12.0")
    implementation("software.constructs:constructs:10.1.69")
    implementation("com.hashicorp:cdktf-provider-docker:2.0.14")

    testImplementation(kotlin("test"))
}

application {
    mainClass.set("org.example.MainKt")
}
