package com.example.room.modelos

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import androidx.room3.ForeignKey

@Entity(tableName = "entidad_ruta")
data class ruta(
    @PrimaryKey(autoGenerate = true) val id_ruta: Long = 0,
    val nombre_ruta: String = "",
    val descripcion: String = "",
    /*@ForeignKey(entity = medioTransporte)*/ val medioTransporte_id: Long = 0
)