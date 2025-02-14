fun main() {
    val articulo1 = Articulo("Libro", 25.0)
    val articulo2 = Articulo("Cuaderno", 45.0)
    val ordenador1 = Ordenador("PC Gamer", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("PC Básico", 399.99, TipoOrdenador.BASICO)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    println("🎄 Aplicando promoción navideña del 10%:")
    articulos.forEach { it.promocionNavidad(10.0) }

    println("\n📋 Estado de los artículos tras la promoción:")
    articulos.forEach { println(it) }
}