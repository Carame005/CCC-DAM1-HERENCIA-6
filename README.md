### **1 ¿De qué tipo genera en la lista por defecto el compilador?**
La lista `listOf(articulo1, articulo2, ordenador1, ordenador2)` es de tipo **`List<Articulo>`**, ya que `Ordenador` hereda de `Articulo` y Kotlin infiere el tipo base común más alto.

---

### **2 ¿Qué está ocurriendo con el polimorfismo en este ejemplo?**
- La lista almacena **objetos de diferentes tipos (`Articulo` y `Ordenador`)**, pero como `Ordenador` **hereda** de `Articulo`, todos pueden manejarse como `Articulo`.
- El **método sobrescrito `promocionNavidad()`** en `Ordenador` se ejecuta correctamente gracias al **polimorfismo dinámico**.
- Aunque la variable es de tipo `Articulo`, si un objeto es un `Ordenador`, **se ejecuta su versión específica del método `promocionNavidad()`**.

---

### **3 ¿Qué pasaría si creáramos la lista con `listOf<Ordenador>`?**
```kotlin
val ordenadores = listOf<Ordenador>(ordenador1, ordenador2)
```
- La lista solo podría almacenar objetos de tipo `Ordenador`.
- No podríamos añadir `Articulo`, aunque `Ordenador` sea una subclase de `Articulo`.
- **Pérdida de flexibilidad**, ya que solo manejaríamos ordenadores.

---

### **4 ¿Qué pasaría si usáramos `listOf<Any>`?**
```kotlin
val elementos = listOf<Any>(articulo1, articulo2, ordenador1, ordenador2)
```
- `Any` es la **superclase de todas las clases en Kotlin**, por lo que permite **cualquier tipo de objeto**.
- Sin embargo, para acceder a propiedades o métodos específicos de `Articulo`, tendríamos que hacer **casting explícito**.
```kotlin
if (elemento is Articulo) {
    elemento.promocionNavidad(10.0)  // Necesitamos comprobar el tipo
}
```
