package questions.UniqueOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class uniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        Set<Integer> set = new HashSet<>();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            set.add(entry.getValue());
        }

        if (set.size() == map.size()) {
            return true;
        }
        return false;

    }
}
