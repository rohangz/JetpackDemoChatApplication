package com.rinfinity.oauth.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import androidx.lifecycle.ViewModelProvider
import com.rinfinity.oauth.composables.EnterPhoneNumberComposable
import com.rinfinity.oauth.hilt.component.DaggerIOAuthComponent
import com.rinfinity.oauth.viewmodel.OAuthViewModel

class OAuthActivity : AppCompatActivity() {

    private lateinit var mViewModel: OAuthViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        setContent {
            EnterPhoneNumberComposable(
                phoneNumber = mViewModel.phoneNumber.value,
                onPhoneNumberChange = {
                    mViewModel.phoneNumber.value = it
                },
                onNextClick = {

                })
        }
    }


    private fun initViewModel() {
        val repo = DaggerIOAuthComponent.create().getOAuthRepo()
        mViewModel = ViewModelProvider(
            this,
            OAuthViewModel.OAuthViewModelFactory(application, repo)
        ).get(OAuthViewModel::class.java)
    }
}