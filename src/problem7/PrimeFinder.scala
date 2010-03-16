package problem7


object PrimeFinder {
  def main(args: Array[String]) {
    println("10001st prime: " + nthPrime(10001).toString)
  }

  def sqrtFromDouble(x: Double) = Math.sqrt(x).toInt
  
  def nthPrime(n: Int): Long = {
      var primes = List[Long](3L, 2L)
      var possiblePrime = 5L
      while(primes.length < n) {
          if(isPrime(possiblePrime)) primes = possiblePrime :: primes
          possiblePrime += 1L
      }
      return primes.first
  }

  def isPrime(candidate: Long): Boolean = {
    for (i <- 2 to sqrtFromDouble(candidate) if (candidate % i == 0))
      return false
    return true
  }

}