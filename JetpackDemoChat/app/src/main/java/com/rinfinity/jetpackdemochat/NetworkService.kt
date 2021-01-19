package com.rinfinity.jetpackdemochat

import com.rinfinity.jetpackdemochat.splash.model.Article
import retrofit2.Response
import retrofit2.http.GET

interface NetworkService {

    @GET("/articles")
    suspend fun getArticles(): Response<ArrayList<Article>>
}