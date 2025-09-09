package BitMnupilation;

import java.util.HashMap;
import java.util.Map;

public class XORofRange {
    public static void main(String[] args) {
        int n = 10;
        int result = 0;
        if (n % 4 == 1) {
            result = 0;
        } else if (n % 4 == 2) {
            result = n + 1;
        } else if (n % 4 == 3) {
            result = 0;
        } else if (n % 4 == 4) {
            result = n;
        }
        System.out.println(result);
        int[] nums = { 1, 1, 2, 2 };
        resultXOR(nums);
    }

    public static void resultXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int XOR = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                XOR = XOR ^ entry.getKey();
            }
        }
        System.out.println(XOR);
    }
}
