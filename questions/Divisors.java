package questions;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                arr[i] = i;
                System.out.println(arr[i]);

            }

        }

        sc.close();

    }
}
