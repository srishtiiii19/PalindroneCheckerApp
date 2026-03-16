class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}