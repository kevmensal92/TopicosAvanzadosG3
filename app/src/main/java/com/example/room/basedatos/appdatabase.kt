package com.example.room.basedatos

import androidx.room3.Database
import androidx.room3.RoomDatabase
import com.example.room.dao.medioTransporteDAO
import com.example.room.dao.rutaDAO
import com.example.room.dao.horarioDAO
import com.example.room.dao.usuarioDAO
import com.example.room.dao.viajePlanificadoDAO
import com.example.room.dao.paradaEstacionDAO
import com.example.room.modelos.medioTransporte
import com.example.room.modelos.ruta
import com.example.room.modelos.horario
import com.example.room.modelos.usuario
import com.example.room.modelos.viajePlanificado
import com.example.room.modelos.paradaEstacion


@Database(entities = [medioTransporte::class, ruta::class, horario::class, usuario::class, viajePlanificado::class, paradaEstacion::class], version = 1)
abstract class appdatabase : RoomDatabase() {
    abstract fun medioTransporteDAO(): medioTransporteDAO
    abstract fun rutaDAO(): rutaDAO
    abstract fun horarioDAO(): horarioDAO
    abstract fun usuarioDAO(): usuarioDAO
    abstract fun viajePlanificadoDAO(): viajePlanificadoDAO
    abstract fun paradaEstacionDAO(): paradaEstacionDAO
}