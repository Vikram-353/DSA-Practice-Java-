package questions;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            totalSum += sum; // Add the sum of divisors for i to the total sum
        }

        System.out.println(totalSum);

        sc.close();
    }
}