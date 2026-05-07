package src.punto_a

/*
Las ddata class en Kotil son perfectas
cuando solo se guardan datos, cuando escribimos
data class kotil ya genera automaticamente el toString(),
equals() y mas, sin tenes que escribirlo uno mismo
 */
data class MenuItem(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double
)


