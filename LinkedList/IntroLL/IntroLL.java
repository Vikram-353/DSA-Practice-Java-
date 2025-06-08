package LinkedList.IntroLL;

import java.util.*;

public class IntroLL {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertLast(89);
        list.insertLast(9);
        list.display();

        list.insertPosition(70, 2);
        list.insertPosition(70, 0);

        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();

        list.display();
        list.deletePosition(3);
        list.display();
        list.insertRec(4, 4);
        list.display();

        System.out.println(list.getSize());

        list.gerReverse();
        list.display();

    }

}
