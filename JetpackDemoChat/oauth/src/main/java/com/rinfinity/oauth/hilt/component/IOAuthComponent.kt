package com.rinfinity.oauth.hilt.component

import com.rinfinity.oauth.hilt.module.OAuthModule
import com.rinfinity.oauth.repo.IOAuthRepo
import dagger.Component

@Component(modules = [OAuthModule::class])
interface IOAuthComponent  {

    fun getOAuthRepo(): IOAuthRepo
}