package rational

class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be zero"})
    }

    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator = n / g
    val denominator = d / g

    override fun toString() = "$numerator/$denominator"

    tailrec private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
