package questions.Arrays.SubarraySumEqualsK;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] a = { -1, -1, 1 };
        int k = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int presum = 0, count = 0;

        map1.put(0, 1);

        for (int i = 0; i < a.length; i++) {
            presum += a[i];
            int remove = presum - k;
            count += map1.getOrDefault(remove, 0);
            map1.put(presum, map1.getOrDefault(presum, 0) + 1);
        }

        System.out.println(count);
    }
}
