package com.tommy.simpleweather.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tommy.simpleweather.models.User
import com.tommy.simpleweather.repo.user.UserRepo

class HomeViewModel(
    private val userRepo: UserRepo
) : ViewModel() {

    private val TAG = "HomeViewModel"
    private val user = MutableLiveData<User>()

    init {
        Log.d(TAG, "VIEW MODEL IS ON!")
    }
}