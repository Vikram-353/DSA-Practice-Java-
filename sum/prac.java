package sum;

public class prac {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int n = i;
            int sum = 0;
            int cube = 0;
            int rem = 0;
            while (n > 0) {
                rem = n % 10;
                cube = rem * rem * rem;
                sum = sum + cube;
                n = n / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
