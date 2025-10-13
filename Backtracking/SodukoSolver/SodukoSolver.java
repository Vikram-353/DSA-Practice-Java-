package Backtracking.SodukoSolver;

public class SodukoSolver {
    public static void main(String[] args) {
        String[][] board = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };
        int n = board.length;
        int[][] intBoard = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!board[i][j].equals(".")) {
                    intBoard[i][j] = Integer.parseInt(board[i][j]);
                } else {
                    intBoard[i][j] = 0;
                }
            }
        }

        display(intBoard);
        System.out.println();

        if (solve(intBoard)) {
            display(intBoard);
        } else {
            System.out.println("can not solve");
        }

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }

            if (emptyLeft) {
                break;
            }

        }

        if (emptyLeft == false) {
            return true;
        }

        for (int i = 1; i <= board.length; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = i;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static void display(int[][] board) {
        for (int[] is : board) {
            for (int num : is) {
                System.out.print((char) (num + '0') + " ");
            }

            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        for (int[] is : board) {
            if (is[col] == num) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int startR = row - row % sqrt;
        int startC = col - col % sqrt;

        for (int i = startR; i < (startR + sqrt); i++) {
            for (int j = startC; j < (startC + sqrt); j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}