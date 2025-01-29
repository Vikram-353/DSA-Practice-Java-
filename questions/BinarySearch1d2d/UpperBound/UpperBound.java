package questions.BinarySearch1d2d.UpperBound;

public class UpperBound {
    public static void main(String[] args) {

        int[] a = { 3, 4, 4, 7, 8, 10 };
        int k = 5;
        int low = 0;
        int high = a.length - 1;
        int[] ans = new int[2];
        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (a[mid] >= k) {
                ans[0] = mid + 1;
                high = mid - 1;
            } else {
                ans[1] = mid + 1;
                low = mid + 1;

            }
        }
        for (int i : ans) {
            System.out.println(i);
        }

    }

}
