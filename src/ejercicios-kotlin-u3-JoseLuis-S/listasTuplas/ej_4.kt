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

fun recopilarNumerosGanadores(): List<String> {
    val numeros = mutableListOf<String>()
    var vacio = false

    println("Introduce un espacio vacio para terminar.\n")

    while (!vacio) {
        try {
            print("Introduce un numero ganador: ")
            val input = readLine()?.trim()

            if (input.isNullOrEmpty()) {
                vacio = true

            } else if (input.all { it.isDigit() }) {
                numeros.add(input)

            } else {
                println("NUMERO NO VALIDO")
            }

        } catch (e: Exception) {
            println("ERROR")
        }
    }

    return numeros
}

fun main() {
    limpiarPantalla()

    val numerosGanadores = recopilarNumerosGanadores().sorted()

    println("Los numeros ganadores son:\n${numerosGanadores.joinToString(", ")}.")
}
