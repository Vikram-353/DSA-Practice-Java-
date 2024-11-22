package Array_ArrayList;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 4 }, { 1, 3, 4 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
