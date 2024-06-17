object scala_lab_1_2 {
	def main(args:Array[String]): Unit={
	    val celsius:Double=35.0
	    val fahrenheit:Double= celsiusToFahrenheit(celsius)
            println(f"The temperature $celsius%.2fC is equal to $fahrenheit%.2fF")
}

        def celsiusToFahrenheit(celsius:Double):Double={
            celsius * 1.8000 + 32.00
}
}
