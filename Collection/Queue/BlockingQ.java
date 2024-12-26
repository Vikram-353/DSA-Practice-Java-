package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

class Producer implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer producing" + value);
                list.put(value++);
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Intrepted");
            }
        }

    }

    private BlockingQueue<Integer> list;
    private int value = 0;

    public Producer(BlockingQueue<Integer> list) {
        this.list = list;
    }
}

class Consumer implements Runnable {

    private BlockingQueue<Integer> list;

    public Consumer(BlockingQueue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = list.take();
                System.out.println("Consumer Consuming" + value);
                list.put(value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Intrepted");
            }
        }

    }
}

public class BlockingQ {
    public static void main(String[] args) {
        BlockingQueue<Integer> list = new ArrayBlockingQueue<>(5);
        // A boumded ,blocking queue backed by circular array
        // Low memory overhead
        // uses a single lock for both enque and dequeue operation
        // more threads-->problems
        Thread producer = new Thread(new Producer(list));
        Thread consumer = new Thread(new Consumer(list));
        producer.start();
        consumer.start();

        BlockingQueue<Integer> list1 = new LinkedBlockingQueue<>();
        System.out.println(list1);
        // Optionally bounded backed by linked list
        // Uses two seperatr locks for enqueue and dequeue operations
        // Higher concurrency between producers and consumers

        BlockingQueue<Integer> list2 = new PriorityBlockingQueue<>();
        // Unbounded
        // Binary Heap as array and can grow dynamically
        // Head is based on their natural ordering or a provided Comparator like
        // prioority queue

        list2.add(43);
        list2.add(40);
        list2.add(49);
        System.out.println(list2);

        BlockingQueue<Integer> list3 = new SynchronousQueue<>();
        System.out.println(list3);
        // each insert operation must wait for a corresponding remove opertion by
        // another thread and vice versa
        // It cannot store element , capacity of at most ane element.
    }
}
