package com.globant.cleanmvpsample.di

import android.content.Context
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    fun providesContext(context: Context):Context{
        return context;
    }
}