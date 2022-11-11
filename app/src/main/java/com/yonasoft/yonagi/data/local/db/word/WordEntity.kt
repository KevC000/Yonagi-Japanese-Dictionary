package com.yonasoft.yonagi.data.local.db.word

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wordentity")
data class WordEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Long? = null,
    @ColumnInfo(name = "kanji")
    val kanjiElements: List<String> = mutableListOf(),
    @ColumnInfo(name = "readings")
    val readingElements: List<String> = mutableListOf(),
    @ColumnInfo(name = "romaji")
    val romajis: List<String> = mutableListOf(),
    @ColumnInfo(name = "glossary")
    val glossary: List<String> = mutableListOf(),
    @ColumnInfo(name = "senses")
    val Senses: List<Senses> = mutableListOf(),
    @ColumnInfo(name = "is_favorite")
    val isFavorite: Boolean = false
)