package questions.BinarySearch1d2d.SplitsumArray;

public class SplitSumLargestArray {
    public static void main(String[] args) {
        int[] a = { 7, 2, 5, 3, 10, 8 };
        int m = 2;
        int result = splitArray(a, m);
        System.out.println(result);

    }

    public static int splitArray(int[] a, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.length; i++) {
            start = Math.max(start, a[i]);
            end += a[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int i : a) {
                if (sum + i > mid) {
                    sum = i;
                    pieces++;
                } else {
                    sum += i;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
