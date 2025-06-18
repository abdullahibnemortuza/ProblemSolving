import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var A = input.nextDouble()
    var B = input.nextDouble()
    var C = input.nextDouble()

    var areaTriangle = triangle(A,C)
    var areaCircle = circle(C)
    var areaTrapezium = trapezium(A,B,C)
    var areaSquare = square(B)
    var areaRectangle = rectangle(A,B)

    println("TRIANGULO: %.3f".format(areaTriangle))
    println("CIRCULO: %.3f".format(areaCircle))
    println("TRAPEZIO: %.3f".format(areaTrapezium))
    println("QUADRADO: %.3f".format(areaSquare))
    println("RETANGULO: %.3f".format(areaRectangle))

}

fun triangle(A: Double, C: Double): Double{
    return (1/2.0) * A * C
}
fun circle(C: Double): Double{
    val pi =3.14159
    return pi * C.pow(2)
}
fun trapezium(A:Double, B: Double, C: Double): Double{

    return (1/2.0)* (A + B) * C
}
fun square(B: Double): Double{

    return B.pow(2)
}
fun rectangle(A:Double, B: Double): Double{

    return A * B
}