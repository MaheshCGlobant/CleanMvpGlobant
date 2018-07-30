package com.globant.cleanmvpsample.di

import com.globant.cleanmvpsample.login.LoginContract
import com.globant.cleanmvpsample.login.LoginPresenter
import dagger.Module
import dagger.Provides

@Module
class Presenter2Module {

    @Provides
    fun provideLoginPresenter(loginPresenter: LoginPresenter): LoginContract.Presenter {
        return loginPresenter
    }
}