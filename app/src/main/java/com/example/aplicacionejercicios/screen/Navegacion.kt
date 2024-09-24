package com.example.aplicacionejercicios.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacionejercicios.viewmodel.PersonaViewModel

@Composable
fun navigationExample() {
    val navController = rememberNavController()
    val personaViewModel: PersonaViewModel = viewModel() // Crear una sola instancia del ViewModel

    NavHost(navController = navController, startDestination = "screen_a") {
        composable("screen_a") {
            ScreenA(navController, personaViewModel)
        }
        composable("screen_b") {
            ScreenB(navController, personaViewModel)
        }
    }
}
