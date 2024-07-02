object stringFilter{
   def filterStringLength(strings:List[String]): List[String] = {
       strings.filter(_.length > 5)
}
   def main(args:Array[String]): Unit={
       val inputString = List("sawani","vihanga","abeywickrama","shashini","dilmin")
       val filteredStrings = filterStringLength(inputString)
       println(s"Filtered strings: $filteredStrings")
}
}
