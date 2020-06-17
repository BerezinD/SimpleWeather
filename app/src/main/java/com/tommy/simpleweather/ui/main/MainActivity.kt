package com.tommy.simpleweather.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.tommy.simpleweather.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        AppBarConfiguration(topLevelDestinationIds = setOf(R.id.navigation_home, R.id.navigation_statistics))

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}
