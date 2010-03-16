package problem4

class LargestPalindromeFinder {
  
  def findLargestPalindrome(): String = {
    var largest = 0
    for (i <- 800 to 999) {
      for (j <- 800 to 999) {
        val candidate = i * j
        if (isPalindrome(candidate.toString) && candidate > largest) {
          largest = candidate
        }
      }
    }
    return largest.toString
  }

  def isPalindrome(palindrome: String): Boolean = {
    return palindrome == palindrome.reverse.toString
  }
}