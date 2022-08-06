package org.example

import com.hashicorp.cdktf.TerraformStack
import com.hashicorp.cdktf.providers.docker.Container
import com.hashicorp.cdktf.providers.docker.ContainerPorts
import com.hashicorp.cdktf.providers.docker.DockerProvider
import com.hashicorp.cdktf.providers.docker.Image
import software.constructs.Construct

class MainStack(scope: Construct, id: String) : TerraformStack(scope, id) {
    init {
        // using docker provider
        DockerProvider.Builder
            .create(this, "docker")
            .build()

        // resource docker image
        val nginxImage = Image.Builder
            .create(this, "nginxImage")
            .name("nginx:latest")
            .keepLocally(false)
            .build()

        // resource container image
        Container.Builder
            .create(this, "nginxContainer")
            .image(nginxImage.latest)
            .name("lesson")
            .ports(
                listOf(
                    ContainerPorts.builder()
                        .internal(80)
                        .external(8000)
                        .build()
                )
            )
            .build()
    }
}