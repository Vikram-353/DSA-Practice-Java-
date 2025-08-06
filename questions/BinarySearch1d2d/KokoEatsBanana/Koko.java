package questions.BinarySearch1d2d.KokoEatsBanana;

import java.util.Arrays;

public class Koko {
    public static void main(String[] args) {
        int[] piles = { 1000000000 };
        long hours = 2;
        System.out.println(kokoEatsBanana(piles, hours));
    }

    public static int kokoEatsBanana(int[] piles, long h) {
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = (int) Math.max(max, piles[i]);
            }
        }

        int low = 1;
        int high = (int) max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = calculateTotalHoues(piles, mid);
            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static long calculateTotalHoues(int[] piles, double hourly) {

        long total = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            total += Math.ceil((double) (piles[i]) / (double) (hourly));

        }
        return total > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) total;
    }
}

// for (int i = 1; i <= max; i++) {
// float total = calculateTotalHoues(piles, i);
// if (total <= h) {
// return i;
// }
// }
