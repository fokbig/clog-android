package com.wetio.logc.activity

import android.os.Bundle
import com.wetio.logc.AppActivity
import com.wetio.logc.databinding.ActivityLoginBinding

class LoginActivity : AppActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fullScreen()
    }
}