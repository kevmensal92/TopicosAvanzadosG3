package com.example.room.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import com.example.room.modelos.paradaEstacion

@Dao
interface paradaEstacionDAO {

    @Query(value="SELECT * FROM entidad_paradaEstacion")
    suspend fun getParadaEstacion(): List<paradaEstacion>

    @Insert
    suspend fun addParadaEstacion(paradaEstacion: paradaEstacion): Long

    @Update
    suspend fun upParadaEstacion(paradaEstacion: paradaEstacion): Int

    @Delete
    suspend fun delParadaEstacion(paradaEstacion: paradaEstacion): Int

}