object NameFormatter {

  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  
  def main(args: Array[String]): Unit = {
    
    println(formatNames("Benny")(toUpper))    
    println(formatNames("Niroshan")(name =>
      name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)
    println(formatNames("Saman")(toLower))   
    println(formatNames("Kumara")(name =>
      name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase))
  }
}
