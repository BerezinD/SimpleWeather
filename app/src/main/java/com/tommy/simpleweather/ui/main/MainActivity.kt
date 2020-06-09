package com.tommy.simpleweather.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.tommy.simpleweather.R
import com.tommy.simpleweather.ui.home.HomeFragment
import com.tommy.simpleweather.ui.statistics.StatisticsFragment

class MainActivity : AppCompatActivity() {

    private var fragmentHome : HomeFragment = HomeFragment()
    private var fragmentStatistics : StatisticsFragment = StatisticsFragment()

    // TODO: change logic of the fragments replacement
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.nav_host_fragment, fragmentHome)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_statistics -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.nav_host_fragment, fragmentStatistics)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_refresh -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        AppBarConfiguration(topLevelDestinationIds = setOf(R.id.navigation_home, R.id.navigation_statistics))

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}
