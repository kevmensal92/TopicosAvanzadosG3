package com.example.room.modelos

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "entidad_usuario")
data class usuario(
    @PrimaryKey(autoGenerate = true) val id_usuario: Long = 0,
    val nombre: String = "",
    val correo_electronico: String = "",
    val tipo: String = "" //Administrador o pasajero
)