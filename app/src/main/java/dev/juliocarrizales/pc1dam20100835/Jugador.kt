package dev.juliocarrizales.pc1dam20100835

data class Jugador(
    val nombreCompleto: String,
    val añoNacimiento: Int,
    val fotoResId: Int // Cambia a Int para el recurso drawable
) {
    val edad: Int
        get() = 2024 - añoNacimiento // Suponiendo que estamos en 2024
}
