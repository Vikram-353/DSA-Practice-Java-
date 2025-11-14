package String.Isomorphic;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder newString = new StringBuilder();

        char[] newS = s.toCharArray();
        char[] newT = t.toCharArray();

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < newT.length; i++) {
            if (!map.containsValue(newT[i])) {
                map.put(newS[i], newT[i]);
            }
        }
        for (int i = 0; i < newS.length; i++) {
            newString.append(map.get(newS[i]));
        }

        return (newString.toString()).equals(t);
    }
}
