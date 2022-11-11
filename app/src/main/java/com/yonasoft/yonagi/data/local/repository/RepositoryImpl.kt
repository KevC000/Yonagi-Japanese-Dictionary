package com.yonasoft.yonagi.data.local.repository

import com.yonasoft.yonagi.data.local.db.word.WordDao
import com.yonasoft.yonagi.data.local.db.word.WordEntity
import com.yonasoft.yonagi.domain.repository.Repository
import com.yonasoft.yonagi.util.parser.WordXMLParser
import kotlinx.coroutines.flow.Flow
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    private val wordXMLParser: WordXMLParser,
    private val wordsDao: WordDao
) : Repository {
    override suspend fun parseWordData(wordInputStream: InputStream): List<WordEntity> {
        return wordXMLParser.parse(wordInputStream)
    }

    override suspend fun insertWords(words: List<WordEntity>) {
        wordsDao.insertWords(words)
    }

    override suspend fun getWords(): Flow<List<WordEntity>> {
        return wordsDao.getWords()
    }

    override suspend fun getWord(id: Long): Flow<WordEntity> {
        return wordsDao.getWord(id)
    }

    override suspend fun searchWords(query: String): Flow<List<WordEntity>> {
        return wordsDao.searchWords(query)
    }

    override suspend fun updateWord(word: WordEntity) {
        wordsDao.updateWord(word)
    }

    override suspend fun isWordDBEmpty(): Boolean {
        return wordsDao.isWordDBEmpty()
    }

}