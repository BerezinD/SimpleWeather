package com.tommy.simpleweather.repo.user

import com.tommy.simpleweather.models.User

interface UserRepo {
    fun getUser(id: String): User?
}