package com.himawanmasyaid.navigationandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.himawanmasyaid.navigationandroid.common.viewBinding
import com.himawanmasyaid.navigationandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        navController = findNavController(R.id.navHost)
        binding.toolbarMain.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            val id = destination.id

            val hideToolbar = arrayOf(R.id.splashFragment, R.id.successFragment, R.id.homeFragment)

            binding.toolbarMain.isGone =
                when (id) {
                    in hideToolbar -> true
                    else -> false
                }

        }

    }
}