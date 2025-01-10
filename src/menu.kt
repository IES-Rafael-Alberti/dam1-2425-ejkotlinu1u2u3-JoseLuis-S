import com.1dam.ejercicioskotlin

fun mostrarMenu() {
    println("1. Ej-U1")
    println("2. Ej-U2")
    println("3. Ej-U3")
    println("4. Salir")
    println("")
}

fun pedirOpcion(): Int {
    while (true) {
        try {
            println("Introduce una opción (1, 2, 3 o 4):")
            val opcion = readLine()!!.toInt()

            if (opcion in 1..4) {
                return opcion
            } else {
                println("Opción no válida. Por favor, introduce un número entre 1 y 4.")
            }

        } catch (e: Exception) {
            println("Opción no válida.")
        }
    }
}

fun mostrarEjU1() {
    println("1. Ej4")
    println("2. Ej6")
    println("3. Ej12")
    println("4. Ej15")
    println("5. Ej18")
    println("6. Ej20")
    println("7. Ej21")
    println("8. Ej22")
    println("9. Ej24")
    println("10. Ej25")
    println("11. Ej26")
    println("12. Ej27")
}

fun ejecEjU1(opcion: Int) {
    when (opcion) {
        1 -> {
            println("Ejecutando Ejercicio 4...")
            ejercicioskotlin.u1.joseluis_s.Ej4.main()
        }
        2 -> {
            println("Ejecutando Ejercicio 6...")
            ejercicioskotlin.u1.joseluis_s.Ej6.main()
        }
        3 -> {
            println("Ejecutando Ejercicio 12...")
            ejercicioskotlin.u1.joseluis_s.Ej12.main()
        }
        4 -> {
            println("Ejecutando Ejercicio 15...")
            ejercicioskotlin.u1.joseluis_s.Ej15.main()
        }
        5 -> {
            println("Ejecutando Ejercicio 18...")
            ejercicioskotlin.u1.joseluis_s.Ej18.main()
        }
        6 -> {
            println("Ejecutando Ejercicio 20...")
            ejercicioskotlin.u1.joseluis_s.Ej20.main()
        }
        7 -> {
            println("Ejecutando Ejercicio 21...")
            ejercicioskotlin.u1.joseluis_s.Ej21.main()
        }
        8 -> {
            println("Ejecutando Ejercicio 22...")
            ejercicioskotlin.u1.joseluis_s.Ej22.main()
        }
        9 -> {
            println("Ejecutando Ejercicio 24...")
            ejercicioskotlin.u1.joseluis_s.Ej24.main()
        }
        10 -> {
            println("Ejecutando Ejercicio 25...")
            ejercicioskotlin.u1.joseluis_s.Ej25.main()
        }
        11 -> {
            println("Ejecutando Ejercicio 26...")
            ejercicioskotlin.u1.joseluis_s.Ej26.main()
        }
        12 -> {
            println("Ejecutando Ejercicio 27...")
            ejercicioskotlin.u1.joseluis_s.Ej27.main()
        }
        else -> {
            println("Opción no válida. Por favor selecciona una opción válida.")
        }
    }
}

fun mostrarCarpetasU2() {
    println("1. Excepciones")
    println("2. Condicionles")
    println("3. Iterativas")
}

fun mostrarEjExcep() {
    println("Excepciones:")
    println("1. Ej 2")
    println("2. Ej 3")
    println("3. Ej 4")
    println("4. Ej 5")
}

fun ejecEjExcep(opcion: Int) {
    when (opcion) {
        1 -> {
            println("Ejecutando Ejercicio 2...")
            excepciones.ej_2.main()
        }
        2 -> {
            println("Ejecutando Ejercicio 3...")
            excepciones.ej_3.main()
        }
        3 -> {
            println("Ejecutando Ejercicio 4...")
            excepciones.ej_4.main()
        }
        4 -> {
            println("Ejecutando Ejercicio 5...")
            excepciones.ej_5.main()
        }
        else -> {
            println("Opción no válida. Por favor selecciona una opción válida.")
        }
    }
}

fun mostrarEjCondicionales() {
    println("1. Ej")
    println("2. Ejercicio 2")
    println("3. Ejercicio 3")
    println("4. Ejercicio 4")
    println("5. Ejercicio 5")
}

fun ejecutarEjCondicionales(opcion: Int) {
    when (opcion) {
        1 -> {
            println("Ejecutando Ejercicio 1...")
            sentenciasCondicionales.Ej1.main()
        }
        2 -> {
            println("Ejecutando Ejercicio 2...")
            sentenciasCondicionales.Ej2.main()
        }
        3 -> {
            println("Ejecutando Ejercicio 3...")
            sentenciasCondicionales.Ej3.main()
        }
        4 -> {
            println("Ejecutando Ejercicio 4...")
            sentenciasCondicionales.Ej4.main()
        }
        5 -> {
            println("Ejecutando Ejercicio 5...")
            sentenciasCondicionales.Ej5.main()
        }
        else -> {
            println("Opción no válida. Seleccione una opción correcta.")
        }
    }
}

