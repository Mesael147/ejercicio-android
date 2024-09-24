package com.example.aplicacionejercicios.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf

class PersonaViewModel : ViewModel() {
    val listaPersonas = mutableStateListOf<Pair<String, String>>()

    fun agregarPersona(nombre: String, apellido: String, edad: String) {
        listaPersonas.add(Pair("$nombre $apellido", edad))
    }
}