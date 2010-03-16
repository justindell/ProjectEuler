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
        String test = new StringBuffer(palindrome).reverse().toString();
        return palindrome.equals(test);
    }
}
