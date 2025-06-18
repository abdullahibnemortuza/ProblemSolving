import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var radius = input.nextDouble()

    val pi = 3.14159

    var volume = (4 / 3.0) * pi * radius.pow(3)

    println("VOLUME = %.3f".format(volume))
}