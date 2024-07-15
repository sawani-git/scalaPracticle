object sclQ5_2 {

  case class Book(name: String, author: String, isbn: String)

  var lib: Set[Book] = Set()
  
  def addBook(book: Book): Unit = {
    lib += book
    println(book)
  }

 
  def removeBook(isbn: String): Unit = {
    lib = lib.filterNot(_.isbn == isbn)
    println(s"Book with ISBN '$isbn' removed.")
  }

  
  def searchByTitle(name: String): Unit= {
    println(lib.filter(_.name.toLowerCase.contains(name.toLowerCase)))
  }

  
  def searchByAuthor(author: String): Unit= {
    println(lib.filter(_.author.toLowerCase.contains(author.toLowerCase)))
    
  }


  def searchByIsbn(isbn: String): Unit = {
    println(lib.find(_.isbn == isbn))
  }

  
  def main(args: Array[String]): Unit = {
    val b1 = Book("athurudahan wu nawkawa", "A.B.Karunadasa", "1234567")
    val b2 = Book("madolduwa", "Martin Wicckramsingha", "1234568")
    val b3 = Book("matigedara lamai", "sibil weththasinghe", "1234569")
    
    println("Books Informations...")
    addBook(b1)
    addBook(b2)
    addBook(b3)

    println("\nSearch by title 'matigedara lamai':")
    searchByTitle("matigedara lamai")

    println("\nSearch by author 'A.B.Karunadasa':")
    searchByAuthor("A.B.Karunadasa")

    println("\nSearch by ISBN '':")
    searchByIsbn("1234568")

    println("\nRemove book with ISBN '1234568':")
    removeBook("1234568")

    println("\nLibrary after removal:")
    lib.foreach(println)
  }
}

	

