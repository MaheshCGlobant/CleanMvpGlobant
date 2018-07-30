package com.globant.cleanmvpsample.login

import android.view.View
import com.globant.cleanmvpsample.BasePresenter
import java.lang.ref.WeakReference
import javax.inject.Inject

class LoginPresenter @Inject constructor(loginRepository: LoginRepository) : LoginContract.Presenter {

    var view: WeakReference<LoginContract.View>? = null

    override fun bindView(view: View) {
        this.view = WeakReference(view as LoginContract.View)
    }

    override fun unbindView() {
        this.view = null
    }

    override fun login(userName: String, password: String) {

    }


}