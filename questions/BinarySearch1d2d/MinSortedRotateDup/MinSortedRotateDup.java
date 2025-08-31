package questions.BinarySearch1d2d.MinSortedRotateDup;

import java.util.Arrays;

public class MinSortedRotateDup {
    public static void main(String[] args) {
        int[] nums = { -2, -1, 0, 1, 2 };
        System.out.println(findMin(nums));
        System.out.println(Arrays.toString(squareSort(nums)));
    }

    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r--;
            }

        }

        return nums[l];
    }

    public static int[] squareSort(int[] nums) {
        int n = nums.length - 1;
        int[] sorted = new int[nums.length];
        int l = 0;
        int h = n;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[l]) > Math.abs(nums[h])) {
                sorted[i] = nums[l] * nums[l];
                l++;
            } else {
                sorted[i] = nums[h] * nums[h];
                h--;
            }
        }

        return sorted;

        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = nums[i] * nums[i];
        // }

        // Arrays.sort(nums);

        // return nums;

    }

}
