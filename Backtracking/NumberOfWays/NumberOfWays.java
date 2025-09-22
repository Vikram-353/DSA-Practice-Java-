package Backtracking.NumberOfWays;

import java.util.ArrayList;

public class NumberOfWays {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(count(row, col));

        System.out.println(path("", row, col));
        System.out.println(pathDaigonal("", row, col));
        System.out.println(count);

        boolean[][] maze = { { true, true, true }, { true, false, true }, { true, true, true } };

        pathRestriction("", maze, 0, 0);

    }

    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    // static ArrayList<String> path = new ArrayList<>();
    static int count = 0;

    // -------------------Only Right and Down is Allowed---------------------
    static ArrayList<String> path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> path = new ArrayList<>();

            path.add(p);
            return path;
        }
        ArrayList<String> path = new ArrayList<>();
        if (row > 1) {
            path.addAll(path(p + "D", row - 1, col));
        }

        if (col > 1) {
            path.addAll(path(p + "R", row, col - 1));
        }

        return path;

    }

    // ------------------Daigonal, Right and Down--------------------
    static ArrayList<String> pathDaigonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> path = new ArrayList<>();
            count++;
            path.add(p);
            return path;
        }
        ArrayList<String> path = new ArrayList<>();
        if (row > 1) {
            path.addAll(pathDaigonal(p + "D", row - 1, col));
        }

        if (col > 1) {
            path.addAll(pathDaigonal(p + "R", row, col - 1));
        }
        if (col > 1 && row > 1) {
            path.addAll(pathDaigonal(p + "N", row - 1, col - 1));
        }

        return path;

    }

    // --------------------With restrictions--------------------
    static void pathRestriction(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }
        if (row < maze.length - 1) {
            pathRestriction(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            pathRestriction(p + "R", maze, row, col + 1);
        }
        // if (col > 1 && row > 1) {
        // path.addAll(pathDaigonal(p + "N", row - 1, col - 1));
        // }

    }
}
