package questions.BinarySearch1d2d.InfiniteArray;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] a = { 3, 5, 6, 12, 14, 15, 10, 21, 23, 24, 25 };
        int k = 14;

        int result = ans(k, a);
        System.out.println(result);
    }

    static int ans(int target, int[] a) {
        int low = 0;
        int high = 1;
        while (target > a[high]) {
            int temp = high + 1;
            high = high + (high - low + 1) * 2;
            low = temp;

        }
        return Bsearch(a, low, high, target);
    }

    static int Bsearch(int[] a, int low, int high, int k) {
        // int ans = a.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // maybe an answer
            if (a[mid] > k) {

                high = mid - 1;

            } else if (k >= a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }

        }
        return high;

    }

}
