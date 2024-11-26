package Vector;

import java.util.*;

// Vector increases their capacity by 2 times of its initial capacity
//initial capacity can be provided in while declaratio with increament capacity value
//Vector are Syncronised that means all methods of vector are thread safe. 
public class DemoVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // ArrayList<Integer> vector = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

            e.printStackTrace();

        }
        System.out.println(vector.size());
    }
}
