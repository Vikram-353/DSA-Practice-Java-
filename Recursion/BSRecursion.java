package Recursion;

public class BSRecursion {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 10;
        System.out.println(search(a, target, 0, a.length - 1));
        ;
    }

    static int search(int[] a, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int m = start + (end - start) / 2;
        if (a[m] == target) {
            return m;
        } else if (target < a[m]) {
            return search(a, target, start, m - 1);
        } else {
            return search(a, target, m + 1, end);
        }

    }

}
