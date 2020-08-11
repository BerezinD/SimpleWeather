package com.tommy.simpleweather.di

import com.tommy.simpleweather.storage.database.UsersDatabase
import com.tommy.simpleweather.storage.user.UserStorage
import com.tommy.simpleweather.storage.user.UserStorageImpl
import org.koin.dsl.module

val storageModule = module {
    single { get<UsersDatabase>().getUserDao() }
    single<UserStorage> { UserStorageImpl(get()) }
}