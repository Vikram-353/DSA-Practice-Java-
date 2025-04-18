package Sorting.Bubble;

public class Bubble {

    static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void Print_Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Sort_Increasing(int[] arr) {
        boolean swaped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] < arr[j]) {
                    Swap(arr, i, j);
                    swaped = true;
                }

                if (!swaped) {
                    break;
                }
            }

        }
        Print_Array(arr);

    }

    // Decreasing Order

    static void Sort_Decreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] > arr[j]) {
                    Swap(arr, i, j);
                }
            }
        }
        Print_Array(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Array Before Sorting: ");
        Print_Array(arr);
        System.out.println();
        System.out.println("Array After Sorting In Increasing Order: ");
        Sort_Increasing(arr);
        System.out.println();
        System.out.println("Array After Sorting In Decreasing Order: ");
        Sort_Decreasing(arr);
    }
}
