package com.albertogfv.newsapp.models

import com.albertogfv.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)