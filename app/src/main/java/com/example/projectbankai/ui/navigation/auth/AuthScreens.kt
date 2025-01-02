package com.example.projectbankai.ui.navigation.auth

sealed class AuthScreens(
    val route: String
){
    object Start: AuthScreens("Start")
    object Login: AuthScreens("login")
    object Register: AuthScreens("register")
}
