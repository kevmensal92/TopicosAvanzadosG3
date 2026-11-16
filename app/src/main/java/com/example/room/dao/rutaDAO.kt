package com.example.room.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import com.example.room.modelos.ruta

@Dao
interface rutaDAO {

    @Query(value="SELECT * FROM entidad_ruta")
    suspend fun getRuta(): List<ruta>

    @Insert
    suspend fun addRuta(ruta: ruta): Long

    @Update
    suspend fun upRuta(ruta: ruta): Int

    @Delete
    suspend fun delRuta(ruta: ruta): Int

}