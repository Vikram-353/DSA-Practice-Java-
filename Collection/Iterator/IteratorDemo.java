package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer list1 = itr.next();
            if (list1 % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
