package com.yonasoft.yonagi.presentation.screens.search.tabs.kanji

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yonasoft.yonagi.ui.theme.Red1

@Composable
fun KanjiTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
        ) {
        Text(text = "kanji")
    }
}