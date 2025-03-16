package Recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        int n = 9;
        msg(n, n);
    }

    // static void msg(int n) {
    // if (n <= 0) {
    // return;
    // }
    // msg(n - 1);
    // System.out.println(n);
    // }

    static void msg(int i, int n) {
        if (i < 1) {
            return;

        }
        System.out.println(i);
        msg(i - 1, n);

    }

}
