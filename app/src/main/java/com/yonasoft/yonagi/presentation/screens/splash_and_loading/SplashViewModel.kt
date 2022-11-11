package com.yonasoft.yonagi.presentation.screens.splash_and_loading

import android.app.Application
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yonasoft.yonagi.data.local.db.word.WordEntity
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

    val loading: MutableState<Boolean> = mutableStateOf(false)
    private var words:List<WordEntity>?=null

    init {
        viewModelScope.launch(Dispatchers.IO) {

//            if (repository.isWordDBEmpty()) {
//                loading.value = true
//                val wordInputStream: InputStream =
//                    application.applicationContext.assets.open("words.xml")
//                parseWordStream(wordInputStream)
//                repository.insertWords(words!!)
//            }
//            loading.value = false

        }
    }

    private fun parseWordStream(wordInputStream: InputStream) {
        viewModelScope.launch {
            words=repository.parseWordData(wordInputStream)
        }
    }
}