package questions;

public class Palindrome {
    public static void main(String[] args) {
        int n = -121;
        int num = n;
        int reverse = 0;
        int digit = 0;
        int length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            digit = n % 10;
            n = n / 10;
            reverse = reverse * 10 + digit;

        }
        if (num == reverse) {
            System.out.println(reverse + " is a Palindrome.");

        } else {
            System.out.println(reverse + " is not a Palindrome.");
        }

    }
}
