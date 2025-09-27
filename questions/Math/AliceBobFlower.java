package questions.Math;

public class AliceBobFlower {
    public static void main(String[] args) {
        System.out.println(flowerGame(4, 4));
    }

    ///// Brute Force

    // public static long flowerGame(int n, int m) {
    // long result = 0;
    // // if (m != n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (isOdd(i, j)) {
    // result++;
    // }

    // }
    // }
    // // }
    // return result;
    // }

    // public static boolean isOdd(int i, int j) {
    // if ((i + j) % 2 != 0) {
    // return true;
    // }
    // return false;
    // }

    /// Optimized/////
    public static long flowerGame(int n, int m) {
        long oddN = (n + 1) / 2;
        long oddM = (m + 1) / 2;
        long evenN = n / 2;
        long evenM = m / 2;

        return oddN * evenM + oddM * evenN;
    }

}
