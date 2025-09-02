package questions.Arrays.Divide;

public class Divide {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 1;
        System.out.println(divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
        long result = 0;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        for (int i = 31; i >= 0; i--) {
            if ((ldivisor << i) <= ldividend) {
                ldividend -= (ldivisor << i);
                result |= (1L << i);
            }
        }

        if (negative) {
            result = -result;
        }

        return (int) result;
    }
}
