object sclQ5_3 {
  def main(args: Array[String]): Unit = {
    val n = 5
    println(s"The first $n Fibonacci numbers are:")
    printFibonacciNumbers(n)
  }
  def printFibonacciNumbers(n: Int): Unit = {
    for (i <- 0 until n) {
      println(fib(i))
    }
  }
  def fib(n: Int): Int = {
    if (n == 0) return 0
    if (n == 1) return 1
    fib(n - 1) + fib(n - 2)
  }
}
