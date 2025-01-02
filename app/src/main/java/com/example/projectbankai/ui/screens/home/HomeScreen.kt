package com.example.projectbankai.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projectbankai.ui.components.home.CircularImageButton
import com.example.projectbankai.ui.theme.ScreenPurple
import com.example.projectbankai.R
import com.example.projectbankai.ui.components.common.BottomMenu
import com.example.projectbankai.ui.components.common.BottomMenuContent
import com.example.projectbankai.ui.components.home.ButtonGroup
import com.example.projectbankai.ui.components.home.CardGroup
import com.example.projectbankai.ui.navigation.home.HomeScreens


@Composable
fun HomeScreen(navController: NavController){


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenPurple)
    ) {
        LazyColumn {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(start = 16.dp, top = 32.dp, end = 16.dp, bottom = 16.dp)
                        .align(Alignment.TopCenter),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column {

                        Text(
                            text = "Hello,",
                            color = Color.Gray,
                            fontSize = 24.sp,
                            modifier = Modifier
                                .padding(top = 12.dp)
                        )
                        Text(
                            text = "Schrodinger",
                            color = Color.Black,
                            fontSize = 28.sp
                        )
                    }

                    CircularImageButton(
                        imageId = R.drawable.ic_profile_pic,
                        onClick = {

                        },
                        modifier = Modifier
                            .padding(end = 16.dp, top = 8.dp)
                    )

                }

                OutlinedTextField(
                    value = "",
                    onValueChange = {

                    },
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 24.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        unfocusedBorderColor = Color.White,
                    ),
                    placeholder = {
                        Text(
                            text = "Search",
                            color = Color.Gray
                        )
                    },

                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = "Search",
                            tint = Color.Gray,
                            modifier = Modifier
                                .padding(end = 20.dp)
                                .size(28.dp)
                        )
                    },

                    shape = RoundedCornerShape(12.dp)
                )

                Text(
                    text = "Bankai",
                    color = Color.Black,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 16.dp)
                )

                ButtonGroup()

                CardGroup()


            }

        }

        Scaffold(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(color = Color.Transparent)
                .padding(bottom = 16.dp)
                .height(84.dp),
            containerColor = Color.Transparent,
            bottomBar = {
                BottomMenu(
                    items = listOf(
                        BottomMenuContent(
                            title = "Home",
                            iconId = R.drawable.ic_home,
                            onClick = {
                                navController.navigate(HomeScreens.Home.route)
                                navController.popBackStack()
                            }
                        ),
                        BottomMenuContent(
                            title = "Quick",
                            iconId = R.drawable.ic_quick,
                            onClick = {
                                navController.navigate(HomeScreens.QuickSkills.route)
                                navController.popBackStack()
                            }
                        ),
                        BottomMenuContent(
                            title = "Bankai",
                            iconId = R.drawable.ic_learn,
                            onClick = {
                                navController.navigate(HomeScreens.Learn.route)
                                navController.popBackStack()
                            }
                        ),
                        BottomMenuContent(
                            title = "Notifications",
                            iconId = R.drawable.ic_notifications,
                            onClick = {
                                navController.navigate(HomeScreens.Notifications.route)
                                navController.popBackStack()
                            }
                        ),
                        BottomMenuContent(
                            title = "Profile",
                            iconId = R.drawable.ic_profile,
                            onClick = {
                                navController.navigate(HomeScreens.Profile.route)
                                navController.popBackStack()
                            }
                        )
                    ),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .height(84.dp)
                )
            }
        ) {
            it
        }
    }
}
