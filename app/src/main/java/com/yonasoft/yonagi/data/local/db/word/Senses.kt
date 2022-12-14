package com.yonasoft.yonagi.data.local.db.word

data class Senses(
    val related:List<String> = mutableListOf(),
    val antonym:List<String>,
    val pos:String,
    val field:String,
    val source:String,
    val dialect:String,
    val gloss:String,
    val examples:List<String> = mutableListOf(),
    val favorites:Boolean = false
)
