package com.tommy.simpleweather.storage.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tommy.simpleweather.storage.CityDB
import com.tommy.simpleweather.storage.CityForecast
import com.tommy.simpleweather.storage.ForecastDB
import com.tommy.simpleweather.storage.UserCity
import com.tommy.simpleweather.storage.UserDB
import com.tommy.simpleweather.storage.dao.UserDAO
import com.tommy.simpleweather.storage.database.UsersDatabase.Companion.DB_VERSION

@Database(
    entities = [UserDB::class, UserCity::class, CityDB::class, CityForecast::class, ForecastDB::class],
    version = DB_VERSION,
    exportSchema = true
)
abstract class UsersDatabase : RoomDatabase() {

    companion object {
        const val DB_FILE_NAME = "users.db"
        const val DB_VERSION = 2
    }

    abstract fun getUserDao(): UserDAO
}