package problem10

import java.math.BigInteger

object PrimeSummer {
  def main(args: Array[String]) {
    var prime:BigInteger = new BigInteger("0")
    var sum = new BigInteger("0")
    while (prime.compareTo(new BigInteger("2000000")) == -1) {
      prime = prime.nextProbablePrime();
      sum = sum.add(prime)
    }
    sum = sum.subtract(prime)
    println(sum)
  }
}
