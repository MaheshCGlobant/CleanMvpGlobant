package com.globant.cleanmvpsample.di

import android.app.Application
import com.globant.cleanmvpsample.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetModule::class])
interface ApplicationComponent {

    fun inject(myApplication: MyApplication)

    fun getPresenterComponent(): Presenter2Component.Builder
}