package org.example

import com.hashicorp.cdktf.App

fun main() {
    val app = App()
    MainStack(app, "localStackContainer")
    app.synth()
}
