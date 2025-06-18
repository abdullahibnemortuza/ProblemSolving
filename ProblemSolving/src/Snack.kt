import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var productCode = input.nextInt()
    var quantity = input.nextInt()

    var price = when (productCode) {
        1 -> 4.00
        2 -> 4.50
        3 -> 5.00
        4 -> 2.00
        5 -> 1.50
        else -> 0.0
    }

    var total = price * quantity
    println("Total: R$ %.2f".format(total))

}