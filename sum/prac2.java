package sum;

import java.util.Arrays;

public class prac2 {
    // public static void main(String[] args) {
    // int result = 0;
    // long n = 987554321;
    // while (n > 0) {
    // n = n / 10;
    // result++;
    // }
    // System.out.println(result);
    // System.out.println(1 > 0);
    // }
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - n % i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = n - (n % i); j <= n + (n % i); j++) {
    // if ((j == n - (n % i)) || (j == n + (n % i))) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }

    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        int[] dup = { 1, 2, 9 };
        int isDup = 0;
        Arrays.sort(dup);
        for (int i = 0; i < dup.length - 1; i++) {
            if (dup[i] == dup[i + 1]) {
                System.out.println("duplicate" + dup[i]);
                isDup = 1;
            }

        }
        if (isDup == 0) {
            System.out.println("No duplicate");
        }
    }
}
