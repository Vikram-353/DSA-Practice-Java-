package Backtracking.NumberOfWays;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
        int[][] pathPrint = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        // allPath("", maze, 0, 0);
        allPathPrint("", maze, 0, 0, pathPrint, 0);

    }

    static void allPath(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        if (row < maze.length - 1) {
            allPath(p + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            allPath(p + "R", maze, row, col + 1);
        }
        if (row > 0) {
            allPath(p + "U", maze, row - 1, col);
        }
        if (col > 0) {
            allPath(p + "L", maze, row, col - 1);
        }
        maze[row][col] = true;

    }

    static void allPathPrint(String p, boolean[][] maze, int row, int col, int[][] pathPrint, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            pathPrint[row][col] = step;
            for (int[] is : pathPrint) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println(p);
            System.out.println(" ");
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        pathPrint[row][col] = step;
        if (row < maze.length - 1) {
            allPathPrint(p + "D", maze, row + 1, col, pathPrint, step + 1);
        }

        if (col < maze[0].length - 1) {
            allPathPrint(p + "R", maze, row, col + 1, pathPrint, step + 1);
        }
        if (row > 0) {
            allPathPrint(p + "U", maze, row - 1, col, pathPrint, step + 1);
        }
        if (col > 0) {
            allPathPrint(p + "L", maze, row, col - 1, pathPrint, step + 1);
        }
        maze[row][col] = true;
        pathPrint[row][col] = 0;

    }
}
