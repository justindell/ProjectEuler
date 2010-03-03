package problem3

import org.junit._

class PrimeFactorizerTest {
  val pf:PrimeFactorizer = new PrimeFactorizer

  @Test
  def shouldEvaluate23AsPrime() {
    Assert.assertEquals("23 not evaluated to be prime", true, pf.isPrime(23))
  }

  @Test
  def shouldEvaluate22AsNotPrime() {
    Assert.assertEquals("22 evaluated to be prime", false, pf.isPrime(22))
  }

  @Test
  def shouldFindTwoAsSmallestFactor() {
    Assert.assertEquals("Did not calculate smallest factor correctly", 2L, pf.smallestFactor(50))
  }

  @Test
  def shouldFindThreeAsSmallestFactor() {
    Assert.assertEquals("Did not calculate smallest factor correctly", 3L, pf.smallestFactor(9))
  }
}