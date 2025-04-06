package Recursion;

import java.util.ArrayList;

public class LR_Recursion {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 5, 6 };
        int target = 2;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(LinearSearch(a, target, 0, list));
    }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static int LinearSearch(int[] a, int target, int n) {
    // if (n == a.length) {
    // return -1;
    // }

    // if (a[n] == target) {
    // list.add(n);
    // }
    // return LinearSearch(a, target, n + 1);
    // // return -1;
    // }

    static ArrayList<Integer> LinearSearch(int[] a, int target, int n, ArrayList<Integer> list) {
        if (n == a.length) {
            return list;
        }

        if (a[n] == target) {
            list.add(n);
        }
        return LinearSearch(a, target, n + 1, list);
        // return -1;
    }
}
