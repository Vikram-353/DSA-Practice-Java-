package questions.Arrays.NumOfTri;

import java.util.Arrays;

public class NumOfTri {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 4 };
        System.out.println(triangleNumber(nums));
    }

    public static int triangleNumber(int[] nums) {
        int result = 0;
        int n = nums.length;
        Arrays.sort(nums);
        if (nums.length < 3) {
            return 0;
        }

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;
            while (i <= j) {
                if (nums[i] + nums[j] > nums[k]) {
                    result += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return result;
    }
    // public static int triangleNumber(int[] nums) {
    // int result = 0;
    // int n = nums.length;
    // Arrays.sort(nums);
    // if (nums.length < 3) {
    // return 0;
    // }

    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] == 0) {
    // continue;
    // }

    // for (int j = i + 1; j < nums.length; j++) {
    // int sum = nums[i] + nums[j];

    // int k = binarySearch(nums, j + 1, n - 1, sum);
    // if (k != -1) {
    // result += (k - j);
    // }

    // }
    // }

    // return result;
    // }

    // public static int binarySearch(int[] nums, int start, int end, int target) {
    // int k = -1;

    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (nums[mid] < target) {
    // k = mid;
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return k;
    // }

    // public static int triangleNumber(int[] nums) {
    // int result = 0;
    // Arrays.sort(nums);

    // for (int i = 0; i < nums.length - 2; i++) {
    // for (int j = i + 1; j < nums.length - 1; j++) {
    // for (int j2 = j + 1; j2 < nums.length; j2++) {
    // if (nums[i] + nums[j] > nums[j2]) {
    // result++;
    // }
    // }
    // }

    // }
    // return result;
    // }
}
