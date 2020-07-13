package com.tommy.simpleweather.di.home

import androidx.lifecycle.ViewModel
import com.tommy.simpleweather.di.ViewModelKey
import com.tommy.simpleweather.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    public abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel
}