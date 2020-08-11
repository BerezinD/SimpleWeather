package com.tommy.simpleweather.storage.user

import com.tommy.simpleweather.models.User

interface UserStorage {
    fun getUser(id: String): User?
}