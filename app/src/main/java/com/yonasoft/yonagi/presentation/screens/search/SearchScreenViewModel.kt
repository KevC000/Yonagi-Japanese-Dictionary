@file:OptIn(ExperimentalPagerApi::class)

package com.yonasoft.yonagi.presentation.screens.search


import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.InputStream
import javax.inject.Inject

@HiltViewModel
class SearchScreenViewModel @Inject constructor(@ApplicationContext private val application: Context) :
    ViewModel() {
    val searchTextState: MutableState<String> = mutableStateOf("")
    val tabs: List<String> = listOf("Word", "Kanji")
    val pagerState: MutableState<PagerState> = mutableStateOf(PagerState(0))

    fun parseAndGetData() {
        viewModelScope.launch {
            val context: Context = application.applicationContext
            val factory: XmlPullParserFactory = XmlPullParserFactory.newInstance()
            val parser: XmlPullParser = factory.newPullParser()
            val wordsAsset: InputStream = context.assets.open("words.xml")
            parser.setInput(wordsAsset, "UTF-8")

            var eventType:Int = parser.eventType

            while(eventType != XmlPullParser.END_DOCUMENT){
                if(eventType == XmlPullParser.START_TAG){

                }
                eventType = parser.next()
            }
        }
    }
}