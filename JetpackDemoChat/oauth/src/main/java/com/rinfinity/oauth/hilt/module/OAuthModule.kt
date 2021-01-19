package com.rinfinity.oauth.hilt.module

import com.rinfinity.oauth.repo.IOAuthRepo
import com.rinfinity.oauth.repo.OAuthRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class OAuthModule {

    @Binds
    abstract fun bindOAuthRepo(repo: OAuthRepoImpl): IOAuthRepo
}