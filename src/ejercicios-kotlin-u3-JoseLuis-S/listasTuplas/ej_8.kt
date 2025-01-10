package com.1dam.ejercicioskotlin

import java.io.IOException

fun limpiarPantalla() {
    try {
        val os = System.getProperty("os.name").toLowerCase()

        if (os.contains("win")) {
            Runtime.getRuntime().exec("cls")
        } else {
            Runtime.getRuntime().exec("clear")
        }

    } catch (e: IOException) {
        e.printStackTrace()
    }
}

fun pedirPalabra(): String {
    var comprobacion = false
    var palabra: String

    while (!comprobacion) {
        try {
            palabra = readLine()?.toLowerCase() ?: ""
            if (palabra.any { it !in "qwertyuiopasdfghjklzxcvbnm" }) {
                throw ValueErrorException()
            }
            comprobacion = true

        } catch (e: ValueErrorException) {
            println("ERROR, palabra invalida")

        } catch (e: Exception) {
            println("ERROR")
        }
    }

    return palabra
}

fun comprobarPalindromo(palabra: String): Boolean {
    return palabra == palabra.reversed()
}

fun main() {
    limpiarPantalla()

    val palabra = pedirPalabra()

    if (comprobarPalindromo(palabra)) {
        println("La palabra $palabra es un palindromo.")
    } else {
        println("La palabra $palabra no es un palindromo.")
    }
}