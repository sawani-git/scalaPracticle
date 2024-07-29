import scala.io.StdIn._

object StudentRecordsApp extends App {
  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student name: ")
    val name = readLine()
    println("Enter marks obtained: ")
    val marks = readInt()
    println("Enter total possible marks: ")
    val totalMarks = readInt()

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks must be between 0 and total possible marks"))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var validInput = false
    var name = ""
    var marks = 0
    var totalMarks = 0

    while (!validInput) {
      println("Enter student name: ")
      name = readLine()
      println("Enter marks obtained: ")
      marks = readInt()
      println("Enter total possible marks: ")
      totalMarks = readInt()

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        validInput = true
      } else {
        println(s"Invalid input: ${errorMessage.get}")
      }
    }

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  // Example Usage
  val studentInfo = getStudentInfoWithRetry()
  printStudentRecord(studentInfo)
}
