package com.example.projectbankai.ui.navigation.home.drawer

sealed class DrawerScreens(val route: String) {
    object Home : DrawerScreens("home")
    object Profile : DrawerScreens("profile")
    object Settings : DrawerScreens("settings")
    object Community : DrawerScreens("community")
    object LogOut : DrawerScreens("logout")
}