import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var productCodeOne = input.nextInt()
    var unitOfProductOne = input.nextInt()
    var priceProductOne = input.nextDouble()

    var productCodeTwo = input.nextInt()
    var unitOfProductTwo = input.nextInt()
    var priceProductTwo = input.nextDouble()


    var amount = (unitOfProductOne * priceProductOne) + (unitOfProductTwo * priceProductTwo)

    println("VALOR A PAGAR: R$ %.2f".format(amount))
}