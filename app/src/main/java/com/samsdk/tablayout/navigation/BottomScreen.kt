package com.samsdk.tablayout.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home: BottomScreen("Home","Home",Icons.Filled.Home)
    object Favorite: BottomScreen("Favorite","Favorite",Icons.Filled.Favorite)
    object Search: BottomScreen("Search","Search",Icons.Filled.Search)
    object Setting :BottomScreen("Setting","Setting",Icons.Filled.Settings)
    object User : BottomScreen("User","User",Icons.Filled.Person)
}

val bottomNavigationItems = listOf(
    BottomScreen.Home,
    BottomScreen.Favorite,
    BottomScreen.Search,
    BottomScreen.User,
    BottomScreen.Setting
)