object sclQ5_3{
	def main(args:Array[String]):Unit={
	var s:Int = fib(5)
	println(s)	

	}
	def fib(n:Int):Int={
	if(n<2){return 1}
	else{fib(n-1)+fib(n-2)}
	}


}
