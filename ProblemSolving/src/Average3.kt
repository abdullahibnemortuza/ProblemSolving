fun main(args: Array<String>) {
    var (N1, N2, N3, N4) = readLine()!!.split(" ").map { it.toFloat() }

    var result = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10

    println("Media: %.1f".format(result))

    if (result >= 7.0) {
        println("Aluno aprovado.")
    } else if (result < 5.0) {
        println("Aluno reprovado.")
    } else if (result in 5.0..6.9) {
        println("Aluno em exame.")
        var examScore = readLine()!!.toFloat()
        println("Nota do exame: $examScore")
        result = (result + examScore) / 2
        if (result >= 5.0) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado.")
        }
        println("Media final: %.1f".format(result))
    } else {
        println("Aluno reprovado.")
    }
}