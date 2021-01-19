package com.rinfinity.jetpackdemochat.splash.model

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("title")
    var title: String,
    @SerializedName("desc")
    var desc: String,
    @SerializedName("content")
    val content: String
)