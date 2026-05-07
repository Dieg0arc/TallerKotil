package src.punto_a

class Pedido(val cliente: Cliente) {

    private val items: MutableList<MenuItem> = mutableListOf()

    fun agregarItem(item: MenuItem) {
        items.add(item)
        println("'${item.nombre}' agregado al pedido.")
    }

    fun eliminarItem(id: Int) {
        val item = items.firstOrNull { it.id == id }
        if (item != null) {
            items.remove(item)
            println("'${item.nombre}' eliminado del pedido.")
        } else {
            println("No se encontró el producto con ID $id en el pedido.")
        }
    }

    fun calcularSubtotal(): Double = items.sumOf { it.precio }

    fun calcularTotal(): Double {
        val subtotal = calcularSubtotal()
        return if (subtotal > 100_000.0) subtotal * 0.90 else subtotal
    }

    fun tieneDescuento(): Boolean = calcularSubtotal() > 100_000.0

    fun cantidadItems(): Int = items.size

    fun mostrarPedido() {
        println("\n Pedido de ${cliente.nombre}:")
        if (items.isEmpty()) {
            println("  (El pedido está vacío)")
        } else {
            items.forEach { item ->
                println("  [${item.id}] ${item.nombre} - $${item.precio}")
            }
            println("  Subtotal : $${calcularSubtotal()}")
            println("  Total    : $${calcularTotal()}")
            if (tieneDescuento()) println("Descuento del 10% aplicado, OMG que descuentote")
        }
    }

}