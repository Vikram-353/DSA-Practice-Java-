package Array_ArrayList;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
