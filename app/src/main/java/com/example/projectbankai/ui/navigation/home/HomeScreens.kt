package com.example.projectbankai.ui.navigation.home

sealed class HomeScreens(val route: String) {
    object Home : HomeScreens("home")
    object QuickLearn : HomeScreens("quickLearn")
}