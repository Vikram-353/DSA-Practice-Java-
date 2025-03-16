package Sorting.AllMissing;

import java.util.ArrayList;
import java.util.List;

public class AllMissing {
    public List<Integer> findDisappearedNumbers(int[] a) {
        int i = 0;
        int n = a.length;

        while (i < n) {
            int correct = a[i] - 1;
            if (a[i] != a[correct] && a[i] > 0 && a[i] <= n) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (i = 0; i < a.length; i++) {
            if (a[i] != i + 1) {
                missingNumbers.add(a[i]);
            }
        }

        return missingNumbers;
    }

    static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        AllMissing sol = new AllMissing();
        int[] arr = { 1, 2, 2, 4 };
        System.out.println(sol.findDisappearedNumbers(arr));
    }
}
