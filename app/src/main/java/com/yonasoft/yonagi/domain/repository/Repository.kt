package com.yonasoft.yonagi.domain.repository

import com.yonasoft.yonagi.data.local.db.word.WordEntity
import kotlinx.coroutines.flow.Flow
import java.io.InputStream

interface Repository {
    suspend fun parseWordData(wordInputStream: InputStream):List<WordEntity>
    suspend fun insertWords(words:List<WordEntity>)
    suspend fun getWords(): Flow<List<WordEntity>>
    suspend fun getWord(id:Long): Flow<WordEntity>
    suspend fun searchWords(query:String): Flow<List<WordEntity>>
    suspend fun updateWord(word: WordEntity)
    suspend fun isWordDBEmpty():Boolean
}