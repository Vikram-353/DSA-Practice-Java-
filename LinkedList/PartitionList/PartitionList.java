package LinkedList.PartitionList;

import LinkedList.IntroLL.*;

public class PartitionList {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(4);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(2);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = new ListNode(2);
        // l.next.next.next.next.next.next = new ListNode(5);

        printList(partition(l, 3));
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        printList(head);

        ListNode lowDummy = new ListNode(-1);
        ListNode highDummy = new ListNode(-2);

        ListNode low = lowDummy;
        ListNode high = highDummy;

        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                low.next = current;
                low = current;
            } else {
                high.next = current;
                high = current;
            }
            current = current.next;
        }
        high.next = null;
        low.next = highDummy.next;

        return lowDummy.next;
    }
}
