package com.example.aplicacionejercicios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.aplicacionejercicios.screen.navigationExample
import com.example.aplicacionejercicios.ui.theme.AplicacionEjerciciosTheme

class MainActivity : ComponentActivity() {//Daniel Santiago Medrano Gomez
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplicacionEjerciciosTheme {
                navigationExample()
            }
        }
    }
}

