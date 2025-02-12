package com.example.projectbankai.domain.model

import com.example.projectbankai.R

enum class DrawerNavigationItems(
    val title: String,
    val icon: Int
) {

    Profile(
        title = "Edit Profile",
        icon = R.drawable.ic_profile,
    ),
    Settings(
        title = "Settings",
        icon = R.drawable.ic_settings
    ),
    Community(
        title = "Community",
        icon = R.drawable.ic_community
    ),
    LogOut(
        title = "Log Out",
        icon = R.drawable.ic_logout
    )
}