class Ordenador(nombre: String, precio: Double, val tipo: TipoOrdenador = TipoOrdenador.BASICO) : Articulo(nombre, precio) {

    override fun promocionNavidad(descuento: Double) {
        if (precio > 500) {
            super.promocionNavidad(descuento)
        }
    }

    override fun toString(): String {
        return super.toString() + " [Tipo: $tipo]"
    }
}