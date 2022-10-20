class Empleado {
    var nombre = ""
    var sueldo = 0

    var empleados = mutableListOf<String>()
    var sueldos = mutableListOf<Int>()

    fun datos(){
        var b = 1

        for (i in (1..3)){
            println("Imgrese el nombre del empleado: ")
            nombre= readln()
            empleados.add(nombre)
            println("Ingrese el sueldo del empleado: ")
            sueldo= readln().toInt()
            sueldos.add(sueldo)

        }

        for (i in sueldos){
            println("Nombre $b: "+empleados[i]+"sueldo: "+sueldos[i])

            b++
        }
        var total = sueldos.sum()
        println("La empresa gasta un total de $total en sueldos")
    }

}