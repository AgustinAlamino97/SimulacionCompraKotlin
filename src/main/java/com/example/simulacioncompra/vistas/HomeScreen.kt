package com.example.simulacioncompra.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.simulacioncompra.R


@Composable
fun HomeScreen(
    navController: NavController,
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.heladera),
                contentDescription = "Aprende Programando"
            )
            Text("Heladera Drean")
            Button(onClick = { onNextButtonClicked() }) {
                Text("Descripcion")
            }
            Button(
                onClick = { navController.navigate("Comprar") }

            ) {
                Text("Comprar")
            }
            Image(
                painter = painterResource(id = R.drawable.heladera),
                contentDescription = "Aprende Programando"
            )
            Text("Heladera Drean")
            Button(onClick = { onNextButtonClicked() }) {
                Text("Descripcion")
            }
            Button(
                onClick = { navController.navigate("Comprar") }

            ) {
                Text("Comprar")
            }



        }
    }
}