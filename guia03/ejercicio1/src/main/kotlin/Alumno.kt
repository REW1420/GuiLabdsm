class Alumno {
    var nombre : String = ""
    var nota : Float = 0.0F

    fun datos(){
        println("Ingrese el nombre del estudiante")
        nombre = readln()
        println("Ingrese la nota del estudiate")
        nota = readln().toFloat()
    }

    fun validacion(){
        if (nota >= 4) println("La nota es regular")
    }

    fun impresion(){
        println("$nombre con nota $nota tiene validacion de:")
    }
}