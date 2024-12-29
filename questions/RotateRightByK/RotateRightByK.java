package questions.RotateRightByK;

public class RotateRightByK {
    public static void main(String[] args) {
        int k = 3;

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        k = k % arr.length;
        // -----------------------------------My Approach

        // for (int i = 0; i < point; i++) {
        // for (int j = arr.length - 1; j > 0; j--) {
        // int temp = arr[j - 1];
        // arr[j - 1] = arr[j];
        // arr[j] = temp;
        // }
        // }

        // ----------------------------------Time OPtimized
        // int[] rotated = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // rotated[(i + point) % arr.length] = arr[i];
        // }
        // Printing the rotated array
        // for (int i = 0; i < rotated.length; i++) {
        // System.out.print(rotated[i] + " ");
        // }

        // Approach 3 (Reversal appraoch)
        // 1. Reverse last k elements
        // 2. Reverse the fist n-k elments
        // 3. Reverse Whole array

        Reverse(arr, arr.length - k, arr.length - 1);
        Reverse(arr, 0, arr.length - k - 1);
        Reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void Reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
