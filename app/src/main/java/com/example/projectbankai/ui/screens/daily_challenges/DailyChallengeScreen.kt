package com.example.projectbankai.ui.screens.daily_challenges

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.projectbankai.ui.theme.LightPurple

@Composable
fun DailyChallengeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightPurple),
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = "Daily Challenge Screen"
        )
    }
}