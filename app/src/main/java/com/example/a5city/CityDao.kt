package com.example.a5city

import androidx.room.*

@Dao
public interface CityDao {

    @Query("SELECT * FROM City")
    fun getAll(): MutableList<City>

    @Query("SELECT * FROM City WHERE id= :id")
    fun getById(id: Long):City

    @Query("SELECT * FROM City WHERE name = :cityName")
    fun getByName(cityName: String):City

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(player: City)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun update(player: City)

    @Delete
    fun delete(player: City)

}