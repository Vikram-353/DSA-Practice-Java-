package Patterns;

public class reverse_star_triangle {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
