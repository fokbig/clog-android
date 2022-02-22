package com.wetio.logc.model.login

import org.json.JSONObject


class UserForm(private val username: String, private val password: String) {
    fun toJSONObject(): JSONObject {
        val jsonObject = JSONObject()
        jsonObject.put("username", username)
        jsonObject.put("password", password)
        return jsonObject
    }
}


