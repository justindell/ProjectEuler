package problem3

import scala.collection.immutable.TreeSet

object PrimeFactorizer {
  def main(args: Array[String]) {
    val bigNumber: Long = 600851475143L
    val sqrtFromDouble = (x: Double) => Math.sqrt(x.toDouble).toInt

    var divisor = bigNumber
    while (!isPrime(divisor))
      divisor /= smallestFactor(divisor)

    println("Largest Prime Factor: " + divisor)

    // The smallest factor must be a prime number
    def smallestFactor(x: Long): Long = {
      for (small <- 2 to sqrtFromDouble(x) if (x % small == 0))
        return small
      return 1L
    }

    def isPrime(candidate: Long): Boolean = {
      for (i <- 2 to sqrtFromDouble(candidate) if (candidate % i == 0))
        return false
      return true
    }
  }
}
