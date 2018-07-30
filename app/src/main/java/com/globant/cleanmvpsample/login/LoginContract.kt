package com.globant.cleanmvpsample.login

import com.globant.cleanmvpsample.BasePresenter

class LoginContract {

    interface View {

    }

    interface Presenter : BasePresenter {

        fun login(userName: String, password: String)

    }
}