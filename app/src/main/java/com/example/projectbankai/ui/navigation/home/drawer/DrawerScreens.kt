package com.example.projectbankai.ui.navigation.home.drawer

sealed class DrawerScreens(val route: String) {

    @kotlinx.serialization.Serializable
    data object Home : DrawerScreens("home_drawer")

    @kotlinx.serialization.Serializable
    data object Profile : DrawerScreens("profile_drawer")

    @kotlinx.serialization.Serializable
    data object Settings : DrawerScreens("settings_drawer")

    @kotlinx.serialization.Serializable
    data object Community : DrawerScreens("community_drawer")

    @kotlinx.serialization.Serializable
    data object LogOut : DrawerScreens("logout_drawer")
}