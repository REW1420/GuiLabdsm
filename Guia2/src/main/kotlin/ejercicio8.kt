import java.time.LocalDateTime
import java.util.Date

fun main(args: Array<String>) {

    var ano = 0
    var mes = 0
    var dia = 0
    val anoActual = LocalDateTime.now()
    var fecha = 0
    var bebe = 0

    do {

        println("Ingrese su dia de nacimiento")
        dia = readln().toInt()
        if ( dia > 32) {
        println("Los meses solo tienen 31 dias")
        };if (dia <= 0){
            println("Los dias no pueden ser 0 o negativo")
        }
    }while (dia > 32 || dia <= 0)

    do {


        println("Ingrese su mes de nacimiento")
        mes= readln().toInt()
        if ( mes > 12) {
            println("Los años solo tienen 12 meses")
        };if (mes <= 0){
            println("Los meses no pueden ser 0 o negativo")
        }
    }while ((mes > 12) || (mes <= 0))

    do {


        println("Ingrese su año de nacimiento")
        ano= readln().toInt()
        if ( ano <= 0) {
            println("Los años no pueden ser negativos")
        }
    }while (ano <= 0)

    fecha = (anoActual.year-ano)

    if (fecha == 0){
        bebe = anoActual.monthValue - mes
        println("Su fecha de nacimiento es $dia,$mes,$ano y tiene "+bebe+" meses")

    };if (fecha > 0){
        println("Su fecha de nacimiento es $dia,$mes,$ano y tiene "+fecha+" años")
    }


}