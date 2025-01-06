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
import com.example.projectbankai.ui.screens.home.HomeScreen
import com.example.projectbankai.ui.screens.learn.LearnScreen
import com.example.projectbankai.ui.screens.notifications.NotificationScreen
import com.example.projectbankai.ui.screens.profile.ProfileScreen
import com.example.projectbankai.ui.screens.quickSkills.QuickSkillsScreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBottomAppBar(){

    val navController = rememberNavController()
    val selected = remember{
        mutableStateOf(R.drawable.ic_home)
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.White,
                modifier = Modifier.padding(horizontal = 12.dp)
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
                                modifier = Modifier.size(28.dp),
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
                            selected.value = R.drawable.ic_quick
                            navController.navigate(BottomBarScreen.QuickSkills.screen){
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected.value == R.drawable.ic_quick) LightPurple else Color.Transparent)
                                .padding(horizontal = 10.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_quick),
                                modifier = Modifier.size(28.dp),
                                contentDescription = "QuickSkills",
                                tint = if (selected.value == R.drawable.ic_quick) Color.White else LightPurple
                            )

                        }

                    }
                    Text(
                        text = "Quick",
                        color = if (selected.value == R.drawable.ic_quick) DarkPurple else LightPurple
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
                                popUpTo(0)
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
                                modifier = Modifier.size(28.dp),
                                contentDescription = "Home",
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
                            selected.value = R.drawable.ic_notifications
                            navController.navigate(BottomBarScreen.Notifications.screen){
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (selected.value == R.drawable.ic_notifications) LightPurple else Color.Transparent)
                                .padding(horizontal = 10.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_notifications),
                                modifier = Modifier.size(28.dp),
                                contentDescription = "Home",
                                tint = if (selected.value == R.drawable.ic_notifications) Color.White else LightPurple
                            )

                        }

                    }
                    Text(
                        text = "Notifications",
                        color = if (selected.value == R.drawable.ic_notifications) DarkPurple else LightPurple
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
                                popUpTo(0)
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
                                contentDescription = "Home",
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

            composable(route = BottomBarScreen.QuickSkills.screen){
                QuickSkillsScreen()
            }

            composable(route = BottomBarScreen.Learn.screen){
                LearnScreen()
            }

            composable(route = BottomBarScreen.Notifications.screen){
                NotificationScreen()
            }

            composable(route = BottomBarScreen.Profile.screen){
                ProfileScreen()
            }

        }
    }
}


