package questions.Arrays.CountElements;

import java.util.HashMap;

public class CountElements {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(maxFrequencyElements(nums));

    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (int i : map.values()) {
            if (i > max) {
                max = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == max) {
                count++;
            }
        }
        return count;
    }

}
