fun main(args: Array<String>) {
    var (A, B, C) = readLine()!!.split(" ").map { it.toFloat() }

    if ((A < B + C) && (B < A + C) && (C < A + B)) {
        var result = A + B + C
        println("Perimetro = %.1f".format(result))
    } else {
        var result2 = ((A + B) * C) / 2
        println("Area = %.1f".format(result2))
    }
}