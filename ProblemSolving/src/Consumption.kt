import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var distance = input.nextInt()
    var fuelSpent = input.nextFloat()

    var consumption = distance / fuelSpent




    println("%.3f km/l".format(consumption))
}