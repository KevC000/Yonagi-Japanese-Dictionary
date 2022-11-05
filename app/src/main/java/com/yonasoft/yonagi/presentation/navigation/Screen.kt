package com.yonasoft.yonagi.presentation.navigation

sealed class Screen(val route:String){
    object SplashScreen: Screen("splash_screen")
    object HomeScreen: Screen("home_screen")
    object SearchScreen: Screen("search_screen")
    object ListsScreen: Screen("lists_screen")
    object FavoriteScreen: Screen("favorite_screen")
    object KanaScreen: Screen("kana_screen")

}
