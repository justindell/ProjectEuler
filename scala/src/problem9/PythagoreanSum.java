package problem9;

import java.lang.Math;

public class PythagoreanSum {

    public static void main(String args[]) {
        for (int a=1; a<1000; a++) {
            double aSquared = Math.pow(a,2);
            for (int b=0; b<a; b++) {
                double c = 1000 - a - b;
                if (Math.pow(c,2) == aSquared + Math.pow(b,2))
                    System.out.println("Product: " + (a*b*c));
            }
        }
    }
}
