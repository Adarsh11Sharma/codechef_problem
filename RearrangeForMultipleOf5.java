/*
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeForMultipleOf5 {

    public static boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    public static void rearrangeDigits(int[] digits, int index) {
        if (index == digits.length - 1) {
            int number = 0;
            for (int digit : digits) {
                number = number * 10 + digit;
            }
            if (isMultipleOf5(number)) {
                System.out.println("Permutation: " + Arrays.toString(digits));
            }
            return;
        }

        for (int i = index; i < digits.length; i++) {
            int temp = digits[index];
            digits[index] = digits[i];
            digits[i] = temp;

            rearrangeDigits(digits, index + 1);

            temp = digits[index];
            digits[index] = digits[i];
            digits[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Convert the number to an array of digits
        String numberString = Integer.toString(number);
        int[] digits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        rearrangeDigits(digits, 0);

        int
    }
}
/*/
