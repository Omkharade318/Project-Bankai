package com.example.projectbankai.ui.navigation.home.drawer

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectbankai.ui.navigation.auth.AuthScreens
import com.example.projectbankai.ui.screens.authentication.auth.LogIn
import com.example.projectbankai.ui.screens.community.CommunityScreen
import com.example.projectbankai.ui.screens.home.EditProfileScreen
import com.example.projectbankai.ui.screens.home.HomeScreen

@Composable
fun DrawerNavigation(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = DrawerScreens.Home.route) {

        composable(DrawerScreens.Home.route) {
            HomeScreen(navController = navController)
            DrawerNavigation()
        }

        composable(DrawerScreens.Profile.route) {
            EditProfileScreen()
        }

        composable(DrawerScreens.Community.route) {
            CommunityScreen()
        }

        composable("settings") {

        }

        composable(AuthScreens.Login.route) {
            LogIn(navController = navController)
        }
    }
}