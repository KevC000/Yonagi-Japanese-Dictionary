package com.yonasoft.yonagi.data.local.db.word.entity

data class Word(
    val id: Long,
    val kanjiElements:MutableList<KanjiElement> = mutableListOf(),
    val readingElements:MutableList<ReadingElement> = mutableListOf(),
    val sense: Sense

)
