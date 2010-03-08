package problem5

class EvenlyDivisible {

  def smallestEvenlyDivisible(limit: Int) = {
    (1 to limit).reduceLeft((x, y) => lcm(x.toLong,y.toLong).toInt)  
  }

  def lcm(one: Long, two: Long) = (one * two) / gcd(one, two)

  def gcd(a: Long, b: Long): Long = {
    if (b == 0) return a
    return gcd(b, a - (b * (a/b)))
  }
}