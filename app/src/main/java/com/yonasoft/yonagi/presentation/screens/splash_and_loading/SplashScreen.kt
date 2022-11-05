package com.yonasoft.yonagi.presentation.screens.splash_and_loading

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.yonasoft.yonagi.R
import com.yonasoft.yonagi.presentation.navigation.Screen
import com.yonasoft.yonagi.presentation.screens.splash_and_loading.viewmodel.SplashViewModel
import com.yonasoft.yonagi.ui.theme.Red2
import kotlinx.coroutines.delay

//TODO: Splash and loading screen
@Composable
fun SplashScreen(
    navController: NavController,
    splashViewModel: SplashViewModel = hiltViewModel()
) {
    val loading = splashViewModel.loading

    Surface(
        modifier =
        Modifier.fillMaxSize()
    ) {
        if (loading.value) {
            GetDataLoadScreen()
        } else {
            LogoSplashScreen()
            LaunchedEffect(key1 = true) {
                delay(2250L)
                navController.navigate(Screen.HomeScreen.route)
            }

        }
    }
}

@Preview
@Composable
 fun LogoSplashScreen(modifier: Modifier = Modifier) {
    Image(modifier = modifier, painter = painterResource(id = R.drawable.logo), contentDescription = "Splash Logo")
}


@Composable
fun GetDataLoadScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator(
            color = Red2,
            strokeWidth = 16.dp,
            modifier = Modifier.fillMaxSize(0.3f)
        )
        Text(
            text = "Loading Data",
            color = Red2,
            fontSize = 48.sp
            )

    }
}

