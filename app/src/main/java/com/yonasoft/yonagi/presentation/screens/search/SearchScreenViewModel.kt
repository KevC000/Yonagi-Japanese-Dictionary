package com.yonasoft.yonagi.presentation.screens.search

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchScreenViewModel @Inject constructor(): ViewModel() {
    private val _searchTextState: MutableState<String> =
        mutableStateOf("")
    val searchTextState: State<String> = _searchTextState


    fun updateSearchTextState(newValue: String) {
        _searchTextState.value = newValue
    }
}