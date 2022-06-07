package com.himawanmasyaid.navigationandroid.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment <VBinding: ViewBinding>(val inflate: CustomInflate<VBinding>): Fragment() {

    lateinit var binding: VBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    fun disablePreviousNavigation() {

        // This callback will only be called when MyFragment is at least Started.
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true /* enabled by default */) {
                override fun handleOnBackPressed() {
                    // Handle the back button event
                }
            }

        requireActivity().onBackPressedDispatcher.addCallback(callback)
    }

}

private typealias CustomInflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T
