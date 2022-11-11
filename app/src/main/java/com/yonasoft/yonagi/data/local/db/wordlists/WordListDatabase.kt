package com.yonasoft.yonagi.data.local.db.wordlists

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yonasoft.yonagi.data.local.db.word.WordDao
import com.yonasoft.yonagi.data.local.db.word.WordsConverter

//@Database(
//    entities = [WordListEntity::class],
//    version = 1,
//    exportSchema = true
//)
//
//abstract class WordDatabase: RoomDatabase() {
//    abstract val dao: WordDao
//}