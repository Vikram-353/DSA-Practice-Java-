package questions;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        // int N1 = sc.nextInt();
        // System.out.println("Enter second number: ");
        // int N2 = sc.nextInt();
        // int[] arr1 = new int[N1];
        // int[] arr2 = new int[N2];
        // int[] arr3 = new int[Math.max(N1, N2)];

        // for (int i = 1; i <= N1 - 1; i++) {
        // if (N1 % i == 0) {
        // arr1[i] = N1 / i;
        // }
        // }
        // for (int i = 1; i <= N2 - 1; i++) {
        // if (N2 % i == 0) {
        // arr2[i] = N2 / i;
        // }
        // }
        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr2.length; j++) {
        // if (arr1[i] == arr2[j]) {
        // arr3[i] = arr1[i];

        // }

        // }
        // }
        // for (int i = 0; i < arr3.length - 1; i++) {
        // for (int j = 0; j < arr3.length - i - 1; j++) {
        // if (arr3[j] > arr3[j + 1]) {
        // int temp = arr3[j];
        // arr3[j] = arr3[j + 1];
        // arr3[j + 1] = temp;
        // }
        // }
        // }
        // System.out.println(arr3[(arr3.length) - 1]);

        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int N1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int N2 = sc.nextInt();
        int gcd = 1;

        for (int i = 1; i <= Math.min(N1, N2); i++) {

            if (N1 % i == 0 && N2 % i == 0) {

                gcd = i;
            }
        }

        // Return the greatest
        // common divisor (gcd)
        System.out.println("GCD of " + N1 + " and " + N2 + " is: " + gcd);
        sc.close();
    }
}
