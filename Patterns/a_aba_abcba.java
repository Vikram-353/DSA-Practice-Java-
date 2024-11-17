package Patterns;

public class a_aba_abcba {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println(" ");
        }

        // for (int i = 0; i < n; i++) {
        // // Print leading spaces
        // for (int j = 0; j < n - i - 1; j++) {
        // System.out.print(" ");
        // }

        // // Print ascending characters
        // for (int j = 0; j <= i; j++) {
        // System.out.print((char) ('A' + j));
        // }

        // // Print descending characters
        // for (int j = i - 1; j >= 0; j--) {
        // System.out.print((char) ('A' + j));
        // }

        // // Move to the next line
        // System.out.println();
        // }
    }
}
