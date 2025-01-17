package com.example.projectbankai.ui.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectbankai.R
import com.example.projectbankai.ui.components.home.SelectButton
import com.example.projectbankai.ui.theme.DarkPurple

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonRow(modifier: Modifier = Modifier) {

    var selectedButton by remember { mutableIntStateOf(1) }

    LazyRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {

        item{

            SelectButton(
                onclick = { selectedButton = 1 },
                colors = if (selectedButton == 1)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 1) Color.White else DarkPurple,
                iconColor = if (selectedButton == 1) DarkPurple else Color.White,
                text = "All Topic",
                icon = painterResource(R.drawable.ic_fire),
                width = 140.dp,
                size = 30.dp,
                iconSize = 30.dp
            )

            SelectButton(
                onclick = { selectedButton = 2 },
                colors = if (selectedButton == 2)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 2) Color.White else DarkPurple,
                iconColor = if (selectedButton == 2) DarkPurple else Color.White,
                text = "Quick",
                icon = painterResource(R.drawable.ic_quick),
                width = 140.dp,
                size = 30.dp,
                iconSize = 30.dp
            )

            SelectButton(
                onclick = { selectedButton = 3 },
                colors = if (selectedButton == 3)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 3) Color.White else DarkPurple,
                iconColor = if (selectedButton == 3) DarkPurple else Color.White,
                text = "Completed",
                icon = painterResource(R.drawable.ic_fire),
                width = 155.dp,
                size = 30.dp,
                iconSize = 30.dp
            )
        }

    }
}