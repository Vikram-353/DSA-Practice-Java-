package questions.Arrays.TwoSumII;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 9, 56, 90 };
        int target = 8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int remain = target - numbers[i];
            int search = BinarySearch(numbers, i, numbers.length - 1, remain, i);
            if (search != -1) {
                ans[0] = i + 1;
                ans[1] = search + 1;
                return ans;
            }
        }
        return ans;

    }

    public static int BinarySearch(int[] a, int low, int high, int k, int except) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (mid == except) {
            mid = mid + 1;
        }
        if (a[mid] == k) {
            return mid;
        } else if (k > a[mid]) {
            low = mid + 1;
            return BinarySearch(a, low, high, k, except);
        } else {
            high = mid - 1;
            return BinarySearch(a, low, high, k, except);
        }

    }
}
