package src.punto_a

fun mostrarReporteGeneral(pedidos: List<Pedido>) {
    println("\n--- PILLE PUES EL REPORTE GENERAL DE PEDIDOS ----")

    if (pedidos.isEmpty()) {
        println("No se realizó ningún pedido.")
        return
    }

    pedidos.forEach { pedido ->
        println("-------------------------------")
        println("Cliente  : ${pedido.cliente.nombre}")
        println("Ítems    : ${pedido.cantidadItems()}")
        println("Total    : $${pedido.calcularTotal()}")
        println("Descuento: ${if (pedido.tieneDescuento()) "Sí (10%)" else "No"}")
    }

    println("===============================")
    val totalGeneral = pedidos.sumOf { it.calcularTotal() }
    println("Total recaudado: $$totalGeneral")
}