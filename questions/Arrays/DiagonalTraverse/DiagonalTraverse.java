package questions.Arrays.DiagonalTraverse;

import java.util.*;
public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] grid = { { 1, 7, 3 }, { 9, 8, 2 }, { 4, 5, 6 } };
        int[][] result = sortMatrix(grid);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println("");
        }

    }

    public static int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int key = i - j;
                diagonals.putIfAbsent(key, new ArrayList<>());
                diagonals.get(key).add(grid[i][j]);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : diagonals.entrySet()) {
            List<Integer> diaog = entry.getValue();
            if (entry.getKey() >= 0) {
                diaog.sort(Comparator.reverseOrder());

            } else {
                Collections.sort(diaog);
            }
        }
        Map<Integer, Integer> idx = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int key = i - j;
                int pos = idx.getOrDefault(key, 0);
                grid[i][j] = diagonals.get(key).get(pos);
                idx.put(key, pos + 1);
            }
        }

        return grid;
    }

}
