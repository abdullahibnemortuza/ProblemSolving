import java.util.Scanner
import kotlin.math.abs
import kotlin.math.pow

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var a = input.nextInt()
    var b = input.nextInt()
    var c = input.nextInt()

    var resultOne = (a + b + abs(a - b)) / 2

    var finalResult = (c + resultOne + abs(c-resultOne)) / 2

    println("$finalResult eh o maior")
}