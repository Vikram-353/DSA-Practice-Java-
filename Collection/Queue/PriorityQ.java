package Queue;

import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        qu.add(3);
        qu.add(30);
        qu.add(13);
        qu.add(37);
        qu.add(323);
        System.out.println(qu);// Not sorted
        while (qu.size() != 0) {
            System.out.println(qu.poll());
        }

    }
}
