package questions.Arrays.Duplicate2;

import java.util.HashMap;

public class Duplicate2 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if ((map.containsKey(nums[i]) && (Math.abs(map.get(nums[i]) - i)) <= k)) {
                return true;
            } else if ((map.containsKey(nums[i]) && (Math.abs(map.get(nums[i]) - i)) > k)) {
                map.put(nums[i], i);
            } else {
                map.putIfAbsent(nums[i], i);
            }
        }
        System.out.println(map);

        return false;
    }
}
