package problem4

import org.junit._

class LargestPalindromeFinderTest {
  val lpf:LargestPalindromeFinder = new LargestPalindromeFinder

  @Test
  def shouldReverseAString() {
    Assert.assertEquals("EDCBA", "ABCDE".reverse.toString)
  }

  @Test
  def shouldDetectAPalindrome() {
    Assert.assertEquals(true, lpf.isPalindrome("123321"))
    Assert.assertEquals(true, lpf.isPalindrome("12321"))
    Assert.assertEquals(false, lpf.isPalindrome("123421"))
  }
}