package questions;

public class SquareRoot {
    public static void main(String[] args) {

        int n = 40;
        int d = 3;
        double result = Search(n, d);
        System.out.printf("%.3f", result);
    }

    static double Search(int n, int d) {
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s < e) {
            int mid = (s + e) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid < n) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        double inc = 0.1;
        for (int i = 0; i < d; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc = inc / 10;

        }
        return root;
    }
}
