package questions.Arrays.MaxSumDivThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSumDivThree {
    public static void main(String[] args) {
        int[] nums = { 2, 6, 2, 2, 7 };
        System.out.println(maxSumDivThree(nums));
    }

    public static int maxSumDivThree(int[] nums) {
        int result = 0;
        int sum = 0;
        ArrayList<Integer> rem1 = new ArrayList<>();
        ArrayList<Integer> rem2 = new ArrayList<>();
        for (int i : nums) {
            sum += i;

            if (i % 3 == 1) {
                rem1.add(i);
            } else if (i % 3 == 2) {
                rem2.add(i);
            }
        }
        if (sum % 3 == 0) {
            return sum;
        }
        Collections.sort(rem1);
        Collections.sort(rem2);

        int rem = sum % 3;
        if (rem == 1) {
            int remove1 = rem1.size() >= 1 ? rem1.get(0) : Integer.MAX_VALUE;
            int remove2 = rem2.size() >= 2 ? rem2.get(0) + rem2.get(1) : Integer.MAX_VALUE;

            result = Math.max(result, sum - Math.min(remove1, remove2));

        } else {
            int remove1 = rem2.size() >= 1 ? rem2.get(0) : Integer.MAX_VALUE;
            int remove2 = rem1.size() >= 2 ? rem1.get(0) + rem1.get(1) : Integer.MAX_VALUE;

            result = Math.max(result, sum - Math.min(remove1, remove2));
        }

        return result;

    }
}
