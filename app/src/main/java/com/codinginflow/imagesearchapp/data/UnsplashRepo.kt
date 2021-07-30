package com.codinginflow.imagesearchapp.data

import com.codinginflow.imagesearchapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

// let dagger inject this from the module
// after repo is created inject the repo into the view model
@Singleton
class UnsplashRepo @Inject constructor(private val unsplashApi: UnsplashApi) {
}