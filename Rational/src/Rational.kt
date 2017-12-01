package rational

class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be zero"})
    }

    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator by lazy { n / g }
    val denominator by lazy { d / g }

    operator fun plus(that: Rational) = Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
    )

    override fun toString() = "$numerator/$denominator"

    tailrec private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
