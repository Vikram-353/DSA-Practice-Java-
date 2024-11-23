package Sorting.Quick;

public class QuickSort {

    static void Sort_Increasing(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            Sort_Increasing(arr, low, pIndex - 1);
            Sort_Increasing(arr, pIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;

            }
            while (arr[j] > pivot && j > low) {
                j--;

            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void Print_Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -2, 0, 1, 3, 4, 3, 5, 7, 4 };
        System.out.println("Array Before Sorting: ");
        Print_Array(arr);
        System.out.println();
        System.out.println("Array After Sorting In Increasing Order: ");
        Sort_Increasing(arr, 0, arr.length - 1);
        System.out.println();
        Print_Array(arr);
        System.out.println();
    }
}
