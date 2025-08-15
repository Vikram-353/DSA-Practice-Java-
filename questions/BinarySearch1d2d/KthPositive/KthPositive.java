package questions.BinarySearch1d2d.KthPositive;

import java.util.ArrayList;

public class KthPositive {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int n = arr.length + k;
        ArrayList<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (!present(i, arr)) {
                missing.add(i);
            }
        }
        result = missing.get(k - 1);

        return result;
    }

    public static boolean present(int num, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
