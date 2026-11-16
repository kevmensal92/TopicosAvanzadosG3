package com.example.room.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import com.example.room.modelos.viajePlanificado

@Dao
interface viajePlanificadoDAO {

    @Query(value="SELECT * FROM entidad_viajePlanificado")
    suspend fun getViajePlanificado(): List<viajePlanificado>

    @Insert
    suspend fun addViajePlanificado(viajePlanificado: viajePlanificado): Long

    @Update
    suspend fun upViajePlanificado(viajePlanificado: viajePlanificado): Int

    @Delete
    suspend fun delViajePlanificado(viajePlanificado: viajePlanificado): Int

}