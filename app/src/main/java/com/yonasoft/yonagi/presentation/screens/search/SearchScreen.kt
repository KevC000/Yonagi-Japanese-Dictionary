package com.yonasoft.yonagi.presentation.screens.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.yonasoft.yonagi.presentation.appbars.SearchScreenAppBar
import com.yonasoft.yonagi.presentation.screens.search.tabs.SearchScreenTabLayout

@ExperimentalPagerApi
@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: SearchScreenViewModel = hiltViewModel()
) {

    val searchTextState by viewModel.searchTextState

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            SearchScreenAppBar(
                text = searchTextState,
                onCloseClicked = {
                    viewModel.updateSearchTextState(newValue = "")
                },

                onTextChange = {
                    viewModel.updateSearchTextState(newValue = it)
                },
                navController = navController,
                onSearchTriggered = {},
                onSearchClicked = {},
            )
        }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier =
                Modifier.fillMaxSize()
            ) {
                SearchScreenTabLayout()
            }

        }
    }
}

