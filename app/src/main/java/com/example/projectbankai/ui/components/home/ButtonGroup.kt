package com.example.projectbankai.ui.components.home


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projectbankai.R
import com.example.projectbankai.ui.theme.DarkPurple

@Composable
fun ButtonGroup() {
    // State to track the currently selected button
    var selectedButton by remember { mutableIntStateOf(1) } // 1 corresponds to "All Topic" by default

    Column {
        // First row of buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SelectButton(
                onclick = { selectedButton = 1 }, // Set selectedButton to 1
                colors = if (selectedButton == 1)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 1) Color.White else DarkPurple,
                iconColor = if (selectedButton == 1) DarkPurple else Color.White,
                text = "All Topic",
                icon = painterResource(R.drawable.ic_fire)
            )

            SelectButton(
                onclick = { selectedButton = 2 }, // Set selectedButton to 2
                colors = if (selectedButton == 2)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 2) Color.White else DarkPurple,
                iconColor = if (selectedButton == 2) DarkPurple else Color.White,
                text = "Popular",
                icon = painterResource(R.drawable.ic_popular)
            )
        }

        // Second row of buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SelectButton(
                onclick = { selectedButton = 3 }, // Set selectedButton to 3
                colors = if (selectedButton == 3)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 3) Color.White else DarkPurple,
                iconColor = if (selectedButton == 3) DarkPurple else Color.White,
                text = "Newest",
                icon = painterResource(R.drawable.ic_star)
            )

            SelectButton(
                onclick = { selectedButton = 4 }, // Set selectedButton to 4
                colors = if (selectedButton == 4)
                    ButtonDefaults.buttonColors(DarkPurple)
                else
                    ButtonDefaults.buttonColors(Color.White),
                circleColor = if (selectedButton == 4) Color.White else DarkPurple,
                iconColor = if (selectedButton == 4) DarkPurple else Color.White,
                text = "Advance",
                icon = painterResource(R.drawable.ic_advance),
                iconSize = 32.dp
            )
        }
    }
}