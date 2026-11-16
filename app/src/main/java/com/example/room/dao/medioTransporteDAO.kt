package com.example.room.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import com.example.room.modelos.medioTransporte

@Dao
interface medioTransporteDAO {

    @Query(value="SELECT * FROM entidad_medioTransporte")
    suspend fun getMedioTransporte(): List<medioTransporte>

    @Insert
    suspend fun addMedioTransporte(medioTransporte: medioTransporte): Long

    @Update
    suspend fun upMedioTransporte(medioTransporte: medioTransporte): Int

    @Delete
    suspend fun delMedioTransporte(medioTransporte: medioTransporte): Int

}