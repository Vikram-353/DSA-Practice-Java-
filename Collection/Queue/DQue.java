package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();// faster iteration, Low memory,no null value allowed unlike linked list
        // circular array is used , just shift head and tail
        dq.addFirst(3);
        dq.addLast(4);
        dq.offerFirst(5);
        dq.offerLast(2);
        dq.addFirst(14);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.removeFirst();
        dq.pollLast();
        System.out.println(dq);

    }
}
