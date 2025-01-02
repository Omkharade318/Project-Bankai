package com.example.projectbankai.ui.navigation.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectbankai.ui.screens.home.HomeScreen
import com.example.projectbankai.ui.navigation.home.HomeScreens
import com.example.projectbankai.ui.screens.authentication.auth.LogIn
import com.example.projectbankai.ui.screens.authentication.auth.Register
import com.example.projectbankai.ui.screens.authentication.start.StartUI
import com.example.projectbankai.ui.screens.learn.LearnScreen
import com.example.projectbankai.ui.screens.notifications.NotificationScreen
import com.example.projectbankai.ui.screens.profile.ProfileScreen
import com.example.projectbankai.ui.screens.quickSkills.QuickSkillsScreen

@Composable
fun AuthNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "start") {

        composable(route = AuthScreens.Start.route) {
            StartUI(navController = navController)
        }

        composable(route = AuthScreens.Login.route) {
            LogIn(navController = navController)
        }

        composable(route = AuthScreens.Register.route){
            Register(navController = navController)
        }

        composable(route = HomeScreens.Home.route) {
            HomeScreen(navController = navController)
        }


    }
}