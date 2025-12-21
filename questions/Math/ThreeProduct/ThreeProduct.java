package questions.Math.ThreeProduct;

import java.util.Arrays;

public class ThreeProduct {
    public static void main(String[] args) {
        int[] nums = { -100, -98, -1, 2, 3, 4 };
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
         int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;

        for (int x : nums) {
            globalMax = Math.max(globalMax, x);
            globalMin = Math.min(globalMin, x);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                 int a = nums[i];
                int b = nums[j];
                int pairProduct = a * b;

                if (pairProduct >= 0) {
                    // multiply with largest remaining
                    maxProduct = Math.max(
                        maxProduct,
                        pairProduct * globalMax
                    );
                } else {
                    // multiply with smallest (most negative)
                    maxProduct = Math.max(
                        maxProduct,
                        pairProduct * globalMin
                    );
                }
            }
        }

        return maxProduct;

    }

}
