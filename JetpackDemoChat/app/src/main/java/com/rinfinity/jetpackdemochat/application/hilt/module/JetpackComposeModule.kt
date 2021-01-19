package com.rinfinity.jetpackdemochat.application.hilt.module

import com.rinfinity.jetpackdemochat.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "http://192.168.0.5:8081"
@InstallIn(ApplicationComponent::class)
@Module
class JetpackComposeModule {

    companion object {
        @Provides
        fun provideNetworkService(): NetworkService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NetworkService::class.java)
        }
    }


}