package com.example.projectbankai.ui.components.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple
import com.example.projectbankai.R
import com.example.projectbankai.ui.screens.daily_challenges.DailyChallengeScreen
import com.example.projectbankai.ui.screens.home.HomeScreen
import com.example.projectbankai.ui.screens.learn.LearnScreen
import com.example.projectbankai.ui.screens.profile.ProfileScreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBottomAppBar(){

    val navController = rememberNavController()
    val selected = remember{
        mutableStateOf(R.drawable.ic_home)
    }

    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = {

            BottomAppBar(
                containerColor = Color.Transparent,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .clip(RoundedCornerShape(16.dp)),

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                IconButton(
                    onClick = {
                        selected.value = R.drawable.ic_home
                        navController.navigate(BottomBarScreen.Home.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (selected.value == R.drawable.ic_home) LightPurple else Color.Transparent)
                            .padding(horizontal = 10.dp, vertical = 8.dp)
                    ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_home),
                                modifier = Modifier.size(32.dp),
                                contentDescription = "Home",
                                tint = if (selected.value == R.drawable.ic_home) Color.White else LightPurple
                            )

                        }

                    }
                    Text(
                        text = "Home",
                        color = if (selected.value == R.drawable.ic_home) DarkPurple else LightPurple
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    IconButton(
                        onClick = {
                            selected.value = R.drawable.ic_daily_challenge
                            navController.navigate(BottomBarScreen.DailyChallenge.screen){
                                navController.popBackStack()
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected.value == R.drawable.ic_daily_challenge) LightPurple else Color.Transparent)
                                .padding(horizontal = 10.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_daily_challenge),
                                modifier = Modifier.size(32.dp),
                                contentDescription = "QuickSkills",
                                tint = if (selected.value == R.drawable.ic_daily_challenge) Color.White else LightPurple
                            )

                        }

                    }
                    Text(
                        text = "Daily",
                        color = if (selected.value == R.drawable.ic_daily_challenge) DarkPurple else LightPurple
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    IconButton(
                        onClick = {
                            selected.value = R.drawable.ic_learn
                            navController.navigate(BottomBarScreen.Learn.screen){
                               navController.popBackStack()
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected.value == R.drawable.ic_learn) LightPurple else Color.Transparent)
                                .padding(horizontal = 10.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_learn),
                                modifier = Modifier.size(32.dp),
                                contentDescription = "learn",
                                tint = if (selected.value == R.drawable.ic_learn) Color.White else LightPurple
                            )

                        }

                    }
                    Text(
                        text = "Bankai",
                        color = if (selected.value == R.drawable.ic_learn) DarkPurple else LightPurple
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    IconButton(
                        onClick = {
                            selected.value = R.drawable.ic_profile
                            navController.navigate(BottomBarScreen.Profile.screen){
                                navController.popBackStack()
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected.value == R.drawable.ic_profile) LightPurple else Color.Transparent)
                                .padding(horizontal = 10.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_profile),
                                modifier = Modifier.size(28.dp),
                                contentDescription = "Profile",
                                tint = if (selected.value == R.drawable.ic_profile) Color.White else LightPurple
                            )
                        }
                    }
                    Text(
                        text = "Profile",
                        color = if (selected.value == R.drawable.ic_profile) DarkPurple else LightPurple
                    )
                }
            }
        }
    ) {
        paddingValues->
        NavHost(
            navController = navController,
            startDestination = BottomBarScreen.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ){

            composable(route = BottomBarScreen.Home.screen){
                HomeScreen()
            }

            composable(route = BottomBarScreen.DailyChallenge.screen){
                DailyChallengeScreen()
            }

            composable(route = BottomBarScreen.Learn.screen){
                LearnScreen()
            }

            composable(route = BottomBarScreen.Profile.screen){
                ProfileScreen()
            }

        }
    }
}


