package problem5

import org.junit._

class EvenlyDivisibleTest {
  val ed:EvenlyDivisible = new EvenlyDivisible

  @Test
  def shouldSolveEulerProblem5() {
    Assert.assertEquals(232792560, ed.smallestEvenlyDivisible(20))
  }

  @Test
  def shouldReturnLCM() {
    Assert.assertEquals(4, ed.lcm(2, 4))
    Assert.assertEquals(12, ed.lcm(6,4))
  }

  @Test
  def shouldReturnGCD() {
    Assert.assertEquals(2, ed.gcd(10,8))
    Assert.assertEquals(5, ed.gcd(5,10))
  }
}