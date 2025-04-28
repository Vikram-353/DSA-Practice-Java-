package Patterns;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int r = 6;
        int c = 0;
        Star(r, c);
        Star2(6, 0);
        int[] a = { 2, 1, 3, 5, 4, 6, 7, 0, 8 };
        // BubbleSort(a, a.length - 1, c);
        // System.out.println();
        // System.out.println(Arrays.toString(a));
        SelectionSort(a, a.length - 1, c);
        System.out.println();
        System.out.println(Arrays.toString(a));

    }

    static void Star(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            Star(r, c + 1);

        } else {
            System.out.println();
            Star(r - 1, 0);
        }

    }

    static void Star2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            Star2(r, c + 1);
            System.out.print("*");

        } else {
            Star2(r - 1, 0);
            System.out.println();
        }

    }

    static void BubbleSort(int[] a, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (a[c] > a[r]) {
                int temp = a[c];
                a[c] = a[r];
                a[r] = temp;
            }
            BubbleSort(a, r, c + 1);

        } else {
            BubbleSort(a, r - 1, 0);

        }

    }

    static int max = 0;

    static void SelectionSort(int[] a, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (a[c] > a[max]) {
                max = c;
            }
            SelectionSort(a, r, c + 1);

        } else {
            int temp = a[max];
            a[max] = a[r - 1];
            a[r - 1] = temp;
            max = 0;
            SelectionSort(a, r - 1, 0);

        }

    }
}
