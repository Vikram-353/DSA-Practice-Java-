package questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = n;
        int length = String.valueOf(n).length();
        int digit = 0;
        int arm = 0;
        for (int i = 0; i < length; i++) {
            digit = n % 10;
            n = n / 10;
            arm += Math.pow(digit, length);
        }
        sc.close();
        if (num == arm) {
            System.out.println(num + " is Armstrong number:");
        } else {
            System.out.println("No");
        }
    }
}
