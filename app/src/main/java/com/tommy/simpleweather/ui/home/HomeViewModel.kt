package com.tommy.simpleweather.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tommy.simpleweather.models.User

class HomeViewModel constructor(): ViewModel() {

    private val TAG = "HomeViewModel"
    private val user = MutableLiveData<User>()

    init {
        Log.d(TAG, "VIEW MODEL IS ON!")
    }
}