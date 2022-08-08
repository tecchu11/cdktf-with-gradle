package org.example

import com.hashicorp.cdktf.TerraformStack
import com.hashicorp.cdktf.providers.docker.Container
import com.hashicorp.cdktf.providers.docker.ContainerPorts
import com.hashicorp.cdktf.providers.docker.DockerProvider
import com.hashicorp.cdktf.providers.docker.Image
import software.constructs.Construct

class MainStack(scope: Construct, id: String) : TerraformStack(scope, id) {
    companion object {
        private const val LOCALSTACK_VERSION = "1.0.3"
    }
    init {
        // using docker provider
        DockerProvider.Builder
            .create(this, "docker")
            .build()

        // resource docker image
        val localstackImage = Image.Builder
            .create(this, "localstackImage")
            .name("localstack/localstack:$LOCALSTACK_VERSION")
            .keepLocally(false)
            .build()

        // resource container image
        Container.Builder
            .create(this, "localstackContainer")
            .image(localstackImage.latest)
            .name("lesson")
            .ports(
                listOf(
                    ContainerPorts.builder()
                        .internal(4566)
                        .external(4566)
                        .build()
                )
            )
            .build()
    }
}
