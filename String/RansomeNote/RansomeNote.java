package String.RansomeNote;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RansomeNote {
    public static void main(String[] args) {
        String ransome = "aa";
        String magazine = "b";
        String s = "abcdd";
        System.out.println(repeatedCharacter(s));
        System.out.println(canConstruct(ransome, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0) {
                count++;
                map.replace(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            }
        }

        return count == ransomNote.length();
    }

    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (Character character : s.toCharArray()) {
            if (!set.contains(character)) {
                return character;
            } else {
                set.add(character);
            }
        }
        return 'a';

    }
}
