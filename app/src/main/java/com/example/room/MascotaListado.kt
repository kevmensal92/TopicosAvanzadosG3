package com.example.room

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.room.modelos.mascota
import com.example.room.ui.theme.ROOMTheme

@Composable
fun MascotaListado(modifier: Modifier, lstMascotas: List<mascota>){
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(lstMascotas.size){ index ->
            MascotaItem(lstMascotas[index], Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MascotaListadoPreview(){
    val lmascota = mascota(id=1, nombre="Blacky",color="Negro",peso=4)
    ROOMTheme {
        MascotaListado(Modifier, listOf(lmascota, lmascota, lmascota, lmascota))
    }
}