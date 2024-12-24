package Map;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        // SortedMap<Integer, String> arr = new TreeMap<>((a, b) -> b - a);// Decreasing
        // order
        SortedMap<Integer, String> arr = new TreeMap<>((a, b) -> a - b);// Increasing order
        arr.put(71, "Binod");
        arr.put(73, "Kamali");
        arr.put(53, "HYTRF");
        arr.put(23, "bhkks");

        System.out.println(arr.firstKey());
        System.out.println(arr.lastEntry());
        System.out.println(arr.subMap(23, 53));
        System.out.println(arr.hashCode());
        System.out.println(arr.headMap(53));
        System.out.println(arr.tailMap(53));
        System.out.println(arr);

    }
}
