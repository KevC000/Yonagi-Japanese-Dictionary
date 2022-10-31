package com.yonasoft.yonagi.presentation.screens.loading_data.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yonasoft.yonagi.data.local.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.InputStream
import javax.inject.Inject

@HiltViewModel
class LoadingDataViewModel @Inject constructor(
    private val repository: RepositoryImpl,
    application: Application
) : ViewModel() {

    init {
        val wordInputStream: InputStream = application.applicationContext.assets.open("words.xml")
        parseWordStream(wordInputStream)
    }

    private fun parseWordStream(wordInputStream: InputStream) {
        viewModelScope.launch {
            repository.parseWordData(wordInputStream)
        }
    }
}