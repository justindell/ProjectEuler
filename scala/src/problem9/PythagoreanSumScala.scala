package problem9;

object PythagoreanSumScala {
  def main(args: Array[String]) {
        for (a <- 1 to 1000) {
            var aSquared = Math.pow(a,2)
            for (b <- 0 to a) {
                var c = 1000 - a - b;
                if (Math.pow(c,2) == aSquared + Math.pow(b,2))
                    println("Product: " + (a*b*c));
            }
        }
    }
}
