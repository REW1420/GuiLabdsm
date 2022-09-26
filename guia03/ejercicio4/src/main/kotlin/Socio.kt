open class Socio {
    var nombre: Array<String> = emptyArray()
    var antiguedad = IntArray(3)


    fun datos() {
      var bandera = 1
        for (i in 1..3) {
            println("Ingresar el nombre del $bandera socio: ")

            nombre[i]= readln()
            println("Ingresar la antiguedad: ")

            antiguedad[i]= readln().toInt()

        }
    }

}