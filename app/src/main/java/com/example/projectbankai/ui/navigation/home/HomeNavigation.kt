package com.example.projectbankai.ui.navigation.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.projectbankai.ui.screens.daily_challenges.DailyChallengeScreen
import com.example.projectbankai.ui.screens.home.HomeScreen
import com.example.projectbankai.ui.screens.learn.LearnScreen
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
            DailyChallengeScreen()
        }

        composable(route = HomeScreens.Profile.route){
            ProfileScreen()
        }

    }
}