package com.yonasoft.yonagi.data.local.db.word.entity

data class ReadingElement(
    val reading: String,
    val noKanji: Boolean? = null,
    val information: String,
    val priority: MutableList<String> = mutableListOf()

    )