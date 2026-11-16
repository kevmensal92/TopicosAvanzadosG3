package com.example.room.modelos

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import androidx.room3.ForeignKey

@Entity(tableName = "entidad_viajePlanificado")
data class viajePlanificado(
    @PrimaryKey(autoGenerate = true) val id_viaje: Long = 0,
    val usuario_id: Long = 0,
    val rutaInicio_id: Long = 0,
    val rutaFinal_id: Long = 0,
    val fecha_hora_inicio: String = ""
)