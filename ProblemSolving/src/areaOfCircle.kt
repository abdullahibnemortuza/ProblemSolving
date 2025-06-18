import java.util.Scanner

fun main(args: Array<String>) {
    val pi = 3.14159
    var input = Scanner(System.`in`)

    var R = input.nextDouble()

    var area = pi * R * R
    println("A=%.4f".format(area))
    //var areaCircle = String.format("%.4f", area)

   // println("A=$areaCircle")

}