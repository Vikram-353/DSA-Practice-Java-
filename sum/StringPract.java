// Q1. Process String with Special Operations I
// Medium
// 4 pt.
// You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.

// Build a new string result by processing s according to the following rules from left to right:

// If the letter is a lowercase English letter append it to result.
// A '*' removes the last character from result, if it exists.
// A '#' duplicates the current result and appends it to itself.
// A '%' reverses the current result.
// Return the final string result after processing all characters in s.

package sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Sorting.Merge.Merge_Sort;

public class StringPract {
    public static void main(String[] args) {
        String s = "eafrteajv#ku#q####g%fr#%t#%#hcc##tpf%wxt%p#x##ql";
        // System.out.println(processStr(s));
        System.out.println(processChr(s, 1581));

        int[] a = { 5, 4, 3, 2, 1 };

        String[] answer = findRelativeRanks(a);
        System.out.println(Arrays.toString(answer));
    }

    public static String processStr(String s) {
        StringBuilder result = new StringBuilder();
        if (s.length() == 0) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            if (97 <= ((int) s.charAt(i))) {
                result.append(s.charAt(i));
            } else if (s.charAt(i) == '*' && result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            } else if (s.charAt(i) == '#') {
                result.append(result);
            } else if (s.charAt(i) == '%') {
                result.reverse();
            }
        }

        return result.toString();
    }

    public static char processChr(String s, int k) {

        StringBuilder result = new StringBuilder();
        if (s.length() == 0) {
            return '.';
        }

        for (int i = 0; i < s.length(); i++) {
            if (97 <= ((int) s.charAt(i))) {
                result.append(s.charAt(i));
            } else if (s.charAt(i) == '*' && result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            } else if (s.charAt(i) == '#') {
                // if (result.length() * 2 > 100000)
                // return '.';
                String temp = result.toString();
                result.append(temp);
            } else if (s.charAt(i) == '%') {
                result.reverse();
            }
        }

        for (int i = 0; i < result.length(); i++) {
            if (i == k) {
                return result.charAt(i);
            }
            if (result.length() > k + 10000)
                break;
        }
        return k < result.length() ? result.charAt((int) k) : '.';
    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = sorted[left];
            sorted[left] = sorted[right];
            sorted[right] = temp;
            left++;
            right--;
        }

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                map.put(sorted[i], "Gold Medal");
            } else if (i == 1) {
                map.put(sorted[i], "Silver Medal");
            } else if (i == 2) {
                map.put(sorted[i], "Bronze Medal");
            } else {
                map.put(sorted[i], String.valueOf(i + 1));
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = map.get(sorted[i]);
        }

        return answer;

    }
}
