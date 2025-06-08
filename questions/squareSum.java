package questions;

public class squareSum {
    public static void main(String[] args) {
        int n = 19;
        int slow = n;
        int fast = n;
        do {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (int) Math.pow((n % 10), 2);
            n = n / 10;
        }
        return sum;

    }
}
