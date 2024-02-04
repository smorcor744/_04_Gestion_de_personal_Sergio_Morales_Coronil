import java.text.DecimalFormat

/**
 * Clase que representa a un empleado con un nombre, edad, salario base y porcentaje de impuestos.
 *
 * @param nombre Nombre del empleado.
 * @param edad Edad del empleado.
 * @param salarioBase Salario base del empleado antes de impuestos.
 * @param porcentajeImpuestos Porcentaje de impuestos aplicado al salario base (por defecto, 10%).
 */
open class Empleado(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {

    /**
     * Salario base del empleado antes de impuestos.
     * Se convierte a Double para asegurar que sea un número decimal.
     */
    val salarioBase = salarioBase
        get() = field.toInt().toDouble()

    /**
     * Porcentaje de impuestos aplicado al salario base.
     * Se convierte a Double para asegurar que sea un número decimal.
     */
    open val porcentajeImpuestos = porcentajeImpuestos
        get() = field.toInt().toDouble()

    /**
     * Calcula el salario del empleado después de aplicar el porcentaje de impuestos.
     *
     * @return Salario del empleado después de impuestos.
     */
    open fun calcularSalario(): Double {
        val salario: Double = salarioBase - (salarioBase * porcentajeImpuestos / 100)
        return DecimalFormat("#.##").format(salario).toDouble()
    }

    /**
     * Realiza la acción de trabajar e imprime un mensaje.
     */
    fun trabajar() {
        println("$nombre está trabajando en la empresa")
    }

    /**
     * Representación de la información del empleado en formato de cadena.
     *
     * @return Cadena que representa la información del empleado.
     */
    override fun toString(): String = "Nombre: $nombre, Edad: $edad, Salario: ${calcularSalario()}"
}
