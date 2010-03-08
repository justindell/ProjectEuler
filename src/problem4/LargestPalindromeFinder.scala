package problem4

class LargestPalindromeFinder {
  def main(args: Array[String]) {
    val s:String = "hello"
    s.substring(0, s.length/2)
  }

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
    var firsthalf = palindrome.substring(0, palindrome.length/2)
    if (palindrome.length % 2 != 0) {
      firsthalf = palindrome.substring(0, palindrome.length/2 + 1)
    }
    val secondhalf = palindrome.substring(palindrome.length/2, palindrome.length)
    return firsthalf == secondhalf.reverse.toString
  }
}