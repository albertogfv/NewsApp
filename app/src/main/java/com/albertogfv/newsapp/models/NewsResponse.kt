package com.albertogfv.newsapp.models

import com.albertogfv.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)