object scala_Lab_2_3 {

  def main(args: Array[String]): Unit = {
    // Cost per hour
    val normalWorkCost = 250
    val overtimeCost = 85

    
    val normalHours = 40
    val overtimeHours = 30 

  
    val taxRate = 0.12

    // Calculate total take-home salary
    val takeHomeSalary = totalTakeHomeSalary(normalWorkCost, overtimeCost, normalHours, overtimeHours, taxRate)

   
    println(s"The normal work cost per hour is Rs$normalWorkCost")
    println(s"The overtime work cost per hour is Rs$overtimeCost")
    println(s"Tax rate per week is $taxRate")
    println(s"The total take-home salary is Rs$takeHomeSalary")
  }

  def totalTakeHomeSalary(normalWorkCost: Int, overtimeCost: Int, normalHours: Int, overtimeHours: Int, taxRate: Double): Double = {
    val totalNormalCost = normalWorkCost * normalHours
    val totalOvertimeCost = overtimeCost * overtimeHours
    val totalSalary = totalNormalCost + totalOvertimeCost
    val taxCost = totalSalary * taxRate

    // Return the take-home salary 
    totalSalary - taxCost
  }
}
  
