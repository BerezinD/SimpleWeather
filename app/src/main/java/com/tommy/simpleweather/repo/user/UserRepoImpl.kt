package com.tommy.simpleweather.repo.user

import com.tommy.simpleweather.models.User
import com.tommy.simpleweather.storage.user.UserStorage

class UserRepoImpl(
    private val userStorage: UserStorage
) : UserRepo {
    override fun getUser(id: String): User? {
        return userStorage.getUser(id)
    }
}