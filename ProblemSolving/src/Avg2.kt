import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var A = input.nextDouble()
    var B = input.nextDouble()
    var C = input.nextDouble()

    var avg = (A * 2 +  B * 3 + C * 5) / (2 + 3 + 5)

    println("MEDIA = %.1f".format(avg))
}