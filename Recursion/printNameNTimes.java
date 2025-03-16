package Recursion;

import java.util.Scanner;

public class printNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number how many times you want to print your name: ");
        int n = sc.nextInt();
        int i = 1;
        name(i, n);

        sc.close();
    }

    static void name(int i, int n) {
        if (i <= n) {
            System.out.println("Vikram");
            name(i + 1, n);
        } else {
            return;
        }

    }
}
