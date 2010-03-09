package problem4

import org.junit._

class LargestPalindromeFinderTest {
  val lpf:LargestPalindromeFinder = new LargestPalindromeFinder
  val lpfj:LargestPalindromeFinderJava = new LargestPalindromeFinderJava

  @Test
  def shouldSolveEulerProblem4() {
    Assert.assertEquals("906609", lpfj.findLargestPalindrome)
    Assert.assertEquals("906609", lpf.findLargestPalindrome)
  }

  @Test
  def shouldReverseAString() {
    Assert.assertEquals("EDCBA", "ABCDE".reverse.toString)
  }

  @Test
  def shouldDetectAPalindrome() {
    Assert.assertEquals(true, lpfj.isPalindrome("123321"))
    Assert.assertEquals(true, lpfj.isPalindrome("12321"))
    Assert.assertEquals(false, lpfj.isPalindrome("123421"))
    Assert.assertEquals(true, lpf.isPalindrome("123321"))
    Assert.assertEquals(true, lpf.isPalindrome("12321"))
    Assert.assertEquals(false, lpf.isPalindrome("123421"))
  }
}