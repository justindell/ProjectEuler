package problem3

import org.junit._

class PrimeFactorizerTest {
  val pf:PrimeFactorizer = new PrimeFactorizer
  val pfj:PrimeFactorizerJava = new PrimeFactorizerJava

  @Test
  def shouldSolveEulerProblem3() {
    val bigNumber: Long = 600851475143L

    var divisor = bigNumber
    while (!pf.isPrime(divisor))
      divisor /= pf.smallestFactor(divisor)

    println("Largest Prime Factor: " + divisor)
  }

  @Test
  def shouldEvaluate23AsPrime() {
    Assert.assertEquals("23 not evaluated to be prime", true, pfj.isPrime(23))
    Assert.assertEquals("23 not evaluated to be prime", true, pf.isPrime(23))
  }

  @Test
  def shouldEvaluate22AsNotPrime() {
    Assert.assertEquals("22 evaluated to be prime", false, pfj.isPrime(22))
    Assert.assertEquals("22 evaluated to be prime", false, pf.isPrime(22))
  }

  @Test
  def shouldFindTwoAsSmallestFactor() {
    Assert.assertEquals("Did not calculate smallest factor correctly", 2L, pfj.smallestFactor(50))
    Assert.assertEquals("Did not calculate smallest factor correctly", 2L, pf.smallestFactor(50))
  }

  @Test
  def shouldFindThreeAsSmallestFactor() {
    Assert.assertEquals("Did not calculate smallest factor correctly", 3L, pfj.smallestFactor(9))
    Assert.assertEquals("Did not calculate smallest factor correctly", 3L, pf.smallestFactor(9))
  }
}