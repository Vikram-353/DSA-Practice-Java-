package Heap;

import java.util.ArrayList;

public class Heap {
    public static void main(String[] args) throws Exception {
        HeapD<Integer> heap = new HeapD<Integer>();

        heap.insert(45);
        heap.insert(4);
        heap.insert(5);
        heap.insert(15);
        heap.insert(50);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}
