package com.example.calificaciones.data

data class Calificacion(
    val id: String = "",
    val nombre: String = "",
    val calificacion: Double = 0.0,
    val docente: String = "",
    val unidad: Int = 0
)