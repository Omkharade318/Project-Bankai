package com.example.projectbankai.ui.navigation.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectbankai.ui.screens.authentication.auth.LogIn
import com.example.projectbankai.ui.screens.authentication.auth.Register
import com.example.projectbankai.ui.screens.authentication.start.StartUI

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


    }
}