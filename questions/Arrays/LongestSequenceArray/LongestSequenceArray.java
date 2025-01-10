package questions.Arrays.LongestSequenceArray;

public class LongestSequenceArray {
    public static void main(String[] args) {

        int[] a = { 5, 4, 3 };
        int count = 0, longest = 1, lastSmaller = Integer.MIN_VALUE;
        Sort_Increasing(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            if (a[i] - 1 == lastSmaller) {
                count++;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                lastSmaller = a[i];
                count = 1;
            }
            longest = Math.max(count, longest);

        }
        System.out.println(longest);
    }

    static void Sort_Increasing(int[] arr, int low, int high) {
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
}
