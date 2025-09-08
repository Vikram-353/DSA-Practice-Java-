package questions.Math.IsZero;

import java.util.Arrays;

public class IsZero {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
    }

    public static int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];

        int a = 1;
        int b = n - a;
        while (a + b <= n) {
            if (isZero(a) && isZero(b)) {
                result[0] = a;
                result[1] = b;
                break;
            } else {
                a = a + 1;
                b = n - a;
            }
        }
        return result;

    }

    private static boolean isZero(int a) {
        while (a != 0) {
            int digit = a % 10;
            a = a / 10;
            if (digit == 0) {
                return false;
            }
        }
        return true;
    }
}
