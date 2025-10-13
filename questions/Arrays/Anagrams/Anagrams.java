package questions.Arrays.Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        // String[] words = { "a", "b", "c", "d", "e" };
        // String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
        // String[] words = { "aaab", "abbb" };
        String[] words = { "qhlagjqq", "hqqgljqa", "qlqjahgq", "hqlqaqjg",
                "hlqagqjq", "lqghqjqa", "lhqgjqqa",
                "qahqjqlg", "qahjlqgq", "lqqhqgja" };
        System.out.println(removeAnagrams(words));
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for (String string : words) {
            list.add(string);
        }
        for (int i = 1; i < words.length; i++) {
            if (isAnagram(words[i - 1], words[i])) {
                list.remove(words[i]);
            }
        }
        return list;
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            // if (map.containsKey(word2.charAt(i))) {
            // if (map.get(word2.charAt(i)) > 0) {
            // map.put(word2.charAt(i), map.get(word2.charAt(i)) - 1);
            // } else {
            // return false;
            // }

            // } else {
            // return false;
            // }
            char ch = word2.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;

    }
}
