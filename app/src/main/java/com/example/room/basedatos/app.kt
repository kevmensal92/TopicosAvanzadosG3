package com.example.room.basedatos

import android.app.Application
import androidx.room3.Room

class app : Application() {
    companion object {
        lateinit var db: appdatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, appdatabase::class.java, "db_room").build()
    }

}