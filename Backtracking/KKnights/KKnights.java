package Backtracking.KKnights;

public class KKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] boards = new boolean[n][n];
        knights(boards, 0, 0, n);
    }

    public static void knights(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            display(board, row);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knights(board, row + 1, 0, knight);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }
        knights(board, row, col + 1, knight);

    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    public static void display(boolean[][] board, int row) {
        for (boolean[] bs : board) {
            for (boolean element : bs) {
                if (element == true) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
