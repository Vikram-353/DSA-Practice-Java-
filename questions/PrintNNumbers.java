package questions;

public class PrintNNumbers {
    public static void main(String[] args) {

        int n = 1534236469;
        int reverse = 0;
        int digit = 0;
        int length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            digit = n % 10;
            n = n / 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println(reverse);

    }
}
