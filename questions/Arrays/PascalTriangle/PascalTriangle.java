package questions.Arrays.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int row = 6;
        int col = 6;
        // Find element(row,col);
        System.out.printf("Printing Element at row %d and col %d :%n", row, col);
        int result = NCR(row - 1, col - 1);
        System.out.println(result);

        // find elements of row N

        System.out.printf("Row %d :%n", row);
        System.out.println(answer(row));

        // Print Pascals Triangle
        ArrayList<List<Integer>> list = new ArrayList<>();
        System.out.println("Pascals Triangle");
        for (int i = 1; i <= col; i++) {
            list.add(answer(i));
        }

        System.out.println(list);

        // sum of nth row

        System.out.printf("Sum of %dth row : %d ", row, 1 << row - 1);
        // System.out.println(row & ());

    }

    public static int NCR(int r, int c) {
        int res = 1;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static List<Integer> answer(int row) {
        int ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(ans);
        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }
}
