package problem6

object SquareSummer {

    def square(x: Long) = (x * x).toLong
  
    def sumOfSquares(): Long = {
        var sum = 0L
        for (i <- 1 to 100) {
            sum += square(i)
        }
        return sum
    }

    def squareOfSums(): Long = {
        return square((1 to 100).reduceLeft(_+_))
    }

    def main(args: Array[String]) {
        println("Difference is: " + (squareOfSums - sumOfSquares).toString)
    }
}