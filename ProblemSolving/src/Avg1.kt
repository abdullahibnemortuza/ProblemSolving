import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var A = input.nextDouble()
    var B = input.nextDouble()

    var avg = (A * 3.5 +  B * 7.5) / (3.5 + 7.5)

    println("MEDIA = %.5f".format(avg))
}