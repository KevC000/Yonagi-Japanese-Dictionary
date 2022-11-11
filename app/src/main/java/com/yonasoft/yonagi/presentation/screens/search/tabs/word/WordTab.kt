package com.yonasoft.yonagi.presentation.screens.search.tabs.word

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yonasoft.yonagi.ui.theme.Red1

@Composable
fun WordTab(

) {
    Column(
        modifier = Modifier
            .fillMaxSize()

        ,
    ) {

        LazyColumn{
            //TODO: Word List. Flow list gets collected to viewmodel and added to state
        }
    }
}