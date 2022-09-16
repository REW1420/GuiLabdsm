fun main(args: Array<String>) {

    var op = 0
    var op2 = 0


    do {
        println("menu: \n" +
                "1. Kg a libras\n" +
                "2. Kg a onzas\n" +
                "3. Kg a toneladas")
        op= readln().toInt()

do {
    if (op == 1){
        println("Ingrese los Kg a libras")
        var kg = readln().toFloat()
        var lbs = kg * 2.205
        println("los $kg kg a libras es $lbs")
        println(
            "1. Calcular denuevo\n" +
                    "0. Regresar"
        )
        op2 = readln().toInt()
    }
}while (op2!=0)

        do {
            if (op == 2){
                println("Ingrese los Kg a onzas")
                var kg = readln().toFloat()
                var onz = kg * 35.274
                println("los $kg kg a onzas es $onz")
                println(
                    "1. Calcular denuevo\n" +
                            "0. Regresar"
                )
                op2 = readln().toInt()
            }
        }while (op2!=0)

        do {
            if (op == 3 ){
                println("Ingrese los Kg a toneladas")
                var kg = readln().toFloat()
                var tn = kg / 1000
                println("los $kg kg a tonelada es $tn")
                println(
                    "1. Calcular denuevo\n" +
                            "0. Regresar"
                )
                op2 = readln().toInt()
            }
        }while (op2!=0)


    }while (op!=4)

}