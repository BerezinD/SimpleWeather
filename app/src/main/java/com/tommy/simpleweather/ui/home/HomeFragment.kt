package com.tommy.simpleweather.ui.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.tommy.simpleweather.R

class HomeFragment: Fragment(R.layout.fragment_home), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.humidity_button).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.humidity_button -> navController.navigate(R.id.action_from_home_to_humidity)
        }
    }
}