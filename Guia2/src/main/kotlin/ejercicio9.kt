fun main(args: Array<String>) {

    var op1 = ""
    var op2 = 0
    var op3 = 0
    var colon = 0.0F
    var dolar = 0.0
    var milla = 0.0F
    var km = 0.0
    var gc = 0.0F
    var gf = 0.0
    do {
        println("Menu: \n" +
                "a) conversión de colones a dólares\n" +
                "b) conversión de millas a kms\n" +
                "c) conversión de grados Celsius a grados Fahrenheit\n" +
                "d) segundo menú\n" +
                "e) fin de menu")
        op1= readln()
        do {


            if (op1 == "a") {
                println("Ingrese la cantidad de colones que quiere convertir a dolares")
                colon = readln().toFloat()
                dolar = ((colon * 0.0016))
                println("Los $colon colon a dolar es: $dolar")
                println(
                    "1. Calcular denuevo\n" +
                            "0. Regresar"
                )
                op3 = readln().toInt()

            }
        }while (op3!=0)

        do {



            if (op1 == "b"){
                println("Ingrese la cantidad de millas que quiere convertir a km")
                milla= readln().toFloat()
                km=((milla * 1.60934))
                println("Las $milla millas a kms es: $km")



                println(
                    "1. Calcular denuevo\n" +
                            "0. Regresar"
                )
                op3 = readln().toInt()

            }
        }while (op3!=0)

        do {
            if (op1 == "c"){
                println("Ingrese la cantidad de grados Celsius que quiere convertir a grados Fahrenheit")
                gc= readln().toFloat()
                gf=((gc * 1.8)+32)
                println("Los $gc de grados Celsius a grados Fahrenheit son: $gf")
                println(
                    "1. Calcular denuevo\n" +
                            "0. Regresar"
                )
                op3 = readln().toInt()

            }
        }while (op3!=0)


        if (op1 == "d") {
            do {
                println(
                    "Menu: \n" +
                            "1. si es positivo o negativo\n" +
                            "2. área de un triangulo\n" +
                            "3. fin submenú"
                )
                op2 = readln().toInt()

                do {
                    if (op2 == 1) {
                        println("Ingrese el numero")
                        var numero = readln().toInt()

                        if (numero > 0) {
                            println("Es positivo")
                        } else {
                            println("Es negativo")
                        }

                        println(
                            "1. Calcular denuevo\n" +
                                    "0. Regresar"
                        )
                        op3 = readln().toInt()

                    }
                } while (op3 != 0)

                do {
                    if (op2 == 2) {
                        println("Ingrese la base del triangulo")
                        var base = readln().toFloat()
                        println("Ingrese la altura del triangulo")
                        var altura = readln().toFloat()

                        var area = (base * altura)/2

                        println("El area del triangulo es $area")

                        println(
                            "1. Calcular denuevo\n" +
                                    "0. Regresar"
                        )
                        op3 = readln().toInt()

                    }
                } while (op3 != 0)


            } while (op2 != 3)

        }



    }while (op1!="e")
}