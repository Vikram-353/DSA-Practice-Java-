package questions.Arrays.CountPalinSub;

import java.util.*;

public class CountPalinSub {
    public static void main(String[] args) {
        String str = "aabca";
        System.out.println(countPalindromicSubsequence(str));
    }

    public static int countPalindromicSubsequence(String s) {
        int result = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }

        System.out.println(set);
        for (Character ch : set) {
            int left = -1;
            int right = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ch) {
                    if (left == -1) {
                        left = i;
                    }
                    right = i;
                }
            }

            Set<Character> set2 = new HashSet<>();

            for (int i = left + 1; i < right; i++) {
                set2.add(s.charAt(i));
            }
            result += set2.size();

        }

        return result;

    }

    // public static int countPalindromicSubsequence(String s) {
    // int size = 0;
    // HashMap<String, Boolean> map = new HashMap<>();

    // int n = s.length();
    // int total = 1 << n;

    // for (int mask = 0; mask < total; mask++) {
    // StringBuilder sb = new StringBuilder();

    // for (int i = 0; i < n; i++) {
    // if ((mask & (1 << i)) != 0) {
    // sb.append(s.charAt(i));
    // }
    // }

    // if (isPalindrome(sb.toString()) && sb.length() == 3) {
    // map.put(sb.toString(), true);
    // } else {
    // map.put(sb.toString(), false);

    // }
    // }
    // for (Boolean e : map.values()) {
    // if (e == true) {
    // size++;
    // }
    // }
    // return size;
    // }

    // private static boolean isPalindrome(String word) {
    // if (word == null || word.length() == 0) {
    // return true;
    // }
    // for (int i = 0; i < word.length(); i++) {
    // char start = word.charAt(i);
    // char end = word.charAt(word.length() - 1 - i);
    // if (start != end) {
    // return false;
    // }
    // }
    // return true;
    // }
}
