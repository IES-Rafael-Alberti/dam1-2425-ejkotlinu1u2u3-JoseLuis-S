package com.1dam.ejercicioskotlin

import kotlin.math.round

fun cleanScreen() {
    try {
        val os = System.getProperty("os.name").toLowerCase()
        if (os.contains("win")) {
            Runtime.getRuntime().exec("cls")
        } else {
            Runtime.getRuntime().exec("clear")
        }
    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}

fun calcularDesviacionTipica(media: Int, nums: List<Int>): Double {
    var resultado = 0.0
    for (i in nums) {
        resultado += (i - media).toDouble().pow(2)
    }
    return round(Math.sqrt(resultado / nums.size))
}

fun calcularMedia(nums: List<Int>): Int {
    var sumaTotal = 0
    for (i in nums) {
        sumaTotal += i
    }
    return sumaTotal / nums.size
}

fun pedirNums(): List<Int> {
    val listaNums = mutableListOf<Int>()
    println("Introduce un espacio para terminar.\n")

    while (true) {
        try {
            val entrada = readLine()?.trim()
            if (entrada.isNullOrEmpty()) {
                return listaNums
            } else {
                listaNums.add(entrada.toInt())
            }
        } catch (e: NumberFormatException) {
            println("ERROR, DEBES INTRODUCIR NUMEROS ENTEROS.")
        } catch (e: Exception) {
            println("ERROR: ${e.message}")
        }
    }
}

fun main() {
    cleanScreen()
    val nums = pedirNums()
    val media = calcularMedia(nums)
    val resultado = calcularDesviacionTipica(media, nums)
    println("\nLista de nums = $nums\nMedia = $media\nDesviacion tipica = $resultado")
}