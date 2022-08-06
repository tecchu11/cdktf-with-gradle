package org.example

import com.hashicorp.cdktf.App

fun main() {
    val app = App()
    MainStack(app, "cdktf-lesson")
    app.synth()
}