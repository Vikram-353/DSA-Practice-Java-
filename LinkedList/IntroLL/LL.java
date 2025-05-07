package LinkedList.IntroLL;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }
    // public int getVal() {
    // return;
    // }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if (tail == null) {
            insertFirst(val);
            return;
        }

        size += 1;

    }

    public void insertPosition(int val, int position) {
        if (position == 0) {
            insertFirst(val);
            return;
        }
        if (position == size) {
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;

        int i = 0;
        while (i < position - 1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;

        size += 1;

    }

    public void deleteFirst() {
        Node temp = head.next;
        head = temp;
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        int i = 0;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deletePosition(int position) {
        if (position == 0) {
            deleteFirst();
            return;
        }
        if (position == size) {
            deleteLast();
            return;
        }

        Node temp = head;
        int i = 1;
        while (i < position) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void insertRec(int val, int position) {
        head = insertRec(val, position, head);
    }

    private Node insertRec(int val, int position, Node node) {
        if (position == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, position - 1, node.next);
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println(" END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
