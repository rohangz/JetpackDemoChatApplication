package com.rinfinity.oauth.repo

interface IOAuthRepo {

    suspend fun doSignUp()

    suspend fun doLogin()
}