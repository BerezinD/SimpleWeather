package com.tommy.simpleweather.di

import com.tommy.simpleweather.di.home.HomeViewModelsModule
import com.tommy.simpleweather.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [HomeViewModelsModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity
}