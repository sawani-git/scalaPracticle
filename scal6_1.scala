case class Product(id: Int, name: String, quantity: Int, price: Double)

val inventory1: Map[Int, Product] = Map(
  101 -> Product(101, "ProductA", 50, 20.0),
  102 -> Product(102, "ProductB", 30, 40.0),
  103 -> Product(103, "ProductC", 20, 15.0)
)

val inventory2: Map[Int, Product] = Map(
  101 -> Product(101, "ProductA", 70, 25.0),
  104 -> Product(104, "ProductD", 10, 35.0)
)

// Retrieve all product names from inventory1
val productNames = inventory1.values.map(_.name).toList
println("Product Names: " + productNames.mkString(", "))

// Calculate the total value of all products in inventory1
val totalValue = inventory1.values.map(product => product.quantity * product.price).sum
println("Total Value of Inventory1: " + totalValue)

// Check if inventory1 is empty
val isEmpty = inventory1.isEmpty
println("Is Inventory1 Empty? " + isEmpty)

//  Merge inventory1 and inventory2, updating quantities and retaining the highest price
def mergeInventories(inv1: Map[Int, Product], inv2: Map[Int, Product]): Map[Int, Product] = {
  inv2.foldLeft(inv1) {
    case (mergedInv, (id, newProduct)) =>
      mergedInv.get(id) match {
        case Some(existingProduct) =>
          val updatedProduct = existingProduct.copy(
            quantity = existingProduct.quantity + newProduct.quantity,
            price = math.max(existingProduct.price, newProduct.price)
          )
          mergedInv + (id -> updatedProduct)
        case None =>
          mergedInv + (id -> newProduct)
      }
  }
}

val mergedInventory = mergeInventories(inventory1, inventory2)
println("Merged Inventory: " + mergedInventory.values.mkString(", "))

//  Check if a product with a specific ID (e.g., 102) exists and print its details
val productIdToCheck = 102
val productExists = inventory1.get(productIdToCheck)

productExists match {
  case Some(product) => println(s"Product with ID $productIdToCheck: $product")
  case None => println(s"Product with ID $productIdToCheck does not exist in inventory1")
}
