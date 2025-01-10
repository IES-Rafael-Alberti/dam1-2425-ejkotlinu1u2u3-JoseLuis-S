package com.1dam.ejercicioskotlin

import java.util.*

fun pedirCantidad(articulo: String): Int {
    while (true) {
        try {
            print("\nIntroduce la cantidad a comprar de $articulo: ")
            val cantidad = readLine()?.toInt()

            if (cantidad != null && cantidad >= 0) {
                return cantidad
            } else {
                throw ValueOutOfBoundsException("La cantidad no puede ser negativa.")
            }

        } catch (e: ValueOutOfBoundsException) {
            println(e.message)

        } catch (e: Exception) {
            println("Cantidad no valida.")
        }
    }
}

fun pedirPrecio(articulo: String): Double {
    while (true) {
        try {
            print("\nIntroduce el precio de $articulo: ")
            val precio = readLine()?.toDouble()

            if (precio != null && precio >= 0) {
                return precio
            } else {
                throw ValueOutOfBoundsException("El precio no puede ser negativo.")
            }

        } catch (e: ValueOutOfBoundsException) {
            println(e.message)

        } catch (e: Exception) {
            println("Precio no valido.")
        }
    }
}

fun pedirArticulo(): String {
    print("\nIntroduce el articulo a comprar: ")
    return readLine()?.trim() ?: ""
}

fun preguntarSalir(): Boolean {
    while (true) {
        print("\n¿Desea introducir otro elemento a la cesta? (Si o no): ")
        val respuesta = readLine()?.toLowerCase()

        if (respuesta == "si") {
            return false
        } else if (respuesta == "no") {
            return true
        } else {
            println("RESPONDE SI O NO")
        }
    }
}

fun mostrarLista(cestaCompra: MutableMap<String, MutableMap<String, Any>>) {
    println("\nLista de la compra\n")

    for ((articulo, producto) in cestaCompra) {
        if (articulo != "Precio total productos") {
            val precio = producto["Precio"]
            val cantidad = producto["Cantidad"]
            val precioTotal = producto["Precio total"]
            println("$articulo | Precio: $precio | Cantidad: $cantidad | Precio total: $precioTotal")
        } else {
            println("------------------------------------")
            println("Precio total: ${cestaCompra[articulo]}€")
        }
    }
}

fun calcularPrecioTotal(index: Int, cestaCompra: MutableMap<String, MutableMap<String, Any>>, articulo: String): Double {
    return if (index == 0) {
        val precio = cestaCompra[articulo]?.get("Precio") as Double
        val cantidad = cestaCompra[articulo]?.get("Cantidad") as Int
        precio * cantidad
    } else {
        cestaCompra[articulo]?.get("Precio total") as Double
    }
}

fun main() {
    val cestaCompra = mutableMapOf<String, MutableMap<String, Any>>()
    var contador = 0

    var salir = false

    limpiarPantalla()

    while (!salir) {
        contador++
        println("\nIntroduzca el $contador producto.")

        val articulo = pedirArticulo()
        val cantidad = pedirCantidad(articulo)
        val precio = pedirPrecio(articulo)

        val producto = mutableMapOf("Precio" to precio, "Cantidad" to cantidad)
        cestaCompra[articulo] = producto

        salir = preguntarSalir()
    }

    cestaCompra["Precio total productos"] = 0.0

    for ((articulo, _) in cestaCompra) {
        if (articulo == "Precio total productos") {
            continue
        } else {
            cestaCompra[articulo]?.set("Precio total", calcularPrecioTotal(0, cestaCompra, articulo))
            cestaCompra["Precio total productos"] = (cestaCompra["Precio total productos"] as Double) + calcularPrecioTotal(1, cestaCompra, articulo)
        }
    }

    mostrarLista(cestaCompra)
}
