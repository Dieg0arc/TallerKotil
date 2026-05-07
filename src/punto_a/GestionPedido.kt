package src.punto_a

fun gestionarPedido(pedido: Pedido) {
    var continuar = true

    while (continuar) {
        println("\n---- Gestione ps el pedido ----")
        println("1. Ver menú completo")
        println("2. Filtrar menú por precio")
        println("3. Agregar producto al pedido")
        println("4. Ver mi pedido actual")
        println("5. Eliminar producto del pedido")
        println("6. Finalizar pedido")
        print("Opción: ")

        when (readln().trim().toIntOrNull()) {
            1 -> mostrarMenu()
            2 -> {
                print("Precio mínimo: ")
                val min = readln().trim().toDoubleOrNull()
                print("Precio máximo: ")
                val max = readln().trim().toDoubleOrNull()
                if (min == null || max == null || min > max) {
                    println("Rango de precios inválido, pailas.")
                } else {
                    filtrarPorPrecio(min, max)
                }
            }
            3 -> {
                mostrarMenu()
                print("ID del producto a agregar: ")
                val id = readln().trim().toIntOrNull()
                if (id == null) {
                    println("ID no válido, escriba eso bien pues.")
                } else {
                    val item = menu.firstOrNull { it.id == id }
                    if (item == null) println("No existe un producto con ID $id, pillado.")
                    else pedido.agregarItem(item)
                }
            }
            4 -> pedido.mostrarPedido()
            5 -> {
                print("ID del producto a eliminar: ")
                val id = readln().trim().toIntOrNull()
                if (id == null) println("ID no válido, escriba eso bien pues.")
                else pedido.eliminarItem(id)
            }
            6 -> continuar = false
            else -> println("Opción inválida, eso no se puede crack.")
        }
    }
}