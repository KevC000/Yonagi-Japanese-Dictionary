package com.yonasoft.yonagi.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yonasoft.yonagi.presentation.appbars.HomeScreenAppBar
import com.yonasoft.yonagi.presentation.menus.DrawerBody
import com.yonasoft.yonagi.presentation.menus.DrawerHeader
import com.yonasoft.yonagi.presentation.menus.MenuItem
import com.yonasoft.yonagi.presentation.navigation.Screen
import com.yonasoft.yonagi.ui.theme.Red1
import com.yonasoft.yonagi.ui.theme.Red2
import com.yonasoft.yonagi.ui.theme.Red3
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
                },
                modifier = Modifier.fillMaxSize().background(color = Red3)
                )
        },
        floatingActionButton = {
            HomeFAB(navController = navController) {
                navController.navigate(Screen.SearchScreen.route)
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

        }
    }
}

@Composable
private fun HomeFAB(navController: NavController, onClick: () -> Unit) {
    FloatingActionButton(
        onClick = {
            onClick()
        }, backgroundColor = Red1,
        shape = RoundedCornerShape(48.dp)
    ) {
        Icon(Icons.Filled.Search, "To search screen")
    }
}