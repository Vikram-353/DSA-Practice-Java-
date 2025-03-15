package questions.BinarySearch1d2d.RowCol;

import java.util.Arrays;

public class RowCol2D {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 0;
        // int[] result = search(matrix, target);
        // for (int i : result) {
        // System.out.println(i);
        // }
        System.out.println(Arrays.toString(search(matrix, target)));

    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) {
                return new int[] { r, c };
            }
            if (target < matrix[r][c]) {
                c--;

            } else {
                r++;
            }

        }
        return new int[] { -1, -1 };

    }
}
