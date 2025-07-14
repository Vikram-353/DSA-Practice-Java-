package Sorting.CountSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 9, 4, 5, 12, 11 };

        countSort(arr);
        countsortHash(arr);
        System.out.println(findLargest(arr));

    }

    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int largest = findLargest(arr);

        int[] freq = new int[largest + 1];

        for (int i : arr) {
            freq[i]++;
        }

        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[index] = i;
                index++;
                freq[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void countsortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        int index = 0;

        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);

            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));

        // int largest = findLargest(arr);
    }

    public static int findLargest(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }

        }
        return largest;
    }

}
