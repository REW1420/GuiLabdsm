fun main(args: Array<String>) {
    val numeros = mutableListOf<Int>()


    for (x in (1..100)){
        var numero =0
        numero=(0..20).random()
        numeros.add(numero)
    }
    val bandera = numeros.count { (it >= 1) && (it <= 4) }
    val bandera2 = numeros.count { (it >= 10) && (it <= 13) }

    if (numeros.contains(20)) println("El numero 20 esta presente") else println("El numero 20 no esta presente")
    println(numeros.size)
    println(bandera)
    println(bandera2)
}