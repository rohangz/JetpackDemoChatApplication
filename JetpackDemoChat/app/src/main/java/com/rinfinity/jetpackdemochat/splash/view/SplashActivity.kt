package com.rinfinity.jetpackdemochat.splash.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.rinfinity.jetpackdemochat.application.JetpackComposeChatApplication
import com.rinfinity.jetpackdemochat.splash.composable.SplashComposable
import com.rinfinity.oauth.view.OAuthActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

const val TAG = "SplashActivity"
class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashComposable()
        }
    }

    override fun onResume() {
        super.onResume()
        Intent(this, OAuthActivity::class.java).apply {
            startActivity(this)
            finish()
        }
    }
}