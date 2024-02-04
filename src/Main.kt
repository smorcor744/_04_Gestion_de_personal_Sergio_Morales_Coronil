fun main() {
    val persona = Persona("Lucia", 5)
    val empleado =  Empleado("Marta",18,2220.221110)
    val gerente: Gerente = Gerente("Rafa",20,2000.0, 33.2,223.6, true )
    // Mostrar información de la Persona
    println("Información de Persona:")
    println(persona)

    // Mostrar información del Empleado
    println("\nInformación de Empleado:")
    println(empleado)

    // Mostrar información del Gerente
    println("\nInformación de Gerente:")
    println(gerente)

    // Mostrar trabajar y administrar
    empleado.trabajar()
    gerente.administrar()

    // Celebrar cumpleaños de la Persona
    persona.celebrarCumple()

    // Mostrar información actualizada después de celebrar el cumpleaños
    println("\nInformación de Persona después de celebrar cumpleaños:")
    println(persona)
}