fun mostrarEjIterativas() {
    println("1. Ej 6")
    println("2. Ej 8")
    println("3. Ej 13")
    println("4. Ej 15")
    println("5. Ej 18")
    println("6. Ej 19")
    println("7. Ej 25")
}

fun ejecutarEjIterativas(opcion: Int) {
    when (opcion) {
        1 -> {
            println("Ejecutando Ejercicio 6...")
            sentenciasIterativas.ej_6.main()
        }
        2 -> {
            println("Ejecutando Ejercicio 8...")
            sentenciasIterativas.ej_8.main()
        }
        3 -> {
            println("Ejecutando Ejercicio 13...")
            sentenciasIterativas.ej_13.main()
        }
        4 -> {
            println("Ejecutando Ejercicio 15...")
            sentenciasIterativas.ej_15.main()
        }
        5 -> {
            println("Ejecutando Ejercicio 18...")
            sentenciasIterativas.ej_18.main()
        }
        6 -> {
            println("Ejecutando Ejercicio 19...")
            sentenciasIterativas.ej_19.main()
        }
        6 -> {
            println("Ejecutando Ejercicio 25...")
            sentenciasIterativas.ej_25.main()
        }
        else -> {
            println("Opción no válida. Seleccione una opción correcta.")
        }
    }
}

fun mostrarEjDiccionarios() {
    println("1. Ej 3")
    println("2. Ej 5")
    println("3. Ej 6")
    println("4. Ej 7")
    println("5. Ej 8")
}

fun ejecutarEjDiccionarios(opcion: Int) {
    when (opcion) {
        1 -> {
            println("Ejecutando Ejercicio 3...")
            diccionarios.ej_3.main()
        }
        2 -> {
            println("Ejecutando Ejercicio 5...")
            diccionarios.ej_5.main()
        }
        3 -> {
            println("Ejecutando Ejercicio 6...")
            diccionarios.ej_6.main()
        }
        4 -> {
            println("Ejecutando Ejercicio 7...")
            diccionarios.ej_7.main()
        }
        5 -> {
            println("Ejecutando Ejercicio 8...")
            diccionarios.ej_8.main()
        }
        else -> {
            println("Opción no válida. Seleccione una opción correcta.")
        }
    }
}

fun mostrarEjListasTuplas() {
    println("1. Ej 4")
    println("2. Ej 6")
    println("3. Ej 8")
    println("4. Ej 9")
    println("5. Ej 10")
    println("6. Ej 13")
}

fun ejecutarEjListasTuplas(opcion: Int) {
    when (opcion) {
        1 -> {
            println("Ejecutando Ejercicio 4...")
            listasTuplas.ej_4.main()
        }
        2 -> {
            println("Ejecutando Ejercicio 6...")
            listasTuplas.ej_6.main()
        }
        3 -> {
            println("Ejecutando Ejercicio 8...")
            listasTuplas.ej_8.main()
        }
        4 -> {
            println("Ejecutando Ejercicio 9...")
            listasTuplas.ej_9.main()
        }
        5 -> {
            println("Ejecutando Ejercicio 10...")
            listasTuplas.ej_10.main()
        }
        6 -> {
            println("Ejecutando Ejercicio 13...")
            listasTuplas.ej_13.main()
        }
        else -> {
            println("Opción no válida. Seleccione una opción correcta.")
        }
    }
}

fun mostrarCarpetasU3() {
    println("1. Diccionarios")
    println("2. Listas y tuplas")
}

fun main() {
    var salir = false

    while (!salir) {
        mostrarMenu()
        var opcion = pedirOpcion()

        when (opcion) {
            1 -> {
                mostrarEjU1()
                var opcionEjercicio = pedirOpcion()
                ejecEjU1(opcionEjercicio)
            }
            2 -> {
                mostrarCarpetasU2()
                var opcionCarpeta = pedirOpcion()
                when (opcionCarpeta) {
                    1 -> {
                        mostrarEjExcep()
                        var opcionEjercicio = pedirOpcion()
                        ejecEjExcep(opcionEjercicio)
                    }
                    2 -> {
                        mostrarEjCondicionales()
                        var opcionEjercicio = pedirOpcion()
                        ejecutarEjCondicionales(opcionEjercicio)
                    }
                    3 -> {
                        mostrarEjIterativas()
                        var opcionEjercicio = pedirOpcion()
                        ejecutarEjIterativas(opcionEjercicio)

                    } else -> {
                        println("Opción no válida.")
                    }
                }
            }
            3 -> {
                mostrarCarpetasU3()
                var opcionCarpeta = pedirOpcion()
                when (opcionCarpeta) {
                    1 -> {
                        mostrarEjDiccionarios()
                        var opcionEjercicio = pedirOpcion()
                        ejecutarEjDiccionarios(opcionEjercicio)
                    }
                    2 -> {
                        mostrarEjListasTuplas()
                        var opcionEjercicio = pedirOpcion()
                        ejecutarEjListasTuplas(opcionEjercicio)

                    } else {
                        println("Opcion no valida")
                    }
                }

            }
            4 -> {
                println("Saliendo del programa...")
                salir = true

            } else -> {
                println("Opción no válida. Por favor selecciona una opción entre 1 y 4.")
            }
        }
    }

    println("Fin del programa.")
}