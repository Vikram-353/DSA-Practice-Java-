package Sorting.Selection;

//Time Complexity =O(n^2) 

public class Selection {
    // Increasing Order

    static void Sort_Increasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }

            }
            Swap(arr, i, min);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Decreasing Order

    static void Sort_Decreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;

                }
            }
            Swap(arr, i, max);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 3, 5, 7, 4 };
        System.out.println("Array Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array After Sorting In Increasing Order: ");
        Sort_Increasing(arr);
        System.out.println();
        System.out.println("Array After Sorting In Decreasing Order: ");
        Sort_Decreasing(arr);
    }
}
