import org.gradle.kotlin.dsl.application

plugins {
    application
}

tasks.register("${project.name}Build") {
    group = "application"
    description = "Task for cdktf. Run project: ${project.name}"
    dependsOn("run")
    doLast {
        println("[INFO] gradle run with project: ${project.name}")
    }
}