package questions.Arrays.TriangleParameter;

import java.util.Arrays;

public class TriangleParameter {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];

            }
        }
        return 0;
    }
}
