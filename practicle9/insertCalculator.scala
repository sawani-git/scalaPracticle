object InterestCalculator {

  val calculateInterest: Double => Double = depositAmount => depositAmount match {
    case amount if amount <= 20000    => amount * 0.02
    case amount if amount <= 200000   => amount * 0.04
    case amount if amount <= 2000000  => amount * 0.035
    case amount if amount > 2000000   => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
   
    val deposit1 = 15000.0
    val deposit2 = 50000.0
    val deposit3 = 1500000.0
    val deposit4 = 2500000.0

    
    println(s"Interest for Rs. $deposit1: Rs. ${calculateInterest(deposit1)}")
    println(s"Interest for Rs. $deposit2: Rs. ${calculateInterest(deposit2)}")
    println(s"Interest for Rs. $deposit3: Rs. ${calculateInterest(deposit3)}")
    println(s"Interest for Rs. $deposit4: Rs. ${calculateInterest(deposit4)}")
  }
}
