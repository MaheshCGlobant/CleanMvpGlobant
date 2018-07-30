package com.globant.cleanmvpsample.di

import com.globant.cleanmvpsample.MainActivity
import dagger.Subcomponent


@Subcomponent(modules = [Presenter2Module::class])
interface Presenter2Component {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun presenterModule(presenter2Module: Presenter2Module): Builder
        fun build(): Presenter2Component
    }
}