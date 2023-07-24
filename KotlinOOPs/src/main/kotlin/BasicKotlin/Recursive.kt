fun fibonacci(n: Int): Long {
    if (n <= 0) {
        throw IllegalArgumentException("Invalid input. Please provide a positive integer.")
    }
    if (n == 1 || n == 2) {
        return 1
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val n = 10 // Number of Fibonacci numbers to generate
    for (i in 1..n) {
        val fibonacciNumber = fibonacci(i)
        println(fibonacciNumber)
    }
}
