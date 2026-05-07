package src

import src.punto_a.Pedido
import src.punto_a.gestionarPedido
import src.punto_a.mostrarReporteGeneral
import src.punto_a.registrarCliente

fun main() {
    println("---- SEVERO SISTEMA DE PEDIDOS ----")

    val pedidos: MutableList<Pedido> = mutableListOf()
    var nuevoPedido = true

    while (nuevoPedido) {
        // A.3 - Registrar cliente
        val cliente = registrarCliente()

        // A.4 - Crear pedido y gestionar ítems
        val pedido = Pedido(cliente)
        gestionarPedido(pedido)

        // Mostrar resumen del pedido finalizado
        pedido.mostrarPedido()

        // Guardar pedido si tiene ítems
        if (pedido.cantidadItems() > 0) {
            pedidos.add(pedido)
            println("Pedido guardado.")
        } else {
            println("️Pedido vacío, no se guardó.")
        }

        // ¿Otro pedido?
        print("\n¿Registrar otro pedido? (s/n): ")
        nuevoPedido = readln().trim().lowercase() == "s"
    }

    // A.6 - Reporte final
    mostrarReporteGeneral(pedidos)

    println("\n¡Todo bien, gracias por usar este sistemota!")
}