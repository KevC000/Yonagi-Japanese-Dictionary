package com.yonasoft.yonagi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.yonasoft.yonagi.presentation.navigation.Navigation
import com.yonasoft.yonagi.ui.theme.YonagiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navController = rememberNavController()
        Navigation(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YonagiTheme {
        YonagiApp()
    }
}