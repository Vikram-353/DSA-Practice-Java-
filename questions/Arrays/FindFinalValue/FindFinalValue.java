package questions.Arrays.FindFinalValue;

import java.util.Arrays;

public class FindFinalValue {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9 };
        int original = 4;
        System.out.println(findFinalValue(nums, original));
    }

    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int i = 0;
        while (i > -1 && i < nums.length) {
            if (search(nums, i, original) != -1) {
                original = 2 * original;
                i = search(nums, i, original);
            } else {
                return original;
            }

        }

        return original;
    }

    private static int search(int[] nums, int i, int target) {
        for (int j = i; j < nums.length; j++) {
            if (nums[j] == target) {
                return j;
            }
        }
        return -1;
    }
}
