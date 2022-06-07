package com.himawanmasyaid.navigationandroid.view

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.himawanmasyaid.navigationandroid.common.BaseFragment
import com.himawanmasyaid.navigationandroid.databinding.FragmentDetailBinding

class DetailFragment: BaseFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            findNavController().navigate(DetailFragmentDirections.actionToSuccessFragment())
//            disablePreviousNavigation()
        }

    }

}