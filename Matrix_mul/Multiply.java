package Matrix_mul;

import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

        System.out.println("Enter elements of first array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element a[" + i + "]" + "[" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element a[" + i + "]" + "[" + j + "]");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] *= b[i][j];
            }

        }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(a[i][j]);
        // }
        // System.out.println();
        // }

        for (int[] arr : a) {
            System.out.println(Arrays.toString(arr));
        }
        sc.close();

    }

}
