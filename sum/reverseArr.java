package sum;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6, 8, 7 };
        reverse(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));

    }

    public static void reverse(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        swap(a, l, r);
        reverse(a, l + 1, r - 1);
    }

    public static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}
