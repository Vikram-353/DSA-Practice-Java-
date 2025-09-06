package BitMnupilation;

import java.util.*;

public class singleCount3 {
    public static void main(String[] args) {
        int[] num = { 2, 1, 2, 3, 4, 1 };
        System.out.println(Arrays.toString(singleNumber(num)));
    }

    public static int[] singleNumber(int[] nums) {
        // int[] result = new int[2];
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // int j = 0;
        // for (Map.Entry<Integer, Integer> i : map.entrySet()) {
        // if (i.getValue() == 1) {
        // result[j] = i.getKey();
        // j++;
        // }
        // }
        // return result;

        int result[] = new int[2];
        long xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        System.out.println(xor);

        // long rightMost = (xor & (xor - 1)) & xor;
        long rightMost = xor & -xor;
        System.out.println(rightMost);
        int b1 = 0;
        int b2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & rightMost) != 0) {
                b1 = b1 ^ nums[i];
            } else {
                b2 = b2 ^ nums[i];
            }
        }
        result[0] = b1;
        result[1] = b2;
        return result;
    }
}
