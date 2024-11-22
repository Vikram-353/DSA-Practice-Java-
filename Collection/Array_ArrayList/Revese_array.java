package Array_ArrayList;

import java.util.Arrays;

public class Revese_array {
    public static void main(String[] args) {
        int[] arr = { 74, 5, 63, 5, 3, 2, 4, 6, 8 };
        System.out.println(Arrays.toString(arr));
        reverse(arr);

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (start < end) {
                swap(arr, start, end);
                start++;
                end--;

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
