package Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        boolean result = SortCheck(a, 0);
        System.out.println(result);
    }

    static boolean SortCheck(int[] a, int count) {
        if (count == a.length - 1) {
            return true;
        }
        return a[count] < a[count + 1] && SortCheck(a, count + 1);

    }
}
