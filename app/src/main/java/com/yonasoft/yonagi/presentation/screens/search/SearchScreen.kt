package com.yonasoft.yonagi.presentation.screens.search

import android.content.Context
import android.content.res.AssetManager
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.yonasoft.yonagi.presentation.appbars.SearchScreenAppBar
import com.yonasoft.yonagi.presentation.screens.search.tabs.SearchScreenContent
import kotlinx.coroutines.CoroutineScope
import java.io.InputStream

@ExperimentalPagerApi
@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: SearchScreenViewModel = hiltViewModel()
) {

    val searchTextState by viewModel.searchTextState
    val pagerState by viewModel.pagerState
    val tabs = viewModel.tabs
    val scope: CoroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            SearchScreenAppBar(
                text = searchTextState,
                onCloseClicked = {
                    viewModel.searchTextState.value=""
                },

                onTextChange = {
                    viewModel.searchTextState.value=it
                },
                navController = navController,
                onSearchClicked = {},
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                SearchScreenContent(tabs = tabs, pagerState = pagerState, scope = scope)
            }
        }
    }
}



