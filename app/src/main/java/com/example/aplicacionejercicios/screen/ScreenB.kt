package com.example.aplicacionejercicios.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.aplicacionejercicios.viewmodel.PersonaViewModel

@Composable
fun ScreenB(navController: NavController, personaViewModel: PersonaViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla B")

        personaViewModel.listaPersonas.forEach { persona ->
            Text(text = "Nombre: ${persona.first}, Edad: ${persona.second}")
        }

        Button(onClick = { navController.navigate("screen_a") }) {
            Text(text = "Volver a Pantalla A")
        }
    }
}


