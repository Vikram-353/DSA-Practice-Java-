package Custum_Stack;

public class CustumSTack {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustumSTack() {
        this(DEFAULT_SIZE);
    }

    public CustumSTack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
            // return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove fron and empty stack");
        }

        int digit = data[ptr];
        ptr--;
        return digit;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr >= data.length - 1;
    }
}
