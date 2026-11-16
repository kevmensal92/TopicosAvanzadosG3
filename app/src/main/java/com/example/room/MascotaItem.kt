package com.example.room

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.room.modelos.mascota
import com.example.room.ui.theme.ROOMTheme

@Composable
fun MascotaItem(lmascota: mascota, modifier: Modifier){
    Row(modifier = Modifier.fillMaxSize().padding(8.dp)
    ){
        Column(modifier = Modifier.weight(1f)) {
            Text(text = lmascota.id.toString())
            Text(text = lmascota.nombre)
            Text(text = lmascota.color)
            Text(text = lmascota.peso.toString())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MascotaItemPreview(){
    ROOMTheme {
        MascotaItem(mascota(id=1, nombre="Blacky",color="Negro",peso=4),Modifier)
    }
}