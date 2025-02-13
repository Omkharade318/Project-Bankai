package com.example.projectbankai.ui.components.home.drawer

import android.util.Log
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
import androidx.navigation.NavController
import com.example.projectbankai.domain.model.DrawerNavigationItems
import com.example.projectbankai.ui.navigation.home.drawer.DrawerScreens
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple
import com.example.projectbankai.ui.theme.ScreenPurple

@Composable
fun NavigationItemView(
    navigationItem: DrawerNavigationItems,
    selected: Boolean,
    onclick:() -> Unit,
    navController: NavController
){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(size = 12.dp))
            .clickable{
                onclick()
                // Then navigate
                try {
                    val route = when (navigationItem) {
                        DrawerNavigationItems.Profile -> DrawerScreens.Profile.route
                        DrawerNavigationItems.Settings -> DrawerScreens.Settings.route
                        DrawerNavigationItems.Community -> DrawerScreens.Community.route
                        DrawerNavigationItems.LogOut -> DrawerScreens.LogOut.route
                    }
                    navController.navigate(route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        popUpTo(DrawerScreens.Home.route) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination
                        launchSingleTop = true
                        // Restore state when re-selecting a previously selected item
                        restoreState = true
                    }
                } catch (e: Exception) {
                    // Handle navigation errors
                    Log.e("Navigation", "Error navigating to ${navigationItem.title}", e)
                }
            }
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