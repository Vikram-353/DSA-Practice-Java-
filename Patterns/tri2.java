package Patterns;

public class tri2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int start = i;
            if (i % 2 == 0) {
                start = 1;

            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {

                System.out.print(start);
                start = 1 - start;
            }
            System.out.println(" ");
        }
    }
}
