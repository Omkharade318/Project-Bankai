package com.example.projectbankai.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple
import com.example.projectbankai.R

@Composable
fun SelectCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    imageId: Int,
    onClick: () -> Unit,
    iconId1: Int = R.drawable.ic_difficulty,
    iconTitle1: String,
    iconId2: Int = R.drawable.ic_time,
    iconTitle2: String
) {
    Card(
        modifier = modifier
            .padding(16.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = RoundedCornerShape(24.dp),
        onClick = onClick
    ){
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = imageId),
                contentDescription = title,
                modifier = Modifier
                    .size(width = 220.dp, height = 220.dp)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.FillBounds
            )

            Text(
                text = title,
                color = DarkPurple,
                fontSize = 18.sp,
                modifier = modifier
                    .align(Alignment.Start)
            )

            Text(
                text = description,
                color = Color.Gray,
                fontSize = 14.sp,
                modifier = modifier
                    .align(Alignment.Start)
            )

            Row (
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment =  Alignment.CenterVertically
            ){
                Box(
                    modifier = modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .size(35.dp)
                        .background(LightPurple),
                    contentAlignment = Alignment.Center
                ){
                    Icon(
                        painter = painterResource(iconId1),
                        contentDescription = iconTitle1,
                        tint = Color.White,
                        modifier = modifier
                            .size(25.dp)
                    )
                }

                Text(
                    text = iconTitle1,
                    color = LightPurple,
                    fontSize = 14.sp
                )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                Spacer(modifier = modifier.width(24.dp))

                Box(
                    modifier = modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .size(35.dp)
                        .background(LightPurple),
                    contentAlignment = Alignment.Center
                ){
                    Icon(
                        painter = painterResource(iconId2),
                        contentDescription = iconTitle2,
                        tint = Color.White,
                        modifier = modifier
                            .size(25.dp)
                    )
                }

                Text(
                    text = iconTitle2,
                    color = LightPurple,
                    fontSize = 14.sp
                )

            }
        }
    }
}