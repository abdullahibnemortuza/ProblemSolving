import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var (A, B, C) = readLine()!!.split(" ").map { it.toDouble() }

    var delta = B.pow(2) - 4 * A * C

    if (A == 0.0 || delta < 0) {
        println("Impossivel calcular")

    } else {
        var r1 = (-B + sqrt(delta)) / (2 * A)
        var r2 = (-B - sqrt(delta)) / (2 * A)

        println("R1 = %.5f".format(r1))
        println("R2 = %.5f".format(r2))

    }

}