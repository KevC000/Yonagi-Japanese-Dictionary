package com.yonasoft.yonagi.domain.repository

import com.yonasoft.yonagi.domain.model.Word
import kotlinx.coroutines.flow.Flow
import java.io.InputStream

interface Repository {
    suspend fun parseWordData(wordInputStream: InputStream)
    suspend fun getWords(query:String): Flow<List<Word>>
}