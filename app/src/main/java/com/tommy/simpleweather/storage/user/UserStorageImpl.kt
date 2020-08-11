package com.tommy.simpleweather.storage.user

import com.tommy.simpleweather.models.User
import com.tommy.simpleweather.storage.dao.UserDAO
import com.tommy.simpleweather.storage.mapper.UserFromDb

class UserStorageImpl(
    private val dao: UserDAO
) : UserStorage {
    override fun getUser(id: String): User? {
        return dao.getById(id.toLong())?.let { UserFromDb.map(it) }
    }
}