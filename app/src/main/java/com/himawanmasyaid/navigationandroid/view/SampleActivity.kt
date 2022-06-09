package com.himawanmasyaid.navigationandroid.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.himawanmasyaid.navigationandroid.common.BaseActivity
import com.himawanmasyaid.navigationandroid.common.viewBinding
import com.himawanmasyaid.navigationandroid.databinding.ActivitySampleBinding

class SampleActivity : BaseActivity() {

    private val binding by viewBinding(ActivitySampleBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}