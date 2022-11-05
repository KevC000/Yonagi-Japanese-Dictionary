package com.yonasoft.yonagi.presentation.screens.splash_and_loading.viewmodel

import android.app.Application
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.yonasoft.yonagi.data.local.db.word.entity.WordEntity
import com.yonasoft.yonagi.data.local.repository.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val repository: RepositoryImpl,
    application: Application
) : ViewModel() {

    val loading: MutableState<Boolean> = mutableStateOf(true)
    private var words:List<WordEntity>?=null

    init {
//        viewModelScope.launch(Dispatchers.IO) {
//            if (repository.isWordDBEmpty()) {
//                val wordInputStream: InputStream =
//                    application.applicationContext.assets.open("words.xml")
//                parseWordStream(wordInputStream)
//                repository.insertWords(words!!)
//                loading.value = false
//            } else{
//                loading.value = false
//            }
//
//        }
    loading.value = false
    }

//    private fun parseWordStream(wordInputStream: InputStream) {
//        viewModelScope.launch {
//            words=repository.parseWordData(wordInputStream)
//        }
//    }
}