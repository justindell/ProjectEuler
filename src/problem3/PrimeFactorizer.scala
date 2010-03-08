package problem3

class PrimeFactorizer {

  def sqrtFromDouble(x: Double) = Math.sqrt(x).toInt

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