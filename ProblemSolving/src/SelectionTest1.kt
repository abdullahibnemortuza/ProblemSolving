fun main(args: Array<String>) {
    var (A, B, C, D) = readLine()!!.split(" ").map { it.toInt() }

    if (B > C && D > A) {
        if (C + D > A + B) {
            if (C >= 0 && D >= 0 && A % 2 == 0) {
                println("Valores aceitos")
            } else {
                println("Valores nao aceitos")
            }
        } else {
            println("Valores nao aceitos")
        }
    } else {
        println("Valores nao aceitos")
    }
}