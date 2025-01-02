package com.example.projectbankai.ui.components.home


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.projectbankai.R

@Composable
fun CardGroup(){
    LazyRow(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 100.dp)
    ) {
        item {
            SelectCard(
                imageId = R.drawable.temp_working_lady,
                title = "Bankai 1",
                description = "Description of Bankai 1",
                onClick = {

                },
                iconTitle1 = "Easy",
                iconTitle2 = "30 min"
            )

            SelectCard(
                imageId = R.drawable.person,
                title = "Bankai 2",
                description = "Description of Bankai 2",
                onClick = {

                },
                iconTitle1 = "Easy",
                iconTitle2 = "45 min"
            )

            SelectCard(
                imageId = R.drawable.laptop_lady,
                title = "Bankai 3",
                description = "Description of Bankai 3",
                onClick = {

                },
                iconTitle1 = "Medium",
                iconTitle2 = "45 min"
            )

            SelectCard(
                imageId = R.drawable.person,
                title = "Bankai 4",
                description = "Description of Bankai 4",
                onClick = {

                },
                iconTitle1 = "Easy",
                iconTitle2 = "45 mins"
            )

            SelectCard(
                imageId = R.drawable.temp_working_lady,
                title = "Bankai 5",
                description = "Description of Bankai 5",
                onClick = {

                },
                iconTitle1 = "Hard",
                iconTitle2 = "20 mins"
            )

        }
    }
}