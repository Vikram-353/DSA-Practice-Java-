package questions;

public class water {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;

            sum = sum + Math.abs(j - i);
        }
        System.out.println(sum);
    }
}
