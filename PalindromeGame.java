import java.util.Scanner;

public class PalindromeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number for test case " + (i+1) + ": ");
            int n = scanner.nextInt();
            
            // Check if the number is a palindrome
            if (isPalindrome(n)) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }

        scanner.close();
    }

    // Method to check if a number is a palindrome
    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
