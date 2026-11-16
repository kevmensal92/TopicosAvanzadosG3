package com.example.room.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import com.example.room.modelos.horario

@Dao
interface horarioDAO {

    @Query(value="SELECT * FROM entidad_horario")
    suspend fun getHorario(): List<horario>

    @Insert
    suspend fun addHorario(horario: horario): Long

    @Update
    suspend fun upHorario(horario: horario): Int

    @Delete
    suspend fun delHorario(horario: horario): Int

}