package com.example.projectbankai.ui.navigation.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectbankai.ui.screens.home.HomeScreen
import com.example.projectbankai.ui.screens.learn.LearnScreen
import com.example.projectbankai.ui.screens.notifications.NotificationScreen
import com.example.projectbankai.ui.screens.profile.ProfileScreen
import com.example.projectbankai.ui.screens.quickSkills.QuickSkillsScreen

@Composable
fun HomeNavigation(navController: NavHostController){

    NavHost(navController = navController, startDestination = "home"){

        composable(route = HomeScreens.Home.route){
            HomeScreen()
        }

        composable(route = HomeScreens.QuickSkills.route){
            QuickSkillsScreen()
        }

        composable(route = HomeScreens.Learn.route){
            LearnScreen()
        }

        composable(route = HomeScreens.Notifications.route){
            NotificationScreen()
        }

        composable(route = HomeScreens.Profile.route){
            ProfileScreen()
        }

    }
}