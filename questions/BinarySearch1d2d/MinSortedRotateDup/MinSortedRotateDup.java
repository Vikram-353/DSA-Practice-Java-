package questions.BinarySearch1d2d.MinSortedRotateDup;

import java.util.Arrays;

public class MinSortedRotateDup {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 0, 0, 1, 1, 1 };
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
        // int[] numbers = new int[nums.length];
        // int k = 0;
        // int n = nums.length - 1;
        // int i = n;
        // while (k <= i) {
        // if (Math.abs(nums[k]) > Math.abs(nums[i])) {
        // numbers[n] = nums[k] * nums[k];
        // k++;
        // n--;
        // } else {
        // numbers[n] = nums[i] * nums[i];
        // n--;
        // i--;
        // }

        // }
        // return numbers;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;

    }

}
