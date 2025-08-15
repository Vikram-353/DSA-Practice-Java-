package questions.BinarySearch1d2d.BloomDay;

public class BloomDay {
    public static void main(String[] args) {
        int[] bloomDay = { 62, 75, 98, 63, 47, 65, 51, 87, 22, 27, 73, 92, 76, 44, 13, 90, 100, 85 };
        int m = 2, k = 7;
        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int result = -1;
        if (m * k > bloomDay.length) {
            return result;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
        }
        boolean flag = false;

        int low = min;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            flag = possible(mid, bloomDay, k, m);
            if (flag) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        result = low;
        return result;
    }

    public static boolean possible(int day, int[] bloomDay, int k, int m) {
        int n = bloomDay.length;
        int count = 0;
        int nofb = 0;
        for (int j = 0; j < n; j++) {
            if (bloomDay[j] <= day) {
                count++;
            } else {
                nofb += (count / k);
                count = 0;
            }
        }
        nofb += (count / k);
        return nofb >= m;
    }
}
