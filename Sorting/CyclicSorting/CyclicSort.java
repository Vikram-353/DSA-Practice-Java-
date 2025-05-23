package Sorting.CyclicSorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] a = { 3, 5, 2, 1, 4, 2, 3 };
        cyclicSort(a);
        System.out.println(Arrays.toString(a));

    }

    static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void cyclicSort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

    }
}
