package com.albertogfv.newsapp.db

import androidx.room.TypeConverter
import com.albertogfv.newsapp.models.Source

class Converters {

    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun tosource(name: String): Source {
        return Source(name, name)
    }
}