package Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.*;

//It stores ordered key value pair unlike Hashmap
//It uses Doubly linked list
public class DemoLinkedHashmap {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> list = new LinkedHashMap<>();
        list.put("Vikram", 18);
        list.put("Rana", 15);
        list.put("Daggu", 38);
        list.put("Pati", 15);
        list.put("Kikka", 28);
        list.putIfAbsent("Shubham", 78);
        int me = list.getOrDefault("Ranka", 0);
        list.put("Ranau", 10);

        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(list);
        System.out.println(me);
    }
}