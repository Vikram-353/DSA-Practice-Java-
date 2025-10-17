package questions.Arrays.SubArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 18, -10, 2, 13, -3, 14));
        int k = 3;
        System.out.println(hasIncreasingSubarrays(list, k));
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (nums.size() < 2 * k) {
            return false;
        }
        if (nums.size() >= 2 && k == 1) {
            return true;
        }
        int i = 0;
        int count = 0;

        while (i <= (nums.size() - (k + 2))) {
            int j = i + k;
            if (j + 1 < nums.size()) {
                if (nums.get(i) < nums.get(i + 1) && nums.get(j) < nums.get(j + 1)) {
                    count++;
                }
            }
            i++;

        }
        return count >= k - 1;

    }
}
