package com.himawanmasyaid.navigationandroid.view

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.himawanmasyaid.navigationandroid.common.BaseFragment
import com.himawanmasyaid.navigationandroid.databinding.FragmentSplashBinding
import kotlinx.coroutines.*

class SplashFragment: BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        GlobalScope.launch {
            delay(3000)
            withContext(Dispatchers.Main) {

                findNavController().navigate(SplashFragmentDirections.actionToHomeFragment())
//                disablePreviousNavigation()

            }
        }

    }

}