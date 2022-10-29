package com.yonasoft.yonagi.presentation.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.yonasoft.yonagi.presentation.appbars.HomeScreenAppBar
import com.yonasoft.yonagi.presentation.menus.DrawerBody
import com.yonasoft.yonagi.presentation.menus.DrawerHeader
import com.yonasoft.yonagi.presentation.menus.MenuItem
import com.yonasoft.yonagi.presentation.navigation.Screen
import com.yonasoft.yonagi.ui.theme.Red1
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            HomeScreenAppBar(onNavigationIconClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            })
        },
        drawerContent = {
            DrawerHeader()
            DrawerBody(
                menuItems = MenuItem.getMenuItems(),
                onItemClick = {
                    navController.navigate(it.id)
                })
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(Screen.SearchScreen.route)
                }, backgroundColor = Red1
            ) {
                Icon(Icons.Filled.Search, "To search screen")
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

        }
        }
    }
}