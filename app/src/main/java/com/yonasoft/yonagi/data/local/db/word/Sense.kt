package com.yonasoft.yonagi.data.local.db.word

data class Sense(
    val stagKanji:String?=null,
    val stagReading:String?=null,
    val related:String,
    val antonym:String,
    val partOfSpeech:String,

)