package Sorting.FindLHS;

import java.util.HashMap;

public class FindLHS {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1 };
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        int result = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + 1)) {
                result = map.get(nums[i]) + map.get(nums[i] + 1);
            }
            if (result >= max) {
                max = result;
            }
            result = 0;
        }

        return max;
    }
}
