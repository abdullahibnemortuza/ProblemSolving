import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var eNumber = input.next()
    var baseSalary = input.nextDouble()
    var soldAmount = input.nextDouble()

    var salary = baseSalary + (soldAmount * 0.15)

    println("TOTAL = R$ %.2f".format(salary))
}