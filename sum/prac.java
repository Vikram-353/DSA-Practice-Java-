package sum;

import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0 };

        int[] b = PlusOne(a);
        int[] arr = { 3, 4, 5, 6, 8, 10, 90, 0 };
        int[] array = { 1, 1 };

        // rotateByK(arr, 2);

        // System.out.println(secondLargest(arr));
        // System.out.println(isSorted(arr));
        // System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(searchRange(array, 1)));
        // System.out.println(searchRange(array, 8));
    }

    public static int[] PlusOne(int[] a) {

        double sum = 0;
        int len = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i] * Math.pow(10, len);
            len--;
        }
        double num = sum + 1;
        double n = num;
        int bSize = 0;

        if (lengthDigit(num) > lengthDigit((int) sum) && lengthDigit((int) sum) != 0) {
            bSize = a.length + 1;
        } else {
            bSize = a.length;
        }
        int[] b = new int[bSize];

        for (int i = b.length - 1; i >= 0; i--) {

            b[i] = (int) (n % 10);
            n = n / 10;

        }
        return b;
    }

    public static int lengthDigit(double digit) {
        int result = 0;
        double n = digit;
        while (n > 0) {
            n = n / 10;
            result++;
        }

        return result;
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
        }

        return secondLargest;

    }

    public static boolean isSorted(int[] arr) {
        if (arr.length == 0) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;

            }
        }

        return true;
    }

    public static void rotateByK(int[] a, int k) {
        int n = a.length;
        k = k % n;

        Reverse(a, n - k, n - 1);
        Reverse(a, 0, n - k - 1);
        Reverse(a, 0, n - 1);

        System.out.println(Arrays.toString(a));
    }

    public static void Reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] searchRange(int[] a, int k) {
        int[] ans = { -1, -1 };

        if (a == null || a.length == 0) {
            return ans;
        }

        int low = 0, high = a.length - 1;

        // Binary search to find first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low >= a.length || a[low] != k)
            return ans;
        ans[0] = low;

        // Binary search to find last occurrence
        high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        ans[1] = high;

        return ans;

    }

}
