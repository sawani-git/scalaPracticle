object scala_lab_1_1 {
	def main(args: Array[String]): Unit={
            val radius:Double=5.0
            val area=calculateArea(radius)
            println(s"The area of a disk with radius $radius is $area")
       }
       
        def calculateArea(radius: Double): Double = {
         val Pi: Double=3.14
	 Pi*radius*radius

            
	    

	}
}
