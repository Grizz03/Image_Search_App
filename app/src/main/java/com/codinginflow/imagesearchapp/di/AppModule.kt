package com.codinginflow.imagesearchapp.di

import com.codinginflow.imagesearchapp.api.UnsplashApi
import com.codinginflow.imagesearchapp.api.UnsplashApi.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module // turns into a dagger module
@InstallIn(ApplicationComponent::class) // class is autogenerated by dagger
object AppModule {

    @Provides  // turns into a dagger object
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideUnsplashApi(retrofit: Retrofit): UnsplashApi =
        retrofit.create(UnsplashApi::class.java)
}