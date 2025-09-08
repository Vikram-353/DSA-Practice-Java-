package questions.Math.NUniqueIntSumZero;

import java.util.Arrays;

public class NUniqueIntSumZero {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int a = n / 2;
        int j = 0;
        for (int i = -a; i <= a; i++) {
            if (((n & 1) == 0) && i == 0) {
                continue;
            }
            result[j] = i;
            j++;
        }

        return result;
    }
}
