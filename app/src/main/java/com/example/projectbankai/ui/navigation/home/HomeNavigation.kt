package com.example.projectbankai.ui.navigation.home

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){

        composable(route = HomeScreens.Home.route){
            HomeScreen()
        }
    }
}