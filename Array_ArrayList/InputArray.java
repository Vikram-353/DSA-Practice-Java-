package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // for (int num : arr) {
        // System.out.println(num);// here num represents elements of arryr. For every
        // element in array print array

        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        sc.close();

    }
}
