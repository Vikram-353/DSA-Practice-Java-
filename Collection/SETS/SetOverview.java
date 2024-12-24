package SETS;

import java.util.*;

public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(2);
        System.out.println(set1);

        Set<Integer> integer = Collections.synchronizedSet(set1);// Externally Thread
        // safe set

        // Set<Integer> integer = new ConcurrentSkipListSet<Integer>(set1);// Integrated
        // thread safetyt. More easy
        // implementation the Collections.synchronized.
        System.out.println(integer);
    }
}
