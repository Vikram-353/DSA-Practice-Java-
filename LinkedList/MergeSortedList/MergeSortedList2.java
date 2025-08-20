package LinkedList.MergeSortedList;

import java.util.ArrayList;
import LinkedList.IntroLL.*;

public class MergeSortedList2 {
    public static void main(String[] args) {
        ListNode l1 = null;

        ListNode l2 = new ListNode(1);

        ArrayList<ListNode> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);

        printList(mergeKLists(list));
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null)
            tail.next = list1;
        if (list2 != null)
            tail.next = list2;

        return dummy.next;
    }

    public static ListNode mergeKLists(ArrayList<ListNode> list) {
        if (list == null || list.size() == 0)
            return null;

        ListNode merged = null;
        for (int i = 0; i < list.size(); i++) {
            merged = mergeTwoLists(merged, list.get(i));
        }
        return merged;
    }
}
