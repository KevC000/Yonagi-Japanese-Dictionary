package com.yonasoft.yonagi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.yonasoft.yonagi.presentation.screens.favorites.FavoritesScreen
import com.yonasoft.yonagi.presentation.screens.home.HomeScreen
import com.yonasoft.yonagi.presentation.screens.kana.KanaScreen
import com.yonasoft.yonagi.presentation.screens.lists.ListsScreen
import com.yonasoft.yonagi.presentation.screens.search.SearchScreen
import com.yonasoft.yonagi.presentation.screens.splash_and_loading.SplashScreen

@ExperimentalPagerApi
@Composable
fun Navigation(navController:NavHostController) {

    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){

        composable(route = Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screen.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.SearchScreen.route){
            SearchScreen(navController = navController)
        }
        composable(route = Screen.ListsScreen.route){
            ListsScreen(navController = navController)
        }
        composable(route = Screen.FavoriteScreen.route){
            FavoritesScreen(navController = navController)
        }
        composable(route = Screen.KanaScreen.route){
            KanaScreen(navController = navController)
        }
    }
}