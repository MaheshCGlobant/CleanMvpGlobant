package com.globant.cleanmvpsample

import android.view.View
import java.lang.ref.WeakReference

abstract class BasePresenter<T> {

    protected var t: WeakReference<T>?=null

    fun bindView(t: T) {
        this.t = WeakReference(t)
    }

    fun unbindView() {
        t = null
    }

}