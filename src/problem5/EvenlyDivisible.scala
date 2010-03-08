package problem5

class EvenlyDivisible {
  def main(args: Array[String]) {
    val runningLCM = (1L to 20L).reduceLeft(lcm(_,_))
    println("Smallest is " + runningLCM)
  }

  def lcm(one: Long, two: Long) = (one * two) / gcd(one, two)

  def gcd(a: Long, b: Long): Long = {
    if (b == 0) return a
    return gcd(b, a - (b * (a/b)))
  }
}