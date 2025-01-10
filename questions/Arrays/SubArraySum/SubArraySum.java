package questions.Arrays.SubArraySum;

// import java.util.HashMap;
// import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 1, 1, 1, 1, 1, 3, 4, 5, 6, 7, 8, 9 };
        int k = 6;

        // --------------------Brute Force--------------------
        // int len = -1;
        // for (int i = 0; i < a.length; i++) {
        // int sum = 0;
        // for (int j = i; j < a.length; j++) {

        // sum = sum + a[j];
        // if (sum == k) {
        // len = Math.max(len, j - i + 1);
        // }
        // }

        // }
        // System.out.println(len);

        // -----------------Better Approach--------------
        // Map<Long, Integer> preMap = new HashMap<>();

        // int maxLen = 0;
        // long sum = 0;

        // for (int i = 0; i < a.length; i++) {
        // sum += a[i];

        // if (sum == k) {
        // maxLen = Math.max(maxLen, i + 1);
        // }

        // long rem = sum - k;

        // if (preMap.containsKey(rem)) {
        // int len = i - preMap.get(rem);
        // maxLen = Math.max(maxLen, len);
        // }

        // if (!preMap.containsKey(sum)) {
        // preMap.put(sum, i);
        // }
        // }

        // System.out.println("Maximum Length of Subarray with Sum " + k + " is: " +
        // maxLen);

        // ------------Optimal Approach---------------

        long sum = a[0];
        int right = 0;
        int left = 0;

        int maxLen = 0;
        while (right < a.length) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;

            }
            if (sum == k) {
                maxLen = Math.max(right - left + 1, maxLen);
            }
            right++;
            if (right <= a.length - 1)
                sum += a[right];
        }
        System.out.println(maxLen);

    }
}
