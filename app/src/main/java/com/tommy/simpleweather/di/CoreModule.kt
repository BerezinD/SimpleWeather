package com.tommy.simpleweather.di

import com.tommy.simpleweather.repo.user.UserRepo
import com.tommy.simpleweather.repo.user.UserRepoImpl
import org.koin.dsl.module

val coreModule = module {
    single<UserRepo> { UserRepoImpl(get()) }
}