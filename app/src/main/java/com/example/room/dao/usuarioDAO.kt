package com.example.room.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Update
import com.example.room.modelos.usuario

@Dao
interface usuarioDAO {

    @Query(value="SELECT * FROM entidad_usuario")
    suspend fun getUsuario(): List<usuario>

    @Insert
    suspend fun addUsuario(usuario: usuario): Long

    @Update
    suspend fun upUsuario(usuario: usuario): Int

    @Delete
    suspend fun delUsuario(usuario: usuario): Int

}