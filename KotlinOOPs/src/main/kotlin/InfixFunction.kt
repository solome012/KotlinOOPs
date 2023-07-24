class InfixFunction {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = InfixFunction()
            p createPyramid 5
        }
    }

    infix fun createPyramid(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..rows - i) {
                print(" ")
            }
            for (k in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}
