package com.1dam.ejercicioskotlin

import java.util.*

fun pedirPalabra(): List<String> {
    while (true) {
        try {
            val palabraTraduc = readLine()!!.lowercase(Locale.getDefault())

            if (!palabraTraduc.contains(":")) {
                throw ValueError()
            } else {
                return palabraTraduc.split(":")
            }

        } catch (e: Exception) {
            println("ERROR, formato no valido.")
        }
    }
}

fun preguntarSalir(): Boolean {
    val respuesta = readLine()!!.lowercase(Locale.getDefault())
    if (respuesta !in listOf("si", "no")) {
        println("RESPONDE SI O NO")
        return false
    }
    return respuesta == "no"
}

fun traducirFrase(frase: String, oxford: Map<String, String>): String {
    val palabrasPorTraducir = frase.split(" ").toMutableList()

    for (i in palabrasPorTraducir.indices) {
        if (oxford.containsKey(palabrasPorTraducir[i])) {
            palabrasPorTraducir[i] = oxford[palabrasPorTraducir[i]]!!
        }
    }

    return palabrasPorTraducir.joinToString(" ")
}

fun main() {
    val oxford = mutableMapOf<String, String>()
    var salir = false

    while (!salir) {
        val palabra = pedirPalabra()
        oxford[palabra[0]] = palabra[1]

        salir = preguntarSalir()
    }

    println("Introduce la frase a traducir: ")
    val frase = readLine()!!

    val fraseTraducida = traducirFrase(frase, oxford)

    println(fraseTraducida)
}
