package com.example.projectbankai.domain.model
import com.example.projectbankai.R

enum class DrawerNavigationItems(
    val title: String,
    val icon: Int
) {
    Settings(
        title = "Settings",
        icon = R.drawable.ic_settings
    ),
    Profile(
        title = "Profile",
        icon = R.drawable.ic_profile
    ),
    Community(
        title = "Community",
        icon = R.drawable.ic_community
    ),
}