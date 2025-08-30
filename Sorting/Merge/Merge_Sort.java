package Sorting.Merge;

//Time Complexity is O(nlogn) b/c dividing array n times from mid which take logn time
//Space Complexity is O(n) b/c we using extra temp array space to stor array temprorarly
public class Merge_Sort {

    public static void Sort_Increasing(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        Sort_Increasing(arr, low, mid);
        Sort_Increasing(arr, mid + 1, high);
        Merge(arr, low, mid, high);

    }

    static void Merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int i = 0;
        int[] temp = new int[high - low + 1];
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[i++] = arr[left++];
            } else {
                temp[i++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[i++] = arr[left++];

        }
        while (right <= high) {
            temp[i++] = arr[right++];

        }
        for (int j = 0; j < temp.length; j++) {
            arr[low + j] = temp[j];
        }

    }

    static void Print_Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 3, 5, 7, 4 };
        System.out.println("Array Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array After Sorting In Increasing Order: ");
        Sort_Increasing(arr, 0, arr.length - 1);
        System.out.println();
        Print_Array(arr);
        System.out.println();

    }
}
