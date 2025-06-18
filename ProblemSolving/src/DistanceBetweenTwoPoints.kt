import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt


fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var x1 = input.nextDouble()
    var y1 = input.nextDouble()
    var x2 = input.nextDouble()
    var y2 = input.nextDouble()

    var distance = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("%.4f".format(distance))
}