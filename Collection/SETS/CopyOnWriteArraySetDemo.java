package SETS;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> list = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> list2 = new ConcurrentSkipListSet<>();// Weakly consistent set

        for (int i = 0; i < 5; i++) {
            list.add(i);
            list2.add(i);
        }

        for (Integer integer : list2) {
            System.out.println(integer);
            list2.add(6);
        }
        for (Integer integer : list) {
            System.out.println(integer);
            list.add(6);
        }
        System.out.println(list);
        System.out.println(list2);

    }
}
