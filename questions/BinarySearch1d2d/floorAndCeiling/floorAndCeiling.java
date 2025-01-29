package questions.BinarySearch1d2d.floorAndCeiling;

public class floorAndCeiling {
    public static void main(String[] args) {
        int[] a = { 3, 4, 7, 8, 8, 10 };
        int k = 5;
        int low = 0;
        int high = a.length - 1;
        int[] ans = { -1, -1 };
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            // maybe an answer
            if (a[mid] > k) {
                ans[1] = a[mid];
                high = mid - 1;
            } else if (a[mid] == k) {
                ans[0] = a[mid];

                ans[1] = a[mid];
                for (int i : ans) {
                    System.out.println(i);
                }
            } else {
                ans[0] = a[mid];
                low = mid + 1;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
