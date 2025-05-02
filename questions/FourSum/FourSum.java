package questions.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 2, 2 };

        List<List<Integer>> result = threeSumOptimize(nums, 8);
        System.out.println(result);

    }

    static List<List<Integer>> threeSumOptimize(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int l = i + 1; l < nums.length; l++) {

                if (l != i + 1 && nums[l] == nums[l - 1]) {
                    continue;
                }
                int j = l + 1;
                int k = nums.length - 1;

                while (j < k) {
                    long sum = nums[i];
                    sum += nums[l];
                    sum += nums[j];
                    sum += nums[k];
                    if (sum < target) {
                        j++;
                    } else if (sum > target) {
                        k--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[l], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1])
                            j++;
                        while (j < k && nums[k] == nums[k - 1])
                            k--;

                        j++;
                        k--;
                    }
                }
            }

        }
        return result;
    }
}
