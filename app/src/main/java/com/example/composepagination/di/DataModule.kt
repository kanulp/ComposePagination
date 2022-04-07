package com.example.composepagination.di

import com.example.composepagination.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl("https://api.instantwebtools.net/").addConverterFactory(GsonConverterFactory.create()).build().create(ApiService::class.java)
    }
}