package Recursion;

import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            System.out.println(Fab(i));
        }
        sc.close();
    }

    static int Fab(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;

        }
        return Fab(n - 1) + Fab(n - 2);
    }
}
