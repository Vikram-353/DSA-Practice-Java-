package questions.BinarySearch1d2d.UpperBound;

public class UpperBound {
    public static void main(String[] args) {

        int[] a = { 3, 5, 8, 8, 8, 8, 8, 15, 19, 20 };
        int k = 8;
        int low = 0;
        int high = a.length - 1;
        int result = Bsearch(a, low, high, k);
        System.out.println(result);

    }

    public static int Bsearch(int[] a, int low, int high, int k) {
        // int ans = a.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // maybe an answer
            if (k > a[a.length - 1]) {
                return -1;
            }
            if (a[mid] >= k) {

                high = mid - 1;

            } else if (k > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }

        }
        return low;

    }

}
