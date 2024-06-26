package com.example.simulacioncompra.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.simulacioncompra.R

@Composable
fun descripcion( navController: NavController) {//Descripcion
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.heladera),
            contentDescription = "Heladera"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Heladera Drean con dispenser de agua")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Precio del producto: $600.000 PESOS")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("Comprar") }

        ) {
            Text("Comprar")
        }


    }
}