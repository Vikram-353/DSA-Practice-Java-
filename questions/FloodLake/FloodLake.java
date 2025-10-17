package questions.FloodLake;

import java.util.*;

public class FloodLake {
    public static void main(String[] args) {
        int[] rains = { 1, 2, 0, 0, 2, 1 };
        System.out.println(Arrays.toString(avoidFlood(rains)));
    }

    public static int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];

        Map<Integer, Integer> fullLakes = new HashMap<>();

        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;
            } else {
                int lake = rains[i];
                ans[i] = -1;

                if (fullLakes.containsKey(lake)) {
                    Integer dryDay = dryDays.higher(fullLakes.get(lake));
                    if (dryDay == null) {
                        return new int[0];
                    }
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }
                fullLakes.put(lake, i);
            }
        }

        return ans;
    }
}
