package questions.BinarySearch1d2d.MountainPeak;

public class MountainPeak {
    public static void main(String[] args) {

        int[] a = { 1, 2, 1, 3, 5, 6, 4 };

        int result = Bsearch(a);
        System.out.println(result);
    }

    static int Bsearch(int[] a) {
        // int ans = a.length;
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // maybe an answer
            if (a[mid] > a[mid + 1]) {

                high = mid;

            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}
