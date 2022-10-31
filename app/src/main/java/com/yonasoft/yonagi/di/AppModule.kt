package com.yonasoft.yonagi.di

import com.yonasoft.yonagi.util.parser.WordXMLParser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideWordXMLParser(): WordXMLParser {
        return WordXMLParser()
    }

//    @Provides
//    @Singleton
//    fun provideRepository(){}

//    @Provides
//    @Singleton
//    fun provideStockDatabase(app: YonagiApplication) {
//        return Room.databaseBuilder(
//            app,
//            StockDatabase::class.java,
//            "stockdb.db"
//        ).build()
//    }
}