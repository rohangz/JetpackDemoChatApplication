package com.rinfinity.jetpackdemochat.application

import android.app.Application
import com.rinfinity.jetpackdemochat.NetworkService
import com.rinfinity.jetpackdemochat.application.hilt.component.DaggerIJetpackComposeApplicationComponent
import dagger.hilt.android.HiltAndroidApp

private lateinit var mApplicationInstance: JetpackComposeChatApplication

@HiltAndroidApp
class JetpackComposeChatApplication : Application() {

    companion object {
        val TAG = JetpackComposeChatApplication::class.java.simpleName
        val Instance: JetpackComposeChatApplication
            get() = mApplicationInstance
    }

    private val mComponent = DaggerIJetpackComposeApplicationComponent.create()

    private lateinit var mNetworkService: NetworkService
    val networkService: NetworkService
        get() = mNetworkService

    override fun onCreate() {
        super.onCreate()
        mApplicationInstance = this
        mNetworkService = mComponent.getNetworkService()
    }
}