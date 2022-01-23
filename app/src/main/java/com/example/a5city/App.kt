package com.example.a5city

import android.app.Application
import androidx.room.Room

class App : Application() {
    var database: AppDatabase? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, AppDatabase::class.java, "database")
            .build()
    }

    companion object {
        lateinit var instance: App
    }
}