package linear_search;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        int target = 9;
        // int min=arr[0][0];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    result = arr[i][j];

                }
            }
        }
        System.out.println(result);
    }
}
