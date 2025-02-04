package com.example.projectbankai.ui.components.common

sealed class BottomBarScreen(val screen: String){
    data object Home: BottomBarScreen("home")
    data object DailyChallenge: BottomBarScreen("DailyChallenge")
    data object Learn: BottomBarScreen("learn")
    data object Profile: BottomBarScreen("profile")
}