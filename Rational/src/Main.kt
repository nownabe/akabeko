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

    println("\n# 3.5 演算子オーバーロード")
    println(Rational(1, 4).plus(Rational(1, 2)))
    println(Rational(1, 3).plus(Rational(4, 7)))

    println(Rational(1,2) + Rational(1, 5))
    println(Rational(1,6) + Rational(1,3) + Rational(1, 2))

    println("\n# 3.6 メソッドのオーバロード")
    println(Rational(1, 4) + 1)
    println(Rational(1, 1) + 2)
}