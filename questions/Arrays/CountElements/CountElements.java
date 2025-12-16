package questions.Arrays.CountElements;

import java.util.HashMap;

public class CountElements {
    public static void main(String[] args) {
        int[] nums = {};
        // System.out.println(maxFrequencyElements(nums));
        System.out.println(firstUniqChar("aabb"));

    }

    static public int firstUniqChar(String s) {
        int index = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return index;
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
