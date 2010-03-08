package problem2

object EvenFibCounter {
  def main(args: Array[String]) {
    var fibNumbers = List[Int](1, 0)

    while (fibNumbers(0) < 4000000)
      fibNumbers = fibNumbers(0) + fibNumbers(1) :: fibNumbers

    val sum = fibNumbers.filter(_%2==0).reduceLeft(_+_)

    println("Sum is: " + sum)
  }
}
