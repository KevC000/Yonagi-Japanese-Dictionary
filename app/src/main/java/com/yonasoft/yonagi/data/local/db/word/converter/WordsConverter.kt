package com.yonasoft.yonagi.data.local.db.word.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.yonasoft.yonagi.data.local.db.word.entity.Senses

class WordsConverter {

    @TypeConverter
    fun fromElements(elements:List<String>):String{
        return Gson().toJson(elements)
    }
    @TypeConverter
    fun toElements(elements:String): List<String> {
        return Gson().fromJson(elements,  object : TypeToken<List<String>>() {}.type)
    }

    @TypeConverter
    fun fromSense(senses:List<Senses>):String{
        return Gson().toJson(senses)
    }
    @TypeConverter
    fun toSenses(senses:String): List<Senses> {
        return Gson().fromJson(senses,  object : TypeToken<Senses>() {}.type)
    }

}