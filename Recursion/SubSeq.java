package Recursion;

import java.util.*;

public class SubSeq {

    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        // ArrayList<String> result = new ArrayList<>();
        // result = Search("", "abc", list);
        // result = SearchRet("", "ram");
        int[] arr = { 1, 2, 2 };
        // result=subset(arr);

        // List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans = subsetDuplicate(arr);
        System.out.println(ans);

    }

    // static ArrayList<String> Search(String p, String up, ArrayList<String> list)
    // {
    // if (up.isEmpty()) {
    // list.add(p);
    // return list;
    // }
    // char ch = up.charAt(0);
    // Search(p + ch, up.substring(1), list);
    // Search(p, up.substring(1), list);

    // return list;
    // }

    // static ArrayList<String> SearchRet(String p, String up) {
    // if (up.isEmpty()) {
    // ArrayList<String> list = new ArrayList<>();
    // list.add(p);
    // return list;
    // }
    // char ch = up.charAt(0);
    // ArrayList<String> left = SearchRet(p + ch, up.substring(1));
    // ArrayList<String> right = SearchRet(p, up.substring(1));
    // // ArrayList<String> ascii = SearchRet(p + (ch + 0), up.substring(1));
    // // right.addAll(ascii);
    // left.addAll(right);

    // return left;
    // }

    // static List<List<Integer>> subset(int[] arr) {
    // List<List<Integer>> outer = new ArrayList<>();
    // outer.add(new ArrayList<>());
    // for (int num : arr) {
    // int n = outer.size();
    // for (int i = 0; i < n; i++) {
    // List<Integer> internal = new ArrayList<>(outer.get(i));
    // internal.add(num);
    // outer.add(internal);
    // }
    // }

    // return outer;
    // }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
