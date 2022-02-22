package com.wetio.logc.activity

import android.os.Bundle
import com.google.gson.Gson
import com.wetio.logc.AppActivity
import com.wetio.logc.R
import com.wetio.logc.databinding.ActivityLoginBinding
import com.wetio.logc.model.user.UserForm
import com.wetio.logc.model.user.UserJWT
import com.wetio.logc.util.HttpUtil

class LoginActivity : AppActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.fullScreen()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.setListener()
    }

    private fun setListener() {
        binding.loginButton?.setOnClickListener {
            val username = binding.username?.text
            val password = binding.password?.text
            val message = "username = $username and password = $password"

            val thread = Thread {
                this.netLogin("$username", "$password")
            }
            thread.start()
            println(message)
        }
    }

    private fun netLogin(username: String, password: String) {
        val form = UserForm(username, password)
        val requestBody = gson.toJson(form)
        val url = this.resources.getString(R.string.login_url)
        val body = HttpUtil().post(url, requestBody)
        val userJWT = gson.fromJson(body, UserJWT::class.java)
        println("登陆响应数据: $body")
    }
}