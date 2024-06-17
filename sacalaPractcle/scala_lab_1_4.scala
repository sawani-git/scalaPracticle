object scala_lab_1_4{
       def main(args: Array[String]): Unit={
             val numberOfBooks = 60
             val price: Double =24.95
             val discount: Double=0.40
             val shippingCost: Double=3.0
             val cost=wholesaleCost(price,numberOfBooks,discount,shippingCost)
             println(f"The total wholescale cost  for $numberOfBooks copies is Rs.$cost%.2f")
}
       def wholesaleCost(price: Double,numberOfBooks: Int,discount: Double,shippingCost: Double): Double = {
             val discountPrice = price * (1-discount)
             val totalBookCost = discountPrice * numberOfBooks
             val shippingTotal =if (numberOfBooks-50 >0) shippingCost +  (numberOfBooks - 50)*0.75 else shippingCost
             totalBookCost + shippingTotal

       
  }
}
