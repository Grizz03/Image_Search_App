package com.codinginflow.imagesearchapp.api

import com.codinginflow.imagesearchapp.data.UnsplashPhoto

data class UnsplashedResponse(
    val results: List<UnsplashPhoto>
)