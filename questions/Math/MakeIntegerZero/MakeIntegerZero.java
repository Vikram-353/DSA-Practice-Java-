package questions.Math.MakeIntegerZero;

public class MakeIntegerZero {
    public static void main(String[] args) {
        int num1 = 112577768;
        int num2 = -501662198;
        System.out.println(makeTheIntegerZero(num1, num2));
    }

    public static int makeTheIntegerZero(int num1, int num2) {
        // int t = 1;
        // while (true) {
        // int val = num1 - t * num2;
        // if (val <= 0) {
        // return -1;
        // }
        // if (Integer.bitCount(val) <= t && t <= val) {
        // return t;
        // }
        // t++;
        // }

        for (int t = 1; t < 60; t++) {
            long val = (long) num1 - (long) t * num2;
            if (val < t) {
                return -1;
            }
            if (Long.bitCount(val) <= t && t <= val) {
                return t;
            }

        }
        return -1;

    }
}
