object QS3 {
    def mean(num1: Int,num2: Int):Double = {
      val avg =(num1+num2)/2.0
      BigDecimal(avg).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
}
   def main(args:Array[String]):Unit={
     val num1=5
     val num2=10
     val result=mean(num1,num2)
     println(f"The mean of $num1 and $num2 is $result%.2f")
}
}

