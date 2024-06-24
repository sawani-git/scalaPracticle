object scala_lab_2_1 {

  def main(args: Array[String]): Unit = {
    var k, i, j: Int = 2
    var m, n: Int = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    println("Initial values:")
    println(s"k = $k")
    println(s"i = $i")
    println(s"j = $j")
    println(s"m = $m")
    println(s"n = $n")
    println(s"f = $f")
    println(s"g = $g")
    println(s"c = $c")

    val R_a = k + 12 * m
    val R_b = m / j
    val R_c = n % j
    val R_d = n / j * j
    val R_e = f + 10 * 5 + g
     i +=1
    val R_f = i * n

    println(s"a. k + 12 * m = $R_a")
    println(s"b. m / j = $R_b")
    println(s"c. n % j = $R_c")
    println(s"d. m / j * j = $R_d")
    println(s"e. f + 10 * 5 + g = $R_e")
    println(s"f. ++i*n = $R_f")
  }
}

