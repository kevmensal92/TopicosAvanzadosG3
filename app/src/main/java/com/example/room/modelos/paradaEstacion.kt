package com.example.room.modelos

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "entidad_paradaEstacion")
data class paradaEstacion(
    @PrimaryKey(autoGenerate = true) val id_parada: Long = 0,
    val nombre_parada: String = "",
    val ubicacion: String = "" //coordenadas
)