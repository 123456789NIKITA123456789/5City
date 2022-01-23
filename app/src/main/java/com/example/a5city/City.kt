package com.example.a5city

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "City")
class City {

    @PrimaryKey(autoGenerate = true)
    public var id: Long? = null

    @ColumnInfo(name = "name")
    public  var cityName: String? = null

    @ColumnInfo(name = "population")
    public var population: Int? = null

    @ColumnInfo(name = "square")
    public var square: Float? = null

}