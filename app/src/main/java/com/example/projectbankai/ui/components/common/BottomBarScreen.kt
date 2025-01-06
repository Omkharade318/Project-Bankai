package com.example.projectbankai.ui.components.common

sealed class BottomBarScreen(val screen: String){
    data object Home: BottomBarScreen("home")
    data object QuickSkills: BottomBarScreen("quickSkills")
    data object Learn: BottomBarScreen("learn")
    data object Notifications: BottomBarScreen("notification")
    data object Profile: BottomBarScreen("profile")
}