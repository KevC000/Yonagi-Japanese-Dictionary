package com.yonasoft.yonagi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.yonasoft.yonagi.presentation.AppBar
import com.yonasoft.yonagi.presentation.menus.DrawerBody
import com.yonasoft.yonagi.presentation.menus.DrawerHeader
import com.yonasoft.yonagi.presentation.menus.MenuItem
import com.yonasoft.yonagi.ui.theme.YonagiTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YonagiTheme {
                YonagiApp()
            }
        }
    }
}

@Composable
fun YonagiApp() {
    val scaffoldState =  rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBar(onNavigationIconClick = {
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
                    println("Clicked on ${it.title}")
                })
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YonagiTheme {
        YonagiApp()
    }
}