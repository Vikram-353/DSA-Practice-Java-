package questions.TwoPairSum;

import java.util.HashMap;
import java.util.Map;

public class TwoPairSum {
    public static void main(String[] args) {
        int[] a = { 2, 6, 5, 8, 11 };
        int target = 14;

        // ----------My Approach ---------------
        // boolean result = false;

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a.length; j++) {
        // if (a[i] + a[j] == target && i != j) {
        // result = true;
        // }
        // }
        // }
        // System.out.println(result);

        // -------------Better Appraoch-----------

        Map<Integer, Integer> sumMap = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int moreNeeded = target - num;

            if (sumMap.containsKey(moreNeeded)) {
                ans[0] = sumMap.get(moreNeeded);
                ans[1] = i;
                PrintArray(ans);
                return;
            }

            sumMap.put(a[i], i);
        }

        // If no valid pair found
        if (ans[0] == -1) {
            System.out.println("No valid pair found");
        }
    }

    public static void PrintArray(int[] a) {
        System.out.println("Pair found at indices:");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
