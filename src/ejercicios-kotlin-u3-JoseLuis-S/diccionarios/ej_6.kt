package com.1dam.ejercicioskotlin

import kotlin.system.exitProcess

val datosAPedir = listOf("nombre", "edad", "sexo", "telefono", "correo electronico")

fun mostrarDatoAgregado(dato: String, valor: Any, datos: Map<String, Any>) {
    println("\nSe ha agregado $dato con un valor $valor.")
    println("$datos\n")
}

fun agregarDatosDict(datos: MutableMap<String, Any>, dato: String, valor: Any): MutableMap<String, Any> {
    datos[dato] = valor
    return datos
}

fun pedirValorClave(index: Int): Any {
    val mensajes = listOf(
        "Introduce tu nombre: ",
        "Introduce tu edad: ",
        "Introduce tu sexo (masculino o femenino): ",
        "Introduce tu telefono: ",
        "Introduce tu correo electronico: "
    )

    while (true) {
        try {
            print(mensajes[index])
            var valor = readLine()?.trim()?.capitalize()

            when (index) {
                0 -> return valor!!
                1 -> {
                    valor = valor?.toIntOrNull()?.toString()
                    if (valor == null || valor.toInt() < 0 || valor.toInt() > 120) {
                        throw ValueOutOfBoundsException("Edad no válida")
                    }
                    return valor.toInt()
                }
                2 -> {
                    if (valor != "Masculino" && valor != "Femenino") {
                        throw IllegalArgumentException("Sexo no válido")
                    }
                    return valor!!
                }
                3 -> {
                    if (valor!!.length != 9 || !valor.all { it.isDigit() }) {
                        throw IllegalArgumentException("Teléfono no válido")
                    }
                    return valor.toInt()
                }
                else -> return valor!!
            }
        } catch (e: Exception) {
            println("ERROR, valor no válido.")
        }
    }
}

fun main() {
    val datos = mutableMapOf<String, Any>()

    limpiarPantalla()

    for (i in datosAPedir.indices) {
        val valor = pedirValorClave(i)
        agregarDatosDict(datos, datosAPedir[i], valor)
        mostrarDatoAgregado(datosAPedir[i], valor, datos)
    }
}
