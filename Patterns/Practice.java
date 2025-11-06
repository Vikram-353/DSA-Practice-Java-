package Patterns;

import sum.Sum;

public class Practice {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - n % i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = n - (n % i); j <= n + (n % i); j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
    }

    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + Sum(n - 1);
    }
}
