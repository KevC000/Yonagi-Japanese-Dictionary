@file:OptIn(ExperimentalPagerApi::class)

package com.yonasoft.yonagi.presentation.screens.search


import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.yonasoft.yonagi.data.local.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchScreenViewModel @Inject constructor(
    private val repository: RepositoryImpl
) : ViewModel() {
    val searchTextState: MutableState<String> = mutableStateOf("")
    val tabs: List<String> = listOf("Word", "Kanji")
    val pagerState: MutableState<PagerState> = mutableStateOf(PagerState(0))

    //TODO: Work on search ViewModel

    fun parseAndGetData() {
        viewModelScope.launch {
            Log.d("app test", "$")
        }
    }
}