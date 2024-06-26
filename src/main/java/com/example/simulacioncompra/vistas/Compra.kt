package com.example.simulacioncompra.vistas

import android.content.ClipData.Item
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ListaProductos(navController: NavController) {
    var productosList by remember { mutableStateOf(mutableListOf<String>()) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "El producto seleccionado es una Heladera")
        Text("El precio de la herladera es: $600.000")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Actualmente en el carrito:")
        Spacer(modifier = Modifier.height(23.dp))
        Text(text = "Heladera con dispenser")

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("Inicio") }

        ){
            Text(text = "ir al inicio")
        }


    }


}

