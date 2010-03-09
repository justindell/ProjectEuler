package problem4;

public class LargestPalindromeFinderJava {

    public String findLargestPalindrome() {
        Integer largest = 0;
        for(int i=999; i>800; i--) {
            for(int j=999; j>800; j--) {
                Integer candidate = i * j;
                if (isPalindrome(candidate.toString()) && candidate > largest) {
                    largest = candidate;
                }
            }
        }
        return largest.toString();
    }

    public boolean isPalindrome(String palindrome) {
        String firsthalf = palindrome.substring(0, palindrome.length()/2);
        if(palindrome.length() % 2 != 0) {
            firsthalf = palindrome.substring(0, palindrome.length()/2 + 1);
        }
        String secondhalf = palindrome.substring(palindrome.length()/2, palindrome.length());
        String test = new StringBuffer(secondhalf).reverse().toString();
        return firsthalf.equals(test);
    }
}
