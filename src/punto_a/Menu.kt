package src.punto_a

val menu: List<MenuItem> = listOf(
    MenuItem(1,  "Hamburguesa Clásica",  "Carne, lechuga, tomate y queso",       18_000.0),
    MenuItem(2,  "Hamburguesa Doble",    "Doble carne con bacon",                28_000.0),
    MenuItem(3,  "Pizza Margarita",      "Salsa de tomate y mozzarella",         22_000.0),
    MenuItem(4,  "Pizza Pepperoni",      "Mozzarella y pepperoni",               27_000.0),
    MenuItem(5,  "Perro Caliente",       "Salchicha, papas y salsas",            12_000.0),
    MenuItem(6,  "Bandeja Paisa",        "Frijoles, arroz, carne y huevo",       35_000.0),
    MenuItem(7,  "Pollo a la Brasa",     "Cuarto de pollo con ensalada",         24_000.0),
    MenuItem(8,  "Ensalada César",       "Lechuga, crutones y aderezo",          15_000.0),
    MenuItem(9,  "Limonada de Coco",     "Limonada natural con leche de coco",    8_000.0),
    MenuItem(10, "Brownie con Helado",   "Brownie de chocolate con vainilla",    11_000.0)
)

fun mostrarMenu() {
    println("\n---- MENÚsote DISPONIBLE ----")
    menu.forEach { item ->
        println("[${item.id}] ${item.nombre} - ${item.descripcion} - $${item.precio}")
    }
    println("===========================")
}

//forEach: este nos ayuda a recorer cada elemento de la lista y
// ejecutar el bloque

fun filtrarPorPrecio(minPrecio: Double, maxPrecio: Double) {
    val filtrados = menu.filter { it.precio in minPrecio..maxPrecio }
    println("\nProductos entre $$minPrecio y $$maxPrecio COP:")
    if (filtrados.isEmpty()) {
        println("No hay productos en ese rango de precios.")
    } else {
        filtrados.forEach { item ->
            println("[${item.id}] ${item.nombre} - $${item.precio}")
        }
    }
}