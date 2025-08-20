package LinkedList.IntroLL;

import java.util.List;

public class SwapTwoNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        printList(l1);
        printList(swapPairs(l1));

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();

    }

    public static ListNode swapPairs(ListNode head) {
        // if (head == null || head.next == null) {
        // return head;
        // }

        // ListNode first = head;
        // ListNode second = head.next;

        // first.next = swapPairs(second.next);
        // second.next = first;

        // return second;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode f = prev.next;
            ListNode s = prev.next.next;

            f.next = s.next;
            s.next = f;
            prev.next = s;

            prev = f;

        }

        return dummy.next;

    }
}
