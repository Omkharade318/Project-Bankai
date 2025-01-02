package com.example.projectbankai.ui.navigation.home

sealed class HomeScreens(val route: String) {
    object Home : HomeScreens("home")
    object QuickSkills : HomeScreens("quickSkills")
    object Learn : HomeScreens("learn")
    object Notifications : HomeScreens("notifications")
    object Profile : HomeScreens("profile")
}