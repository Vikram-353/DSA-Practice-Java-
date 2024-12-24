package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(1, "Vikram");
        maps.put(2, "binu");
        maps.put(3, "King");
        System.out.println(maps.get(3));
        System.out.println(maps.containsKey(4));
        System.out.println(maps.containsValue("Vikram"));
        for (Integer s : maps.keySet()) {
            System.out.println(maps.get(s));

        }

        System.out.println(maps);

        Set<Map.Entry<Integer, String>> keys = maps.entrySet();
        for (Map.Entry<Integer, String> entry : keys) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(maps);

    }
}
