package com.yonasoft.yonagi.data.local.db.word

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [WordEntity::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(WordsConverter::class)
abstract class WordDatabase:RoomDatabase() {
    abstract val dao:WordDao

}