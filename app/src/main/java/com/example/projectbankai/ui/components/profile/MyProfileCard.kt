package com.example.projectbankai.ui.components.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MyProfileCard(
    modifier: Modifier = Modifier,
    id : Int,
    title: String
){
    Column(
        modifier = modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Card {
            Image(
                painter = painterResource(id = id),
                contentDescription = title,
                modifier = modifier
                    .size(width = 120.dp, height = 200.dp)
            )
        }

        Text(text = title)
    }
}