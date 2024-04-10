package com.example.assetally.ui.theme.logic

class Auth {
    fun login(username: String, password: String): Boolean {
        return username == "admin" && password == "admin"
    }
}