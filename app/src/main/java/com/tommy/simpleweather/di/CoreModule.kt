package com.tommy.simpleweather.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {

    @Singleton
    @Provides
    fun getApp(application: Application?): Boolean =
        application == null
}