package com.yonasoft.yonagi.util.parser

import com.yonasoft.yonagi.domain.model.Word
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordXMLParser @Inject constructor(): XMLParser<Word> {
    private val wordData:MutableList<Word> = mutableListOf()

    override suspend fun parse(stream: InputStream ): List<Word> {

        val factory: XmlPullParserFactory = XmlPullParserFactory.newInstance()
        val parser: XmlPullParser = factory.newPullParser()
        val wordsAsset: InputStream = stream
        parser.setInput(wordsAsset, "UTF-8")

        var eventType:Int = parser.eventType

        while(eventType != XmlPullParser.END_DOCUMENT){
            if(eventType == XmlPullParser.START_TAG){

            }
            eventType = parser.next()
        }


        return wordData
    }
}