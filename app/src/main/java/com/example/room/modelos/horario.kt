package com.example.room.modelos

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import androidx.room3.ForeignKey

@Entity(tableName = "entidad_horario")
data class horario(
    @PrimaryKey(autoGenerate = true) val id_horario: Long = 0,
    val ruta_id: Long = 0,
    val hora_salida: String = "",
    val hora_llegada: String = ""
)