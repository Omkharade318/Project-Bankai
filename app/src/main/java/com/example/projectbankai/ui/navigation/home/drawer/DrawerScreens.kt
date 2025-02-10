package com.example.projectbankai.ui.navigation.home.drawer

sealed class DrawerScreens(val route: String) {
    @kotlinx.serialization.Serializable
    object Home : DrawerScreens("home_drawer")

    @kotlinx.serialization.Serializable
    object Profile : DrawerScreens("profile_drawer")

    @kotlinx.serialization.Serializable
    object Settings : DrawerScreens("settings_drawer")

    @kotlinx.serialization.Serializable
    object Community : DrawerScreens("community_drawer")

    @kotlinx.serialization.Serializable
    object LogOut : DrawerScreens("logout_drawer")
}