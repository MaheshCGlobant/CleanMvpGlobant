package com.globant.cleanmvpsample

import android.app.Activity
import android.app.ActivityManager
import android.content.Context

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.globant.cleanmvpsample.di.Presenter2Module
import com.globant.cleanmvpsample.login.LoginContract
import com.globant.cleanmvpsample.login.LoginPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity(),LoginContract.View {

    @Inject
    lateinit var loginPresenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.getApplicationComponent()
                ?.getPresenterComponent()
                ?.presenterModule(Presenter2Module())
                ?.build()
                ?.inject(this@MainActivity);

        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        loginPresenter.login("mahesh","mahesh")
    }

    override fun onStop() {
        super.onStop()
    }

}
