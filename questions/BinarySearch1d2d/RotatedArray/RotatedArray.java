package questions.BinarySearch1d2d.RotatedArray;

public class RotatedArray {
    public static void main(String[] args) {
        int[] a = { 4, 4, 4, 4, 5, 6, 7, 0, 1, 2, 2, 2, 2 };
        int low = 0;
        int high = a.length - 1;
        int mid = (low + high) / 2;
        int k = 0;
        int result = search(a, low, high, mid, k);
        System.out.println(result);

    }

    static int search(int[] a, int low, int high, int mid, int k) {
        int pivot = ans(a, low, high, mid);
        if (pivot == -1) {
            return Bsearch(a, 0, a.length - 1, k);
        }
        if (a[pivot] == k) {
            return pivot;

        } else if (k > a[0]) {
            high = pivot - 1;

            return Bsearch(a, low, high, k);
        } else {
            low = pivot + 1;
            return Bsearch(a, low, high, k);
        }

    }

    static int Bsearch(int[] a, int low, int high, int k) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == k) {
                return mid;
            } else if (k > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }

    static int ans(int[] a, int low, int high, int mid) {
        while (low <= high) {
            if (mid < high && a[mid] > a[mid + 1]) {
                return mid;
            }
            if (mid > low && a[mid] < a[mid - 1]) {
                return mid - 1;
            }
            if (a[low] >= a[mid]) {
                high = mid;
            } else {
                low = mid - 1;
            }
            // for dulpicated roteted array
            if (a[mid] == a[low] && a[mid] == a[high]) {
                if (a[low] > a[low + 1]) {
                    return low;
                }
                low++;
                if (a[high] < a[high - 1]) {
                    return high - 1;
                }
                high--;

            } else if (a[low] < a[mid] || (a[low] == a[mid] && a[mid] > a[high])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }
}
