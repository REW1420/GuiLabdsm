class Hijos {

    var edades = IntArray(5)

    fun datos(){
        var bandera = 1
        for(i in 0..4) {
            print("Ingrese edad $bandera:")


            edades[i] = readln().toInt()
            bandera++
        }

}fun impresion(){
    var bandera = 1
        for(i in 0..4) {
            println("La edad $bandera es :"+edades[i])
            bandera++
        }
    }

    fun promedio(){
        var pro : Int

        pro=(edades.sum()/5)
        println("El promedio de las edades es $pro")

    }
}