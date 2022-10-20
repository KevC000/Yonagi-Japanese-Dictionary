package com.yonasoft.yonagi.domain.model.word

data class KanjiElement(
val kanjiReading:String,
val information:String,
val priority: MutableList<String> = mutableListOf()
)