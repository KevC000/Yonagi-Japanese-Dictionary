package com.yonasoft.yonagi.presentation.screens.splash_and_loading.viewmodel

import android.app.Application
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yonasoft.yonagi.data.local.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.InputStream
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val repository: RepositoryImpl,
    application: Application
) : ViewModel() {

    val loading: MutableState<Boolean> = mutableStateOf(true)

    init {
        viewModelScope.launch(Dispatchers.IO) {
            if (repository.isWordDBEmpty()) {
                val wordInputStream: InputStream =
                    application.applicationContext.assets.open("words.xml")
                parseWordStream(wordInputStream)
                loading.value = false
            } else{
                loading.value = false
            }
        }
    }

    private fun parseWordStream(wordInputStream: InputStream) {
        viewModelScope.launch {
            repository.parseWordData(wordInputStream)
        }
    }
}