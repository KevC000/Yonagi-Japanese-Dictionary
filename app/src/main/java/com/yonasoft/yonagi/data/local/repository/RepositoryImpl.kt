package com.yonasoft.yonagi.data.local.repository

import com.yonasoft.yonagi.domain.model.Word
import com.yonasoft.yonagi.domain.repository.Repository
import com.yonasoft.yonagi.util.parser.XMLParser
import kotlinx.coroutines.flow.Flow
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    private val wordXMLParser: XMLParser<Word>
):Repository {
    override suspend fun parseWordData(wordInputStream: InputStream) {
        wordXMLParser.parse(wordInputStream)
    }

    override suspend fun getWords(query: String): Flow<List<Word>> {
        TODO("Not yet implemented")
    }


}