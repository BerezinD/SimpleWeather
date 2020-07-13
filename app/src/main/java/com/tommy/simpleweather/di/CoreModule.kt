package com.tommy.simpleweather.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class CoreModule {

    @Provides
    fun getApp(application: Application?): Boolean =
        application == null
}