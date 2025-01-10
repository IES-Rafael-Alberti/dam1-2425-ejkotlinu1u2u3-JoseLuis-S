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

fun recopilarAsignaturas(): MutableList<String> {
    val asignaturas = mutableListOf<String>()
    var vacio = false

    println("Introduce un espacio vacio para terminar.\n")

    while (!vacio) {
        val input = readLine()?.trim()?.titlecase()
        if (input.isNullOrEmpty()) {
            vacio = true
        } else {
            asignaturas.add(input)
        }
    }

    return asignaturas
}

fun comprobarNota(notas: MutableList<Int>): Boolean {
    return notas.last() in 0..10
}

fun recopilarNotas(asignaturas: MutableList<String>): MutableList<Int> {
    var notasCompletas = false
    val notas = mutableListOf<Int>()

    while (!notasCompletas) {
        try {
            for (asignatura in asignaturas) {
                print("Introduce la nota de $asignatura: ")
                val nota = readLine()?.toIntOrNull()

                if (nota != null) {
                    notas.add(nota)

                    if (!comprobarNota(notas)) {
                        throw ValueErrorException()
                    }

                } else {
                    throw ValueErrorException()
                }
            }
            notasCompletas = true

        } catch (e: ValueErrorException) {
            println("NOTA INVALIDA")

        } catch (e: Exception) {
            println("ERROR")
        }
    }
    return notas
}

fun comprobarAsigAprobadas(asignaturas: MutableList<String>, notas: MutableList<Int>): MutableList<String> {
    val asignaturasAprobadas = mutableListOf<String>()

    for (i in asignaturas.indices) {
        if (notas[i] >= 5) {
            asignaturasAprobadas.add(asignaturas[i])
        }
    }

    return asignaturasAprobadas
}

fun main() {
    limpiarPantalla()

    val asignaturas = recopilarAsignaturas()
    val notas = recopilarNotas(asignaturas)

    val asignaturasAprobadas = comprobarAsigAprobadas(asignaturas, notas)

    println("Tienes que repetir las siguientes asignaturas:\n${asignaturasAprobadas.joinToString(", ")}")
}

class ValueErrorException : Exception()
