package com.example.a5city


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [City::class], version = 1)
public  abstract class AppDatabase: RoomDatabase() {

    abstract fun cityDao(): CityDao?
}