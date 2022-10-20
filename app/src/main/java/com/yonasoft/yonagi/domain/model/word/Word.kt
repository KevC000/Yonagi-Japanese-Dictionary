package com.yonasoft.yonagi.domain.model.word

import com.yonasoft.yonagi.domain.model.word.KanjiElement
import com.yonasoft.yonagi.domain.model.word.ReadingElement

data class Word(
    val id: Long,
    val kanjiElements:MutableList<KanjiElement> = mutableListOf(),
    val readingElements:MutableList<ReadingElement> = mutableListOf(),
    val sense: Sense

)
