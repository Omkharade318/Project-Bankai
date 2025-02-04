package com.example.projectbankai.ui.components.home.drawer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.projectbankai.domain.model.DrawerNavigationItems

@Composable
fun CustomDrawer(
    selectedNavigationItem: DrawerNavigationItems,
    onNavigationItemClick: (DrawerNavigationItems) -> Unit,
    onCloseClick: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(fraction = 0.6f)
            .padding(horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ){
            IconButton(

                onClick = onCloseClick
            ) { }
        }
    }
}