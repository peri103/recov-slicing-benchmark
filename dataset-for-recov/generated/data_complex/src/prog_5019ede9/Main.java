import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a new thread to perform the write operation on the SynchronousQueue
        new Thread(() -> {
            try {
                /* write */ synchronousQueue.put(42);
                System.out.println("Value written to the SynchronousQueue.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Write operation interrupted.");
            }
        }).start();

        // Create another thread to perform operations on ArrayBlockingQueue
        new Thread(() -> {
            try {
                arrayBlockingQueue.put(100);
                System.out.println("Value written to the ArrayBlockingQueue.");
                int value = arrayBlockingQueue.take();
                System.out.println("Value read from the ArrayBlockingQueue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("ArrayBlockingQueue operation interrupted.");
            }
        }).start();

        // Create another thread to perform operations on LinkedList
        new Thread(() -> {
            linkedList.add(200);
            linkedList.add(300);
            System.out.println("Values written to the LinkedList.");
            int value = linkedList.remove();
            System.out.println("Value read from the LinkedList: " + value);
        }).start();

        // Create a new thread to perform the read operation on the SynchronousQueue
        new Thread(() -> {
            try {
                /* read */ int value = synchronousQueue.take();
                System.out.println("Value read from the SynchronousQueue: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Read operation interrupted.");
            }
        }).start();
    }
}