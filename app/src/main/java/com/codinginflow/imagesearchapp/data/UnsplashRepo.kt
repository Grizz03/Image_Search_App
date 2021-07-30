package com.codinginflow.imagesearchapp.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.codinginflow.imagesearchapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

// let dagger inject this from the module
// after repo is created inject the repo into the view model
@Singleton
class UnsplashRepo @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20, // how many items can fit into the RecyclerView
                maxSize = 100, // makes sure not to use to much memory
                enablePlaceholders = false
            ),
            pagingSourceFactory = { UnsplashPagingSource(unsplashApi, query) }
        ).liveData // later observe in fragment..
}