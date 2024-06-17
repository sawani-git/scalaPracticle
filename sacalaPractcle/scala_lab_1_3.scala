object scala_lab_1_3{
	def main(args:Array[String]): Unit={
           val radius:Double = 5
           val volume = calculateVolume(radius)
           println(f"The volume of a sphere with radius $radius%.2f is $volume%.2f")
}
        def calculateVolume(radius:Double):Double={
           val Pi:Double = 3.14
           4/3*Pi*radius*radius* radius
}
}
