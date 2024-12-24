package Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQ {
    public static void main(String[] args) {
        BlockingQueue<DelayedTask> queue = new DelayQueue<>();

        try {
            queue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
            queue.put(new DelayedTask("Task2", 3, TimeUnit.SECONDS));
            queue.put(new DelayedTask("Task3", 10, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Failed to add tasks to the queue.");
        }

        while (!queue.isEmpty()) {
            try {
                DelayedTask task = queue.take(); // Blocks until a task is available
                System.out.println("Executed: " + task.getTaskname() + " at " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task execution interrupted.");
            }
        }
    }
}

class DelayedTask implements Delayed {

    private final String taskname;
    private final long startTime; // Time when the task should execute

    public DelayedTask(String taskname, long delay, TimeUnit unit) {
        this.taskname = taskname;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay); // Calculate execution time
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedTask) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedTask) o).startTime) {
            return 1;
        }
        return 0;
    }

    public String getTaskname() {
        return taskname;
    }
}
