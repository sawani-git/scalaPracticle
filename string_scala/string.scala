object string{
   def reverseString(str:String): String = {
      if (str.isEmpty)""
      else reverseString(str.tail) + str.head
}
   def main(args:Array[String]): Unit = {
      val string ="SAWANI"
      val reversedString = reverseString(string)
      println(s"Original: $string , Reversed: $reversedString")
}
}
