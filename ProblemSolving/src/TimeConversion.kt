import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var totalTime = input.nextInt()

    var totalHour = totalTime / 3600
    var remainder = totalTime % 3600

    var totalMinute = remainder / 60
    remainder = remainder % 60

    println("$totalHour:$totalMinute:$remainder")

}