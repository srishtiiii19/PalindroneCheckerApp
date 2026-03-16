import java.util.Scanner;

public class PalindromeCheckerUC4 {

    public static boolean isPalindrome(String input) {

        // Convert string to character array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}