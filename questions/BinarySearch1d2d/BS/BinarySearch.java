package questions.BinarySearch1d2d.BS;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 10;
        int low = 0;
        int high = a.length - 1;
        int result = Bsearch(a, low, high, k);
        System.out.println(result);

    }

    public static int Bsearch(int[] a, int low, int high, int k) {

        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (a[mid] == k) {
            return mid;
        } else if (k > a[mid]) {
            low = mid + 1;
            return Bsearch(a, low, high, k);
        } else {
            high = mid - 1;
            return Bsearch(a, low, high, k);
        }

    }
}
