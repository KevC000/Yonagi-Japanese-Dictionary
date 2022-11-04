package com.yonasoft.yonagi.data.local.db.word

import androidx.room.*
import com.yonasoft.yonagi.data.local.db.word.entity.WordEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertWord(word: WordEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertWords(wordList: List<WordEntity>)

    @Query("SELECT * FROM wordentity")
    fun getWords(): Flow<List<WordEntity>>

    @Query("SELECT * FROM wordentity WHERE id=:id")
    fun getWord(id: Long): Flow<WordEntity>
//
//    @Query(
//        """
//        SELECT * FROM wordentity
//        """
//    //TODO: Search query
//    )
//    fun searchWords(query: String): Flow<List<WordEntity>>

    @Query("SELECT * FROM wordentity WHERE is_favorite = 1")
    fun getFavoriteWords(): Flow<List<WordEntity>>

    @Update
    fun updateWord(word:WordEntity)

    @Query("SELECT (SELECT COUNT(*) FROM wordentity) == 0")
    fun isWordDBEmpty(): Boolean
}