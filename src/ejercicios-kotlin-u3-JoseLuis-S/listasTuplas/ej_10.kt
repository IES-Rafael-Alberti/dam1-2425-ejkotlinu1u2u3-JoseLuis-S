package com.1dam.ejercicioskotlin

fun main() {
    limpiarPantalla()
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    println("El menor precio es ${precios.minOrNull()} y el mayor ${precios.maxOrNull()}.")
}