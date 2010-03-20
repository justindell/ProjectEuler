package problem2;

import java.util.ArrayList;

public class EvenFibCounterJava {

    public static void main(String args[]) {
        ArrayList<Integer> fibNumbers = new ArrayList<Integer>();
        fibNumbers.add(0);
        fibNumbers.add(1);
        while (fibNumbers.get(fibNumbers.size()-1) < 4000000) {
            fibNumbers.add(fibNumbers.get(fibNumbers.size()-1) + fibNumbers.get(fibNumbers.size()-2));
        }

        int sum = 0;
        for(int num : fibNumbers)
            if (num % 2 == 0) sum += num;

        System.out.println("Sum is: " + sum);
    }
}
