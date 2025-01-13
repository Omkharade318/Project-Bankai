package com.example.projectbankai.ui.components.profile



import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectbankai.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RecentlyWatchedCards(){
    LazyRow(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 12.dp)
    ){
        item{
            MyProfileCard(
                id = R.drawable.laptop_lady,
                title = "Bankai 1"
            )

            MyProfileCard(
                id = R.drawable.person,
                title = "Bankai 2"
            )

            MyProfileCard(
                id = R.drawable.temp_working_lady,
                title = "Bankai 3"
            )
        }
    }
}