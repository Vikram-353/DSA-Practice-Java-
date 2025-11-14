package String.OnesAndZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static void main(String[] args) {
        String[] strs = { "10", "0001", "111001", "1", "0" };
        int m = 4;
        int n = 3;
        System.out.println(findMaxForm(strs, m, n));
    }

    public static int solve(List<int[]> count, int m, int n, int i) {
        if (i >= count.size() || (m == 0 && n == 0)) {
            return 0;
        }
        int take = 0;
        if (count.get(i)[0] <= m && count.get(i)[1] <= n) {
            take = 1 + solve(count, m - count.get(i)[0], n - count.get(i)[1], i + 1);
        }

        int skip = solve(count, m, n, i + 1);

        return Math.max(take, skip);
    }

    public static int findMaxForm(String[] strs, int m, int n) {

        List<int[]> count = new ArrayList<>();

        for (String s : strs) {
            int countOne = 0;
            int countZero = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    countZero++;
                } else {
                    countOne++;
                }
            }

            count.add(new int[] { countZero, countOne });
        }

        return solve(count, m, n, 0);
    }
}
