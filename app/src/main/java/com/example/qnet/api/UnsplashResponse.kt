package com.example.qnet.api

import com.example.qnet.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)