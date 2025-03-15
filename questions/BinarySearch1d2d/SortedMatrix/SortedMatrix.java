package questions.BinarySearch1d2d.SortedMatrix;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    // serch in rows
    static int[] rowSearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == matrix[row][mid]) {
                return new int[] { row, mid };

            }
            if (target < matrix[row][mid]) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }

        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        if (rows == 1) {
            return rowSearch(matrix, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = col / 2;

        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };

        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };

        }

        if (target <= matrix[rStart][cMid - 1]) {
            return rowSearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
            return rowSearch(matrix, rStart, cMid + 1, col - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return rowSearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return rowSearch(matrix, rStart + 1, cMid + 1, col - 1, target);

        }

    }
}
