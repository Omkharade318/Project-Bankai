package com.example.projectbankai.ui.screens.learn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple
import com.example.projectbankai.R
import com.example.projectbankai.ui.components.common.ButtonRow

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LearnScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightPurple),
    ) {
        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(start = 8.dp, top = 32.dp, end = 16.dp, bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = {

                    },
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                        contentDescription = "Back",
                        tint = DarkPurple,
                        modifier = Modifier
                            .size(36.dp)
                    )
                }

                Text(
                    text = "Bankai",
                    color = DarkPurple,
                    fontSize = 32.sp
                )

                IconButton(
                    onClick = {

                    },
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_search),
                        contentDescription = "Back",
                        tint = DarkPurple,
                        modifier = Modifier
                            .size(28.dp)
                    )

                }
            }

            LazyColumn {
                item {
                    ButtonRow()
                        Card(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            shape = RoundedCornerShape(24.dp),
                            colors = CardDefaults.cardColors(Color.White)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column{
                                    
                                    Text(
                                        text = "Find a bankai\n" +
                                                "you want to\n" +
                                                "get!",
                                        color = DarkPurple,
                                        fontSize = 20.sp
                                    )

                                    Button(
                                        onClick = {

                                        },
                                        shape = RoundedCornerShape(24.dp),
                                        colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                                            containerColor = DarkPurple,
                                            contentColor = Color.White
                                        ),
                                        modifier = Modifier.padding(top = 12.dp)
                                    ) {
                                        Text(
                                            text = "Check Now",
                                            fontSize = 16.sp,
                                        )
                                    }
                                }

                                Image(
                                    painter = painterResource(R.drawable.laptop_guy),
                                    contentDescription = "guy with laptop",
                                    alignment = Alignment.CenterEnd
                                )
                        }

                    }
                }
            }
        }
    }
}
