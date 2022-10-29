@file:OptIn(ExperimentalPagerApi::class)

package com.yonasoft.yonagi.presentation.screens.search

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchScreenViewModel @Inject constructor() : ViewModel() {
    val searchTextState: MutableState<String> = mutableStateOf("")
    val tabs: List<String> = listOf("Word", "Kanji")
    val pagerState: MutableState<PagerState> = mutableStateOf(PagerState(0))
}