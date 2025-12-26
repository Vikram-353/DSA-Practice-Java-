package questions.Arrays.MinOpDivThree;

import java.util.Arrays;

public class MinOpDivThree {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
        // System.out.println(minimumOperations(nums));

    }

    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(i - nums[i]) > 1) {
                ans[0] = i + 2;
                ans[1] = i + 2;
            } else {
                ans[0] = nums[i];
                ans[1] = nums[i] + 1;
            }
        }
        return ans;
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                count = count + Math.min(nums[i] % 3, 3 - (nums[i] % 3));
            }
        }
        return count;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            x[i] = nums[i];
            y[i] = nums[i + n];
        }

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        int even = 0;
        int odd = 0;
        int i = 0;
        while (i < 2 * n) {
            if (i % 2 == 0) {
                ans[i] = x[even];
                even++;
            } else {
                ans[i] = y[odd];
                odd++;
            }
            i++;
        }

        return ans;

    }
}
