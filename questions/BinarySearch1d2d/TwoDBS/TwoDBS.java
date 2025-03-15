package questions.BinarySearch1d2d.TwoDBS;

public class TwoDBS {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 13, 4, 5 }, { 7, 8, 9 } };
        int target = 13;
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == target) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
