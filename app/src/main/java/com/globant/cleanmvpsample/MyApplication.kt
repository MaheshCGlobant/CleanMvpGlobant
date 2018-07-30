package com.globant.cleanmvpsample

import android.app.Application
import android.util.Log
import com.globant.cleanmvpsample.di.ApplicationComponent
import com.globant.cleanmvpsample.di.ApplicationModule
import com.globant.cleanmvpsample.di.DaggerApplicationComponent
import retrofit2.Retrofit
import javax.inject.Inject

class MyApplication : Application() {

    @Inject
    lateinit var retrofit: Retrofit


    override fun onCreate() {
        super.onCreate()
        getApplicationComponent()?.inject(this)

        Log.v("MyApplication", retrofit.toString())
    }

    companion object {
        private var applicationComponent: ApplicationComponent? = null
        fun getApplicationComponent(): ApplicationComponent? {
            if (applicationComponent == null) {
                applicationComponent = DaggerApplicationComponent.builder().applicationModule(ApplicationModule()).build()
            }
            return applicationComponent
        }
    }


}

