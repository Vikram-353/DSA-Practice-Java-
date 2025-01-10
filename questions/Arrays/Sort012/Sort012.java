package questions.Arrays.Sort012;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        // int[] a = { 1, 2, 1, 2, 1, 2, 0, 0, 0 };
        // int count_0 = 0;
        // int count_1 = 0;
        // int count_2 = 0;
        // for (int i : a) {
        // if (i == 0) {
        // count_0++;

        // }

        // if (i == 1) {
        // count_1++;

        // }

        // if (i == 2) {
        // count_2++;

        // }
        // }

        // for (int i = 0; i < count_0; i++) {
        // a[i] = 0;
        // }
        // for (int i = count_0; i < count_0 + count_1; i++) {
        // a[i] = 1;
        // }
        // for (int i = count_0 + count_1; i < a.length; i++) {
        // a[i] = 2;
        // }
        // for (int i : a) {
        // System.out.print(i + " ");
        // }W

        // ------Optimal Approach----------
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
        int n = 6;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
        System.out.println(arr);
    }
}
