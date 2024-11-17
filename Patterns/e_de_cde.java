package Patterns;

public class e_de_cde {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + n - j - 1) + " ");
            }
            System.out.println();
        }
    }
}
