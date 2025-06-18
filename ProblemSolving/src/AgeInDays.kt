import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var daysInTotal = input.nextInt()

    var year = daysInTotal / 365

    println("$year ano(s)")

    var remainDays = daysInTotal % 365

    var month = remainDays / 30

    println("$month mes(es)")

    remainDays = remainDays % 30

    println("$remainDays dia(s)")

}