object Item {

  var items: Array[String] = Array("Books", "Coconut", "Chocolate", "Pots")
  var quantities: Array[Int] = Array(70, 50, 60, 40)

  def displayInventory(): Unit = {
    println();
    println("Items of the Store:")
    println()
    for (i <- items.indices) {
      println(s"${items(i)} : ${quantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = items.indexOf(itemName)

    if (index != -1) {
      quantities(index) = quantities(index) + quantity
      println(s"Restocked $quantity of $itemName : New quantity : ${quantities(index)}")
    } else {
      println(s"Item '$itemName' not found in inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = items.indexOf(itemName)

    if (index != -1) {
      if (quantities(index) >= quantity) {
        quantities(index) = quantities(index) - quantity
        println(s"Sold $quantity of $itemName : New quantity : ${quantities(index)}")
      } else {
        println(s"Not enough $itemName in inventory to sell $quantity.")
      }
    } else {
      println(s"Item '$itemName' not found in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    println()
    println("After Restocked Items: ")
    println()
    restockItem("Books", 20)
    restockItem("Coconut", 10)
    restockItem("Chocolate", 30)
    restockItem("Tables", 20)
    println();
    println("After Sold Items:")
    println();
    sellItem("Books", 10)
    sellItem("Pots", 2)
  }
}
