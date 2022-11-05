package com.yonasoft.yonagi.presentation.menus

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yonasoft.yonagi.presentation.screens.splash_and_loading.LogoSplashScreen

@Composable
fun DrawerMenu(menuItems: List<MenuItem> = MenuItem.getMenuItems(), navController:NavController){
    DrawerHeader()
    DrawerBody(
        menuItems = menuItems,
        onItemClick = {
            navController.navigate(it.id)
        })
}

@Composable
fun DrawerHeader(
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.35f)
            .background(Color.White)
            ,
        contentAlignment = Alignment.Center
    ) {
        LogoSplashScreen()
    }
}

@Composable
fun DrawerBody(
    menuItems: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem) -> Unit
) {

        LazyColumn(modifier) {
            items(menuItems) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onItemClick(item) }
                        .padding(16.dp)
                ) {
                    if (item.icon != null) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.contentDescription,
                        )
                    } else {
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = item.resource!!),
                            contentDescription = item.contentDescription,
                            contentScale = ContentScale.Fit
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = item.title,
                        style = itemTextStyle,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

}