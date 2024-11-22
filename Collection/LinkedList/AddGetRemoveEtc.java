package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class AddGetRemoveEtc {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(13);
        linkedList.get(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        linkedList.addFirst(45);
        System.out.println(linkedList);
        linkedList.getLast();
        System.out.println(linkedList.getLast());
        linkedList.remove(2);
        System.out.println(linkedList);
        LinkedList<String> list = new LinkedList<>(Arrays.asList("kj", "hj", "jh"));
        System.out.println(list);
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("kj", "hjd", "jhs"));
        list.removeAll(list2);
        System.out.println(list);
    }
}
