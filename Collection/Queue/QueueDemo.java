package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        queue.element();
        System.out.println(queue);
    }
}
