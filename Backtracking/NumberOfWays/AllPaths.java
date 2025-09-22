package Backtracking.NumberOfWays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
        allPath("", maze, 0, 0);

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
}
