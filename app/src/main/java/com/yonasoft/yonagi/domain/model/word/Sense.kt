package com.yonasoft.yonagi.domain.model.word

data class Sense(
    val stagKanji:String?=null,
    val stagReading:String?=null,
    val related:String,
    val antonym:String,
    val partOfSpeech:String,

)