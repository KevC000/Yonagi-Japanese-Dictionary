package com.yonasoft.yonagi.di

import com.yonasoft.yonagi.data.local.db.word.WordEntity
import com.yonasoft.yonagi.data.local.repository.RepositoryImpl
import com.yonasoft.yonagi.domain.repository.Repository
import com.yonasoft.yonagi.util.parser.WordXMLParser
import com.yonasoft.yonagi.util.parser.XMLParser
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsWordXMLParser(
        wordXMLParser:WordXMLParser
    ):XMLParser<WordEntity>

    @Binds
    @Singleton
    abstract fun bindRepository(
        repositoryImpl: RepositoryImpl
    ):Repository


}