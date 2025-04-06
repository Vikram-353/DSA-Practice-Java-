package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int number = 1020304;
        int result = Zeros(number, 0);
        System.out.println(result);
    }

    // static int count = 0;

    static int Zeros(int n, int count) {
        if (n <= 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return Zeros(n / 10, count + 1);
        }
        return Zeros(n / 10, count);

    }
}
