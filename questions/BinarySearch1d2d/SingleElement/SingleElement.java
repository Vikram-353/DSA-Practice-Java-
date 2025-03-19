package questions.BinarySearch1d2d.SingleElement;

public class SingleElement {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int result = search(a, 0, a.length - 1);
        System.out.println(result);

    }

    static int search(int[] a, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a.length % 2 == 0) {
                return -1;
            }
            if (mid == 0 || mid == a.length - 1) {
                return mid;
            }
            if (a[mid] != a[mid + 1] && a[mid] != a[mid - 1]) {
                return mid;
            }

            if ((mid % 2 == 0 && a[mid] == a[mid + 1]) || (mid % 2 == 1 && a[mid] == a[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
