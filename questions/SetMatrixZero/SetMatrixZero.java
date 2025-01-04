package questions.SetMatrixZero;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1 } };

        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] rowMarker = new boolean[rows];
        boolean[] colMarker = new boolean[cols];

        // Step 1: Mark rows and columns to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowMarker[i] = true;
                    colMarker[j] = true;
                }
            }
        }

        // Step 2: Set marked rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowMarker[i]) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 3: Set marked columns to zero
        for (int j = 0; j < cols; j++) {
            if (colMarker[j]) {
                for (int i = 0; i < rows; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 4: Print the result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
