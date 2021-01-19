package com.rinfinity.jetpackdemochat.application.hilt.component

import com.rinfinity.jetpackdemochat.NetworkService
import com.rinfinity.jetpackdemochat.application.hilt.module.JetpackComposeModule
import dagger.Component
import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ApplicationComponent

@Component(modules = [JetpackComposeModule::class])
interface IJetpackComposeApplicationComponent {

    fun getNetworkService(): NetworkService
}