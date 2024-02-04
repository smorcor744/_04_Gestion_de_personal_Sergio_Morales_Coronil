import java.text.DecimalFormat

/**
 * Clase que representa a un gerente, que es un tipo especial de empleado, con un nombre, edad, salario base, porcentaje de impuestos y bonus.
 *
 * @param nombre Nombre del gerente.
 * @param edad Edad del gerente.
 * @param salarioBase Salario base del gerente antes de impuestos.
 * @param porcentajeImpuestos Porcentaje de impuestos aplicado al salario base (valor predeterminado es 33.99%).
 * @param bonus Bonus adicional recibido por el gerente.
 * @param excentoImpuestos Indica si el gerente está exento de pagar impuestos (valor predeterminado es falso).
 */
class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    porcentajeImpuestos: Double,
    val bonus: Double,
    var excentoImpuestos: Boolean = false
) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    /**
     * Porcentaje de impuestos aplicado al salario base del gerente (valor específico para la clase Gerente).
     */
    override val porcentajeImpuestos = 33.99

    /**
     * Calcula el salario del gerente después de aplicar el porcentaje de impuestos y opcionalmente el bonus.
     *
     * @return Salario del gerente después de impuestos y bonus.
     */
    override fun calcularSalario(): Double {
        var salario: Double = salarioBase

        if (!excentoImpuestos) {
            salario = salarioBase - (salarioBase * porcentajeImpuestos / 100)
        }

        return salario + bonus
    }

    /**
     * Realiza la acción de administrar e imprime un mensaje.
     *
     * @return Mensaje que indica que el gerente está administrando la empresa.
     */
    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }

    /**
     * Representación de la información del gerente en formato de cadena.
     *
     * @return Cadena que representa la información del gerente.
     */
    override fun toString(): String {
        return super.toString() + ", Bonus: $bonus."
    }
}
