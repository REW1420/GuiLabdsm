fun main(args: Array<String>) {

  var a = 0
    var b = 0
    var c = 0

    println("Ingreese el primer numero")
    a=readln().toInt()
    println("Ingreese el segundo numero")
    b=readln().toInt()
    println("Ingreese el tercer numero")
    c=readln().toInt()

    if (a + b == c){
        println("$c es igual a $a + $b")
    }else{
        println("no cumple")
    }
}