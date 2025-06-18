import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var eNumber = input.nextInt()
    var workedHour = input.nextInt()
    var salaryPerHour = input.nextDouble()

    var salary = workedHour * salaryPerHour

    println("NUMBER = $eNumber")
    println("SALARY = U$ %.2f".format(salary))
}