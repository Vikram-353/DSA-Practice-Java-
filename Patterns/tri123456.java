package Patterns;

public class tri123456 {
    public static void main(String[] args) {
        int n = 5;
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
