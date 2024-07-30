object InventorySystem {

  // Define the product type as a case class

  case class Product(name: String, quantity: Int, price: Double)

  // Sample inventory1 and inventory2

  val inventory1: Map[Int, Product] = Map(
    101 -> Product("ProductA", 10, 100.0),
    102 -> Product("ProductB", 5, 150.0),
    103 -> Product("ProductC", 8, 200.0)
  )

  val inventory2: Map[Int, Product] = Map(
    101 -> Product("ProductA", 20, 90.0),
    104 -> Product("ProductD", 15, 300.0)
  )

  // 1. Retrieve all product names from inventory1

  def getProductNames(inventory: Map[Int, Product]): Iterable[String] = {
    inventory.values.map(_.name)
  }

  // 2. Calculate the total value of all products in inventory1

  def calculateTotalValue(inventory: Map[Int, Product]): Double = {
    inventory.values.map(product => product.quantity * product.price).sum
  }

  // 3. Check if inventory1 is empty

  def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = {
    inventory.isEmpty
  }

  // 4. Merge inventory1 and inventory2, updating quantities and retaining the highest price

  def mergeInventories(inv1: Map[Int, Product], inv2: Map[Int, Product]): Map[Int, Product] = {
    inv2.foldLeft(inv1) { case (acc, (id, newProduct)) =>
      acc.get(id) match {
        case Some(existingProduct) =>
          acc + (id -> Product(
            existingProduct.name,
            existingProduct.quantity + newProduct.quantity,
            math.max(existingProduct.price, newProduct.price)
          ))
        case None =>
          acc + (id -> newProduct)
      }
    }
  }

  // 5. Check if a product with a specific ID (e.g., 102) exists and print its details

  def checkProductExists(inventory: Map[Int, Product], id: Int): Unit = {
    inventory.get(id) match {
      case Some(product) => println(s"Product ID: $id, Details: $product")
      case None => println(s"Product ID: $id does not exist.")
    }
  }

  // Main method to run the code

  def main(args: Array[String]): Unit = {
    println("1. Product Names in Inventory1: " + getProductNames(inventory1).mkString(", "))
    println()
    println("2. Total Value of Inventory1: " + calculateTotalValue(inventory1))
    println()
    println("3. Is Inventory1 Empty? " + isInventoryEmpty(inventory1))
    println()

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("4. Merged Inventory: " + mergedInventory)
    println()

    println("5. Check if Product ID 102 exists in Inventory1:")
    checkProductExists(inventory1, 102)
  }
}
