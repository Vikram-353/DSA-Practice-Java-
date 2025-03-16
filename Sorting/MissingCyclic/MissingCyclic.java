package Sorting.MissingCyclic;

import java.util.ArrayList;
import java.util.List;

public class MissingCyclic {

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
        for (i = 0; i < n; i++) {
            if (a[i] != i + 1) {
                missingNumbers.add(i + 1);
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
        MissingCyclic sol = new MissingCyclic();
        int[] arr = { 1, 2, 2 };
        System.out.println(sol.findDisappearedNumbers(arr));
    }
}
