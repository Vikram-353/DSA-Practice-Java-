package Heap;

import java.util.ArrayList;

public class HeapD<T extends Comparable<T>> {

    private ArrayList<T> list;

    public HeapD() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int paraent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return i * 2 + 1;
    }

    private int right(int i) {
        return i * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);

    }

    private void upheap(int i) {
        if (i == 0) {
            return;
        }
        int p = paraent(i);
        if (list.get(i).compareTo(list.get(p)) < 0) {
            swap(i, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("removing from an empty heap!");
        }

        T temp = list.get(0);
        T last = list.remove(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int i) {
        int min = i;
        int left = left(i);
        int right = right(i);
        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != i) {
            swap(min, i);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while (!list.isEmpty()) {
            data.add(this.remove());
        }

        return data;
    }

}
