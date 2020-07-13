package com.tommy.simpleweather.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.tommy.simpleweather.R
import com.tommy.simpleweather.di.ViewModelProviderFactory
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : Fragment(R.layout.fragment_home), View.OnClickListener {

    private lateinit var navController: NavController
    private lateinit var viewModel: HomeViewModel

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this, providerFactory).get(HomeViewModel::class.java)

        navController = Navigation.findNavController(view)
        humidity_button.setOnClickListener(this)
        visibility_button.setOnClickListener(this)
        uv_index_button.setOnClickListener(this)
        pressure_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.humidity_button -> navController.navigate(R.id.action_from_home_to_humidity)
            R.id.visibility_button -> navController.navigate(R.id.action_from_home_to_visibility)
            R.id.uv_index_button -> navController.navigate(R.id.action_from_home_to_uv_index)
            R.id.pressure_button -> navController.navigate(R.id.action_from_home_to_pressure)
        }
    }
}