package com.yonasoft.yonagi.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yonasoft.yonagi.YonagiApplication
import com.yonasoft.yonagi.data.local.db.word.WordDao
import com.yonasoft.yonagi.data.local.db.word.WordDatabase
import com.yonasoft.yonagi.data.local.db.word.entity.WordEntity
import com.yonasoft.yonagi.data.local.repository.RepositoryImpl
import com.yonasoft.yonagi.util.parser.WordXMLParser
import com.yonasoft.yonagi.util.parser.XMLParser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideWordDao(wordDatabase: WordDatabase): WordDao = wordDatabase.dao

    @Provides
    @Singleton
    fun provideWordDatabase(@ApplicationContext context: Context): WordDatabase {
        return Room.databaseBuilder(
            context,
            WordDatabase::class.java,
            "worddb.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideWordXMLParser(): XMLParser<WordEntity> {
        return WordXMLParser()
    }
}