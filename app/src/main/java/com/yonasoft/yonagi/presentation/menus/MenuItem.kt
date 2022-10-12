package com.yonasoft.yonagi.presentation.menus

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id:String,
    val title:String,
    val icon: ImageVector,
    val contentDescription:String
    ){
    companion object {
        fun getMenuItems(): List<MenuItem> {
            return listOf(
                MenuItem(
                    id = "Home",
                    title = "Home",
                    icon = Icons.Default.Home,
                    contentDescription = "Go to Home Screen"
                ),
                MenuItem(
                    id = "Search",
                    title = "Search",
                    icon = Icons.Default.Search,
                    contentDescription = "Go to Dictionary Search"
                ),
                MenuItem(
                    id = "Favorites",
                    title = "Favorites",
                    icon = Icons.Default.Favorite,
                    contentDescription = "Go to Favorites"
                ),
                MenuItem(
                    id = "Lists",
                    title = "Lists",
                    icon = Icons.Default.List,
                    contentDescription = "Go to Words Lists"
                )
            )
        }
    }
}

