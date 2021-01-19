package com.rinfinity.oauth.viewmodel

import android.app.Application
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rinfinity.oauth.repo.IOAuthRepo

class OAuthViewModel(
    app: Application,
    repo: IOAuthRepo
) : AndroidViewModel(app) {

    private val mRepo = repo


    private val mPhoneNumber = mutableStateOf("")
    val phoneNumber: MutableState<String>
        get() = mPhoneNumber

    class OAuthViewModelFactory(
        private val mApplication: Application,
        private val mRepo: IOAuthRepo
    ) : ViewModelProvider.AndroidViewModelFactory(mApplication) {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (AndroidViewModel::class.java.isAssignableFrom(modelClass)) {
                return when (modelClass) {
                    OAuthViewModel::class.java -> OAuthViewModel(mApplication, mRepo) as T
                    else -> throw Exception("Unable to create Instance of class ${modelClass.canonicalName}")
                }
            }
            return super.create(modelClass)
        }
    }
}