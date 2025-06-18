import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var spentTime = input.nextInt()
    var averageSpeed = input.nextInt()
    val milage = 12.0

    var totalDistance = spentTime * averageSpeed

    var fuelSpent = totalDistance / milage

    println("%.3f".format(fuelSpent))

}