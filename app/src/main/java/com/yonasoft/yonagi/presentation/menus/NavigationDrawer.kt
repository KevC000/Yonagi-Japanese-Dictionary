package com.yonasoft.yonagi.presentation.menus

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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yonasoft.yonagi.ui.theme.Red3


@Composable
fun DrawerHeader(
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Red3)
            .padding(42.dp)
            ,
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Yonagi", fontSize = 36.sp, color = Color.White)
    }
}

@Composable
fun DrawerBody(
    menuItems: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem) -> Unit
) {
    LazyColumn(modifier){
        items(menuItems) { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { item }
                    .padding(16.dp)
            ){
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.contentDescription
                )
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