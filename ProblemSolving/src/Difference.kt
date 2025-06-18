import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var A = input.nextInt()
    var B = input.nextInt()
    var C = input.nextInt()
    var D = input.nextInt()


    var difference = (A * B -  C * D)

    println("DIFERENCA = $difference")
}