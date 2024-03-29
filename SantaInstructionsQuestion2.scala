/*this code is from day 1 question 2*/
object SantaInstructionsQuestion2 {

  def findFloor(instructions: String): Int = {
    var floor = 0

    for ((char, position) <- instructions.zipWithIndex) {
      if (char == '(') {
        floor += 1
      } else if (char == ')') {
        floor -= 1
      }

      if (floor == -1){
        return position + 1
      }
    }

    -1
  }

  def main(args: Array[String]): Unit = {
    println("Enter the instructions:")
    val instructions = scala.io.StdIn.readLine()
    val finalFloor = findFloor(instructions)
    println(s"Santa ends up on floor $finalFloor.")
  }
}
