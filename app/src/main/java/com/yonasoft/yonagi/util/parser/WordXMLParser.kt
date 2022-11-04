package com.yonasoft.yonagi.util.parser

import com.yonasoft.yonagi.data.local.db.word.entity.WordEntity
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordXMLParser @Inject constructor(): XMLParser<WordEntity> {


    override suspend fun parse(stream: InputStream ): List<WordEntity> {
        val wordData:List<WordEntity> = mutableListOf()

        val factory: XmlPullParserFactory = XmlPullParserFactory.newInstance()
        val parser: XmlPullParser = factory.newPullParser()
        val wordsAsset: InputStream = stream
        parser.setInput(wordsAsset, "UTF-8")

        var eventType:Int = parser.eventType
        //TODO: Parse and add to db
        while(eventType != XmlPullParser.END_DOCUMENT){
            if(eventType == XmlPullParser.START_TAG){

            }
            eventType = parser.next()
        }

        return wordData
    }
}