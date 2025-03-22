package Recursion;

import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(FabFor(i));
        }

        sc.close();
    }

    // static int Fab(int n) {
    // if (n == 0) {
    // return 0;
    // }
    // if (n == 1) {
    // return 1;

    // }
    // return Fab(n - 1) + Fab(n - 2);

    // }

    static int FabFor(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        // double psi = (1 - sqrt5) / 2;

        // return (int) Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5); //
        // Round and cast to int

        return (int) Math.round((Math.pow(phi, n)) / sqrt5);
    }
}
