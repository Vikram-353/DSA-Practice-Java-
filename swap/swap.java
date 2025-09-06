package swap;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        swapNum();
    }

    static void swapNum() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        b = sc.nextInt();
        System.out.println("a: " + a + " b: " + b);
        // temp = a;
        // a = b;
        // b = temp;
        // a = a + b;
        // b = a - b;
        // a = a - b;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b: " + b);
        sc.close();
    }
}
