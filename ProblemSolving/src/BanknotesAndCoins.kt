import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var amount = (input.nextDouble() * 100).roundToInt()

    var taka = listOf<Int>(10000, 5000, 2000, 1000, 500, 200)
    var poisa = listOf<Int>(100, 50, 25, 10, 5, 1)
    println("NOTAS:")


    for (i in taka) {
        var result = amount / i
        println("$result nota(s) de R$ %.2f".format(i / 100.0))
        amount = amount % i
    }
    var amountTwo = amount

    println("MOEDAS:")

    for (j in poisa) {
        var resultTwo = amountTwo / j
        println("$resultTwo moeda(s) de R$ %.2f".format(j / 100.0))
        amountTwo = amountTwo % j
    }
}