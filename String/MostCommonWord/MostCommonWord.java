package String.MostCommonWord;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MostCommonWord {
    public static void main(String[] args) {
        String str = "Bob b.b";
        String[] banned = { "hit" };
        System.out.println(mostCommonWord(str, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new TreeMap<>();
        Set<String> set = new HashSet<>();
        for (String string : banned) {
            set.add(string);
        }

        String[] newStr = paragraph.replaceAll("[.,`':;!?]", " ").split(" ");

        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i] == "") {
                continue;
            }
            map.put(newStr[i].toLowerCase(), map.getOrDefault(newStr[i].toLowerCase(), 0) + 1);
        }
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() >= max && (!set.contains(e.getKey()))) {
                max = e.getValue();
                result.replace(0, result.length(), e.getKey());
            }
        }
        return result.toString();

    }

}
