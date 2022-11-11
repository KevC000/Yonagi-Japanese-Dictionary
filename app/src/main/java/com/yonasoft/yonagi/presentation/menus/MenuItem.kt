package com.yonasoft.yonagi.presentation.menus

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.yonasoft.yonagi.R
import com.yonasoft.yonagi.presentation.navigation.Screen

data class MenuItem(
    val id: String,
    val title: String,
    val icon: ImageVector?,
    val resource: Int? = null,
    val contentDescription: String
) {
    companion object {
        @Composable
        fun getMenuItems(): List<MenuItem> {
            return listOf(
                MenuItem(
                    id = Screen.HomeScreen.route,
                    title = "Home",
                    icon = Icons.Default.Home,
                    contentDescription = "Go to Home Screen"
                ),
                MenuItem(
                    id = Screen.SearchScreen.route,
                    title = "Search",
                    icon = Icons.Default.Search,
                    contentDescription = "Go to Dictionary Search"
                ),
                MenuItem(
                    id = Screen.ListsScreen.route,
                    title = "Lists",
                    icon = Icons.Default.List,
                    contentDescription = "Go to Words Lists"
                ),
                MenuItem(
                    id = Screen.FavoriteScreen.route,
                    title = "Favorites",
                    icon = Icons.Default.Favorite,
                    contentDescription = "Go to Favorites"
                ),
            )
        }
    }
}

