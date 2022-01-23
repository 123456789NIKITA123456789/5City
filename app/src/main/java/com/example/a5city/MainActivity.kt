package com.example.a5city

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db:AppDatabase? = App.instance.database

        findViewById<Button>(R.id.button).setOnClickListener {
            var newCity = City()
            newCity.cityName = findViewById<TextView>(R.id.nameCity).text.toString()
            newCity.population = findViewById<TextView>(R.id.populationCity).text.toString().toInt()
            newCity.square = findViewById<TextView>(R.id.squareCity).text.toString().toFloat()
            inputDB(db!!, newCity)

        }

    }

    private fun inputDB(db: AppDatabase, city: City) {

        val cityDao = db?.cityDao()

        val runnable: Runnable = Runnable {
            cityDao!!.insert(city)
            Log.d("tag","hello from thread")
            Log.d("tag", city.cityName!!)
            Log.d("tag", city.population.toString())
            Log.d("tag", city.square.toString())
        }
        val thread = Thread(runnable)
        thread.start()
    }
}