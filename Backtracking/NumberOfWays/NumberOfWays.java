package Backtracking.NumberOfWays;

import java.util.ArrayList;

public class NumberOfWays {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(count(row, col));

        path("", row, col);
        System.out.println(path);

    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static ArrayList<String> path = new ArrayList<>();

    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            path.add(p);
            return;
        }

        if (row > 1) {
            path(p + "D", row - 1, col);
        }

        if (col > 1) {
            path(p + "R", row, col - 1);
        }

    }
}
