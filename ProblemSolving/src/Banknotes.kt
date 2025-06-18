import java.util.Scanner


fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var amount = input.nextInt()
    println(amount)

    var taka = listOf<Int>(100, 50, 20, 10, 5, 2, 1)


    for (i in taka) {
        var result = amount / i
        println("$result nota(s) de R$ $i,00")
        amount = amount % i
    }
}