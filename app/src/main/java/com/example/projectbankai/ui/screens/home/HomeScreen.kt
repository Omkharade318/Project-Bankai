package com.example.projectbankai.ui.screens.home


import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.Spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.projectbankai.ui.components.home.CircularImageButton
import com.example.projectbankai.ui.theme.ScreenPurple
import com.example.projectbankai.R
import com.example.projectbankai.domain.model.CustomDrawerState
import com.example.projectbankai.domain.model.DrawerNavigationItems
import com.example.projectbankai.domain.model.isOpened
import com.example.projectbankai.domain.model.opposite
import com.example.projectbankai.ui.components.home.ButtonGroup
import com.example.projectbankai.ui.components.home.CardGroup
import com.example.projectbankai.ui.components.home.drawer.CustomDrawer
import com.example.projectbankai.ui.screens.community.CommunityScreen
import com.example.projectbankai.ui.screens.home.edit_profile.EditProfileScreen
import kotlin.math.roundToInt



@Composable
fun HomeScreen(navController: NavController) {

    val navController = rememberNavController()

    var drawerState by remember { mutableStateOf(CustomDrawerState.CLOSED) }
    var selectedNavigationItem by remember { mutableStateOf(DrawerNavigationItems.LogOut) }

    val configuration = LocalConfiguration.current
    val density = LocalDensity.current.density

    val screenWidth = remember {
        derivedStateOf { (configuration.screenWidthDp * density).roundToInt() }
    }
    val offsetValue by remember { derivedStateOf { (screenWidth.value / 4.5).dp } }

    val animatedDrawerOffset by animateDpAsState(
        targetValue = if (drawerState.isOpened()) 0.dp else (-offsetValue),
        label = "Drawer Offset",
        animationSpec = spring(
            dampingRatio = 0.8f,
            stiffness = Spring.StiffnessLow
        )
    )

    val animatedContentOffset by animateDpAsState(
        targetValue = if (drawerState.isOpened()) offsetValue else 0.dp,
        label = "Content Offset",
        animationSpec = spring(
            dampingRatio = 0.8f,
            stiffness = Spring.StiffnessLow
        )
    )

    val animatedScale by animateFloatAsState(
        targetValue = if (drawerState.isOpened()) 0.9f else 1f,
        label = "Animated Scale",
        animationSpec = spring(
            dampingRatio = 0.8f,
            stiffness = Spring.StiffnessLow
        )
    )

    var showEditProfileScreen by remember { mutableStateOf(false) }
    var showCommunityScreen by remember { mutableStateOf(false) }

    if (showEditProfileScreen) EditProfileScreen()
    if (showCommunityScreen) CommunityScreen()

    BackHandler(enabled = drawerState.isOpened()) {
        drawerState = CustomDrawerState.CLOSED
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenPurple)
    ) {

        CustomDrawer(
            modifier = Modifier.offset(x = animatedDrawerOffset),
            selectedNavigationItem = selectedNavigationItem,
            onNavigationItemClick = { item ->
                selectedNavigationItem = DrawerNavigationItems.LogOut
                drawerState = CustomDrawerState.CLOSED
            },
            onCloseClick = { drawerState = CustomDrawerState.CLOSED },
            navController = navController
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .offset(x = animatedContentOffset)
                .scale(animatedScale)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(ScreenPurple)
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(start = 16.dp, top = 32.dp, end = 16.dp, bottom = 16.dp)
                            .align(Alignment.TopCenter),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Column {

                            Text(
                                text = "Hello,",
                                color = Color.Gray,
                                fontSize = 24.sp,
                                modifier = Modifier
                                    .padding(top = 12.dp)
                            )
                            Text(
                                text = "Schrodinger",
                                color = Color.Black,
                                fontSize = 28.sp
                            )
                        }

                        CircularImageButton(
                            imageId = R.drawable.ic_profile_pic,
                            onClick = {
                                drawerState = drawerState.opposite()
                            },
                            modifier = Modifier
                                .padding(end = 16.dp, top = 8.dp)
                        )

                    }

                    OutlinedTextField(
                        value = "",
                        onValueChange = {

                        },
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 24.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            unfocusedBorderColor = Color.White,
                        ),
                        placeholder = {
                            Text(
                                text = "Search",
                                color = Color.Gray
                            )
                        },

                        trailingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Search",
                                tint = Color.Gray,
                                modifier = Modifier
                                    .padding(end = 20.dp)
                                    .size(28.dp)
                            )
                        },

                        shape = RoundedCornerShape(12.dp)
                    )

                    Text(
                        text = "Bankai",
                        color = Color.Black,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(start = 16.dp)
                    )

                    ButtonGroup()

                    CardGroup()


                }

            }
        }
    }
}
