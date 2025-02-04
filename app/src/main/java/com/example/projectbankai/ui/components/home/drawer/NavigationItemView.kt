package com.example.projectbankai.ui.components.home.drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectbankai.domain.model.DrawerNavigationItems
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple
import com.example.projectbankai.ui.theme.ScreenPurple

@Composable
fun NavigationItemView(
    navigationItem: DrawerNavigationItems,
    selected: Boolean,
    onclick: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(size = 12.dp))
            .clickable{ onclick() }
            .background(
                color = if (selected) ScreenPurple else Color.White,
                shape = RoundedCornerShape(size = 12.dp)
            )
            .padding(vertical = 12.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = navigationItem.icon),
            contentDescription = navigationItem.title,
            tint = if (selected) DarkPurple else LightPurple
        )

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = navigationItem.title,
            color = if (selected) DarkPurple else LightPurple,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
            fontSize = 16.sp
        )
    }
}