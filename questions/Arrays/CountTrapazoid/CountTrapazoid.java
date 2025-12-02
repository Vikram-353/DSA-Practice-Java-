package questions.Arrays.CountTrapazoid;

import java.util.HashMap;

public class CountTrapazoid {
    public static void main(String[] args) {
        int[][] points = { { 1, 0 }, { 2, 0 }, { 3, 0 }, { 2, 2 }, { 3, 2 } };
        System.out.println(countTrapezoids(points));
    }

    public static int countTrapezoids(int[][] points) {
        long result = 0;
        long totalLines = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {

            map.put(points[i][1], map.getOrDefault(points[i][1], 0) + 1);
        }

        for (Integer count : map.values()) {
            long horizontals = (count * (count - 1)) / 2;
            result += (horizontals * totalLines);
            totalLines += horizontals;
        }

        return (int) (result % (long) (Math.pow(10, 9) + 7));
    }
}
