/**
 * Clase base que representa a una persona con un nombre y una edad.
 *
 * @property nombre Nombre de la persona.
 * @property edad Edad de la persona.
 */
open class Persona(open val nombre: String, edad: Int) {
    /**
     * Edad de la persona.
     */
    var edad: Int = edad
        private set

    /**
     * Método que incrementa la edad de la persona en uno y muestra un mensaje de cumpleaños.
     */
    open fun celebrarCumple() {
        edad++
        println("Feliz cumpleaños $nombre!!!, Ahora tienes $edad.")
    }

    /**
     * Representación de la persona en formato de cadena.
     *
     * @return Cadena que representa la información de la persona.
     */
    override fun toString(): String = "Nombre=$nombre, Edad=$edad"
}
