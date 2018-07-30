package com.globant.cleanmvpsample.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule {
    companion object {
        val BASE_URL = "http://www.google.com"
    }

    @Provides
    @Singleton
    fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder().build()
    }

    @Provides
    @Singleton
    fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl(NetModule.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient).build()
    }

}