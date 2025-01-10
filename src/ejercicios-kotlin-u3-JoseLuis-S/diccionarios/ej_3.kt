package com.1dam.ejercicioskotlin

import kotlin.system.exitProcess

val TABLA_PRECIOS_FRUTA = mapOf(
    "Platano" to 1.35,
    "Manzana" to 0.8,
    "Pera" to 0.85,
    "Naranja" to 0.7
)

fun calcularPrecioFinal(fruta: String, cantidad: Double): Double {
    return (TABLA_PRECIOS_FRUTA[fruta] ?: 0.0) * cantidad
}

fun pedirCantidad(): Double {
    while (true) {
        try {
            print("Introduce la cantidad a comprar en kg: ")
            val cantidad = readLine()?.toDoubleOrNull() ?: throw NumberFormatException("Entrada no válida")

            if (cantidad < 0) {
                throw ValueError("La cantidad no puede ser menor a 0.")
            } else {
                return "%.2f".format(cantidad).toDouble()
            }

        } catch (e: NumberFormatException) {
            println("CANTIDAD INVALIDA")

        } catch (e: Exception) {
            println("ERROR: ${e.message}")
        }
    }
}

fun pedirFruta(): String {
    println("Fruta disponible:")
    TABLA_PRECIOS_FRUTA.keys.forEach { println(it) }

    print("\nIntroduce que fruta quieres comprar: ")
    return readLine()?.capitalize() ?: ""
}

fun main() {
    limpiarPantalla()

    val fruta = pedirFruta()

    if (fruta !in TABLA_PRECIOS_FRUTA) {
        println("No disponemos de $fruta."

    } else {
        val cantidad = pedirCantidad()
        val precio = calcularPrecioFinal(fruta, cantidad)
        println("$cantidad kg de $fruta cuestan ${"%.2f".format(precio)}€.")
    }
}
