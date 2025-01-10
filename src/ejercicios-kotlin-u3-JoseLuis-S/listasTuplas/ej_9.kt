package com.1dam.ejercicioskotlin

import java.io.IOException

val VOCALS = listOf("a", "e", "i", "o", "u")

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

fun contarVocales(palabra: String): List<Int> {
    val conteoVocales = MutableList(5) { 0 }

    for (i in palabra) {
        if (i in VOCALS) {
            val index = VOCALS.indexOf(i)
            conteoVocales[index] += 1
        }
    }

    return conteoVocales
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

fun main() {
    limpiarPantalla()

    val palabra = pedirPalabra()
    val contador = contarVocales(palabra)

    println("La palabra $palabra tiene:")
    for (i in VOCALS.indices) {
        println("${VOCALS[i]}: ${contador[i]}")
    }
}