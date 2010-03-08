package problem3;

public class PrimeFactorizerJava {

    public int sqrtFromDouble(double x) {
        return (int)Math.sqrt(x);
    }

    // The smallest factor must be a prime number
    public long smallestFactor(long x) {
        for (long small = 2; small < sqrtFromDouble(x) + 1; small++)
            if (x % small == 0) return small;
        return 1L;
    }

    public boolean isPrime(long candidate) {
        for (int i = 2; i < sqrtFromDouble(candidate) + 1; i++)
            if (candidate % i == 0) return false;
        return true;
  }
}
