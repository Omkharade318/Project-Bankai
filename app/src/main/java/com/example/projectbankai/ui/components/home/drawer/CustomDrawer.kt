package com.example.projectbankai.ui.components.home.drawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projectbankai.domain.model.DrawerNavigationItems
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.R


@Composable
fun CustomDrawer(
    modifier: Modifier,
    selectedNavigationItem: DrawerNavigationItems,
    onNavigationItemClick: (DrawerNavigationItems) -> Unit,
    navController: NavController,
    onCloseClick: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(fraction = 0.6f)
            .background(Color.White)
            .padding(horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            IconButton(
                onClick = onCloseClick
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Close Drawer",
                    tint = DarkPurple,
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Image(
            modifier = Modifier.size(100.dp),
            painter = painterResource(id = R.drawable.ic_profile_pic),
            contentDescription = "Profile Image"
        )

        Spacer(modifier = Modifier.height(40.dp))

        DrawerNavigationItems.entries.forEach { item ->
            if (item != DrawerNavigationItems.LogOut) {
                NavigationItemView(
                    navigationItem = item,
                    selected = item == selectedNavigationItem,
                    onclick = { onNavigationItemClick(item) }
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        // Logout at the bottom
        NavigationItemView(
            navigationItem = DrawerNavigationItems.LogOut,
            selected = DrawerNavigationItems.LogOut == selectedNavigationItem,
            onclick = { onNavigationItemClick(DrawerNavigationItems.LogOut) }
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}