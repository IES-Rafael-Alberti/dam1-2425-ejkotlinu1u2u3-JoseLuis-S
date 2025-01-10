package com.1dam.ejercicioskotlin

import kotlin.system.exitProcess

val asignaturasCurso = mutableMapOf<String, Int>()

fun mostrarResultado(asignatura: String, asignaturasCurso: Map<String, Int>) {
    println("La asignatura $asignatura cuesta un total de ${asignaturasCurso[asignatura]} créditos.")
}

fun agregarDatosDict(asignaturasCurso: MutableMap<String, Int>, asignatura: String, creditos: Int): MutableMap<String, Int> {
    asignaturasCurso[asignatura] = creditos
    return asignaturasCurso
}

fun pedirAsignaturas(index: Int): String {
    if (index == 0) {
        println("Introduce una asignatura: ")
        val asignatura = readLine()
        if (asignatura != null) {
            return asignatura.capitalize()
        } else {
            return ""
        }
    } else {
        println("Introduce una asignatura para saber sus créditos: ")
        val asignatura = readLine()
        if (asignatura != null) {
            return asignatura.capitalize()
        } else {
            return ""
        }
    }
}


fun pedirCreditos(asignatura: String): Int {
    while (true) {
        try {
            print("Introduce la cantidad de créditos de la asignatura $asignatura: ")
            val creditos = readLine()?.toIntOrNull() ?: throw NumberFormatException("Valor no válido")

            if (creditos < 0) {
                throw IllegalArgumentException("Los créditos no pueden ser negativos.")
            } else {
                return creditos
            }

        } catch (e: Exception) {
            println("ERROR: ${e.message}")
        }
    }
}

fun main() {
    var salir = false

    limpiarPantalla()

    println("Pulsa enter para terminar de escribir asignaturas.")

    while (!salir) {
        val asignatura = pedirAsignaturas(0)

        if (asignatura.isEmpty()) {
            salir = true
        } else {
            val creditos = pedirCreditos(asignatura)
            agregarDatosDict(asignaturasCurso, asignatura, creditos)
        }
    }

    salir = false

    println("Pulsa enter para terminar de escribir asignaturas.")

    while (!salir) {
        val asignatura = pedirAsignaturas(1)

        if (asignatura.isEmpty()) {
            salir = true
        } else if (!asignaturasCurso.containsKey(asignatura)) {
            println("La asignatura $asignatura no está en tu lista.")
        } else {
            mostrarResultado(asignatura, asignaturasCurso)
        }
    }

    limpiarPantalla()

    println("Hasta pronto!!")
}
