package com.globant.cleanmvpsample

import android.view.View
import java.lang.ref.WeakReference

interface BasePresenter {

    fun bindView(view: View)
    fun unbindView()
}