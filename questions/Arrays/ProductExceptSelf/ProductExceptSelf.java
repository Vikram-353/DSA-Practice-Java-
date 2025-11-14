package questions.Arrays.ProductExceptSelf;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left = left * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = right * result[i];
            right = right * nums[i];
        }
        return result;

        // for (int i = 0; i < nums.length; i++) {
        // int product = 1;
        // for (int j = 0; j < result.length; j++) {
        // if (i != j) {
        // product = product * nums[j];
        // }
        // }
        // result[i] = product;
        // }
    }
}
