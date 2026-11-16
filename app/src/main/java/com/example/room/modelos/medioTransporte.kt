package com.example.room.modelos

import androidx.room3.Entity
import androidx.room3.PrimaryKey


@Entity(tableName = "entidad_medioTrasporte")
data class medioTransporte(
    @PrimaryKey(autoGenerate = true) val id_medio: Long = 0,
    val tipo: String = "", //autobus,taxi,tren,tranvia,metro
    val estado_operativo: Boolean = true,
    val capacidad: Long = 0
)