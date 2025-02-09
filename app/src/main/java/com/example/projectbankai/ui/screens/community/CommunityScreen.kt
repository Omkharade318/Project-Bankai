package com.example.projectbankai.ui.screens.community

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.projectbankai.ui.theme.LightPurple

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CommunityScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightPurple),
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = "Coming Soon...",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp
        )
    }
}