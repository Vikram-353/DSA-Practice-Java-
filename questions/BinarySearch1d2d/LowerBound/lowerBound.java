package questions.BinarySearch1d2d.LowerBound;

public class lowerBound {
    public static void main(String[] args) {

        int[] a = { 3, 5, 8, 15, 19, 20 };
        int k = 0;
        int low = 0;
        int high = a.length - 1;
        int result = Bsearch(a, low, high, k);
        System.out.println(result);

    }

    public static int Bsearch(int[] a, int low, int high, int k) {
        int ans = a.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // maybe an answer
            if (a[mid] >= k) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }
        return ans;

    }
}
