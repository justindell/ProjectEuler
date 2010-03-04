package problem4

import org.junit._

class LargestPalindromeFinderTest {
  val lpf:LargestPalindromeFinder = new LargestPalindromeFinder

  @Test
  def shouldReverseAString() {
    Assert.assertEquals("EDCBA", "ABCDE".reverse.toString)
  }
}