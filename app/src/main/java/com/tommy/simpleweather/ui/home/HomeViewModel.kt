package com.tommy.simpleweather.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(): ViewModel() {

    private val TAG = "HomeViewModel"

    init {
        Log.d(TAG, "VIEW MODEL IS ON!")
    }
}