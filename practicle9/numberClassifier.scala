object NumberClassifier {

  val classifyNumber: Int => String = num => num match {
    case x if x <= 0    => "Negative/Zero is input"
    case x if x % 2 == 0 => "Even number is given"
    case _              => "Odd number is given"
  }

  def main(args: Array[String]): Unit = {
    // Ask the user for an input
    println("Please enter an integer:")

    // Read input from the console
    val input = scala.io.StdIn.readInt()

    // Classify the number and print the result
    println(classifyNumber(input))
  }
}
