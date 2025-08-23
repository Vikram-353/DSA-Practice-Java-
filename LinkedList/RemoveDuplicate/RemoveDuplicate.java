package LinkedList.RemoveDuplicate;

import LinkedList.IntroLL.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(3);
        l.next.next.next.next.next = new ListNode(4);
        l.next.next.next.next.next.next = new ListNode(5);

        printList(deleteDuplicates(l));
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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
 
        while (current != null) {
            boolean isDuplicate = false;

            while (current.next != null && current.val == current.next.val) {
                current = current.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }

}
