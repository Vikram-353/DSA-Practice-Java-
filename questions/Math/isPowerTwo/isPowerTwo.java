package questions.Math.isPowerTwo;

public class isPowerTwo {
    public static void main(String[] args) {
        int n = 27;

        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);

    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 0 || n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }

}
