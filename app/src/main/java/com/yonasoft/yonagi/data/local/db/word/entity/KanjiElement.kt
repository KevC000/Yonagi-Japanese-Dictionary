package com.yonasoft.yonagi.data.local.db.word.entity

data class KanjiElement(
val kanjiReading:String,
val information:String,
val priority: MutableList<String> = mutableListOf()
)