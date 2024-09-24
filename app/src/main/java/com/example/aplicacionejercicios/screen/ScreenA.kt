package com.example.aplicacionejercicios.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.aplicacionejercicios.viewmodel.PersonaViewModel

@Composable
fun ScreenA(navController: NavController, personaViewModel: PersonaViewModel) {
    var nombre by remember { mutableStateOf("") }
    var apellido by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla A")

        Text(text= "por favor ingresa tus datos")
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") }
        )
        TextField(
            value = apellido,
            onValueChange = { apellido = it },
            label = { Text("Apellido") }
        )
        TextField(
            value = edad,
            onValueChange = { edad = it },
            label = { Text("Edad") }
        )

        Button(onClick = {
            personaViewModel.agregarPersona(nombre, apellido, edad)
            navController.navigate("screen_b")
        }) {
            Text(text = "Ir a Pantalla B")
        }
    }
}


