package src.punto_a

fun registrarCliente(): Cliente {
    println("\n---- Resgistrar al Clientote ----")

    print("Nombre   : ")
    val nombre = readln()

    print("Cédula   : ")
    val cedula = readln()

    print("Teléfono : ")
    val telefono = readln()

    val cliente = Cliente(nombre, cedula, telefono)
    println("Clientote '${cliente.nombre}' registrado, que nivel.")
    return cliente
}