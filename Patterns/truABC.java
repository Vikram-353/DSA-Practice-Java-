package Patterns;

public class truABC {
    public static void main(String[] args) {
        int n = 6;

        // for (int i = 1; i <= n; i++) {
        // for (char j2 = 'A'; j2 < 'A' + i; j2++) {
        // System.out.print(j2);

        // }
        // System.out.println();

        // }

        // reverse

        // for (int i = n; i >= 1; i--) {
        // for (char j2 = 'A'; j2 < 'A' + i; j2++) {
        // System.out.print(j2);

        // }
        // System.out.println();

        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print((char) ((int) ('A' + i)) + " ");

        // }
        // System.out.println();

        // }

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print letters
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
            }

            // Print trailing spaces (optional, depending on desired output)
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Move to the next line
            System.out.println();
        }

    }
}
