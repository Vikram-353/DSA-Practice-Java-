package Sorting.FirstPositiveMissing;

import java.util.Arrays;

public class FirstPositiveMissing {
    public static void main(String[] args) {

        int[] a = { 7, 8, 9, 11, 12 };
        cyclicSort(a);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }

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
            if ((a[i] > 0) && (a[i] <= a.length) && (a[i] != a[correct])) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

    }
}
