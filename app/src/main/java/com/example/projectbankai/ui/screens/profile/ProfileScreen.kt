package com.example.projectbankai.ui.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple
import com.example.projectbankai.ui.theme.Skin
import com.example.projectbankai.ui.theme.DarkBlue
import com.example.projectbankai.R
import com.example.projectbankai.ui.components.home.CardGroup
import com.example.projectbankai.ui.components.profile.RecentlyWatchedCards
import com.example.projectbankai.ui.components.profile.StatisticsItem

@Preview(showBackground = true, showSystemUi = true)

@Composable
fun ProfileScreen() {

    LazyColumn(
        modifier = Modifier
            .background(Skin)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(LightPurple),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header Section
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(LightPurple),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_profile_pic), // Replace with your profile image resource
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .background(Color.White) // Border effect
                            .padding(4.dp)
                            .clickable(
                                onClick = {

                                }
                            )
                    )
                }

                // Profile Details Section
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Skin), // Cream background color
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Schrodinger",
                            style = MaterialTheme.typography.headlineMedium,
                            color = DarkBlue
                        )
                        Text(
                            text = "@Schrodinger318",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = {

                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(DarkBlue) // Blue button
                        ) {
                            Text(text = "Edit Profile", color = Color.White)
                        }

                    }
                }

                // Statistics Section
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Skin) // Cream background color
                ) {
                    Column(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Statistics",
                            style = MaterialTheme.typography.headlineMedium,
                            color = DarkBlue,
                            modifier = Modifier
                                .padding(start = 30.dp)
                                .align(Alignment.Start),
                            fontWeight = FontWeight.SemiBold
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            StatisticsItem(label = "Completed", count = 56)
                            StatisticsItem(label = "Ongoing", count = 4)
                            StatisticsItem(label = "WishListed", count = 14)
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Currently Learning",
                            style = MaterialTheme.typography.headlineMedium,
                            color = DarkBlue,
                            modifier = Modifier
                                .padding(start = 30.dp)
                                .align(Alignment.Start),
                            fontWeight = FontWeight.SemiBold
                        )

                        RecentlyWatchedCards()

                    }
                }
            }
        }
    }
}


