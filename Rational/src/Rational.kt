package rational

class Rational(val numerator: Int, val denominator: Int) {
    init {
        require(denominator != 0, {"denominator must not be zero"})
    }

    override fun toString() = "$numerator/$denominator"
}
