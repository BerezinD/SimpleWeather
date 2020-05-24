package com.tommy.simpleweather.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.tommy.simpleweather.R
import com.tommy.simpleweather.ui.home.HomeFragment
import com.tommy.simpleweather.ui.statistics.StatisticsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var fragmentHome : HomeFragment = HomeFragment()
    private var fragmentStatistics : StatisticsFragment = StatisticsFragment()

    // TODO: change logic of the fragments replacement
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container, fragmentHome)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_statistics -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container, fragmentStatistics)
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

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
