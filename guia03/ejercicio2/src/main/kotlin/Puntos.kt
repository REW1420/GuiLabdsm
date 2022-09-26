class Puntos {
    var x : Int = 0
    var y : Int = 0

    fun datos(){
        println("Ingrese el punto x")
        x= readln().toInt()
        println("Ingrse el punto y")
        y=readln().toInt()
    }

    fun validaciones(){
        if (x>0 && y>0) println("$x y $y esta en el primer cuadrante")
        if (x<0 && y>0) println("$x y $y esta en el segundo cuadrante")
        if (x<0 && y<0) println("$x y $y esta en el tercer cuadrante")
        if (x>0 && y<0) println("$x y $y esta en el cuarto cuadrante")

    }
}