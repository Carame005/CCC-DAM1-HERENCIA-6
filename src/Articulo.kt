open class Articulo(var nombre: String, var precio: Double) {

    companion object {
        private var totalArticulos = 0
    }

    private val id: Int = generarId()

    private fun generarId(): Int {
        return ++totalArticulos
    }

    open fun promocionNavidad(descuento: Double) {
        precio -= precio * (descuento / 100)
    }

    override fun toString(): String {
        return "%s - %.2f€ (ID: %d)".format(nombre, precio, id)
    }
}