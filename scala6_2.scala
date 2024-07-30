import scala.io.StdIn.readLine

object StudentRecords {

  // Function to validate input

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
      (false, Some("Marks must be positive and not exceed total possible marks"))
    } else {
      (true, None)
    }
  }

  // Function to get student information

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, ' ')

    while (!isValid) {
      println("Enter student's name:")
      val name = readLine().trim

      println("Enter marks obtained:")
      val marks = readLine().trim.toInt

      println("Enter total possible marks:")
      val totalMarks = readLine().trim.toInt

      val (valid, errorMessage) = validateInput(name, marks, totalMarks)

      if (valid) {
        val percentage = (marks.toDouble / totalMarks) * 100
        val grade = percentage match {
          case p if p >= 90 => 'A'
          case p if p >= 75 => 'B'
          case p if p >= 50 => 'C'
          case _            => 'D'
        }
        studentInfo = (name, marks, totalMarks, percentage, grade)
        isValid = true
      } else {
        println(s"Invalid input: ${errorMessage.get}")
      }
    }

    studentInfo
  }

  // Function to print student record

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f")
    println(s"Grade: $grade")
  }

  def main(args: Array[String]): Unit = {
    println("Student Record Management System")
    val studentRecord = getStudentInfo()
    printStudentRecord(studentRecord)
  }
}
