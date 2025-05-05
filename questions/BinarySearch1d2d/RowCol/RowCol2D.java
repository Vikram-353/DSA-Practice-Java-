package questions.BinarySearch1d2d.RowCol;

import java.util.Arrays;

public class RowCol2D {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3 } };
        int target = 0;
        // int[] result = search(matrix, target);
        // for (int i : result) {
        // System.out.println(i);
        // }
        System.out.println(Arrays.toString(search(matrix, target)));

    }

    static int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[] { -1, -1 };
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0, c = cols - 1;

        while (r < rows && c >= 0) {
            int value = matrix[r][c];
            if (target == value) {
                return new int[] { r, c };
            } else if (target < value) {
                c--;
            } else {
                r++;
            }
        }

        return new int[] { -1, -1 };
    }
}
