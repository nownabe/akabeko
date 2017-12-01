package rational

fun main(args: Array<String>) {
    val half = Rational(1, 2)
    println(half.denominator)
    println(half)

    try {
        Rational(1, 0)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println(Rational(17, 17))
    println(Rational(55, 100))
    println(Rational(1234, 5678))
}