package linear_search;

import java.util.Scanner;

public class MinIn2DArray {
    public static void main(String[] args) {
        // int[][] arr = {
        // { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        // };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter Array;");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println();
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value is : " + min);
        System.out.println("Maximum value is : " + max);
        System.out.println(11 % 10);
        System.out.println(111 / 10);
        sc.close();
    }
}
