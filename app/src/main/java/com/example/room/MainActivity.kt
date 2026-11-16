package com.example.room

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.room.basedatos.app
import com.example.room.dao.mascotadao
import com.example.room.modelos.mascota
import com.example.room.ui.theme.ROOMTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val dao: mascotadao by lazy { app.db.mascotaDao()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var lstMascotas by remember { mutableStateOf(listOf<mascota>()) }

            cargaMascotas { result ->
                lstMascotas = result
            }

            ROOMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MascotaListado(Modifier.padding(innerPadding), lstMascotas)
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        //AGREGAR MASCOTA
        val lmascotaDos = mascota(id = 2, nombre = "Laika", color = "Blanco y negro", peso = 6)
        val lmascotaTres = mascota(id = 3, nombre = "Muffin", color = "Cafe", peso = 5)
        //Modificar-Eliminar
        val lmascota = mascota(id = 1, nombre = "Blacky", color = "Negro manchado", peso = 4)

        lifecycleScope.launch {
            //Agregar
            dao.addMascota(lmascotaDos)
            //Modificar
            dao.upMascota(lmascota)
            //Eliminar
            dao.delMascota(lmascotaTres)
        }

    }

    private fun cargaMascotas(onResult: (List<mascota>) -> Unit){
        lifecycleScope.launch {
            val result = dao.getMascota()
            onResult(result)
        }
    }

}