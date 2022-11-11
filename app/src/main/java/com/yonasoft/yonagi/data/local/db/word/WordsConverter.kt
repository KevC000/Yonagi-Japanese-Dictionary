package com.yonasoft.yonagi.data.local.db.word

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class WordsConverter {

    @TypeConverter
    fun fromElements(elements:List<String>):String{
        var res = ""
        for(i in 0 until elements.size){
            res+=elements[i]
            if(i != elements.size-1){
                res+=","
            }
        }
        return res
    }
    @TypeConverter
    fun toElements(elements:String): List<String> {
        return elements.split(",")
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